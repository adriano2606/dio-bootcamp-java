import java.util.Locale;
import java.util.Scanner;

public class Usuario {

    public static void main (String [] args) throws Exception{

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

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

        System.out.println("Type the channel you want to move to: ");
        int newChannel = scanner.nextInt();
        smartTv.changeToSpecifChannel(newChannel);

        System.out.println("What is the SmartTV Channel: " + smartTv.channel);

        System.out.println("----------------------");

        smartTv.turnOff();

        System.out.println("Is the SmartTV on: " + smartTv.on);
        System.out.println("What is the SmartTV Volume: " + smartTv.volume);
        System.out.println("What is the SmartTV Channel:" + smartTv.channel);

    }
    
}