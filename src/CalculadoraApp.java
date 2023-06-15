import java.sql.SQLOutput;
import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        int operando1;
        int operando2;
        int opcion;
        int resultado;

        System.out.println("---- Aplicacion Calculadora ----");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division ");
        System.out.println("5. Salir");
        System.out.println("¿Que operacion desea realizar?");
        Scanner consola = new Scanner(System.in);
        opcion = Integer.parseInt(consola.nextLine());

        switch (opcion){
            case 1:
                System.out.println("Proporciona el primer valor : ");
                operando1 = Integer.parseInt(consola.nextLine());
                System.out.println("Proporciona el segundo valor");
                operando2 = Integer.parseInt(consola.nextLine());
                resultado = operando1 + operando2;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                System.out.println("Proporciona el primer valor : ");
                operando1 = Integer.parseInt(consola.nextLine());
                System.out.println("Proporciona el segundo valor");
                operando2 = Integer.parseInt(consola.nextLine());
                resultado = operando1 - operando2;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                System.out.println("Proporciona el primer valor : ");
                operando1 = Integer.parseInt(consola.nextLine());
                System.out.println("Proporciona el segundo valor");
                operando2 = Integer.parseInt(consola.nextLine());
                resultado = operando1 * operando2;
                System.out.println("Resultado: " + resultado);
            case 4:
                System.out.println("Proporciona el primer valor : ");
                operando1 = Integer.parseInt(consola.nextLine());
                System.out.println("Proporciona el segundo valor");
                operando2 = Integer.parseInt(consola.nextLine());
                resultado = operando1 / operando2;
                System.out.println("Resultado: " + resultado);
                break;

        }


    }
}
