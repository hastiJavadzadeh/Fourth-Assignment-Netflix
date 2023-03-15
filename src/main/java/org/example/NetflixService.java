package org.example;

import java.util.ArrayList;

class NetflixService {
    /*
     *The NetflixService should have an Arraylist of users, tv shows and movies.
     *The NetflixService should have a User object which represents current user.
     */

    ArrayList<TVShow> tvShows = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();
    ArrayList<Movie> movies = new ArrayList<>();
    public void addTVShow(TVShow tvShow){
        // Implement add tv show logic here
        for (int i = 0; i < tvShows.size(); i++) {
            if (tvShow.equals(tvShows.get(i))) {
                System.out.println("This tv show already exists");
                return;
            }
        }
        tvShows.add(tvShow);
    }

    public void addMovie(Movie movie){
        // Implement add movie logic here
        for (int i = 0; i < movies.size(); i++) {
            if (movie.equals(movies.get(i))) {
                System.out.println("This movie already exists");
                return;
            }
        }
        movies.add(movie);
    }

    public void createAccount(String username, String password) {
        // Implement create account logic here
        for (int i = 0; i < users.size(); i++) {
            if (username.equals(users.get(i).getUsername())) {
                System.out.println("This username already exists");
                return;
            }
        }
        User newUser = new User(username, password);
        users.add(newUser);
    }

    public boolean login(String username, String password) {
        // Implement login logic here
        for (int i = 0; i < users.size(); i++) {
            if (username.equals(users.get(i).getUsername()) && password.equals(users.get(i).getPassword())) {
                return true;
            }
        }
        return false;
    }

    public void logout() { //?????????????????????????????????
        // Implement logout logic here
    }

    public ArrayList<TVShow> searchByTitle(String title) {
        // Implement search by title logic here
        for (int i = 0; i < tvShows.size(); i++) {
            if (title.equals(tvShows.get(i).getTitle())) {
                System.out.println("Title: " + tvShows.get(i).getTitle() + "\n" + "Genre: " + tvShows.get(i).getGenre() + "\n" + "Release year: " + tvShows.get(i).getReleaseYear() + "\n" + "Duration: " + tvShows.get(i).getDuration() + "\n" + "Ratings: " + tvShows.get(i).getRating());
            }
        }
        return null;
    }

    public ArrayList<TVShow> searchByGenre(String genre) {
        // Implement search by genre logic here
        for (int i = 0; i < tvShows.size(); i++) {
            if (genre.equals(tvShows.get(i).getGenre())) {
                System.out.println("Title: " + tvShows.get(i).getTitle() + "\n" + "Genre: " + tvShows.get(i).getGenre() + "\n" + "Release year: " + tvShows.get(i).getReleaseYear() + "\n" + "Duration: " + tvShows.get(i).getDuration() + "\n" + "Ratings: " + tvShows.get(i).getRating());
            }
        }
        return null;
    }

    public ArrayList<TVShow> searchByReleaseYear(int year) {
        // Implement search by release year logic here
        for (int i = 0; i < tvShows.size(); i++) {
            if (year==(tvShows.get(i).getReleaseYear())) {
                System.out.println("Title: " + tvShows.get(i).getTitle() + "\n" + "Genre: " + tvShows.get(i).getGenre() + "\n" + "Release year: " + tvShows.get(i).getReleaseYear() + "\n" + "Duration: " + tvShows.get(i).getDuration() + "\n" + "Ratings: " + tvShows.get(i).getRating());
            }
        }
        return null;
    }

    public ArrayList<Movie> searchMovieByTitle(String title) {
        for (int i = 0; i < movies.size(); i++) {
            if (title.equals(movies.get(i).getTitle())) {
                System.out.println("Title: " + movies.get(i).getTitle() + "\n" + "Genre: " + movies.get(i).getGenre() + "\n" + "Release year: " + movies.get(i).getReleaseYear() + "\n" + "Duration: " + movies.get(i).getDuration() + "\n" + "Ratings: " + movies.get(i).getRating() + "\n" + "Length: " + movies.get(i).getLength());
            }
        }
        return null;
    }

    public ArrayList<Movie> searchMovieByGenre(String genre) {
        for (int i = 0; i < movies.size(); i++) {
            if (genre.equals(movies.get(i).getGenre())) {
                System.out.println("Title: " + movies.get(i).getTitle() + "\n" + "Genre: " + movies.get(i).getGenre() + "\n" + "Release year: " + movies.get(i).getReleaseYear() + "\n" + "Duration: " + movies.get(i).getDuration() + "\n" + "Ratings: " + movies.get(i).getRating() + "\n" + "Length: " + movies.get(i).getLength());
            }
        }
        return null;
    }

    public ArrayList<Movie> searchMovieByReleaseYear(int year) {
        for (int i = 0; i < movies.size(); i++) {
            if (year==(movies.get(i).getReleaseYear())) {
                System.out.println("Title: " + movies.get(i).getTitle() + "\n" + "Genre: " + movies.get(i).getGenre() + "\n" + "Release year: " + movies.get(i).getReleaseYear() + "\n" + "Duration: " + movies.get(i).getDuration() + "\n" + "Ratings: " + movies.get(i).getRating() + "\n" + "Length: " + movies.get(i).getLength());
            }
        }
        return null;
    }

}

