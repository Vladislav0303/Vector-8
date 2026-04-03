import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class MyVector {
    public static void Add_Element_In_End(int el, int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            int end = mass.length / 2;
            mass[end - 1] = el;
        }
    }
    public static void Add_Element_In_Between(int el, int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            mass[mass.length / 4] = el;
        }
    }
    public static void Add_Element_In_Start(int el, int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            mass[0] = el;
        }
    }
    public static void Delete_Element(int el3, int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            if(el3 >= mass.length) {
                throw new MyException("Помилка, не вірно вказано індекс");
            }
            mass[el3] = 0;
        }
    }
    public static void Clear_Mass(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            mass[i] = 0;
        }
    }
    public static void get(int[] mass) {
            System.out.println(Arrays.toString(mass));
    }
    public static void write_and_read(int[] mass) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть назву файлу куди хочете записати масив: ");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(sc.nextLine()))){
            bw.write(Arrays.toString(mass));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Введіть назву файлу звідки хочете прочитати дані: ");
        try (BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))){
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void capasity(int[] mass) {
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            if(mass[i] != 0) {
                count++;
            }
        }
        System.out.println("capasity: " + count);
        System.out.println("size: " + mass.length);
        get(mass);
    }
    public static void Add_Element(int[] mass) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mass.length; i++) {
            if(mass[i] == 0) {
                System.out.println("Хочете додати ще елемент якщо масив заповнений?: ");
                if(sc.nextLine().equals("Так")) {
                System.out.println("Введіть значення яке хочете записати в масив: ");
                int el4 = sc.nextInt();
                sc.nextLine();
                mass[i] = el4;
                get(mass);
            }
        }
    }
}
}

