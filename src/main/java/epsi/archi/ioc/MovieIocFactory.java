package epsi.archi.ioc;

import java.util.List;

public class MovieIocFactory {

    private List<Movie> movies;
    private MovieStorage storage;

    public MovieIocFactory(List<Movie> movies) {
        super();
        this.movies = movies;
    }

    protected MovieStorage getStorage() {
        if (storage == null) {
            storage = new MovieStorageInMemory(movies);
        }
        return storage;
    }

    public MovieService buildService() {
        return new MovieService(getStorage());
    }
}
