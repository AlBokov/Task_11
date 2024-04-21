package ru.netology.radio;


import org.w3c.dom.ls.LSOutput;

public class Radio {
    private int numberCurrentRadioStation;
    private int volumeSound;


    // Переключение станции вперед
    public int nextStation() {
        if (numberCurrentRadioStation == 9) {
            numberCurrentRadioStation = 0;
            return numberCurrentRadioStation;
        } else {
            numberCurrentRadioStation++;
            return numberCurrentRadioStation;
        }
    }


    // Переключение станции назад
    public int prevStation() {
        if (numberCurrentRadioStation == 0) {
            numberCurrentRadioStation = 9;
        } else {
            numberCurrentRadioStation--;
        }
        return numberCurrentRadioStation;
    }

    // Переключение станции во выбору
    public int selectionStation(int station) {
        if (station >= 0 && station <= 9) {
            numberCurrentRadioStation = station;
        } else {
            System.out.println("Нет такой станции");
        }
        return numberCurrentRadioStation;
    }


    // Установка звука
    public int volume(int target) {
        if (target >= 0 && target <= 100) {
            volumeSound = target;
        }
        return volumeSound;
    }

    // Прибавление звука на +1
    public int increaseVolume() {
        if (volumeSound < 100) {
            volumeSound = volumeSound + 1;
            return volumeSound;
        } else {
            return volumeSound;
        }
    }

    // Убавление звука на -1
    public int reduceVolume() {
        if (volumeSound > 0) {
            volumeSound = volumeSound - 1;
            return volumeSound;
        } else {
            return volumeSound;
        }
    }
}
