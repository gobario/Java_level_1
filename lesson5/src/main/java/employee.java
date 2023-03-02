public class employee {
    private String name;
    private String post;
    private String mail;
    private String mobile;
    private int salary;
    public int age;
    public employee(String name, String post, String mail, String mobile, int salary, int age) {
        this.name = name;
        this.post = post;
        this.mail = mail;
        this.mobile = mobile;
        this.salary = salary;
        this.age = age;
    }
    public void conc() {
        System.out.println("Имя: " + name + " Должность: " + post + " Почта: " + mail + " Телефон: " + mobile + " Зарплата: " + salary + " Возраст: " + age);
    }
}
