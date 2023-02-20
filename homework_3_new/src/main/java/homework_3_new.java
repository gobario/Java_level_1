import java.util.Arrays;

public class homework_3_new {
    public static void main(String[] args) {
        changeMassive();
        fillingMassive();
        multiplicationMassive();
        diagonalMassive();
        System.out.println(Arrays.toString(intvalue(5, 3)));
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

}

