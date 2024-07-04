import java.util.Scanner;

public class UI {
    public static void main(String[] args) {
        Calc calculadora = new Calc();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elija una operación: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");

        int operacion = scanner.nextInt();

        System.out.println("Ingrese el primer número: ");
        int n1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int n2 = scanner.nextInt();

        int resultado = 0;
        switch (operacion) {
            case 1:
                resultado = calculadora.suma(n1, n2); //sumar
                break;
            case 2:
                resultado = calculadora.resta(n1, n2); //restar
            
                break;
            case 3:
                resultado = calculadora.multiplicacion(n1, n2);
                break;
            default:
                System.out.println("Operación no válida");
                return;
        }

        System.out.println("El resultado es: " + resultado);
    }
}
//Prueba conflicto