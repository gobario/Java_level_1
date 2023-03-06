public class cat {
    private String name;
    public int appetite;
    public boolean sitost;
    public cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.sitost = false;
    }
    public void eat(plate p) {
        p.decreaseFood(appetite);
        sitost = true;
    }
}
