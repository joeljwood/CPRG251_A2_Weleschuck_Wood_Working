package sait.bms.problemdomain;


public class BookChildrens extends Book {
	private String author;
	private char format;
	
	/**
	 * 
	 * @param author
	 * @param format
	 */
	public BookChildrens(String author, char format) {
		super();
		this.author = author;
		this.format = format;
	}

	public BookChildrens() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookChildrens(long isbn, String callNumber, int available, int total, String title, String author, char format) {
		super(isbn, callNumber, available, total, title);
		this.author = author;
		this.format = format;
	}
	
	
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public char getFormat() {
		return format;
	}

	public void setFormat(char format) {
		this.format = format;
	}

	/**
	 * takes the single char letter and returns the long name of the format
	 * @param format code for children's book 
	 * @return the long spelled out name
	 */
	public String formatLong() {
		String tempFormatLong = "empty"; 
		if (format == 'P'){
			tempFormatLong = "Picture Book";
		}else if (format == 'E'){
			tempFormatLong = "Early Readers";
		}else if (format == 'C') {
			tempFormatLong = "Chapter Book";
		}
		return tempFormatLong;
	}
	

	@Override 
	public String toString() {
		return String.format("%-15s%d\n%-15s%s\n%-15s%d\n%-15s%d\n%-15s%s\n%-15s%s\n%-15s%s\n",
				"ISBN:", getIsbn(), "Call Number:", getCallNumber(), "Available:", getAvailable(), "Total:", getTotal(), "Title:", getTitle(), "Author:", getAuthor(), "Format:", formatLong() );
	}
	

	
	
}
