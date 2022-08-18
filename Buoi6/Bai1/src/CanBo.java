import java.util.Scanner;

public class CanBo {
    protected int id;
    protected String name;
    protected String birthday;
    protected String gender;
    protected String address;
    private static int temp = 0;
    public static Scanner scanner = new Scanner(System.in);
    public CanBo() {
        this.id = ++temp;
    }

    public int getId() {
        return id;
    }

    public void input() {
        System.out.println("Nhap ten: ");
        name = scanner.next();
        System.out.println("Nhap ngay/thang/nam");
        birthday = scanner.next();
        System.out.println("Nhap gioi tinh: ");
        gender = scanner.next();
        System.out.println("Nhap dia chi: ");
        address = scanner.next();
    }
    public void output() {
        System.out.printf("%-10d %-10s %-15s %-15s", this.id, this.name, this.birthday, this.address);
    }
}
