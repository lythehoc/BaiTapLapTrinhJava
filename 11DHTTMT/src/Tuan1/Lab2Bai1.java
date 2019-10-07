/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan1;

import java.util.Scanner;

/**
 *
 * @author lythehoc
 */
public class Lab2Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b, x;
        Scanner hoc = new Scanner(System.in);
        System.out.println("Nhap gia tri a cua phuong trinh bat nhat: ");
        a = hoc.nextDouble();
        System.out.println("Nhap gia tri b cua phuong trinh bat nhat: ");
        b = hoc.nextDouble();
        
        if (a==0) {
            if (b==0) {
                    System.out.println("Phuong trinh co vo so nghiem!");
            }
            else{
                System.out.println("Phuong trinh vo nghiem!");
            }
        }
        else{
            x=-b/a;
            System.out.println("Nghiem cua phuong trinh la: "+x);
        }
    }
    
}
