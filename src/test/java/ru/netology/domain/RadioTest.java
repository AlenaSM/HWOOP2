package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(15);

        int expected = 15;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio volume = new Radio();

        volume.setCurrentVolume(120);

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio volume = new Radio();

        volume.setCurrentVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio volume = new Radio();

        volume.setToMaxVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolume() {
        Radio volume = new Radio();

        volume.setToMinVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume1() {
        Radio volume = new Radio();
        volume.setCurrentVolume(3);

        volume.increaseVolume();

        int expected = 4;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAboveMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume1() {
        Radio volume = new Radio();
        volume.setCurrentVolume(5);

        volume.decreaseVolume();

        int expected = 4;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeBelowMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation() {
        Radio station = new Radio();

        station.setCurrentStation(8);

        int expected = 8;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio station = new Radio();

        station.setCurrentStation(10);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationBelowMin() {
        Radio station = new Radio();

        station.setCurrentStation(-1);

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxStation() {
        Radio station = new Radio();

        station.setToMaxStation();

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinStation() {
        Radio station = new Radio();

        station.setToMinStation();

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation1() {
        Radio station = new Radio();
        station.setCurrentStation(3);

        station.prevStation();

        int expected = 2;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationBelowMin() {
        Radio station = new Radio();
        station.setCurrentStation(0);

        station.prevStation();

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation1() {
        Radio station = new Radio();
        station.setCurrentStation(3);

        station.nextStation();

        int expected = 4;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationAboveMax() {
        Radio station = new Radio();
        station.setCurrentStation(9);

        station.nextStation();

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}
