import java.util.Scanner;
public class romboinverso{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dime la altura del rombo: ");
        int altura = scanner.nextInt();
        if(altura%2==0){
            altura +=1;
        }
        scanner.close();
        int mitad = altura/2;

        int asteriscos = mitad;
        int espacios = 1;

        int a= 0;

        while (a < mitad) {
            for(int ast = 0; ast< asteriscos; ast++){//imprime la primera linea de rombos
            System.out.print("*");
            }

            for(int esp = 0; esp < espacios; esp++){//imprime el espacio entre lineas de rombos
            System.out.print(" ");
            }

            for(int ast = 0; ast< asteriscos; ast++){//imprime segunda linea de rombos
            System.out.print("*");
            }
            asteriscos --;
            espacios +=2;
            System.out.println();

            a++;

        }
    
        asteriscos = 2;
        espacios = altura -4;
        a= 0;
        while (a < mitad -1) {
            for(int ast = 0; ast< asteriscos; ast++){//imprime la primera linea de rombos
            System.out.print("*");
            }

            for(int esp = 0; esp < espacios; esp++){//imprime el espacio entre lineas de rombos
            System.out.print(" ");
            }

            for(int ast = 0; ast< asteriscos; ast++){//imprime segunda linea de rombos
            System.out.print("*");
            }
            asteriscos ++;
            espacios -=2;

            System.out.println();
            a++;
        }
    }
}
