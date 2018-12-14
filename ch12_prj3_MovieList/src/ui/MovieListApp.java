package ui;

import java.util.ArrayList;

import business.Movie;
import db.MovieIO;
import util.Console;

public class MovieListApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Movie List application!");
		
		Console console = new Console();
		MovieIO mIO = new MovieIO();
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Choose from "+mIO.getMovies().size()+" movies.");
			System.out.println("Categories: drama | musical | scifi | horror | comedy | animated");
			
			String category = console.getString("Enter a category: ");
			
			ArrayList<Movie> filteredMovies = mIO.getMovies(category);
			
			for (Movie m: filteredMovies) {
				System.out.println(m.getTitle());
			}
			
			choice = console.getString("Continue? (y/n) ");
		}

		System.out.println("Bye!");
	}

}
