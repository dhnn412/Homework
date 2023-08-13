package movie;

import java.util.List;

public class PrintResult {
    public void printMovieList(List<MovieDTO> movieList) {
        movieList.forEach(System.out::println);
    }

    public void printMovie(MovieDTO movie) {
        System.out.println(movie);
    }

    public void printErrorMessage(String errorCode) {
        String errorMessage = "";
        switch(errorCode) {
            case "selectList" : errorMessage = "전체 조회 실패."; break;
            case "selectOne" : errorMessage = "상세 조회 실패."; break;
            case "insert" : errorMessage = "영화 등록 실패."; break;
            case "update" : errorMessage = "영화 수정 실패."; break;
            case "delete" : errorMessage = "영화 삭제 실패."; break;
        }
        System.out.println(errorMessage);
    }

    public void printSuccessMessage(String successCode) {
        String successMessage = "";
        switch(successCode) {
            case "insert" : successMessage = "영화 등록 완료."; break;
            case "update" : successMessage = "영화 수정 완료."; break;
            case "delete" : successMessage = "영화 삭제 완료."; break;
        }
        System.out.println(successMessage);
    }
}
