package ru.netology.domian;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void shouldAddStationNumberFromMin() {

        radio.setCurrentStationNumber(0);
        radio.addStationNumber();
        assertEquals(1, radio.getCurrentStationNumber());
    }

    @Test
    void shouldAddStationNumberBeforeMax() {

        radio.setCurrentStationNumber(8);
        radio.addStationNumber();
        assertEquals(9, radio.getCurrentStationNumber());
    }

    @Test
    void shouldAddStationNumberAfterMax() {

        radio.setCurrentStationNumber(9);
        radio.addStationNumber();
        assertEquals(0, radio.getCurrentStationNumber());
    }

    @Test
    void shouldAddStationNumberMoreThanMax() {

        radio.setCurrentStationNumber(11);
        radio.addStationNumber();
        assertEquals(1, radio.getCurrentStationNumber());
    }

    @Test
    void shouldDownStationNumberFromMax() {


        radio.setCurrentStationNumber(9);
        radio.downStationNumber();

        assertEquals(8, radio.getCurrentStationNumber());
    }


    @Test
    void shouldDownStationNumberBeforeMin() {


        radio.setCurrentStationNumber(1);
        radio.downStationNumber();

        assertEquals(0, radio.getCurrentStationNumber());
    }

    @Test
    void shouldDownStationNumberLessThanMin() {


        radio.setCurrentStationNumber(-1);
        radio.downStationNumber();

        assertEquals(9, radio.getCurrentStationNumber());
    }

    @Test
    void shouldDownStationNumberAfterMin() {


        radio.setCurrentStationNumber(0);
        radio.downStationNumber();

        assertEquals(9, radio.getCurrentStationNumber());
    }

    @Test
    void shouldAddSoundVolume() {


        radio.setCurrentSoundVolume(0);
        radio.addSoundVolume();

        assertEquals(1, radio.getCurrentSoundVolume());
    }

    @Test
    void shouldAddSoundVolumeMoreThanMax() {

        radio.setCurrentSoundVolume(11);
        radio.addSoundVolume();
        assertEquals(1, radio.getCurrentSoundVolume());
    }

    @Test
    void shouldAddSoundVolumeAfterMax() {

        radio.setCurrentSoundVolume(10);
        radio.addSoundVolume();
        assertEquals(10, radio.getCurrentSoundVolume());
    }

    @Test
    void shouldDownSoundVolume() {

        radio.setCurrentSoundVolume(10);
        radio.downSoundVolume();
        assertEquals(9, radio.getCurrentSoundVolume());
    }

    @Test
    void shouldDownSoundVolumeAfterMin() {

        radio.setCurrentSoundVolume(0);
        radio.downSoundVolume();
        assertEquals(0, radio.getCurrentSoundVolume());
    }

    @Test
    void shouldDownSoundVolumeMinLimit() {

        radio.setCurrentSoundVolume(-1);
        radio.downSoundVolume();
        assertEquals(0, radio.getCurrentSoundVolume());
    }

    @Test
    void shouldCurrentStationNumberMinLimit() {

        radio.setCurrentStationNumber(-1);
        assertEquals(0, radio.getCurrentStationNumber());
    }

    @Test
    void shouldCurrentStationNumberMaxLimit() {

        radio.setCurrentStationNumber(10);
        assertEquals(0, radio.getCurrentStationNumber());
    }

    @Test
    void souldCurrentSoundVolumeMax() {

        radio.setCurrentSoundVolume(10);
        assertEquals(10, radio.getCurrentSoundVolume());
    }

    @Test
    void souldCurrentSoundVolumeMin() {

        radio.setCurrentSoundVolume(-1);
        assertEquals(0, radio.getCurrentSoundVolume());
    }
}