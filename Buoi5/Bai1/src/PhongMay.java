import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private  float dienTich;
    QuanLi x = new QuanLi();
    May y = new May();

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public QuanLi getX() {
        return x;
    }

    public void setX(QuanLi x) {
        this.x = x;
    }

    public May getY() {
        return y;
    }

    public void setY(May y) {
        this.y = y;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma phong: ");
        maPhong = scanner.next();
        System.out.println("Nhap ten phong: ");
        tenPhong = scanner.next();
        System.out.println("Nhap dien tich: ");
        dienTich = scanner.nextFloat();
        x.input();
        y.input();
    }

    public void output() {
        System.out.println("Ma phong: "+maPhong);
        System.out.println("Ten phong: "+tenPhong);
        System.out.println("Dien tich: "+dienTich);
        x.output();
        y.output();
    }
}
