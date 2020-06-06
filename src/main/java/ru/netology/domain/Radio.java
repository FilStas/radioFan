package ru.netology.domain;

public class Radio {
    private int currentStationNumber;
    private int maxStationNumber = 10;
    private int minStationNumber = 0;
    private int currentSoundVolume;
    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;

    public Radio(int currentStationNumber, int maxStationNumber, int minStationNumber, int currentSoundVolume, int maxSoundVolume, int minSoundVolume) {
        this.currentStationNumber = currentStationNumber;
        this.maxStationNumber = maxStationNumber;
        this.minStationNumber = minStationNumber;
        this.currentSoundVolume = currentSoundVolume;
        this.maxSoundVolume = maxSoundVolume;
        this.minSoundVolume = minSoundVolume;
    }

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


    public int getCurrentStationNumber() {
        return currentStationNumber;
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

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
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
