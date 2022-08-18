
import java.util.Scanner;


public class Test {
    private static int n;
    private static PhuongTien a[] = new PhuongTien[100];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choose;
        do {
            System.out.println("\t\t\tMENU");
            System.out.println("1Nhập thông tin và tạo danh sách các xe ");
            System.out.println("2.Xuất bảng kê khai tiền thuế trước bạ của các xe");
            System.out.println("3. Xuất bảng kê khai tiền thuế trước bạ của các xe với tiền thuế giảm dần");
            System.out.println("4. Xuất bảng kê khai tiền thuế trước bạ của các xe với trị giá tăng dần\n");
            System.out.println("5.Thoát.");
            System.out.print(" Nhap vao lua chon cua ban : ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    nhapXe();
                    break;

                case 2:
                    xuatXe();
                    break;

                case 3:
                    xuatGiam();
                    break;

                case 4:
                    xuatTang();
                    break;

                case 5: {
                    System.out.println("Dung chuong trinh");
                }
                default:
                    System.out.println("Khong thoa man lua chon");
                    break;

            }

        } while (n != 5);
    }

        public static void nhapXe (){
            System.out.print("Nhap so luong phuong tien: ");
            n = sc.nextInt();
            a = new PhuongTien[n];
            for (int i = 0; i < n; i++) {
                a[i] = new PhuongTien();
            }
            for (int i = 0; i < n; i++) {
                System.out.println("Nhap xe thu: " + (i + 1));
                a[i].nhap();
            }
        }

    private static void xuatXe() {
        System.out.printf("%10d %-15s %-15s %-15s %-15s %-15s \n ",  "Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue");
        for (int i = 0; i < n; i++) {
            a[i].xuat();
        }
    }

    public static void xuatGiam() {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i].tinhThue() < a[j].tinhThue()) {
                    PhuongTien tg = a[i];
                    a[i] = a[j];
                    a[j] = tg;
                }
            }
        }
        xuatXe();
    }

    private static void xuatTang() {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i].tinhThue() > a[j].tinhThue()) {
                    PhuongTien tg = a[i];
                    a[i] = a[j];
                    a[j] = tg;
                }
            }
        }
        xuatXe();
    }

}



