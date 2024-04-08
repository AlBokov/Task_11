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
    public void radioNextStationBorder () {
        int numberCurrentRadioStation = 9;
        int expensted = 0;
        int actual = rad.prevStation();

        Assertions.assertEquals(expensted, actual);
    }

}
