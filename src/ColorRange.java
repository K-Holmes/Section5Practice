import java.util.Scanner;

public class ColorRange {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double code;
        System.out.println("Enter a color code");
        code = sc.nextDouble();

        if (code < 450 && code >= 380) {
            System.out.println("The color is Violet");
        }
        else if (code < 495 && code >= 450) {
            System.out.println("The color is Blue");
        }
        else if (code < 570 && code >= 495) {
            System.out.println("The color is Green");
        }
        else if (code < 590 && code >= 570) {
            System.out.println("The color is Yellow");
        }
        else if (code < 620 && code >= 590) {
            System.out.println("The color is Orange");
        }
        else if (code < 750 && code >= 620) {
            System.out.println("The color is Red");
        }
        else {
            System.out.println("The entered wavelength is not a part of the visible spectrum");
        }

    }
}
