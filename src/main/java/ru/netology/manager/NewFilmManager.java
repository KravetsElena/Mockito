package ru.netology.manager;

import ru.netology.domain.FilmItem;

public class NewFilmManager {

    private FilmItem[] items = new FilmItem[0];
    private int maxFilms;


    public NewFilmManager() {       //конструктор пустой
        this.maxFilms = 5;

    }

    public NewFilmManager(int maxFilms) {
        this.maxFilms = maxFilms;

    }

    public void saveNweFilm(FilmItem item) {//добавление нового фильма
        FilmItem[] tmp = new FilmItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;


    }

    public FilmItem[] findAll() {               //вывод в порядке добавления
        return items;
    }

    public FilmItem[] findLast() {           //вывод последних
        int resultLength;
        if (items.length < 5) {
            resultLength = items.length;
            ;
        } else {
            resultLength = 5;
        }

        FilmItem[] all = new FilmItem[resultLength];
        for (int i = 0; i < all.length; i++) {
            all[i] = items[items.length - 1 - i];
        }
        return all;
    }

}
