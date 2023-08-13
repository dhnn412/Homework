package movie;

import java.util.List;

public interface MovieMapper {

    List<MovieDTO> selectAllMovie();

    List<MovieDTO> selectMovieByRating(int rating);

    int insertMovie(MovieDTO movie);

    int updateMovie(MovieDTO movie);

    int deleteMovie(int code);



}








