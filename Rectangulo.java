import java.util.Scanner;
public class Rectangulo {
    public static void main(String[] args) {
        Scanner quest = new Scanner(System.in);
        System.out.print("ingrese una altura ");
        int num = quest.nextInt();
           quest.nextLine();
           
           System.out.print("ingrese un ancho ");
           int num0 = quest.nextInt();
           quest.nextLine();


           var num3 = num * num0;
           var num4 = num + num0 + num + num0;

            System.out.printf("el area es: %d y el perimetro es: %d ",num3,num4);
        quest.close();

    }
}
