import java.util.Scanner;

public class SecuenciaSignos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean valido = false;
        System.out.print("=========Programa para imprimir una secuencia=========\r\n");
        // Validación de entrada
        while (!valido) {
            System.out.print("Ingrese un numero entero positivo: ");
            String entrada = scanner.nextLine();

            // Verifica que solo contenga dígitos
            if (entrada.matches("\\d+")) {
                numero = Integer.parseInt(entrada);

                if (numero > 0) {
                    valido = true;
                } else {
                    System.out.println("Error: el numero debe ser mayor que 0.");
                }
            } else {
                System.out.println("Error: no se permiten letras, espacios ni caracteres especiales.");
            }
        }

        // Generar secuencia
        StringBuilder secuencia = new StringBuilder();

        for (int i = 0; i < numero; i++) {
            if (i % 2 == 0) {
                secuencia.append("+");
            } else {
                secuencia.append("-");
            }
        }

        System.out.println("Secuencia: " + secuencia.toString());
        System.out.print("=========Fin Del Programa=========");
        scanner.close();
    }
}