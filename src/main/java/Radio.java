public class Radio {
    private int currentRadioStation;
    private int maxNumRadio;

    private int currentVolume;

    public Radio(int maxNumRadio) {
        this.maxNumRadio = maxNumRadio;

    }

    public Radio() {
        this.maxNumRadio = 10;

    }

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
        if (newCurrentRadioStation >= this.maxNumRadio) {
            newCurrentRadioStation = this.maxNumRadio - 1;
        }
        this.currentRadioStation = newCurrentRadioStation;
    }

    public void next() {
        currentRadioStation++;

        if (currentRadioStation >= this.maxNumRadio) {
            this.currentRadioStation = 0;
        }

    }

    public void prev() {
        currentRadioStation--;

        if (currentRadioStation < 0) {
            currentRadioStation = this.maxNumRadio - 1;
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