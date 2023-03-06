public class homework7 {
    public static void main(String[] args) {
//        cat cat1 = new cat("Barsik", 5);
//        plate plate1 = new plate(100);
//        plate1.info();
//        cat1.eat(plate1);
//        plate1.info();
        cat[] cats = new cat[3];
        cats[0] = new cat("Barsik", 5);
        cats[1] = new cat("Timofey", 800);
        cats[2] = new cat("Misa", 10);
        plate plate1 = new plate(100);
        plate1.info();
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate1);
            if (plate1.food <= 0) {
                System.out.println("Eda konec");
                break;
            }
            plate1.info();
        }
    }
}
