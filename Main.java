import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        MyVector vector = new MyVector();
        Scanner sc = new Scanner(System.in);
        try {
        System.out.println("Введіть розмір: ");
        int size = sc.nextInt();
        if(size < 1) {
            throw new NegativeSizeOfArray("Не вірний розмір");
        }
        vector.mass = new int[size * 2];
        for (int i = 0; i < vector.mass.length; i++) {
            while (i < vector.mass.length / 2) {
                System.out.println("~Введіть значення яке хочете записати~");
                System.out.println("Значення: ");
                int el = sc.nextInt();
                sc.nextLine();
                vector.mass[i] = el;
                i++;
                vector.get();
            }
        }
        System.out.println("Введіть число яке хочете додати в кінець: ");
        int el = sc.nextInt();
        vector.Add_Element_In_End(el);
        vector.get();
        sc.nextLine();
        System.out.println("Введіть число яке хочете додати в середину: ");
        int el1 = sc.nextInt();
        vector.Add_Element_In_Between(el1);
        vector.get();
        sc.nextLine();
        System.out.println("Введіть число яке хочете додати в початок: ");
        int el2 = sc.nextInt();
        vector.Add_Element_In_Start(el2);
        vector.get();
        sc.nextLine();
        vector.Add_Element();
        System.out.println("Введіть елемент який хочете видалити за індексом: ");
        int el3 = sc.nextInt();
        if(el3 < 0 || el3 > vector.mass.length - 1) {
            throw new WrongIndexOfDelete("Помилка видалення індексу, введіть корректний індекс");
        }
        vector.Delete_Element(el3);
        vector.get();
        vector.capasity();
        sc.nextLine();
        vector.write();
        vector.read();
        System.out.println("Хочете видалити все?: ");
        if (sc.nextLine().equals("Так")) {
            vector.Clear_Mass();
        }
        vector.get();
     } catch (InputMismatchException e) {
        System.out.println("Не вірне значення: ");
    }
}
}