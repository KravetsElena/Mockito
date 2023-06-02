package ru.netology.domain;

public class FilmItem {

    private int id;
    private int filmId;
    private String filmName;
    private String filmGenre;

    public FilmItem(int id, int filmId, String filmName, String filmGenre) {
        this.id = id;
        this.filmId = filmId;
        this.filmName = filmName;
        this.filmGenre = filmGenre;
    }


}
