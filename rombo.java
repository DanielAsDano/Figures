import java.util.Scanner;

public class rombo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame la altura del rombo: ");
        int altura = scanner.nextInt();
        scanner.close();
        if (altura % 2 == 0) {
            altura += 1;
        }

        int a = 0;
        int espacios = altura / 2;
        int asteriscos = 1;
        while (a <= altura / 2) {
            for (int e = 0; e < espacios; e++) {
                System.out.print(" ");
            }
            for (int as = 0; as < asteriscos; as++) {
                System.out.print("*");
            }
            asteriscos += 2;
            espacios--;
            System.out.println();
            a++;
        }
        espacios = 1;
        asteriscos = altura - 2;
        a = 0;

        while (a < altura / 2) {
            for (int e = 0; e < espacios; e++) {
                System.out.print(" ");
            }
            for (int as = 0; as < asteriscos; as++) {
                System.out.print("*");
            }
            asteriscos -= 2;
            espacios++;
            System.out.println();
            a++;
        }

    }
}
