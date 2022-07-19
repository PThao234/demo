/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author win10
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int a, b, c;
      a = scanner.nextInt();
      b = scanner.nextInt();
      c = scanner.nextInt();
      if(a>0&&b>0&&c>0&&a+b>0&&b+c>00&&a+c>0){
          if(a==b&&b==c&&a==c){
              System.out.println("Tam giac deu");
          }
          else if(a==b)
              if(a*a+b*b==c*c){
                  System.out.println("Tam giac vuong can tai A ");
              }
              else{
                  System.out.println("Tam giac can tai A");
              }
          else if(b==c)
              if(b*b+c*c==a*a){
                  System.out.println("Tam giac vuong can tai C ");
              }
              else{
                  System.out.println("Tam giac can tai C");
              }
          else if(a==c)
              if(a*a+c*c==b*b){
                  System.out.println("Tam giac vuong can tai B");
              }
              else{
                  System.out.println("Tam giac can tai B");
              }
          else if(a*a+b*b==c*c){
              System.out.println("Tam giac vuong tai A");
          }
          else if(b*b+c*c==a*a){
              System.out.println("Tam giac vuong tai C");
          }
          else if(a*a+c*c==b*b){
              System.out.println("Tam giac vuong tai B");
          }
          else{
              System.out.println("Tam giac thuong");
          }
      }
      else{
          System.out.println("Khong la tam giac");
      }
        
    }
    
}
