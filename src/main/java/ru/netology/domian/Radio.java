package ru.netology.domian;

public class Radio {
    private int currentStationNumber;
    private int maxStationNumber = 9;
    private int minStationNumber = 0;
    private int currentSoundVolume;
    private int maxSoundVolume = 10;
    private int minSoundVolume = 0;

    public void addStationNumber() {
        if (currentStationNumber > maxStationNumber) {
            return;
        }
        if (currentStationNumber == maxStationNumber) {
            currentStationNumber = minStationNumber - 1;
            currentStationNumber++;
            return;
        }
        if (currentStationNumber < minStationNumber) {
            return;
        }
        currentStationNumber++;
    }

    public void downStationNumber() {
        if (currentStationNumber > maxStationNumber) {
            return;
        }
        if (currentStationNumber == minStationNumber) {
            currentStationNumber = maxStationNumber + 1;
            currentStationNumber--;
            return;
        }
        if (currentStationNumber < minStationNumber) {
            return;
        }
        currentStationNumber--;

    }

    public void addSoundVolume() {
        if (currentSoundVolume == maxSoundVolume) {
            return;
        }
        if (currentSoundVolume > maxSoundVolume) {

        }
        this.maxSoundVolume = currentSoundVolume;
        currentSoundVolume++;

    }

    public void downSoundVolume() {
        if (currentSoundVolume == minSoundVolume) {
            return;
        }
        if (currentSoundVolume > minSoundVolume) {
            this.currentSoundVolume = currentSoundVolume;
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

        }
        if (currentSoundVolume < minSoundVolume) {

        }
        this.currentSoundVolume = currentSoundVolume;
    }

}
