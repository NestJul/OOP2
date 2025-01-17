public class Radio {
    private int currentRadioStation;

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
        if (currentVolume < 0) {
            this.currentVolume = 0;
        }
        if (currentVolume > 100) {
            this.currentVolume = 100;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            newCurrentRadioStation = 0;
        }
        if (newCurrentRadioStation > 9) {
            newCurrentRadioStation = 9;
        }
        this.currentRadioStation = newCurrentRadioStation;
    }

    public void next() {
        currentRadioStation++;

        if (currentRadioStation > 9) {
            this.currentRadioStation = 0;
        }

    }

    public void prev() {
        currentRadioStation--;

        if (currentRadioStation < 0) {
            currentRadioStation = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            this.currentVolume++;
        }

    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            this.currentVolume--;
        }

    }

}