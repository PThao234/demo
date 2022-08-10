import java.util.Scanner;

public class QuanLi {
    private String maQL;
    private String hoTen;

    public String getMaQL() {
        return maQL;
    }

    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma quan ly: ");
        maQL = scanner.next();
        System.out.println("Nhap ho ten: ");
        hoTen = scanner.next();
    }

    public void output() {
        System.out.println("Ma quan ly: "+maQL);
        System.out.println("Ho ten: "+hoTen);
    }
}
