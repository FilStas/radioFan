package ru.netology.domian;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldAddStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        radio.addStationNumber();
        assertEquals(1,radio.getCurrentStationNumber());
    }

    @Test
    void shouldAddStationNumber9() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(8);
        radio.addStationNumber();
        assertEquals(9,radio.getCurrentStationNumber());
    }

    @Test
    void shouldAddStationNumberAfterMax() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        radio.addStationNumber();
        assertEquals(0,radio.getCurrentStationNumber());
    }

    @Test
    void shouldDownStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        radio.downStationNumber();
        assertEquals(8,radio.getCurrentStationNumber());
    }

    @Test
    void shouldDownStationNumberAfterMin() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        radio.downStationNumber();
        assertEquals(9,radio.getCurrentStationNumber());
    }

    @Test
    void shouldAddSoundVolume() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        radio.addSoundVolume();
        assertEquals(1,radio.getCurrentSoundVolume());
    }

    @Test
    void shouldAddSoundVolumeAfterMax() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(10);
        radio.addSoundVolume();
        assertEquals(10,radio.getCurrentSoundVolume());
    }

    @Test
    void shouldDownSoundVolume() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(10);
        radio.downSoundVolume();
        assertEquals(9,radio.getCurrentSoundVolume());
    }

    @Test
    void shouldDownSoundVolumeAfterMin() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        radio.downSoundVolume();
        assertEquals(0,radio.getCurrentSoundVolume());
    }
}