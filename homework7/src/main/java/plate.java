public class plate {
    public int food;
    public plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        food -= n;
    }
    public void increaseFood(int j) { food += j;}
    public void info() {
        System.out.println("plate: " + food);
    }
}
