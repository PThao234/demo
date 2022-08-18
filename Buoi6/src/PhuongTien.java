import java.util.Scanner;

public class PhuongTien {

    private static Scanner sc = new Scanner (System.in);
    private String tenChuXe;
    private String loaiXe;
    private float dungTich;
    private float triGia;
    public Scanner sn = new Scanner(System.in);

    public PhuongTien() {

    }

    public PhuongTien(String tenChuXe, String loaiXe, float dungTich, float triGia) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }

    public void nhap(){
        System.out.println("Nhap ten chu xe: ");
        tenChuXe = sc.nextLine();
        System.out.println("Nhap loai xe: ");
        loaiXe = sc.nextLine();
        System.out.println("Nhap dung tich: ");
        dungTich = sc.nextFloat();
        System.out.println("Nhap tri gia: ");
        triGia = sc.nextFloat();
    }

    public float tinhThue() {
        float thue;
        if (dungTich < 100)
            thue = (float) (triGia * 0.02);
        else if (dungTich >= 100 && dungTich <= 200)
            thue = (float) (triGia * 0.06);
        else
            thue = (float) (triGia * 0.1);
        return thue;
    }


    public void xuat() {
        System.out.printf("%10d %-15s %-15s %-15s %-15s %-15s \n ",  tenChuXe, loaiXe, dungTich, triGia, tinhThue());
    }

}

