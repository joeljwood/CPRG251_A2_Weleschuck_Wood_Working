package sait.bms.problemdomain;

/**
 * book super class for storing book objects
 * 
 * @author Zennon and Joel
 *
 */
public class Book {
	private long isbn;
	private String callNumber;
	private int available;
	private int total;
	private String title;

	/**
	 * default constructor
	 * 
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
	 * 
	 * @param isbn       unique number for each book
	 * @param callNumber used to sort physical books
	 * @param available  number of book to take out
	 * @param total      number of book library owns
	 * @param title      of book
	 */
	public Book(long isbn, String callNumber, int available, int total, String title) {
		this.isbn = isbn;
		this.callNumber = callNumber;
		this.available = available;
		this.total = total;
		this.title = title;
	}

	/**
	 * 
	 * @return isbn number
	 */
	public long getIsbn() {
		return isbn;
	}

	/**
	 * 
	 * @param isbn sets number
	 */
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	/**
	 * 
	 * @return the call number of book
	 */
	public String getCallNumber() {
		return callNumber;
	}

	/**
	 * 
	 * @param callNumber sets number
	 */
	public void setCallNumber(String callNumber) {
		this.callNumber = callNumber;
	}

	/**
	 * 
	 * @return the number of books available
	 */
	public int getAvailable() {
		return available;
	}

	/**
	 * 
	 * @param available number of books available
	 */
	public void setAvailable(int available) {
		this.available = available;
	}

	/**
	 * 
	 * @return total number of books owned
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * 
	 * @param totaltotal number of books owned
	 */
	public void setTotal(int total) {
		this.total = total;
	}

	/**
	 * 
	 * @return title of book
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 
	 * @param title title of book
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Print statment for book object
	 */
	@Override
	public String toString() {
		return String.format("%-15s%d\n%-15s%s\n%-15s%d\n%-15s%d\n%-15s%s", "ISBN:", getIsbn(), "Call Number:",
				getCallNumber(), "Available:", getAvailable(), "Total:", getTotal(), "Title:", getTitle());
	}

}
