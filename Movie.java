class Movie {
   
    private String title;
    private String genre;
    private String leadActor;
    private String director;
    private int releaseYear;
    private double rating;
    private String review;
   
    public Movie(String title, String genre, String leadActor, String director, int releaseYear, double rating) {
        this.title = title;
        this.genre = genre;
        this.leadActor = leadActor;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
        updateReview();
    }

    public void updateReview() {
        if (rating >= 5) {
            review = "Good";
        } else {
            review = "Not Good";
        }
    }
   
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Lead Actor: " + leadActor);
        System.out.println("Director: " + director);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Rating: " + rating);
        System.out.println("Review: " + review);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
       
        Movie movie1 = new Movie("Toofan", "Action", "Shakib Khan", "Raihan Rafi", 2024, 8.0);
        Movie movie2 = new Movie("Mujib: The Making of a Nation", "Biography", "Arifin Shuvo", "Shyam Benegal", 2023, 3.0);

        movie1.displayDetails();
        movie2.displayDetails();
    }
}
class Movie {
   
    private String title;
    private String genre;
    private String leadActor;
    private String director;
    private int releaseYear;
    private double rating;
    private String review;
   
    public Movie(String title, String genre, String leadActor, String director, int releaseYear, double rating) {
        this.title = title;
        this.genre = genre;
        this.leadActor = leadActor;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
        updateReview();
    }

    public void updateReview() {
        if (rating >= 5) {
            review = "Good";
        } else {
            review = "Not Good";
        }
    }
   
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Lead Actor: " + leadActor);
        System.out.println("Director: " + director);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Rating: " + rating);
        System.out.println("Review: " + review);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
       
        Movie movie1 = new Movie("Toofan", "Action", "Shakib Khan", "Raihan Rafi", 2024, 8.0);
        Movie movie2 = new Movie("Mujib: The Making of a Nation", "Biography", "Arifin Shuvo", "Shyam Benegal", 2023, 3.0);

        movie1.displayDetails();
        movie2.displayDetails();
    }
}
