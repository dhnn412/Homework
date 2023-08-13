package movie;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static movie.Template.getSqlSession;

public class MovieService {

    private MovieMapper movieMapper;

    public List<MovieDTO> selectAllMovie() {

        SqlSession sqlSession = getSqlSession();

        movieMapper = sqlSession.getMapper(MovieMapper.class);
        List<MovieDTO> movieList = movieMapper.selectAllMovie();

        sqlSession.close();

        return movieList;
    }

    public List<MovieDTO> selectMovieByRating(int rating) {

        SqlSession sqlSession = getSqlSession();
        movieMapper = sqlSession.getMapper(MovieMapper.class);

        List<MovieDTO> movieList = movieMapper.selectMovieByRating(rating);

        sqlSession.close();

        return movieList;
    }

    public boolean registMovie(MovieDTO movie) {

        SqlSession sqlSession = getSqlSession();
        movieMapper = sqlSession.getMapper(MovieMapper.class);

        int result = movieMapper.insertMovie(movie);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0;
    }

    public boolean modifyMovie(MovieDTO movie) {

        SqlSession sqlSession = getSqlSession();
        movieMapper = sqlSession.getMapper(MovieMapper.class);

        int result = movieMapper.updateMovie(movie);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0;
    }

    public boolean deleteMovie(int code) {

        SqlSession sqlSession = getSqlSession();
        movieMapper = sqlSession.getMapper(MovieMapper.class);

        int result = movieMapper.deleteMovie(code);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0;
    }




}
