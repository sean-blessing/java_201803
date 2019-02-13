package business;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MovieCollection {
	
	private List<Movie> movies;

	public MovieCollection() {
		movies = new ArrayList<>();
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	public void add(Movie m) {
		movies.add(m);
	}
	
	public List<Movie> filterMovies(Predicate<Movie> condition) {
		/*List<Movie> filteredMovies = new ArrayList<>();
		
		for (Movie m: movies) {
			if (condition.test(m))
				filteredMovies.add(m);
		}
		
		return filteredMovies;*/
		
		return movies.stream().filter(condition)
				.collect(Collectors.toList());
	}
	
	public double getLowestRating() {
		double lr = 5.0;
		
//		for (Movie m: movies) {
//			lr = Math.min(lr, m.getRating());
//		}
		
//		lr = movies.stream()
//				.map(r -> r.getRating())
//				.reduce(5.0, (a, b) -> Math.min(a, b));

//		lr = movies.stream()
//				.map(Movie::getRating)
//				.reduce(5.0, Math::min);

//		lr = movies.stream()
//				.mapToDouble(r -> r.getRating())
//				.min().getAsDouble();

		lr = movies.stream()
				.mapToDouble(Movie::getRating)
				.min().getAsDouble();

		return lr;
	}
	
	public double getHighestRating() {
		double hr = movies.stream()
				.map(r -> r.getRating())
				.reduce(1.0, (a, b) -> Math.max(a, b));
		
		return hr;
	}
	
	public String getAverageRating() {
		/*double sum = movies.stream()
				.map(r -> r.getRating())
				.reduce(0.0, (a, b) -> (a+b));
		NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setMaximumFractionDigits(2);
		
		return nf.format(sum/movies.size());
		*/
		
		double avg = movies.stream()
				.mapToDouble(r -> r.getRating())
				.average().getAsDouble();
		NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setMaximumFractionDigits(2);
		return nf.format(avg);
	}
	
	public int getSize() {
		return movies.size();
	}
	
}
