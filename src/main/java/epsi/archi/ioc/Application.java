package epsi.archi.ioc;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static epsi.archi.ioc.MovieBuilder.movieBuilder;

public class Application {
    public static void main(String[] args) {
        MovieIocFactory factory = new MovieIocFactory(initMovies());

        MovieService service = factory.buildService();

        service.searchByTitle("Conan le Barbare")
                .forEach(m -> System.out.println(m));
    }

































    public static List<Movie> initMovies() {
        return Arrays.asList(
                movieBuilder()
                        .title("Conan le barbare")
                        .category("Drame")
                        .exploitation("123456789O")
                        .rating(11)
                        .realisator("John Millius")
                        .releaseDate(LocalDate.of(1982, 04, 02))
                        .build(),
                movieBuilder()
                        .title("Titanic")
                        .category("Drame")
                        .exploitation("1234567891")
                        .rating(8)
                        .realisator("James Cameron")
                        .releaseDate(LocalDate.of(1997, 04, 02))
                        .build()
        );
    }
}
