import java.util.Scanner;

public class Encuesta {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Introduce tu hobby: ");
        String hobby = scanner.nextLine();

        System.out.printf("Hola %s, tienes %d años y tu hobby es %s", nombre, edad, hobby);

        scanner.close();

    }
}
