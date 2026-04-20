import java.util.Scanner;

public class LetraE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean valido = false;

        // Validación de entrada
        while (!valido) {
            System.out.print("Ingrese el tamano (5 - 20): ");
            String input = sc.nextLine();

            if (input.isEmpty()) {
                System.out.println("Error: no se permiten espacios vacios.");
                continue;
            }

            if (!input.matches("\\d+")) {
                System.out.println("Error: solo se permiten numeros.");
                continue;
            }

            n = Integer.parseInt(input);

            if (n < 5 || n > 20) {
                System.out.println("Error: el numero debe estar entre 5 y 20.");
            } else {
                valido = true;
            }
        }

        // Primera línea
        imprimirLinea(n);

        int restantes = n - 3;
        int arriba = restantes / 2;
        int abajo = restantes - arriba;

        // Parte superior vertical
        for (int i = 0; i < arriba; i++) {
            System.out.println("+");
        }

        // Línea central
        imprimirLinea(n);

        // Parte inferior vertical
        for (int i = 0; i < abajo; i++) {
            System.out.println("+");
        }

        // Última línea
        imprimirLinea(n);

        sc.close();
    }

    public static void imprimirLinea(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("+");
        }
        System.out.println();
    }
}