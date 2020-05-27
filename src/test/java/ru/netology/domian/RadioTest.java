package ru.netology.domian;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void addStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        radio.addStationNumber();
        assertEquals(9,radio.getCurrentStationNumber());
    }
}