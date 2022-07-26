/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b3.b1;

import java.util.Scanner;

/**
 *
 * @author win10
 */
public class B3B1 {
    //Tính trung bình cộng các số lẻ ở vị trí chẵn
    public static float sumTB(int a[], int n){
        int d=0; int t=0;
        for(int i=0; i<n; i++){
            if(a[i]%2!=0 && (i+1)%2==0){
                d++;
                t+=a[i];
            }
        }
       return (float)t/d;
    }
//    Tìm vị trí các số nhỏ nhất trong mảng
    public static void min(int a[], int n){
        int m=a[0];
        for(int i=0; i<n;i++){
            if(m>a[i]){
                m=a[i];
            }
        }
        System.out.print("Vị trí số nhỏ nhât: ");
        for(int i=0; i<n; i++){
            if(m==a[i]){
                System.out.print(" "+(i+1));
            }
        }

    }
//    Kiểm tra mảng có số chính phương
    public static boolean squareNumber(int x){
        double z = Math.sqrt(x);
        return z == (int)z;
    }
    public static void squareNumberArr(int a[], int n){
        System.out.print("\nSố chính phương: ");
        for(int i=0; i<n; i++){
            if(squareNumber(a[i])){
               System.out.print(" "+a[i]);
            }
        }
    }
//    Hiển thị các số nguyên tố có trong mảng lên màn hình
    public static boolean primeNumber(int x){
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return x >= 2;
    }
    public static void primeNumberArr(int a[], int n){
        System.out.print("\nSố nguyên tố: ");
        for (int i = 0; i < n; i++) {
            if (primeNumber(a[i])) {
                System.out.print(" "+a[i]);
            }
        }
    }
//    Sắp xếp mảng đã nhập theo thứ tự tăng dần
    public static void sort(int a[], int n) {
        for (int i = 0; i < n-1; i++) {
            for (int j = n-1; j>i; j--) {
                if (a[j] < a[j-1]) {
                    int tg = a[j];
                    a[j] = a[j-1];
                    a[j-1] = tg;
                }
            }
        }
    }
    public static void main(String[] args) {
      int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
        System.out.println(sumTB(a, n));
        min(a, n);
        squareNumberArr(a, n);   
        primeNumberArr(a, n);
        sort(a, n);
        System.out.print("\nMảng tăng dần: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
    
}
