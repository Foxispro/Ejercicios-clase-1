import java.util.Scanner;
public class Temperatura {
    public static void main(String[] args) {
        Scanner quest = new Scanner(System.in);
        System.out.print("ingrese un numero ");
        int temperature = quest.nextInt();
        quest.nextLine();
         var farenheit = temperature * 9 / 5 + 32;
         var kelvin = temperature + 273.15F;

        System.out.printf("En Farenheit son: %d grados y en kelvin son: % grados",farenheit,kelvin);

        quest.close();
    }
}
