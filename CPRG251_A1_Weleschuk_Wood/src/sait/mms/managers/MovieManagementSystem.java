/**
 * /**
 * This application creates the movie management system with the methods, load movie, display menu, addMovie, generateMovieInYear, 
 * generateRandomMovie
 * @version 1.0 May 17 2020
 * @author Joel Wood and Zennon Weleschuk
 *
 *
 */

package sait.mms.managers;

import java.util.*;
import sait.mms.problemdomain.Movie;
import java.io.*;

public class MovieManagementSystem {
	private static final String PATH = "res/movies.txt";
	private ArrayList<Movie> movies;
	Scanner input = new Scanner(System.in);

	public MovieManagementSystem() throws FileNotFoundException {
		/**
		 * Fields
		 */
		this.movies = new ArrayList<>();
		this.loadMovie();
	}

	/**
	 * This method creates movie objects for each movie in movies.txt and loads
	 * movies into the ArrayList movies
	 * 
	 * @throws FileNotFoundException for movie database
	 */
	public void loadMovie() throws FileNotFoundException {
		Scanner input = new Scanner(new File(PATH));

		while (input.hasNext()) {
			String line = input.nextLine();
			String[] parts = line.split(",");

			int duration = Integer.parseInt(parts[0]);
			String title = parts[1];
			int year = Integer.parseInt(parts[2]);

			Movie m = new Movie(duration, title, year);
			this.movies.add(m);
		}
		input.close();

	}

	/**
	 * This method adds a year, duration and title from the user and adds the the
	 * 
	 * @throws IOException for movie database
	 */
	public void addMovie() throws IOException {
		String title = "";
		int duration = 0;
		int year = 0;
		while (title.length() <= 0) { // title must not be empty
			System.out.print("Enter moive title: ");
			title = input.nextLine();
		}
		while (duration <= 0) { // duration must be greater than zero
			System.out.print("Enter duration: ");
			duration = input.nextInt();
		}
		while (year <= 0) { // year must be greater than zero
			System.out.print("Enter year: ");
			year = input.nextInt();
		}
		Movie add = new Movie(duration, title, year);
		this.movies.add(add);
		FileWriter fileWriter = new FileWriter(PATH, true); // Set true for append mode
		PrintWriter printWriter = new PrintWriter(fileWriter);
		printWriter.println(""); // new line
		// printWriter.print(add.toString()); //
		printWriter.print(add.getDuration() + "," + add.getTitle() + "," + add.getYear());
		System.out.println("Saving movies . . .");
		System.out.println("Added movie to the data file.");
		printWriter.close();
	}

	/**
	 * This method generates a list of all the movies in movies.txt with the year
	 * passed in. Also prints out the total duration of the movies in the list
	 * 
	 * 
	 */
	public void generateMovieInYear() {
		System.out.print("Enter in year: ");
		int year = input.nextInt();
		int totalDuration = 0;
		System.out.println("Movie List");
		System.out.printf("%-10s%-6s%-1s\n", "Duration:", "Year:", "Title:");
		for (Movie m : movies) {
			if (m.getYear() == year) {
				totalDuration += m.getDuration();
				System.out.println(m.toString());
			}
		}
		System.out.println("Total Duration: " + totalDuration + " minutes");
	}

	/**
	 * This method displays the main menu which allows the user to select one of 4
	 * options
	 */
	public void displayMenu() {
		System.out.println("Movie Management system");
		System.out.println("1	Add New Movie and Save");
		System.out.println("2	Generate List of Movies Released in a Year");
		System.out.println("3	Generate List of Random Movies");
		System.out.println("4	Exit");
		System.out.println();
		System.out.print("Enter an option: ");
	}

	/**
	 * This method allows the user to make a list of random movies however long they
	 * would like
	 */
	public void generateRandomMovie() {
		int totalDuration = 0;
		System.out.print("Enter number of movies: ");
		int numberOfMovies = input.nextInt();
		Collections.shuffle(movies);
		System.out.println("Movie List");
		System.out.printf("%-10s%-6s%-1s\n", "Duration:", "Year:", "Title:");
		for (int i = 0; i < numberOfMovies; i++) {
			System.out.println(movies.get(i));
			totalDuration += movies.get(i).getDuration();
		}
		System.out.println("Total Duration: " + totalDuration + " minutes");
	}
}