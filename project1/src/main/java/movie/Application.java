package movie;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieController movieController = new MovieController();

        do{
            System.out.println("<영화 관리>");
            System.out.println("1. 전체 조회");
            System.out.println("2. 상세 조회");
            System.out.println("3. 영화 추가");
            System.out.println("4. 영화 수정");
            System.out.println("5. 영화 삭제");
            System.out.print(": ");
            int no = sc.nextInt();

            switch(no) {
                case 1 : movieController.selectAllMovie(); break;
                case 2 : detail(); break;
                case 3 : movieController.registMovie(inputMovie()); break;
                case 4 : movieController.modifyMovie(inputModifyMovie()); break;
                case 5 : movieController.deleteMovie(inputMovie()); break;
                default :
                    System.out.println("잘못 된 메뉴를 선택하셨습니다.");
            }
        }while(true);
    }


    private static Map<String, String> inputMovie() {

        Scanner sc = new Scanner(System.in);
        System.out.print("영화 제목 : ");
        String title = sc.nextLine();
        System.out.print("감독 : ");
        String director = sc.nextLine();
        System.out.print("별점 : ");
        String rating = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("title", title);
        parameter.put("director", director);
        parameter.put("rating", rating);

        return parameter;
    }

    private static Map<String, String> inputModifyMovie() {

        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 영화 코드를 입력: ");
        String code = sc.nextLine();
        System.out.print("수정할 제목: ");
        String title = sc.nextLine();
        System.out.print("수정할 감독: ");
        String director = sc.nextLine();
        System.out.print("수정할 별점: ");
        String rating = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("code", code);
        parameter.put("title", title);
        parameter.put("director", director);
        parameter.put("rating", rating);

        return parameter;
    }

    private static void detail() {
        Scanner sc = new Scanner(System.in);
        MovieController movieController = new MovieController();

        do {
            System.out.println("<상세조회>");
            System.out.println("1. 제목, 감독으로 찾기");
            System.out.println("2. 별점으로 보기");
            System.out.println("3. 뒤로가기");
            System.out.print(": ");
            int no = sc.nextInt();

            switch (no) {
                case 1: break;
                case 2: movieController.selectMovieByRating(inputRating()); break;
                case 3:
                    return;
            }
        } while (true);
    }

        private static Map<String, String> inputRating() {

            Scanner sc = new Scanner(System.in);
            System.out.print("별점 입력 : ");
            String rating = sc.nextLine();

            Map<String, String> parameter = new HashMap<>();
            parameter.put("rating", rating);

            return parameter;

    }



    }


