package epsi.archi.ioc;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class MovieStorageInMemory implements MovieStorage {

    private List<Movie> movies;

    public MovieStorageInMemory(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> all() {
        return Collections.unmodifiableList(movies);
    }

    public void add(Movie movie) {
        //TODO : Handle duplication
        movies.add(movie);
    }

    public Optional<Movie> getF(String exploitationNumber) {
        return movies.stream()
                .filter(m -> m.getExploitation().equals(exploitationNumber))
                .findFirst();
    }

    public Optional<Movie> get(String exploitationNumber) {
        Optional<Movie> result = null;
        for (Movie movie : movies) {
            if (movie.getExploitation().equals(exploitationNumber)) {
                result = Optional.of(movie);
            }
        }
        return result.isPresent() ? result : Optional.empty();
    }

    public void remove(String exploitationNumber) {
        get(exploitationNumber).ifPresent(m -> {
            movies.remove(m);
        });
    }
}
