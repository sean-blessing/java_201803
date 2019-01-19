package com.bmdb;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bmdb.business.Actor;
import com.bmdb.business.ActorDB;
import com.bmdb.business.Movie;
import com.bmdb.business.MovieDB;
import com.bmdb.util.Console;

@SpringBootApplication
public class BmdbJpaTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BmdbJpaTestApplication.class, args);
		
		System.out.println("hello");
		int o = 0;
		Console console = new Console();
		while (o!=9) {
			displayMenu();
			o = console.getInt("Enter option:  ");
			if (o==1) {
				//list all movies
				List<Movie> movies = MovieDB.getAll();
				for (Movie m: movies) {
					System.out.println(m);
				}
			}
			else if (o==2) {
				//list all actors
				List<Actor> actors = ActorDB.getAll();
				for (Actor a: actors) {
					System.out.println(a);
				}
			}
		}
	}

	private static void displayMenu() {
		System.out.println("Options:");
		System.out.println("1 - list all movies");
		System.out.println("2 - list all actors");
		System.out.println("3 - list all movie credits");
		System.out.println("9 - exit");
	}

}

