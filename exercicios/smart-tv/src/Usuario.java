public class Usuario {

    public static void main (String [] args) throws Exception{
        SmartTv smartTv = new SmartTv();

        System.out.println("Is the SmartTV on: " + smartTv.on);
        System.out.println("What is the SmartTV Volume: " + smartTv.volume);
        System.out.println("What is the SmartTV Channel: " + smartTv.channel);

        System.out.println("----------------------");

        smartTv.turnOn();
        smartTv.turnVolumeUp();
        smartTv.moveForwardChannel();
        

        System.out.println("Is the SmartTV on: " + smartTv.on);
        System.out.println("What is the SmartTV Volume: " + smartTv.volume);
        System.out.println("What is the SmartTV Channel:" + smartTv.channel);

        System.out.println("----------------------");

        smartTv.turnOn();
        smartTv.turnVolumeDown();
        smartTv.moveBackChannel();

        System.out.println("Is the SmartTV on: " + smartTv.on);
        System.out.println("What is the SmartTV Volume: " + smartTv.volume);
        System.out.println("What is the SmartTV Channel:" + smartTv.channel);

        System.out.println("----------------------");

        smartTv.changeToSpecifChannel(30);

        System.out.println("What is the SmartTV Channel: " + smartTv.channel);

        System.out.println("----------------------");

        smartTv.turnOff();

        System.out.println("Is the SmartTV on: " + smartTv.on);
        System.out.println("What is the SmartTV Volume: " + smartTv.volume);
        System.out.println("What is the SmartTV Channel:" + smartTv.channel);

    }
    
}