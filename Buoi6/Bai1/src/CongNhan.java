public class CongNhan extends CanBo{

    private String bac;

    public CongNhan() {
        bac = bac;
    }

    public String getBac() {
        return bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }

    public void input() {
            super.input();
            System.out.println("Nhap bac: ");
            bac = scanner.next();
    }
    public void output() {
        super.output();
        System.out.printf("%-15s\n",this.bac);
    }

}

