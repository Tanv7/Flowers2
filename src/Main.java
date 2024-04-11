import java.util.Scanner;

public class Main {

public static void main(String[] args ) {

    String[] flowers = new String[]{"G", "C", "V"};
    Scanner scan = new Scanner( System.in);
    System.out.println("Введите количество дней: ");
    int days = scan.nextInt();
    // Меняем местами правый и центральный цветок
    String temp = flowers[2];
    flowers[2] = flowers[1];
    flowers[1] = temp;
    //Меняем местами левый и центральный цветок

    temp = flowers[0];
    flowers[0] = flowers[1];
    flowers[1] = temp;
    System.out.println("Переставляем цветы до К дней:");

    for (String flower : flowers)
    {
        System.out.println(flower);


    }

}
}

