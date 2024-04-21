package ru.netology.RadioTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

public class RadioTest {
    Radio rad = new Radio();

    // Тест переключение станции вперед
    @Test
    public void radioNextStation() {
         rad.selectionStation(4);
         int expected = 5;
         int actual = rad.nextStation();

        Assertions.assertEquals(expected, actual);
    }

   @Test
    public void radioNextStationUpperBound() {
       rad.selectionStation(9);
        int expensted = 0;
        int actual = rad.nextStation();

        Assertions.assertEquals(expensted, actual);
    }

    // Тест переключение станции назад
    @Test
    public void prevStation() {
        rad.selectionStation(4);
        int expected = 3;
        int actual = rad.prevStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void prevStationLowerBound() {
        rad.selectionStation(0);
        int expensted = 9;
        int actual = rad.prevStation();

        Assertions.assertEquals(expensted, actual);
    }

    // Тест перехода на любую из доступных станций
    @Test
    public void stantion(){
        rad.selectionStation(0);
        int expensted = 5;
        int actual = rad.selectionStation(5);

        Assertions.assertEquals(expensted, actual);
    }

    @Test
    public void stantionLowerBound(){
        rad.selectionStation(1);
        int expensted = 1;
        int actual = rad.selectionStation(-1);

        Assertions.assertEquals(expensted, actual);
    }

    @Test
    public void stantionUpperBound(){
        rad.selectionStation(3);
        int expensted = 3;
        int actual = rad.selectionStation(10);

        Assertions.assertEquals(expensted, actual);
    }

    // Тест прибавление звука
    @Test
    public void increaseVolume() {
        rad.volume(53);
        int expensted = 54;
        int actual = rad.increaseVolume();

        Assertions.assertEquals(expensted, actual);
    }

    @Test
    public void increaseVolumeUpperBound() {
        rad.volume(100);
        int expensted = 100;
        int actual = rad.increaseVolume();

        Assertions.assertEquals(expensted, actual);
    }

    // Тест убавление звука
    @Test
    public void reduceVolume() {
        rad.volume(55);
        int expensted = 54;
        int actual = rad.reduceVolume();

        Assertions.assertEquals(expensted, actual);
    }

    @Test
    public void reduceVolumeLowerBound() {
        rad.volume(0);
        int expensted = 0;
        int actual = rad.reduceVolume();

        Assertions.assertEquals(expensted, actual);
    }

    // Тест выбора звука
    @Test
    public void volume() {
        int expensed = 40;
        int actual = rad.volume(40);

        Assertions.assertEquals(expensed, actual);
    }


    @Test
    public void volumeSoundBorder() {
        int expensed = 0;
        int actual = rad.volume(101);

        Assertions.assertEquals(expensed, actual);
    }

    @Test
    public void volumeSound() {
        int expensed = 0;
        int actual = rad.volume(-1);

        Assertions.assertEquals(expensed, actual);
    }
}


