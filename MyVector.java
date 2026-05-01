import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class MyVector {
    public int[] mass;

    public void Add_Element_In_End(int el) {
        for (int i = 0; i < mass.length; i++) {
            int end = mass.length / 2;
            mass[end - 1] = el;
        }
    }
    public void Add_Element_In_Between(int el) {
        for (int i = 0; i < mass.length; i++) {
            mass[mass.length / 4] = el;
        }
    }
    public void Add_Element_In_Start(int el) {
        for (int i = 0; i < mass.length; i++) {
            mass[0] = el;
        }
    }
    public void Delete_Element(int el3) {
        for (int i = 0; i < mass.length; i++) {
            mass[el3] = 0;
        }
    }
    public void Clear_Mass() {
        for (int i = 0; i < mass.length; i++) {
            mass[i] = 0;
        }
    }
    public void get() {
        System.out.println(Arrays.toString(mass));
    }
    public void capasity() {
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            if(mass[i] != 0) {
                count++;
            }
        }
        System.out.println("capasity: " + count);
        System.out.println("size: " + mass.length);
    }
    public void write() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть назву файлу куди хочете записати: ");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(sc.nextLine()))){
            bw.write(Arrays.toString(mass));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }}
    public void read() {
        Scanner sc = new Scanner(System.in);
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
    public void Add_Element() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mass.length; i++) {
            if(mass[i] == 0) {
                System.out.println("Хочете додати ще елемент якщо не має місця?: ");
                if(sc.nextLine().equals("Так")) {
                    System.out.println("Введіть значення яке хочете записати: ");
                    int el4 = sc.nextInt();
                    sc.nextLine();
                    mass[i] = el4;
                    get();
                }
            }
        }
    }
}