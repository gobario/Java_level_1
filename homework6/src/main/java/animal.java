public class animal {
    public int length;
    public String name;
    public animal(String name, int length) {
        this.name = name;
        this.length = length;
    }
    public void animalRun() {
        System.out.println(name + " �������� " + length + " ������.");
    }
    public void animalSwim() {
        System.out.println(name + " ������� " + length + " ������.");
    }
}
