public class animal {

    public String name;
    public int maxLengthRun = 0;
    public int masLengthSwim = 0;
    public animal(String name) {
        this.name = name;
    }
    public void animalRun(int length) {
        if (length > maxLengthRun){
            System.out.println("NO");
        }
        else System.out.println(name + " �������� " + length + " ������.");
    }
    public void animalSwim(int length) {
        if (length > masLengthSwim){
            System.out.println("NO");
        }
        System.out.println(name + " ������� " + length + " ������.");
    }
}
