

import java.util.Scanner;

public class Employee {
    private static Scanner scanner = new Scanner(System.in);
    private String id;
    private String name;
    private int age;
    private int workingDays;
    private double salary;
    private static final int price = 50;
    public Employee() {

    }
    public Employee(String id, String name, int age, int workingDays) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.workingDays = workingDays;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public int getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }
    public float salary(){
        return workingDays * price;
    }

    public void input(){
        System.out.println("Nhap id: ");
        id = scanner.nextLine();
        System.out.println("Nhap ten: ");
        name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        age = scanner.nextInt();
        System.out.println("Nhap ngay lam viec: ");
        workingDays = scanner.nextInt();
    }
    public void output() {
        System.out.println("Ma nhan vien: " + id);
        System.out.println("Ho ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("So ngay di lam: " + workingDays);
        System.out.println("Luong: " + salary());
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.input();
        e.output();
    }
}

