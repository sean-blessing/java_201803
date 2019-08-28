package ui;

import java.time.LocalDate;
import java.util.List;

import business.Movie;
import business.MovieCollection;
import util.Console;

public class MovieRatingsApp {

	
	public static void main(String[] args) {
		//initialize stuff
		MovieCollection mc = new MovieCollection();
		mc.add(new Movie("Avengers Infinity War", 2018, 4.0));
		mc.add(new Movie("Star Wars Episode 5 - Empire Strikes Back", 1980, 5.0));
		mc.add(new Movie("Sixteen Candles", 1984, 4.5));
		mc.add(new Movie("Happy Gilmore", 1996, 4.3));
		mc.add(new Movie("The Jerk", 1979, 3.9));
		mc.add(new Movie("Superbad", 2007, 3.9));
		mc.add(new Movie("Back to the Future Part III", 1990, 2.1));
		mc.add(new Movie("Entourage", 2015, 1.5));
		
	}
	
}
