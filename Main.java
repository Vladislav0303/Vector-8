import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main extends MyVector {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введіть розмір масиву: ");
    try {
    int size_of_mass = sc.nextInt();
    sc.nextLine();
    int[] mass = new int[size_of_mass * 2];
    for (int i = 0; i < mass.length; i++) {
        while (i < size_of_mass) {
            System.out.println("Введіть значення яке хочете записати в масив: ");
            int el = sc.nextInt();
            sc.nextLine();
            mass[i] = el;
            i++;
            get(mass);
        }
        }
    System.out.println("Введіть число яке хочете додати в кінець масиву: ");
    int el = sc.nextInt();
    Add_Element_In_End(el, mass);
    get(mass);
    sc.nextLine();
    System.out.println("Введіть число який хочете додати в середину масиву: ");
    int el1 = sc.nextInt();
    Add_Element_In_Between(el1, mass);
    get(mass);
    sc.nextLine();
    System.out.println("Введіть число який хочете додати в початок масиву: ");
    int el2 = sc.nextInt();
    Add_Element_In_Start(el2, mass);
    get(mass);
    sc.nextLine();
        Add_Element(mass);
        capasity(mass);
        write_and_read(mass);
        System.out.println("Введіть елемент який хочете видалити за індексом: ");
        int el3 = sc.nextInt();
        Delete_Element(el3, mass);
        get(mass);
        sc.nextLine();
    System.out.println("Хочете видалити весь масив?: ");
    if(sc.nextLine().equals("Так")) {
    Clear_Mass(mass);
    }
    get(mass);
    } catch (InputMismatchException e) {
        System.out.println("Не вірно вказано значення");
    }
    }
}
