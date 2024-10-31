import java.util.Scanner;
public class CalculadoraCrear {
    public static void main(String[] args) {
     Scanner quest = new Scanner(System.in);
     System.out.print("ingrese un numero ");
     int num = quest.nextInt();
        quest.nextLine();
        
        System.out.print("ingrese un numero ");
        int num0 = quest.nextInt();
        quest.nextLine();

        var num1 = num + num0;

        var num2 = num - num0;

        var num3 = num * num0;

        var num4 = num / num0;
        
         System.out.printf("Los posibles resultados son:%d , %d , %d y %d",num1,num2,num3,num4);
     quest.close();
    }
}
