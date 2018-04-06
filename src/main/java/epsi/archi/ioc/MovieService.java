package epsi.archi.ioc;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MovieService {

    private MovieStorage storage;

    public MovieService(MovieStorage storage) {
        this.storage = storage;
    }

    public List<Movie> searchByRealisator(String realisator) {
        return storage.all().stream()
                .filter(m -> m.getRealisator().equalsIgnoreCase(realisator))
                .collect(Collectors.toList());
    }

    public List<Movie> searchByTitle(String title) {
        return storage.all().stream()
                .filter(m -> m.getTitle().equalsIgnoreCase(title))
                .collect(Collectors.toList());
    }

    // Delete all film with a ranking <= @param rank
    public void garbage(int rank) {
        storage.all().stream()
                .filter(m -> m.getRating() <= rank)
                .forEach(m -> storage.remove(m.getExploitation()));
    }

    public void addMovie(Movie movie) {
        storage.add(movie);
    }

    public void remove(String exploitationNumber) {
        storage.remove(exploitationNumber);
    }

    public Optional<Movie> getByExploitationNumber(String exploitationNumber) {
        return storage.get(exploitationNumber);
    }
}
