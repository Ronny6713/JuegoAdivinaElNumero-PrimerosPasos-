import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int Numero_Secreto = new Random().nextInt(10);
        Scanner Numero_Usuario = new Scanner(System.in);
        int Numero = 0;
        System.out.println("Ingrese un numero del 1 al 10");

        while (Numero != Numero_Secreto){
            Numero = Numero_Usuario.nextInt();
            if (Numero < Numero_Secreto){
                System.out.println("El Numero Secreto es Mayor, ingrese otro numero");
            } else if (Numero > Numero_Secreto){
                System.out.println("El Numero es menor, ingrese otro numero");
            } else if (Numero == Numero_Secreto) {
                System.out.println("--------------------------------------");
                System.out.println("Felicidades el Numero Secreto era: " + Numero_Secreto);
                System.out.println("--------------------------------------");
            }

        }
    }
}