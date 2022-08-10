import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private int age;
    Address x = new Address();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getX() {
        return x;
    }

    public void setX(Address x) {
        this.x = x;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id student: ");
        id = scanner.nextInt();
        System.out.println("Nhap name: ");
        name = scanner.next();
        System.out.println("Nhap age: ");
        age = scanner.nextInt();
        x.input();

    }

    public void output() {
        System.out.printf("%-10s%-10s%-10s", id, name, age);
        x.output();
    }
}
