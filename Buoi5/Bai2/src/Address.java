import java.util.Scanner;

public class Address {
    private String id;
    private String district;
    private String province;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id address: ");
        id = scanner.next();
        System.out.println("Nhap district: ");
        district = scanner.next();
        System.out.println("Nhap province: ");
        province = scanner.next();

    }

    public void output() {
        System.out.printf("%-10s%-10s%-10s\n", id, district, province);
    }
}
