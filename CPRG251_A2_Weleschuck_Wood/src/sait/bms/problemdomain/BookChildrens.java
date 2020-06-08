package sait.bms.problemdomain;

/**
 * This subclass extends the books superclass and is for children's book objects
 * 
 * @author Zennon and Joel
 *
 */
public class BookChildrens extends Book {
	private String author;
	private char format;

	/**
	 * constructor for children books
	 * 
	 * @param isbn       unique number for each book
	 * @param callNumber used to sort physical books
	 * @param available  number of book to take out
	 * @param total      number of book library owns
	 * @param title      of book
	 * @param author     of childrens book
	 * @param format     of childrens book
	 */
	public BookChildrens(long isbn, String callNumber, int available, int total, String title, String author,
			char format) {
		super(isbn, callNumber, available, total, title);
		this.author = author;
		this.format = format;
	}

	/**
	 * 
	 * @return the author of children's book
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * 
	 * @param author set of children's book
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * 
	 * @return short format of children's book
	 */
	public char getFormat() {
		return format;
	}

	/**
	 * 
	 * @param format set of childrens book
	 */
	public void setFormat(char format) {
		this.format = format;
	}

	/**
	 * Takes the single char letter and returns the long name of the format
	 * 
	 * @return the long spelled out format of children's book
	 */
	public String formatLong() {
		String tempFormatLong = "empty";
		if (format == 'P') {
			tempFormatLong = "Picture Book";
		} else if (format == 'E') {
			tempFormatLong = "Early Readers";
		} else if (format == 'C') {
			tempFormatLong = "Chapter Book";
		}
		return tempFormatLong;
	}

	/**
	 * print formatted children's book object
	 */
	@Override
	public String toString() {
		return String.format("%-15s%d\n%-15s%s\n%-15s%d\n%-15s%d\n%-15s%s\n%-15s%s\n%-15s%s\n\n", "ISBN:", getIsbn(),
				"Call Number:", getCallNumber(), "Available:", getAvailable(), "Total:", getTotal(), "Title:",
				getTitle(), "Author:", getAuthor(), "Format:", formatLong());
	}

}
