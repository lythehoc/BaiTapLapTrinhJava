/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import java.util.Scanner;

/**
 *
 * @author lythehoc
 */
public class Bai4 {
    public static void main(String[] args) {
        double a=0, b, c, delta;
        Scanner nhap = new Scanner(System.in);
        while (a==0) {       
            System.out.println("Nhap vao he so a(a>0) cua phuong trinh bac 2: ");
        a = nhap.nextDouble();     
        }
        
        System.out.println("Nhap vao he so b cua phuong trinh bac 2: ");
        b = nhap.nextDouble();
        System.out.println("Nhap vao he so a cua phuong trinh bac 2: ");
        c = nhap.nextDouble();
        
        delta = Math.pow(b, 2) -4*a*c;
        System.out.println("Delta cua phuong trinh tren la: "+ delta);
        System.out.println("Can bac hai cua Delta la: "+ Math.sqrt(delta));
    }
}
