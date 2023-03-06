public class homework7 {
    public static void main(String[] args) {
        cat cat1 = new cat("Barsik", 5);
        plate plate1 = new plate(100);
        plate1.info();
        cat1.eat(plate1);
        plate1.info();
    }
}
