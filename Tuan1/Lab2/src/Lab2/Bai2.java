/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

import java.util.Scanner;

/**
 *
 * @author lythehoc
 */
public class Bai2 {
    public static void main(String[] args) {
        double a, b, c, delta, x ,x1 ,x2;
        Scanner hoc = new Scanner(System.in);
        System.out.println("Nhap vao gia tri a cua phuong trinh: ");
        a = hoc.nextDouble();
        System.out.println("Nhap vao gia tri b cua phuong trinh: ");
        b = hoc.nextDouble();
        System.out.println("Nhap vao gia tri c cua phuong trinh: ");
        c = hoc.nextDouble();
        
        if (a==0) {
            if (b==0) {
                if (c==0) {
                    System.out.println("Phuong trinh co vo so nghiem!");
                }
                else{
                System.out.println("Phuong trinh vo nghiem!");
                }
            }
            else{
            x=-c/b;
            System.out.println("Nghiem cua phuong trinh la: "+x);
            }
        }
        else{
            delta = Math.pow(b, 2) -4*a*c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem!");
            }
            if (delta == 0) {
                x= -b/(2*a);
                System.out.println("Phuong trinh co nghiem kep: "+x);
            }
            if (delta > 0) {
               double tam=0;
               tam= Math.sqrt(delta);
               x1 = (-b+tam)/(2*a);
               x2 = (-b-tam)/(2*a);
                System.out.println("Phuong trinh co hai nghiem phan biet la:");
                System.out.println("x1 = "+x1);
                System.out.println("x2 = "+x2);
            }
        }
    }
}
