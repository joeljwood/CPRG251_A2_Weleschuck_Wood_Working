package sait.bms.problemdomain;

public class BookPaperBack extends Book {
	private String author;
	private int year;
	private char genre;
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public char getGenre() {
		return genre;
	}
	public void setGenre(char genre) {
		this.genre = genre;
	}
	
	public BookPaperBack(long isbn, String callNumber, int available, int total, String title, String author, int year, char genre) {
		super(isbn, callNumber, available, total, title);
		this.author = author;
		this.year = year;
		this.genre = genre;
	}
	
	public String GenreLong() {
		String tempGenreLong = "None";
		if (genre == 'A') {
			tempGenreLong = "Adventure";
		} else if (genre == 'D') {
			tempGenreLong = "Drama";
		} else if (genre == 'E') {
			tempGenreLong = "Education";
		} else if (genre == 'C') {
			tempGenreLong = "Classic";
		}else if (genre == 'F') {
			tempGenreLong = "Fantasy";
		}else if (genre == 'S') {
			tempGenreLong = "Science Fiction";;
		}return tempGenreLong;
	}
	
	@Override
	public String toString() {
		return String.format("%-15s%d\n%-15s%s\n%-15s%d\n%-15s%d\n%-15s%s\n%-15s%s\n%-15s%d\n%-15s%s\n", "ISBN:", getIsbn(),
				"Call Number:", getCallNumber(), "Available:", getAvailable(), "Total:", getTotal(), "Title:",
				getTitle(), "Author:", getAuthor(), "year:", getYear(), "Genre:", GenreLong());
	}

	
}
