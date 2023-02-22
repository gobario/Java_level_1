public class homework_2 {
    public static void main(String[] args) {
        System.out.println(ckecksum(6,5));
        checknumber(-3);
        System.out.println(checkNumberboolean(-4));
        printstring("Hello world!", 2);
        System.out.println(checkYear(2106));
    }
    public static boolean ckecksum(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        }
        else return false;
    }
    public static void checknumber(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        }
        else System.out.println("Число отрицательное");
    }
    public static boolean checkNumberboolean(int a) {
        if (a >= 0) return false;
        else return true;
    }
    public static void printstring(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }
    public static boolean checkYear(int a) {
        if (a % 4 == 0) {
            if (a % 100 == 0) {
                if (a % 400 == 0) return true;
                else return false;
            }
            else return true;
        }
        else return false;
    }
}