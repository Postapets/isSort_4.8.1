import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Создание массива, введите кол-во элементов: ");
        int n = in.nextInt();
        int[] a = new int[n];
        System.out.println("Введите значения: ");
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }
        if(isSorted(a)) {
            System.out.println("Массив отсортирован. ");
        }
        else {
            System.out.println("Массив не отсортирован. ");
        }
    }

    public static boolean isSorted(int[] a) {
        int[] newA = Arrays.copyOf(a, a.length);
        Arrays.sort(newA);

        return Arrays.equals(a, newA);
    }
}
