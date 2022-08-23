import java.util.Scanner;

public class TrafficLightChecker {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int code;
        System.out.println("Enter a color code");
        code = sc.nextInt();

        if (code == 1) {
            System.out.println("Next traffic light is green");
        }
        else if (code == 2) {
            System.out.println("Next traffic light is yellow");
        }
        else if (code == 3) {
            System.out.println("Next traffic light is red");
        }
        else {
            System.out.println("Invalid color");
        }

    }

}
