package sait.bms.problemdomain;

public class BookPeriodical extends Book{

	private char frequency;
	
	public BookPeriodical (long isbn, String callNumber, int available, int total, String title, char frequency) {
		super(isbn, callNumber, available, total, title);
		this.frequency = frequency;
	}
	
	public char getFrequency() {
		return frequency;
	}

	public void setFrequency(char diet) {
		this.frequency = frequency;
	}
	
	public String frequencyLong() {
		String tempFrequencyLong = "None";
		if (frequency == 'D') {
			tempFrequencyLong = "Daily";
		} else if (frequency == 'W') {
			tempFrequencyLong = "Weekly";
		} else if (frequency == 'M') {
			tempFrequencyLong = "Monthly";
		} else if (frequency == 'B') {
			tempFrequencyLong = "Bimonthly";
		}
		else if (frequency == 'Q') {
			tempFrequencyLong = "Quarterly";
		}
		return tempFrequencyLong;
	}
	@Override
	public String toString() {
		return String.format("%-15s%d\n%-15s%s\n%-15s%d\n%-15s%d\n%-15s%s\n%-15s%s\n%-15s%s\n", "ISBN:", getIsbn(),
				"Call Number:", getCallNumber(), "Available:", getAvailable(), "Total:", getTotal(), "Title:",
				getTitle(), "Frequency", frequencyLong());
}
