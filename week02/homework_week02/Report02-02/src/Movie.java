public class Movie {

    private String title;
    private String director;
    private int open;
    private String mainActor;
    private double rankPoint;

    public Movie(String title, String director, int open, String mainActor, double rankPoint) {
        this.title = title;
        this.director = director;
        this.open = open;
        this.mainActor = mainActor;
        this.rankPoint = rankPoint;
    }

    public void setRankPoint(double rankPoint) {
        this.rankPoint = rankPoint;
    }

    public String getDirectorLastName() {
        String[] name = director.split(" ");
        return name[name.length - 1];
    }

    @Override
    public String toString() {
        return String.format(
                "제목: %s, 감독: %s, 개봉: %d, 주연: %s, 평점: %.1f",
                title, director, open, mainActor, rankPoint
        );
    }
}