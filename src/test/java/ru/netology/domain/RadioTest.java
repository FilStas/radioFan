package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    private Radio radio = new Radio(0,10,0,0,100,0);

    @Test
    void shouldAddStationNumberFromMin() {
        radio.setCurrentStationNumber(0);
        radio.addStationNumber();

        assertEquals(1, radio.getCurrentStationNumber());
    }

    @Test
    void shouldAddStationNumberBeforeMax() {
        radio.setCurrentStationNumber(9);
        radio.addStationNumber();

        assertEquals(10, radio.getCurrentStationNumber());
    }

    @Test
    void shouldAddStationNumberAfterMax() {
        radio.setCurrentStationNumber(10);
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
        radio.setCurrentStationNumber(10);
        radio.downStationNumber();

        assertEquals(9, radio.getCurrentStationNumber());
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

        assertEquals(10, radio.getCurrentStationNumber());
    }

    @Test
    void shouldDownStationNumberAfterMin() {
        radio.setCurrentStationNumber(0);
        radio.downStationNumber();

        assertEquals(10, radio.getCurrentStationNumber());
    }

    @Test
    void shouldAddSoundVolume() {
        radio.setCurrentSoundVolume(0);
        radio.addSoundVolume();

        assertEquals(1, radio.getCurrentSoundVolume());
    }

    @Test
    void shouldAddSoundVolumeMoreThanMax() {
        radio.setCurrentSoundVolume(101);
        radio.addSoundVolume();

        assertEquals(1, radio.getCurrentSoundVolume());
    }

    @Test
    void shouldAddSoundVolumeAfterMax() {
        radio.setCurrentSoundVolume(100);
        radio.addSoundVolume();

        assertEquals(100, radio.getCurrentSoundVolume());
    }

    @Test
    void shouldDownSoundVolume() {
        radio.setCurrentSoundVolume(100);
        radio.downSoundVolume();

        assertEquals(99, radio.getCurrentSoundVolume());
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
        radio.setCurrentStationNumber(100);

        assertEquals(0, radio.getCurrentStationNumber());
    }

    @Test
    void souldCurrentSoundVolumeMax() {
        radio.setCurrentSoundVolume(100);

        assertEquals(100, radio.getCurrentSoundVolume());
    }

    @Test
    void souldCurrentSoundVolumeMin() {
        radio.setCurrentSoundVolume(-1);

        assertEquals(0, radio.getCurrentSoundVolume());
    }
}