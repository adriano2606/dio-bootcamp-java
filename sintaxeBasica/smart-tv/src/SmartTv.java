public class SmartTv {

    boolean on = false;
    int volume = 25;
    int channel = 1;

    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        on = false;
    }

    public void turnVolumeUp(){
        volume++;
    }

    public void turnVolumeDown(){
        volume--;
    }

    public void moveForwardChannel(){
        channel++;
    }

    public void moveBackChannel(){
        channel--;
    }

    public void changeToSpecifChannel(int channelNumber){
        channel = channelNumber;
    }



}
