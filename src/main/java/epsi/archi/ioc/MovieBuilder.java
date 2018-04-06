package epsi.archi.ioc;

import java.time.LocalDate;
import java.util.Date;

public class MovieBuilder {

    private String exploitation;
    private String title;
    private String category;
    private LocalDate releaseDate;
    private String realisator;
    private int rating;

    public static MovieBuilder movieBuilder() {
        return new MovieBuilder();
    }

    public Movie build() {
        Movie movie = new Movie();
        movie.setExploitation(exploitation);
        movie.setCategory(category);
        movie.setRating(rating);
        movie.setRealisator(realisator);
        movie.setReleaseDate(releaseDate);
        movie.setTitle(title);
        return movie;
    }

    public MovieBuilder exploitation(String exploitation) {
        this.exploitation = exploitation;
        return this;
    }

    public MovieBuilder title(String title) {
        this.title = title;
        return this;
    }

    public MovieBuilder category(String category) {
        this.category = category;
        return this;
    }

    public MovieBuilder releaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    public MovieBuilder realisator(String realisator) {
        this.realisator = realisator;
        return this;
    }

    public MovieBuilder rating(int rating) {
        this.rating = rating;
        return this;
    }
}
