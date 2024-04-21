import ru.netology.radio.Radio;


import ru.netology.radio.Radio;

public class Main {
    public static void main(String[] args) {
        Radio rad = new Radio();


        System.out.println(rad.volume(60));
        rad.reduceVolume();
        rad.reduceVolume();
        System.out.println(rad.volume(103));
        rad.increaseVolume();
        rad.increaseVolume();
        System.out.println();




//        radio.nextStation();
//        radio.nextStation();
//        radio.nextStation();
//        System.out.println(radio.numberCurrentRadioStation);
//
//
//        radio.prevStation();
//        System.out.println(radio.numberCurrentRadioStation);
//        radio.selectionStation(8);
//        System.out.println(radio.numberCurrentRadioStation);
    }
}