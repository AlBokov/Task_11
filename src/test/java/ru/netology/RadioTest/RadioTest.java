package ru.netology.RadioTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.radio.Radio;

public class RadioTest {
    Radio rad = new Radio();

    @Test
    public void radioNextStation() {
         int expected = 5;
         int actual = rad.nextStation(4);

        Assertions.assertEquals(expected, actual);
    }

   @Test
    public void radioNextStationUpperBound() {
        int expensted = 0;
        int actual = rad.nextStation(9);

        Assertions.assertEquals(expensted, actual);
    }

    @Test
    public void prevStation() {
        int expected = 3;
        int actual = rad.prevStation(4);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationLowerBound() {
        int expensted = 9;
        int actual = rad.prevStation(0);

        Assertions.assertEquals(expensted, actual);
    }

    @Test
    public void stantion(){
        int expensted = 5;
        int actual = rad.selectionStation(5, 1);

        Assertions.assertEquals(expensted, actual);
    }

    @Test
    public void stantionLowerBound(){
        int expensted = 1;
        int actual = rad.selectionStation(-1, 1);

        Assertions.assertEquals(expensted, actual);
    }

    @Test
    public void stantionUpperBound(){
        int expensted = 3;
        int actual = rad.selectionStation(10, 3);

        Assertions.assertEquals(expensted, actual);
    }

    @Test
    public void increaseVolume() {
        int expensted = 54;
        int actual = rad.increaseVolume(53);

        Assertions.assertEquals(expensted, actual);
    }

    @Test
    public void increaseVolumeUpperBound() {
        int expensted = 100;
        int actual = rad.increaseVolume(100);

        Assertions.assertEquals(expensted, actual);
    }

    @Test
    public void reduceVolume() {
        int expensted = 54;
        int actual = rad.reduceVolume(55);

        Assertions.assertEquals(expensted, actual);
    }

    @Test
    public void reduceVolumeLowerBound() {
        int expensted = 0;
        int actual = rad.reduceVolume(0);

        Assertions.assertEquals(expensted, actual);
    }
}
