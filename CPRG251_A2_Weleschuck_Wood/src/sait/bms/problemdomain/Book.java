package sait.bms.problemdomain;


public class Book {
	private long isbn;
	private String callNumber;
	private int available;
	private int total;
	private String title;
	
	/**
	 * default constructor
	 * @author  Zennon and Joel
	 */
	public Book() {
		isbn = 0;
		callNumber = "";
		available = 0;
		total = 0;
		title = "";
	}

	/**
	 * constructor super class
	 * @param isbn
	 * @param callNumber
	 * @param available
	 * @param total
	 * @param title
	 */
	public Book(long isbn, String callNumber, int available, int total, String title) {
		this.isbn = isbn;
		this.callNumber = callNumber;
		this.available = available;
		this.total = total;
		this.title = title;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getCallNumber() {
		return callNumber;
	}

	public void setCallNumber(String callNumber) {
		this.callNumber = callNumber;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override // works print only book attributes
	public String toString() {
		return String.format("%-15s%d\n%-15s%s\n%-15s%d\n%-15s%d\n%-15s%s",
				"ISBN:", getIsbn(), "Call Number:", getCallNumber(), "Available:", getAvailable(), "Total:", getTotal(), "Title:", getTitle() );
	}
	
	
	
}
