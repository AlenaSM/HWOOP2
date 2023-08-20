package ru.netology.domain;

public class Radio {
    private int currentVolume;
    private int currentStation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            setToMinVolume();
        } else if (newCurrentVolume > 100) {
            setToMaxVolume();
        } else {
            currentVolume = newCurrentVolume;
        }
    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setToMaxVolume() {
        currentVolume = 100;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            setToMaxStation();
        } else if (newCurrentStation > 9) {
            setToMinStation();
        } else {
            currentStation = newCurrentStation;
        }
    }

    public void nextStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }
    }

    public void setToMaxStation() {
        currentStation = 9;
    }

    public void setToMinStation() {
        currentStation = 0;
    }
}
