package streamAPI;

import java.util.*;

class Movie{
	String movie;
	double rating;
	
	public Movie(String movie, double rating) {
		this.movie = movie;
		this.rating = rating;
	}
	public double getRating() {
        return rating;
    }
}

public class TopFiveTrendingMovies {

	public static void main(String[] args) {
		List<Movie> movies = Arrays.asList(
				new Movie("Inception", 9.0),
                new Movie("Avengers", 8.5),
                new Movie("Interstellar", 9.2),
                new Movie("Joker", 8.7),
                new Movie("Batman", 8.9),
                new Movie("Titanic", 8.0),
                new Movie("Oppenheimer", 9.3),
                new Movie("Attonement", 10)
				);
		
		movies.stream().sorted(Comparator.comparing(Movie::getRating).reversed()).limit(5)
		.forEach(m->System.out.println(m.movie + " " + m.rating));

	}

}
