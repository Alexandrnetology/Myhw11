package ru.netology.movies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {
    MovieManager manager = new MovieManager();

    @Test
    public void shouldAddMovie() {

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOneMovie() {

        manager.addMovie("Бладшот");

        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddFourMovie() {

        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Джентельмены");
        manager.addMovie("Номер один");

        String[] expected = {"Бладшот", "Вперёд", "Джентельмены", "Номер один"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFourMovie() {

        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Джентельмены");
        manager.addMovie("Номер один");

        String[] expected = {"Номер один", "Джентельмены", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFiveMovie() {

        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель <<Белград>>");
        manager.addMovie("Джентельмены");
        manager.addMovie("Номер один");

        String[] expected = {"Номер один", "Джентельмены","Отель <<Белград>>", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastSixMovie() {

        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель <<Белград>>");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Джентельмены");
        manager.addMovie("Номер один");

        String[] expected = {"Номер один", "Джентельмены","Человек-невидимка","Отель <<Белград>>", "Вперёд"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}