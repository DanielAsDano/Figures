
import java.util.Scanner;
public class cruz{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dame la altura de la cruz: ");
        int altura = scanner.nextInt();  
        scanner.close();

        if(altura%2==0){
            altura +=1;
        }

        int a = 0;

        while(a<altura/2){
            for(int i = 0; i < altura-1; i++){
                System.out.print(" ");

        }
            System.out.println("*");
            a++;



        }
        for(int i=0; i <altura; i++){
            System.out.print("* ");
        }
        System.out.println();
        

        a = 0;
        while(a<altura/2){
            for(int i = 0; i < altura-1; i++){
                System.out.print(" ");

        }
            System.out.println("*");
            a++;

        }
    }
}
