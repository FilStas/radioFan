package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Radio {
    private int currentStationNumber;
    private int maxStationNumber = 10;
    private int minStationNumber = 0;
    private int currentSoundVolume;
    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;

    public void addStationNumber() {
        if (currentStationNumber == maxStationNumber) {
            currentStationNumber = minStationNumber;
            return;
        }
        currentStationNumber++;
    }

    public void downStationNumber() {
        if (currentStationNumber == minStationNumber) {
            currentStationNumber = maxStationNumber;
            return;
        }
        currentStationNumber--;

    }

    public void addSoundVolume() {
        if (currentSoundVolume == maxSoundVolume) {
            return;
        }
        currentSoundVolume++;

    }

    public void downSoundVolume() {
        if (currentSoundVolume == minSoundVolume) {
            return;
        }
        currentSoundVolume--;
    }


    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber > maxStationNumber) {
            return;
        }
        if (currentStationNumber < minStationNumber) {
            return;
        }
        this.currentStationNumber = currentStationNumber;
    }


    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume > maxSoundVolume) {
            return;

        }
        if (currentSoundVolume < minSoundVolume) {
            return;

        }
        this.currentSoundVolume = currentSoundVolume;
    }

}
