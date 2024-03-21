import java.util.Scanner;

public class MayorEntreTresNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de los tres números enteros
        System.out.println("Ingrese el primer número:");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int numero2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número:");
        int numero3 = scanner.nextInt();

        // Comprobación del número mayor
        if (numero1 == numero2 && numero2 == numero3) {
            System.out.println("Los tres números son iguales: " + numero1);
        } else {
            int mayor = numero1;
            if (numero2 > mayor) {
                mayor = numero2;
            }
            if (numero3 > mayor) {
                mayor = numero3;
            }
            System.out.println("El número mayor es: " + mayor);
        }

        scanner.close();
    }
}
