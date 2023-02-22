import java.util.Arrays;

public class homework_3_new {
    public static void main(String[] args) {
        changeMassive(); //задание 1
        fillingMassive(); //задание 2
        multiplicationMassive(); // задание 3
        diagonalMassive(); // задание 4
        System.out.println(Arrays.toString(intvalue(5, 3))); // задание 5
        minmaxElements(); // задание 6
        System.out.println(checkBalance()); // задание 7
    }
    public static void changeMassive() {
        int[] massive = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(massive));
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] == 1) {
                massive[i] = 0;
            }
            else massive[i] = 1;
        }
        System.out.println(Arrays.toString(massive));
    }
    public static void fillingMassive() {
        int[] massive = new int[100];
        int count = 1;
        for (int i = 0; i < massive.length; i++) {
            massive[i] = count;
            count++;
        }
        System.out.println(Arrays.toString(massive));
    }
    public static void multiplicationMassive() {
        int[] massive = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < massive.length; i++) {
            if (massive[i] < 6) massive[i]*=2;
        }
        System.out.println(Arrays.toString(massive));
    }
    public static void diagonalMassive() {
        int[][] massive = new int[5][5];
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive.length; j++) {
                if (i == j) massive[i][j] = 1;
                else if (i == (massive.length - j - 1)) massive[i][j] = 1;
                else massive[i][j] = 0;
                System.out.print(massive[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static int[] intvalue(int len, int initialValue) {
        int[] massive = new int[len];
        for (int i = 0; i < len; i++) {
            massive[i] = initialValue;
        }
        return massive;
    }
    public static void minmaxElements() {
        int[] massive = {2, 1, 3, 4, 6, 5};
        int counter = massive[0];
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] < counter) counter = massive[i];
        }
        System.out.println("Минимальное число в массиве: " + counter);
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] > counter) counter = massive[i];
        }
        System.out.println("Максимальное число в массиве: " + counter);
    }
    public static boolean checkBalance() {
        int[] massive = {1, 2, 3, 4, 4, 3, 2, 1};
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < massive.length; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < i; j++) {
                sum1 += massive[j];
            }
            for (int j = i; j < massive.length; j++) {
                sum2 += massive[j];
            }
            if (sum1 == sum2) return true;
        }
        return false;
    }
}

