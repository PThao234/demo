/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author win10
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day, month;
        day = scanner.nextInt();
        month = scanner.nextInt();
        switch(month){
                case 1:
                    if(day>0&&day<=19){
                        System.out.println("Ma Kết");
                    }
                    else if(day>=20&&day<=31){
                        System.out.println("Bảo Bình");
                    }
                    else{
                        System.out.println("NO DAY");
                    }
                    break;
                case 2:
                    if(day>0&&day<=18){
                        System.out.println("Bảo Bình");
                    }
                    else if(day>=19&&day<=29){
                        System.out.println("Song Ngư");
                    }
                    else{
                        System.out.println("NO DAY");
                    }break;
                case 3:
                    if(day>0&&day<=20){
                        System.out.println("Song Ngư");
                    }
                    else if(day>=21&&day<=31){
                        System.out.println("Bạch Dương");
                    }
                    else{
                        System.out.println("NO DAY");
                    }
                    break;
                case 4:
                    if(day>0&&day<=20){
                        System.out.println("Bạch Dương");
                    }
                    else if(day>=21&&day<=30){
                        System.out.println("Kim Ngưu");
                    }
                    else{
                        System.out.println("NO DAY");
                    }
                    break;
                case 5:
                    if(day>0&&day<=20){
                        System.out.println("Kim Ngưu");
                    }
                    else if(day>=21&&day<=31){
                        System.out.println("Song Tử");
                    }
                    else{
                        System.out.println("NO DAY");
                    }
                    break;
                case 6:
                    if(day>0&&day<=21){
                        System.out.println("Song Tử");
                    }
                    else if(day>=22&&day<=30){
                        System.out.println("Cử Giải");
                    }
                    else{
                        System.out.println("NO DAY");
                    }
                    break;
                case 7:
                    if(day>0&&day<=22){
                        System.out.println("Cử Giải");
                    }
                    else if(day>=23&&day<=31){
                        System.out.println("Sư Tử");
                    }
                    else{
                        System.out.println("NO DAY");
                    }
                    break;
                case 8:
                    if(day>0&&day<=22){
                        System.out.println("Sư Tử");
                    }
                    else if(day>=23&&day<=31){
                        System.out.println("Xử Nữ");
                    }
                    else{
                        System.out.println("NO DAY");
                    }
                    break;
                case 9:
                    if(day>0&&day<=22){
                        System.out.println("Xử Nữ");
                    }
                    else if(day>=23&&day<=30){
                        System.out.println("Thiên Bình");
                    }
                    else{
                        System.out.println("NO DAY");
                    }
                    break;
                case 10:
                    if(day>0&&day<=23){
                        System.out.println("Thiên Bình");
                    }
                    else if(day>=24&&day<=31){
                        System.out.println("Bọ Cạp");
                    }
                    else{
                        System.out.println("NO DAY");
                    }
                    break;
                case 11:
                    if(day>0&&day<=22){
                        System.out.println("Bọ Cạp");
                    }
                    else if(day>=23&&day<=30){
                        System.out.println("Nhân Mã");
                    }
                    else{
                        System.out.println("NO DAY");
                    }
                    break;
                case 12:
                    if(day>0&&day<=21){
                        System.out.println("Nhân Mã");
                    }
                    else if(day>=22&&day<=31){
                        System.out.println("Ma Kết");
                    }
                    else{
                        System.out.println("NO DAY");
                    }
                    break;
                default:System.out.println("NO MONTH");break;
                   
                    
        
        }
    }
    
}
