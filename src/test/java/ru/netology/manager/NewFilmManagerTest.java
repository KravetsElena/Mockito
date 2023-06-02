package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmItem;

public class NewFilmManagerTest {
    FilmItem item1 = new FilmItem(1001, 101, "Бладшот", "боевик");
    FilmItem item2 = new FilmItem(1002, 102, "Вперед", "мультфильм");
    FilmItem item3 = new FilmItem(1003, 103, "Отель Белград", "комедия");
    FilmItem item4 = new FilmItem(1004, 104, "Джентельмены", "боевик");
    FilmItem item5 = new FilmItem(1005, 105, "Человек-невидимка", "ужасы");
    FilmItem item6 = new FilmItem(1006, 106, "Тролли. Мировой тур", "мультфильм");
    FilmItem item7 = new FilmItem(1007, 107, "Номер один", "комедия");


    @Test
    public void addAllItems() {
        NewFilmManager film = new NewFilmManager();
        film.saveNweFilm(item1);
        film.saveNweFilm(item2);
        film.saveNweFilm(item3);
        film.saveNweFilm(item4);
        film.saveNweFilm(item5);
        film.saveNweFilm(item6);
        film.saveNweFilm(item7);

        FilmItem[] expected = {item1, item2, item3, item4, item5, item6, item7};
        FilmItem[] actual = film.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addOneItems() {
        NewFilmManager film = new NewFilmManager();
        film.saveNweFilm(item2);

        FilmItem[] expected = {item2};
        FilmItem[] actual = film.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addNoneItems() {
        NewFilmManager film = new NewFilmManager();

        FilmItem[] expected = {};
        FilmItem[] actual = film.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {
        NewFilmManager film = new NewFilmManager();
        film.saveNweFilm(item1);
        film.saveNweFilm(item2);
        film.saveNweFilm(item3);
        film.saveNweFilm(item4);
        film.saveNweFilm(item5);
        film.saveNweFilm(item6);
        film.saveNweFilm(item7);

        FilmItem[] expected = {item7, item6, item5, item4, item3};
        FilmItem[] actual = film.findLast();

    }

    @Test
    public void shouldFindLastBeforeLimit() {
        NewFilmManager film = new NewFilmManager();
        film.saveNweFilm(item1);
        film.saveNweFilm(item2);
        film.saveNweFilm(item3);
        film.saveNweFilm(item4);

        FilmItem[] expected = {item4, item3, item2, item1};
        FilmItem[] actual = film.findLast();

    }
}
