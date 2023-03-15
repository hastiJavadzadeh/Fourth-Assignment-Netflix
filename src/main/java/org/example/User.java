package org.example;

import java.util.ArrayList;

class User {
    /*
    * The user should contain username password.
    * The user should contain an ArrayList of favorite shows and watch history.
    * FUNCTION: the user should have a function to watch a show and add it to watch history.
    *  *** NOTE: All search functions in user are for searching in favorite shows ***
    */

    private String username;
    private String password;

    ArrayList<TVShow> favShows = new ArrayList<>();
    ArrayList<Movie> favMovies = new ArrayList<>();
    ArrayList<TVShow> watchHistory = new ArrayList<>();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<TVShow> searchByTitle(String title) {
        // Implement search by title in favorite shows  logic here
        for (int i = 0; i < favShows.size(); i++) {
            if (title.equals(favShows.get(i).getTitle())) {
                System.out.println("Title: " + favShows.get(i).getTitle() + "\n" + "Genre: " + favShows.get(i).getGenre() + "\n" + "Release year: " + favShows.get(i).getReleaseYear() + "\n" + "Duration: " + favShows.get(i).getDuration() + "\n" + "Ratings: " + favShows.get(i).getRating());
            }
        }
        return null;
    }
    public ArrayList<TVShow> searchByGenre(String genre) {
        // Implement search by genre in favorite shows  logic here
        for (int i = 0; i < favShows.size(); i++) {
            if (genre.equals(favShows.get(i).getGenre())) {
                System.out.println("Title: " + favShows.get(i).getTitle() + "\n" + "Genre: " + favShows.get(i).getGenre() + "\n" + "Release year: " + favShows.get(i).getReleaseYear() + "\n" + "Duration: " + favShows.get(i).getDuration() + "\n" + "Ratings: " + favShows.get(i).getRating());
            }
        }
        return null;
    }
    public ArrayList<TVShow> searchByReleaseYear(int year) {
        // Implement search by release year in favorite shows logic here
        for (int i = 0; i < favShows.size(); i++) {
            if (year==(favShows.get(i).getReleaseYear())) {
                System.out.println("Title: " + favShows.get(i).getTitle() + "\n" + "Genre: " + favShows.get(i).getGenre() + "\n" + "Release year: " + favShows.get(i).getReleaseYear() + "\n" + "Duration: " + favShows.get(i).getDuration() + "\n" + "Ratings: " + favShows.get(i).getRating());
            }
        }
        return null;
    }

    public ArrayList<Movie> searchMovieByTitle(String title) {
        for (int i = 0; i < favMovies.size(); i++) {
            if (title.equals(favMovies.get(i).getTitle())) {
                System.out.println("Title: " + favMovies.get(i).getTitle() + "\n" + "Genre: " + favMovies.get(i).getGenre() + "\n" + "Release year: " + favMovies.get(i).getReleaseYear() + "\n" + "Duration: " + favMovies.get(i).getDuration() + "\n" + "Ratings: " + favMovies.get(i).getRating() + "\n" + "Length: " + favMovies.get(i).getLength());
            }
        }
        return null;
    }

    public ArrayList<Movie> searchMovieByGenre(String genre) {
        for (int i = 0; i < favMovies.size(); i++) {
            if (genre.equals(favMovies.get(i).getGenre())) {
                System.out.println("Title: " + favMovies.get(i).getTitle() + "\n" + "Genre: " + favMovies.get(i).getGenre() + "\n" + "Release year: " + favMovies.get(i).getReleaseYear() + "\n" + "Duration: " + favMovies.get(i).getDuration() + "\n" + "Ratings: " + favMovies.get(i).getRating() + "\n" + "Length: " + favMovies.get(i).getLength());
            }
        }
        return null;
    }

    public ArrayList<Movie> searchMovieByReleaseYear(int year) {
        for (int i = 0; i < favMovies.size(); i++) {
            if (year==(favMovies.get(i).getReleaseYear())) {
                System.out.println("Title: " + favMovies.get(i).getTitle() + "\n" + "Genre: " + favMovies.get(i).getGenre() + "\n" + "Release year: " + favMovies.get(i).getReleaseYear() + "\n" + "Duration: " + favMovies.get(i).getDuration() + "\n" + "Ratings: " + favMovies.get(i).getRating() + "\n" + "Length: " + favMovies.get(i).getLength());
            }
        }
        return null;
    }
    public void addToFavorites(TVShow show) {
        // Implement add to favorites logic here
        for (int i = 0; i < favShows.size(); i++) {
            if (show.equals(favShows.get(i))) {
                System.out.println("This show already exists in favorites list");
                return;
            }
        }
        favShows.add(show);
    }

    public void addMovieToFavorites(Movie movie) {
        for (int i = 0; i < favMovies.size(); i++) {
            if (movie.equals(favMovies.get(i))) {
                System.out.println("This movie already exists in favorites list");
                return;
            }
        }
        favMovies.add(movie);
    }
    public void viewFavorites() {
        // Implement view favorites logic here
        for(int i = 0; i < favShows.size(); i++) {
            System.out.println(favShows.get(i).getTitle() + " - " + favShows.get(i).getGenre() + " - " + favShows.get(i).getReleaseYear() + " - " + favShows.get(i).getDuration() + " - " + favShows.get(i).getRating());
        }
    }

    public void viewFavoriteMovies() {
        for(int i = 0; i < favMovies.size(); i++) {
            System.out.println(favMovies.get(i).getTitle() + " - " + favMovies.get(i).getGenre() + " - " + favMovies.get(i).getReleaseYear() + " - " + favMovies.get(i).getDuration() + " - " + favMovies.get(i).getRating() + " - " + favMovies.get(i).getLength());
        }
    }
    public void addToWatchHistory(TVShow show) {
        watchHistory.add(show);
    }

    public ArrayList<TVShow> getRecommendations() {//????????????
        // Implement get recommendations logic here
        return null;
    }

    public User(String username, String password) {
        this.username=username;
        this.password=password;
    }
}
