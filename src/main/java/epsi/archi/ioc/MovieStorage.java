package epsi.archi.ioc;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public interface MovieStorage {

    List<Movie> all();

    void add(Movie movie);

    Optional<Movie> get(String exploitationNumber);

    void remove(String exploitationNumber);
}
