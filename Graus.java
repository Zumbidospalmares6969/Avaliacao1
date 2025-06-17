import java.util.Scanner;

public class Graus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor em °C:");
        int c = scanner.nextInt();
        int f = c * 9 / 5 + 32;
        double k = c + 273.15;
        System.out.println("°C será: " + c);
        System.out.println("A conversaõ de °F será; " + f);
        System.out.println("A conversaõ de K será; " + k);

    }
}
