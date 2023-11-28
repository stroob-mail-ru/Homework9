import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();

        System.out.println();
        System.out.println("Задача 1");
        // System.out.println(Arrays.toString(arr));

        int payoutsSum = 0;
        for (int element : arr) {
            payoutsSum += element;
        }
        System.out.println("Сумма трат за месяц составила " + payoutsSum + " рублей");
    }

    public static void task2() {
        int[] arr = generateRandomArray();

        System.out.println();
        System.out.println("Задача 2");
        // System.out.println(Arrays.toString(arr));

        int payoutsMax = 0;
        int payoutsMin = 300_000;
        for (int element : arr) {
            if (element > payoutsMax) {
                payoutsMax = element;
            }
            if (element < payoutsMin) {
                payoutsMin = element;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + payoutsMin + " рублей. Максимальная сумма трат за день составила " + payoutsMax + " рублей");
    }

    public static void task3() {
        int[] arr = generateRandomArray();

        System.out.println();
        System.out.println("Задача 3");
        // System.out.println(Arrays.toString(arr));

        int payoutsSum = 0;
        for (int element : arr) {
            payoutsSum += element;
        }
        double averagePayout = (double) payoutsSum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averagePayout + " рублей");
    }

    public static void task4() {

        System.out.println();
        System.out.println("Задача 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >=0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}