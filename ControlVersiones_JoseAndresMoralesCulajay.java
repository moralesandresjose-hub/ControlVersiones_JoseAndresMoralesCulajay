package controlversiones_joseandresmoralesculajay;

import java.util.Scanner;

public class ControlVersiones_JoseAndresMoralesCulajay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ PRINCIPAL DEL PROGRAMA ===");
            System.out.println("1. Calcular promedio");
            System.out.println("2. Calcular número mayor");
            System.out.println("3. Calcular área de un rectángulo");
            System.out.println("4. Salir");
            System.out.println("Seleccione una de las siguientes opciones:");
            opcion = sc.nextInt();
            if (opcion < 1 || opcion > 4) {
    System.out.println("⚠️ Opción inválida, por favor ingrese un número entre 1 y 4.");
    continue; 
}

            switch (opcion) {
                case 1 -> calcularPromedio();
                case 2 -> numeroMayor();
                case 3 -> areaRectangulo();
                case 4 -> System.out.println("¡Gracias por usar el programa!");
                default -> System.out.println("Opción inválida, intente nuevamente.");
            }
        } while (opcion != 4);
    }

    public static void calcularPromedio() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese 3 notas separadas por espacio: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double promedio = (n1 + n2 + n3) / 3;
        System.out.println("El promedio es: " + promedio);
    }

    public static void numeroMayor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese 3 números separados por espacio: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int mayor = Math.max(a, Math.max(b, c));
        System.out.println("El número mayor es: " + mayor);
    }

    public static void areaRectangulo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese base: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese altura: ");
        double altura = sc.nextDouble();
        System.out.println("El área del rectángulo es: " + (base * altura));
    }
}
