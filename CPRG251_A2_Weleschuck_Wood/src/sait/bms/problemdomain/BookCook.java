package sait.bms.problemdomain;

public class BookCook extends Book {
	private String publisher;
	private char diet;

	public BookCook(long isbn, String callNumber, int available, int total, String title, String publisher, char diet) {
		super(isbn, callNumber, available, total, title);
		this.publisher = publisher;
		this.diet = diet;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public char getDiet() {
		return diet;
	}

	public void setDiet(char diet) {
		this.diet = diet;
	}

	public String dietLong() {
		String tempDietLong = "None";
		if (diet == 'D') {
			tempDietLong = "Diabetic";
		} else if (diet == 'V') {
			tempDietLong = "Vegetarian";
		} else if (diet == 'G') {
			tempDietLong = "Gluten-Free";
		} else if (diet == 'I') {
			tempDietLong = "International";
		}
		return tempDietLong;
	}

	@Override
	public String toString() {
		return String.format("%-15s%d\n%-15s%s\n%-15s%d\n%-15s%d\n%-15s%s\n%-15s%s\n%-15s%s\n", "ISBN:", getIsbn(),
				"Call Number:", getCallNumber(), "Available:", getAvailable(), "Total:", getTotal(), "Title:",
				getTitle(), "Publisher:", getPublisher(), "Diet", dietLong());
	}

}
