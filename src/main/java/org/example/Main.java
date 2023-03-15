package org.example;

import java.util.Scanner;

public class Main {
    //don't limit yourself to our template ***


    public static void main(String[] args) {
        NetflixService service = new NetflixService();
        String username = "username";
        String password = "password";
        User user = new User(username, password);
        runMenu(service, user);
    }

    public static void runMenu(NetflixService service, User user){

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1.Log in" + "\n" + "2.Log out" + "\n" + "3.Create account");
            int choice = input.nextInt();

            if (choice == 1) {
                System.out.println("Enter username : ");
                String username = input.next();
                System.out.println("Enter password : ");
                String password = input.next();
                if (service.login(username, password)) {
                    System.out.println("1. Search TV shows   2. Search movies" + "\n" + "3. Search favorite shows    4. Search favorite movies" + "\n" + "5. Add TV show    6. Add movie" + "\n" + "7. Add show to favorites    8. Add movie to favorites" + "\n" + "9. Show favorite shows list    10. Show favorite movies list");
                    int choice2 = input.nextInt();
                    if (choice2 == 1) {
                        System.out.println("1.Search by title" + "\t" + " 2.search by genre" + "\t" + "3.Search by release year");
                        int choice3 = input.nextInt();
                        if (choice3 == 1) {
                            System.out.println("Enter the title");
                            String title = input.next();
                            service.searchByTitle(title);
                        } else if (choice3 == 2) {
                            System.out.println("Enter genre");
                            String genre = input.next();
                            service.searchByGenre(genre);
                        } else if (choice3 == 3) {
                            System.out.println("Enter release year");
                            int releaseYear = input.nextInt();
                            service.searchByReleaseYear(releaseYear);
                        }
                    } else if (choice2 == 2) {
                        System.out.println("1.Search by title" + "\t" + " 2.search by genre" + "\t" + "3.Search by release year");
                        int choice3 = input.nextInt();
                        if (choice3 == 1) {
                            System.out.println("Enter the title");
                            String title = input.next();
                            service.searchMovieByTitle(title);
                        } else if (choice3 == 2) {
                            System.out.println("Enter genre");
                            String genre = input.next();
                            service.searchMovieByGenre(genre);
                        } else if (choice3 == 3) {
                            System.out.println("Enter release year");
                            int releaseYear = input.nextInt();
                            service.searchMovieByReleaseYear(releaseYear);
                        }
                    } else if (choice2 == 3) {
                        System.out.println("1.Search by title" + "\t" + " 2.search by genre" + "\t" + "3.Search by release year");
                        int choice3 = input.nextInt();
                        if (choice3 == 1) {
                            System.out.println("Enter the title");
                            String title = input.next();
                            user.searchByTitle(title);
                        } else if (choice3 == 2) {
                            System.out.println("Enter genre");
                            String genre = input.next();
                            user.searchByGenre(genre);
                        } else if (choice3 == 3) {
                            System.out.println("Enter release year");
                            int releaseYear = input.nextInt();
                            user.searchByReleaseYear(releaseYear);
                        }
                    } else if (choice2 == 4) {
                        System.out.println("1.Search by title" + "\t" + " 2.search by genre" + "\t" + "3.Search by release year");
                        int choice3 = input.nextInt();
                        if (choice3 == 1) {
                            System.out.println("Enter the title");
                            String title = input.next();
                            user.searchMovieByTitle(title);
                        } else if (choice3 == 2) {
                            System.out.println("Enter genre");
                            String genre = input.next();
                            user.searchMovieByGenre(genre);
                        } else if (choice3 == 3) {
                            System.out.println("Enter release year");
                            int releaseYear = input.nextInt();
                            user.searchMovieByReleaseYear(releaseYear);
                        }
                    } else if (choice2 == 5) {
                        System.out.println("Enter show's title");
                        String title = input.next();
                        System.out.println("Enter show's genre");
                        String genre = input.next();
                        System.out.println("Enter show's release year");
                        int releaseYear = input.nextInt();
                        System.out.println("Enter show's duration (by minutes)");
                        int duration = input.nextInt();
                        System.out.println("Enter show's rating");
                        int rating = input.nextInt();
                        TVShow newTVShow = new TVShow(title, genre, releaseYear, duration, rating);
                        service.addTVShow(newTVShow);
                    } else if (choice2 == 6) {
                        System.out.println("Enter movie's title");
                        String title = input.next();
                        System.out.println("Enter movie's genre");
                        String genre = input.next();
                        System.out.println("Enter movie's release year");
                        int releaseYear = input.nextInt();
                        System.out.println("Enter movie's duration (by minutes)");
                        int duration = input.nextInt();
                        System.out.println("Enter movie's rating");
                        int rating = input.nextInt();
                        System.out.println("Enter movie's length");
                        int length = input.nextInt();
                        Movie newMovie = new Movie(title, genre, releaseYear, duration, rating, length);
                        service.addMovie(newMovie);
                    } else if (choice2 == 7) {
                        System.out.println("Enter show's title");
                        String title = input.next();
                        System.out.println("Enter show's genre");
                        String genre = input.next();
                        System.out.println("Enter show's release year");
                        int releaseYear = input.nextInt();
                        System.out.println("Enter show's duration (by minutes)");
                        int duration = input.nextInt();
                        System.out.println("Enter show's rating");
                        int rating = input.nextInt();
                        TVShow newTVShow = new TVShow(title, genre, releaseYear, duration, rating);
                        user.addToFavorites(newTVShow);
                    } else if (choice2 == 8) {
                        System.out.println("Enter movie's title");
                        String title = input.next();
                        System.out.println("Enter movie's genre");
                        String genre = input.next();
                        System.out.println("Enter movie's release year");
                        int releaseYear = input.nextInt();
                        System.out.println("Enter movie's duration (by minutes)");
                        int duration = input.nextInt();
                        System.out.println("Enter movie's rating");
                        int rating = input.nextInt();
                        System.out.println("Enter movie's length (by minutes)");
                        int length = input.nextInt();
                        Movie newMovie = new Movie(title, genre, releaseYear, duration, rating, length);
                        user.addMovieToFavorites(newMovie);
                    } else if (choice2 == 9) {
                        user.viewFavorites();
                    } else if (choice2 == 10) {
                        user.viewFavoriteMovies();
                    }
                } else {
                    System.out.println("Invalid username or password");
                }
            } else if (choice == 2) {//????
                return;
            } else if (choice == 3) {
                System.out.println("Enter username : ");
                String username = input.next();
                System.out.println("Enter password : ");
                String password = input.next();
                service.createAccount(username, password);
            }
        }
    }
}
