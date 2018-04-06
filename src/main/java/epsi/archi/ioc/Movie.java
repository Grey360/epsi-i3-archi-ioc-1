package epsi.archi.ioc;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Movie {

    private String exploitation;
    private String title;
    private String category;
    private LocalDate releaseDate;
    private String realisator;
    private int rating;

    public String getExploitation() {
        return exploitation;
    }

    public void setExploitation(String exploitation) {
        this.exploitation = exploitation;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getRealisator() {
        return realisator;
    }

    public void setRealisator(String realisator) {
        this.realisator = realisator;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "exploitation='" + exploitation + '\'' +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", releaseDate=" + releaseDate +
                ", realisator='" + realisator + '\'' +
                ", rating=" + rating +
                '}';
    }
}
