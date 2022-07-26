/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b3b2;

import java.util.Scanner;

/**
 *
 * @author win10
 */
public class B3B2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nhap vao chuoi s : ");
        String s = scanner.nextLine();
        s = s.replaceAll(" ", "");
        String firstLetter = s.substring(0, 1);
        String remainingLetters = s.substring(1, s.length());
        firstLetter = firstLetter.toUpperCase();
        s = firstLetter + remainingLetters;
  
        System.out.println(" Chuoi s: " + s);
    }

}
