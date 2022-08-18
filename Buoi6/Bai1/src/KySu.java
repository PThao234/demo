public class KySu extends CanBo{
    private String nganhDaoTao;

    public KySu() {
        nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        nganhDaoTao = nganhDaoTao;
    }

    public void input() {
        super.input();
        System.out.println("Nhap nganh dao tao: ");
        nganhDaoTao = scanner.next();
    }

    public void output() {
        super.output();
        System.out.printf("%-15s\n", this.nganhDaoTao);
    }
}
