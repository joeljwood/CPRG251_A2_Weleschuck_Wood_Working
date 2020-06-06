package sait.mms.problemdomain;

/**
 * This application creates a movie object
 * @version 1.0 May 16 2020
 * @author Joel Wood and Zennon Weleschuk
 *
 *
 */

public class Movie{
	/**
	 * fields 
	 */
	private int duration;
	private String title;
	private int year;
	
	/**
	 * no arg constructor
	 */
	public Movie() {
		this.duration = 0;
		this.title = "";
		this.year = 0;
	}
	/**
	* Constructor that creates a new Movie
	*@param duration of the movie
	*@param title of the movie
	*@param year of the movie
	*/
	public Movie(int duration, String title, int year) {
		this.duration = duration;
		this.title = title;
		this.year = year;
	}
	/**
	* Set's the duration of the movie
	*@param duration of the movie
	*/
	public void setDuration(int duration) {
		this.duration = duration;
	}
	/**
	* Gets the duration
	*@return duration of the movie
	*/
	public int getDuration() {
		return duration;
	}
	/**
	* Set's the title of the movie
	*@param title of the movie
	*/
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	* Gets the duration
	*@return duration of the movie
	*/
	public String getTitle() {
		return title;
	}
	/**
	* Set's the year the movie was released
	*@param year of movie release
	*/
	public void setYear(int year) {
		this.year = year;
	}
	/**
	* Gets the year the movie was released
	*@return year of movie release
	*/
	public int getYear() {
		return year;
	}
	/**
	* Returns the string of the object
	*@return duration, title, and year, as a string
	*
	*
	*/
	@Override
	public String toString() {
		return String.format("%-10s%-6s%-1s", getDuration(),  getYear(), getTitle());
	}
	
	
	
}