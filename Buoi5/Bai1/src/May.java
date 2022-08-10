import java.util.Scanner;

public class May {
    private String maMay;
    private String kieuMay;
    private String tinhTrang;

    public String getMaMay() {
        return maMay;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public String getKieuMay() {
        return kieuMay;
    }

    public void setKieuMay(String kieuMay) {
        this.kieuMay = kieuMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma may: ");
        maMay = scanner.next();
        System.out.println("Nhap kieu may: ");
        kieuMay = scanner.next();
        System.out.println("Nhap tinh trang: ");
        tinhTrang = scanner.next();
    }

    public void output() {
        System.out.println("Ma may: "+maMay);
        System.out.println("Kieu may: "+kieuMay);
        System.out.println("Tinh trang: "+tinhTrang);
    }
}
