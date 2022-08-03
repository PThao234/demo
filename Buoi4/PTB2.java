
import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class PTB2 {
    private static Scanner scanner = new Scanner(System.in);
    private float a;
    private float b;
    private float c;

    public void input(){
        System.out.println("Nhap a: ");
        a = scanner.nextFloat();
        System.out.println("Nhap b: ");
        b = scanner.nextFloat();
        System.out.println("Nhap c: ");
        c = scanner.nextFloat();

    }
    public void output(){
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);

    }
    public float tinh(){
        float delta;
        delta = b * b - 4 * a * c;
        if (a == 0)
        {
            if (b == 0)
            {
                if (c == 0)
                {
                    System.out.println("Vo so nghiem");
                }
                else
                {
                    System.out.println("Vo nghiem");
                }
            }
            else
            {
                System.out.println((float)(-c) / b);
            }

        }
        else
        {
            if (delta > 0)
            {
                float x1 = (float) ((-b - sqrt(delta)) / (2 * a));
                float x2 = (float) ((-b + sqrt(delta)) / (2 * a));
                System.out.println(x1+" "+x2);
            }
            else if (delta < 0)
            {
                System.out.println("Vo nghiem");
            }
            else
            {
                System.out.println((float)-b / (2 * a));
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        PTB2 pt = new PTB2();
        pt.input();
        pt.output();
        System.out.println(pt.tinh());
    }
}

