package sait.bms.managers;

import java.io.*;
import java.util.*;

import sait.bms.problemdomain.Book;
import sait.bms.problemdomain.BookChildrens;
import sait.bms.problemdomain.BookCook;
import sait.bms.problemdomain.BookPaperBack;

public class AppManager {
	private final String PATH = "res/books.txt";
	private ArrayList<Book> bookList = new ArrayList<>();

	public AppManager() throws FileNotFoundException {
		this.bookList = new ArrayList<>();
		this.LoadBooks();
	}

	public void LoadBooks() throws FileNotFoundException {
		ArrayList<Book> bookList = new ArrayList<>();
		Book b;
		String checkIsbn;
		int lastIsbn;
		long isbn;
		String callNumber;
		int available;
		int total;
		String title;
		String author;
		char format;
		String publisher;
		char diet;
		int year;
		char genre;
		FileInputStream isFile = new FileInputStream(PATH);
		Scanner inFile = new Scanner(isFile, "UTF-8");
		inFile.useDelimiter(";");
		while (inFile.hasNextLine()) {
			checkIsbn = inFile.next();
			lastIsbn = Integer.parseInt(checkIsbn.substring(checkIsbn.length() - 1)); // gets last digit of ISBN
			switch (lastIsbn) {
			case 0:
			case 1: // Children's books
				isbn = Long.parseLong(checkIsbn);
				callNumber = inFile.next();
				available = inFile.nextInt();
				total = inFile.nextInt();
				title = inFile.next();
				author = inFile.next();
				format = inFile.next().charAt(0);

				b = new BookChildrens(isbn, callNumber, available, total, title, author, format);
				bookList.add(b);
				inFile.nextLine();
				break;

			case 2:
			case 3: // Cook books
				isbn = Long.parseLong(checkIsbn);
				callNumber = inFile.next();
				available = inFile.nextInt();
				total = inFile.nextInt();
				title = inFile.next();
				publisher = inFile.next();
				diet = inFile.next().charAt(0);

				b = new BookCook(isbn, callNumber, available, total, title, publisher, diet);
				bookList.add(b);
				//inFile.nextLine();
				break;
			case 4:
			case 5:
			case 6:
			case 7: // Paperback books
				/*isbn = Long.parseLong(checkIsbn);
				callNumber = inFile.next();
				available = inFile.nextInt();
				total = inFile.nextInt();
				title = inFile.next();
				author = inFile.next();
				year = inFile.nextInt();
				genre = inFile.next().charAt(0);

				b = new BookPaperBack(isbn, callNumber, available, total, title, author, year, genre);
				bookList.add(b);*/
				inFile.nextLine();
				break;
			case 8:
			case 9: // Periodicals
				inFile.nextLine();
				break;

			}

		}
		for (Book b1 : bookList) {
			System.out.println(b1.toString());
		}
		inFile.close();
	}
}
