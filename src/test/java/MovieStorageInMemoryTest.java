import epsi.archi.ioc.Movie;
import epsi.archi.ioc.MovieStorageInMemory;

import java.util.Arrays;
import java.util.Optional;

public class MovieStorageInMemoryTest {

    public void testGet() {
        MovieStorageInMemory storage = new MovieStorageInMemory(Arrays.asList());
        Optional<Movie> movie = storage.get("23243E45316544537");
        if (movie.isPresent()) {
            System.out.println(movie.get().getExploitation());
        }
    }
}
