import java.util.Scanner;
public class Rectangle {
    private static Scanner scanner = new Scanner(System.in);
    private float d;
    private float r;
    public void input(){
        System.out.println("Nhap chieu dai: ");
        d = scanner.nextFloat();
        System.out.println("Nhap chieu rong: ");
        r = scanner.nextFloat();
    }
    public void output(){
        System.out.println("Chieu dai: "+d);
        System.out.println("Chieu rong: "+r);
    }
    public float perimeter(){
        return 2*(d+r);
    }
    public float area(){
        return d*r;
    }

    public static void main(String[] args) {
        Rectangle hcn1 = new Rectangle();
        Rectangle hcn2 = new Rectangle();
        hcn1.input();
        hcn1.output();
        System.out.println("Chu vi: "+ hcn1.perimeter());
        System.out.println("Dien tich: "+ hcn1.area());
        hcn2.input();
        hcn2.output();
        System.out.println("Chu vi: "+ hcn2.perimeter());
        System.out.println("Dien tich: "+ hcn2.area());
        if(hcn1.area()>hcn2.area()){
            System.out.println("Hinh chu nhat 1 lon hon hinh chu nhat 2");
        }

        else if(hcn1.area()==hcn2.area()){
            System.out.println("Hai hinh chu nhat bang nhau");
        }
        else{
            System.out.println("Hinh chu nhat 2 lon hon hinh chu nhat 1");

        }
    }
}
