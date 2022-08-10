import java.util.Scanner;

public class main {
    Scanner scanner = new Scanner(System.in);

    public static void nhap(Student a[], int n) {
        for (int i = 0; i < n; i++) {
            a[i] = new Student();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap student thu: " + (i + 1));
            a[i].input();
        }
    }

    public static void xuat(Student a[], int n) {
        for (int i = 0; i < n; i++) {
            a[i].output();
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n < 0);
        Student a[] = new Student[n];
        System.out.println("Nhap lua chon: ");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                nhap(a, n);
                break;

            case 2:
                nhap(a, n);
                System.out.println("");
                System.out.printf("%-10s%-10s%-10s%-10s%-10%\n", "ID", "Name", "Age", "ID ", "Dis", "Pro");
                xuat(a, n);
                break;

            case 3:
                nhap(a, n);
                System.out.println("Nhap id can tim: ");
                int id = scanner.nextInt();
                System.out.printf("%-10s%-10s%-10s%-10s%-10%\n", "ID", "Name", "Age", "ID ", "Dis", "Pro");
                for (int i = 0; i < n; i++) {
                    if (a[i].getId()==id) {
                        a[i].output();
                    } else {
                        System.out.println("Khong tim thay id " + id);
                    }
                }
                break;

            case 4:
                nhap(a, n);
                System.out.printf("%-10s%-10s%-10s%-10s%-10%\n", "ID", "Name", "Age", "ID ", "Dis", "Pro");
                for (int i = 0; i < n; i++) {
                    if (a[i].x.getProvince().equals("ThanhHoa")) {
                        a[i].x.setProvince("HaiPhong");
                        a[i].output();
                    }
                    else {
                        System.out.println("Khong co hoc sinh ThanhHoa");
                    }
                }
                break;

            case 5:
                nhap(a, n);
                System.out.println("Nhap id can xoa: ");
                int viTriCanXoa = scanner.nextInt();
                int viTri = 0;
                for (int i = 0; i < n; i++) {
                    if (a[i].getId()==viTriCanXoa) {
                        viTri = i;
                    }
                }
                for (int i = viTri; i < n - 1; i++) {
                    a[i] = a[i + 1];
                }
                n--;
                System.out.printf("%-10s%-10s%-10s%-10s%-10%\n", "ID", "Name", "Age", "ID ", "Dis", "Pro");
                for (int i = 0; i < n; i++) {
                    a[i].output();
                }
                break;

            default:

                System.out.println("Khong co lua chon nay");
                break;
        }

    }
}
