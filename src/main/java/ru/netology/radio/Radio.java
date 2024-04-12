package ru.netology.radio;


public class Radio {
    public int numberCurrentRadioStation;
    public int volumeSound;


    // Переключается станицию вперед
    public int nextStation(int numberCurrentRadioStation) {
        if (numberCurrentRadioStation == 9) {
            numberCurrentRadioStation = 0;
            return numberCurrentRadioStation;
        } else {
            numberCurrentRadioStation++;
            return numberCurrentRadioStation;
        }

    }


    // Переключается станции назад
    public int prevStation(int numberCurrentRadioStation) {
        if (numberCurrentRadioStation == 0) {
            numberCurrentRadioStation = 9;
        } else {
            numberCurrentRadioStation--;
        }
        return numberCurrentRadioStation;
    }

    public int selectionStation(int station, int numberCurrentRadioStation) {
        if (station >= 0 && station <= 9) {
            numberCurrentRadioStation = station;
        } else {
            System.out.println("Нет такой станции");
        }
        return numberCurrentRadioStation;
    }

    public int increaseVolume(int volumeSound) {
        if (volumeSound < 100) {
            volumeSound++;
        }
        return volumeSound;

    }

    public int reduceVolume(int volumeSound) {
        if (volumeSound > 0) {
            volumeSound--;
        }
        return volumeSound;

    }

}
