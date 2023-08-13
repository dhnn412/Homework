package movie;

public class MovieDTO {

    private int code;
    private String title;
    private String director;
    private int rating;

    public MovieDTO() {
    }

    public MovieDTO(int code, String title, String director, int rating) {
        this.code = code;
        this.title = title;
        this.director = director;
        this.rating = rating;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "movieDTO{" +
                "code=" + code +
                ", title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", rating=" + rating +
                '}';
    }
}
