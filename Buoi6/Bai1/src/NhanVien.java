public class NhanVien extends CanBo{

    private String congViec;

    public NhanVien() {
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    public void input() {
        super.input();
        System.out.println("Nhap bac: ");
        congViec = scanner.next();
    }
    public void output() {
        super.output();
        System.out.printf("%-15s\n", this.congViec);
    }
}
