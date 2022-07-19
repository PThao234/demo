/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author win10
 */
public class Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
       int n;
       n = scanner.nextInt();
       int t = 0;
       for(int i=1; i<=n; i++){
           if(n%i==0){
               t+=i;
           }
       }
       System.out.println("Tong: " + t);
    }
    
}
