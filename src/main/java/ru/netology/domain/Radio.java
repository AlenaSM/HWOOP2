package ru.netology.domain;

public class Radio {
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;
    private int currentStation = minStation;

    public Radio(int numberStation) {
        this.maxStation = minStation + numberStation - 1;
        this.minStation = 0;
        this.currentStation = minStation;
    }

    public Radio () {

    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            setToMinVolume();
        } else if (newCurrentVolume > maxVolume) {
            setToMaxVolume();
        } else {
            currentVolume = newCurrentVolume;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setToMaxVolume() {
        currentVolume = maxVolume;
    }

    public void setToMinVolume() {
        currentVolume = minVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            setToMaxStation();
        } else if (newCurrentStation > maxStation) {
            setToMinStation();
        } else {
            currentStation = newCurrentStation;
        }
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minStation;
        }
    }

    public void prevStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }

    public void setToMaxStation() {
        currentStation = maxStation;
    }

    public void setToMinStation() {
        currentStation = minStation;
    }
}
