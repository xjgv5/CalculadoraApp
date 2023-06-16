import java.sql.SQLOutput;
import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        int opcion;
        while (true){
            mostrarMenu();
            try{
                Scanner consola = new Scanner(System.in);
                opcion = Integer.parseInt(consola.nextLine());

                if(opcion >=1 && opcion <= 4 ){
                    ejecutarOperacion(opcion, consola);
                }
                else if (opcion  == 5) {
                    System.out.println("Hasta pronto");
                    break;
                }
                else {
                    System.out.println("Opción erronea");
                }
                System.out.println();

            }
            catch (Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }


        }
    }
    private static void mostrarMenu(){
        System.out.println("---- Aplicacion Calculadora ----");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division ");
        System.out.println("5. Salir");
        System.out.println("¿Que operacion desea realizar?");
    }

    private static void ejecutarOperacion(int opcion, Scanner consola){
        double operando1;
        double operando2;
        double resultado;
        System.out.println("Proporciona el primer valor : ");
        operando1 = Double.parseDouble(consola.nextLine());
        System.out.println("Proporciona el segundo valor");
        operando2 = Double.parseDouble(consola.nextLine());
        switch (opcion){
            case 1:
                resultado = operando1 + operando2;
                System.out.println("Resultado de la suma: " + resultado);
                break;
            case 2:
                resultado = operando1 - operando2;
                System.out.println("Resultado de la resta: " + resultado);
                break;
            case 3:
                resultado = operando1 * operando2;
                System.out.println("Resultado de la multiplicacion : " + resultado);
                break;
            case 4:
                resultado = operando1 / operando2;
                System.out.println("Resultado de la division: " + resultado);
                break;

            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}
