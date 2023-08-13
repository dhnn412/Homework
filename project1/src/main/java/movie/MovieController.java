package movie;

import java.util.List;
import java.util.Map;

public class MovieController {

    private final MovieService movieService;
    private final PrintResult printResult;

    public MovieController() {
        movieService = new MovieService();
        printResult = new PrintResult();
    }

    public void selectAllMovie() {

        List<MovieDTO> movieList = movieService.selectAllMovie();

        if(movieList != null) {
            printResult.printMovieList(movieList);
        } else {
            printResult.printErrorMessage("selectList");
        }

    }

    public void selectMovieByRating(Map<String, String> parameter) {

        int rating = Integer.parseInt(parameter.get("rating"));

        List<MovieDTO> movie = movieService.selectMovieByRating(rating);

        if(movie != null) {
            printResult.printMovieList(movie);
        } else {
            printResult.printErrorMessage("selectOne");
        }
    }

    public void registMovie(Map<String, String> parameter) {

        String title = parameter.get("title");
        String director = parameter.get("director");
        int rating = Integer.parseInt(parameter.get("rating"));

        MovieDTO movie = new MovieDTO();
        movie.setTitle(title);
        movie.setDirector(director);
        movie.setRating(rating);

        if(movieService.registMovie(movie)) {
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }
    }

    public void modifyMovie(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));
        String title = parameter.get("title");
        String director = parameter.get("director");
        int rating = Integer.parseInt(parameter.get("rating"));

        MovieDTO movie = new MovieDTO();
        movie.setCode(code);
        movie.setTitle(title);
        movie.setDirector(director);
        movie.setRating(rating);

        if(movieService.modifyMovie(movie)) {
            printResult.printSuccessMessage("update");
        } else {
            printResult.printErrorMessage("update");
        }
    }

    public void deleteMovie(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));

        if(movieService.deleteMovie(code)) {
            printResult.printSuccessMessage("delete");
        } else {
            printResult.printErrorMessage("delete");
        }

    }

    public void searchMovie(Map<String, String> parameter) {

    }
}














