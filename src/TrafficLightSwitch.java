import java.util.Scanner;

public class TrafficLightSwitch {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int code;
        System.out.println("Enter a color code");
        code = sc.nextInt();

        switch (code) {
            case 1:
                System.out.println("Next traffic light is green");
                break;
            case 2:
                System.out.println("Next traffic light is yellow");
                break;
            case 3:
                System.out.println("Next traffic light is red");
                break;
            default:
                System.out.println("Invalid color");
                break;
        }

    }

}
