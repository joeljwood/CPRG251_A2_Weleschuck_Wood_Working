package sait.bms.managers;

import java.io.*;
import java.util.*;

import sait.bms.problemdomain.Book;
import sait.bms.problemdomain.BookChildrens;
import sait.bms.problemdomain.BookCook;
import sait.bms.problemdomain.BookPaperBack;
import sait.bms.problemdomain.BookPeriodical;

public class AppManager {
	private final String PATH = "res/books.txt";
	private ArrayList<Book> bookList = new ArrayList<>();
	Scanner input = new Scanner(System.in);
	private String checkIsbn;
	private int lastIsbn;
	private long isbn;
	private String callNumber;
	private int available;
	private int total;
	private String title;
	private String author;
	private char format;
	private String publisher;
	private char diet;
	private int year;
	private char genre;
	private char frequency;
	private Book b;
	
	
	public AppManager() throws FileNotFoundException {
		this.bookList = new ArrayList<>();
		this.LoadBooks();
	}

	public void LoadBooks() throws FileNotFoundException {
		FileInputStream isFile = new FileInputStream(PATH);
		Scanner inFile = new Scanner(isFile, "UTF-8");
		while (inFile.hasNextLine()) {
			String line = inFile.nextLine();
			String[] parts = line.split(";");

			checkIsbn = parts[0];
			lastIsbn = Integer.parseInt(checkIsbn.substring(checkIsbn.length() - 1)); // gets last digit of ISBN
			switch (lastIsbn) {
			case 0:
			case 1: // Children's books
				isbn = Long.parseLong(checkIsbn);
				callNumber = parts[1];
				available = Integer.parseInt(parts[2]);
				total = Integer.parseInt(parts[3]);
				title = parts[4];
				author = parts[5];
				format = parts[6].charAt(0);

				b = new BookChildrens(isbn, callNumber, available, total, title, author, format);
				bookList.add(b);
				break;

			case 2:
			case 3: // Cook books
				isbn = Long.parseLong(checkIsbn);
				callNumber = parts[1];
				available = Integer.parseInt(parts[2]);
				total = Integer.parseInt(parts[3]);
				title = parts[4];
				publisher = parts[5];
				diet = parts[6].charAt(0);

				b = new BookCook(isbn, callNumber, available, total, title, publisher, diet);
				bookList.add(b);
				break;
			case 4:
			case 5:
			case 6:
			case 7: // Paperback books
				isbn = Long.parseLong(checkIsbn);
				callNumber = parts[1];
				available = Integer.parseInt(parts[2]);
				total = Integer.parseInt(parts[3]);
				title = parts[4];
				author = parts[5];
				year = Integer.parseInt(parts[6]);
				genre = parts[7].charAt(0);

				b = new BookPaperBack(isbn, callNumber, available, total, title, author, year, genre);
				bookList.add(b);
				break;
			case 8:
			case 9: // Periodicals
				isbn = Long.parseLong(checkIsbn);
				callNumber = parts[1];
				available = Integer.parseInt(parts[2]);
				total = Integer.parseInt(parts[3]);
				title = parts[4];
				frequency = parts[5].charAt(0);

				b = new BookPeriodical(isbn, callNumber, available, total, title, frequency);
				bookList.add(b);
				break;

			}

		}
		for (Book b1 : bookList) {// for testing
			System.out.println(b1.toString());// for testing
		}
		inFile.close();
	}

	public void titleSearch() {
		System.out.print("Enter title to search for: ");
		String query = (input.next());
		for (Book b1: bookList) {
			if (b1.getTitle().matches(query) ) {
				
			}
			
		}

	}

	public void randomBooks() {

	}

}
