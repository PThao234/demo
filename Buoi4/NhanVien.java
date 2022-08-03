import java.util.Scanner;

public class NhanVien {
    private static Scanner scanner = new Scanner(System.in);
    private static int temp = 0;
    private int ma;
    private String name;
    private int age;
    private String add;
    private String boPhan;

    public void input(){
        System.out.println("Nhap ten: ");
        name = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        add = scanner.nextLine();
        System.out.println("Nhap bo phan: ");
        boPhan = scanner.nextLine();
    }
    public NhanVien(){
            ma = ++temp;
        }
    public void output() {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", ma, name, age, add, boPhan);
    }

    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien();
        NhanVien nv2 = new NhanVien();
        NhanVien nv3 = new NhanVien();
        NhanVien nv4 = new NhanVien();
        NhanVien nv5 = new NhanVien();
        nv1.input();
        nv2.input();
        nv3.input();
        nv4.input();
        nv5.input();
        System.out.println("            "+"THONG TIN CAC NHAN VIEN");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Manv", "Tennv", "Tuoi", "DiaChi", "BoPhan");
        nv1.output();
        nv2.output();
        nv3.output();
        nv4.output();
        nv5.output();
        }
    }

