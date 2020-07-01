package com.example.android_project8;

public class Movie {
    String title = ;
    String mainActor = ;
    double movierate = ;
    int pgrate = ;
    String genre  = ;

    public Movie(String title, String mainActor, double movierate, int pgrate, String genre) {
        this.title = title;
        this.mainActor = mainActor;
        this.movierate = movierate;
        this.pgrate = pgrate;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMainActor() {
        return mainActor;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    public double getMovierate() {
        return movierate;
    }

    public void setMovierate(double movierate) {
        this.movierate = movierate;
    }

    public int getPgrate() {
        return pgrate;
    }

    public void setPgrate(int pgrate) {
        this.pgrate = pgrate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
