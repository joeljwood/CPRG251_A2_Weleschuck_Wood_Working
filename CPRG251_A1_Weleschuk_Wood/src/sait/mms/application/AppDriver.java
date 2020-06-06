package sait.mms.application;

import sait.mms.managers.MovieManagementSystem;
import sait.mms.problemdomain.Movie;
import java.util.*;
import java.io.*;

/**
 *This program is a movie management system that will allows the user to 
 *add movies to the database, search for movies based on the year, and generate 
 *a list of random movies of any desired length.
 *  
 *This class is the main method and calls all the methods for the program to function.
 * 
 * @author Joel Wood and Zennon Weleschuk
 * @version 1.0 May 17 2020
 * @throws IOException for movie database
 */
public class AppDriver {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		MovieManagementSystem m = new MovieManagementSystem();

		int selection = 0;
		while (selection != 4) {
			m.displayMenu();
			selection = input.nextInt();
			if (selection == 1) {
				m.addMovie();
			} else if (selection == 2) {
				m.generateMovieInYear();
			} else if (selection == 3) {
				m.generateRandomMovie();
			} else if (selection == 4) {
				System.out.println("Program exited");
			} else {
				System.out.println("invaild input!");
			}
			
		}
		input.close();
	}

}