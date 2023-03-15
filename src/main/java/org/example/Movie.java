package org.example;

import java.util.ArrayList;

class Movie extends TVShow {
    /*
     *Movie is extended from TVShow and has extra attribute length.
     */
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Movie(String title, String genre, int releaseYear, int duration, int rating, int length) {
        super(title, genre, releaseYear, duration, rating);
        this.length = length;
    }
}
