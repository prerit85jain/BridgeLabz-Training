package movieManagementSystem;

class Movie {
    String title;
    String director;
    int yearOfRelease;
    String rating;

    Movie(String title, String director, int yearOfRelease, String rating) {
        this.title = title;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
    }
}