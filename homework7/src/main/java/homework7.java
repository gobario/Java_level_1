public class homework7 {
    public static void main(String[] args) {
        int minAppetite;
        cat[] cats = new cat[3];
        cats[0] = new cat("Barsik", 25);
        cats[1] = new cat("Timofey", 10);
        cats[2] = new cat("Misa", 25);
        plate plate1 = new plate(100);
        plate1.info();
        minAppetite = cats[0].appetite;
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].appetite < minAppetite) minAppetite = cats[i].appetite;
        }
        int catsCounter = 0;
        do {
            if (catsCounter >= cats.length) catsCounter = 0;
            if ((plate1.food < cats[catsCounter].appetite)) break;
            cats[catsCounter].eat(plate1);
            plate1.info();
            if (plate1.food == 0) break;
            if (catsCounter == (cats.length - 1)){
                plate1.increaseFood(50);
                for (int j = 0; j < cats.length; j++) {
                    cats[j].sitost = false;
                }
            }
            catsCounter++;
            }
        while ((plate1.food >= minAppetite));
    }
}
