import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    private static ArrayList<CanBo> listCanBo = new ArrayList<CanBo>();
    private static Scanner sc = new Scanner (System.in);


    public static void main(String[] args) {
        int choose;
        do {
            System.out.println("\t\t\tMENU");
            System.out.println("1.Add 1 cán bộ vào List tương ứng");
            System.out.println("2.Hiển thị danh sách các cán bộ");
            System.out.println("3.Xóa 1 cán bộ theo id");
            System.out.println("4.Tìm kiếm 1 cán bộ theo id");
            System.out.println("5.Dừng chương trình");
            System.out.print(" Nhap vao lua chon cua ban : ");
            choose = sc.nextInt();
            switch (choose) {

                case 1: {
                    themCanBo();
                    break;
                }
                case 2: {
                    xuatCanBo();
                    break;
                }
                case 3: {
                    xoaCanBo();
                    break;
                }
                case 4: {
                    timCanBo();
                    break;
                }
                case 5: {
                    System.out.println("Dung chuong trinh");
                }
                default:
                    System.out.println("Khong thoa man lua chon");
                    break;

            }
        }while (choose != 5) ;
    }


    public static void themCanBo() {
        System.out.println("Nhap can bo: ");
        System.out.println("1-Cong nhan");
        System.out.println("2-Ky su");
        System.out.println("3-Nhan Vien");
        int chon = sc.nextInt();
        CanBo canBo = null;
        switch (chon) {
            case 1:
                canBo = new CongNhan();
                break;
            case 2:
                canBo = new KySu();
                break;
            case 3:
                canBo = new NhanVien();
                break;
            default:
                System.out.println("Khong quan ly");
                break;
        }
        canBo.input();
        listCanBo.add(canBo);

    }
    private static void xuatCanBo() {
        for(CanBo canBo : listCanBo) {
            canBo.output();
        }
    }

    private static void xoaCanBo() {
        System.out.println("Nhap id can xoa");
        int id = sc.nextInt();
        for(CanBo canBo : listCanBo) {
            if (canBo.getId() == id) {
                int elementToBeDeleted= id;
            }
            else {
                System.out.println("khong co id tuong ung");
            }
        }
    }

    private static void timCanBo() {
        System.out.println("Nhap id can tim");
        int id = sc.nextInt();
        for(CanBo canBo : listCanBo) {
            if (canBo.id == id) {
                canBo.output();
            }
            else {
                System.out.println("khong co id tuong ung");
            }
        }
    }


}
