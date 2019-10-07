/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan1;

import java.util.Scanner;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author lythehoc
 */
public class Lab2Bai4 {
    public static void bac1(){
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
    
    public static void bac2(){
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
    
    public static void dien(){
        double a, tien;
        Scanner hoc = new Scanner(System.in);
        System.out.println("Nhap vao so dien su dung trong thang: ");
        a = hoc.nextDouble();
        
        if (a < 50) {
            tien = a*1000;
            System.out.println("Tien dien phai dong la: "+tien +" dong");
        }
        else {
            tien= 50*1000+(a-50)*1200;
            System.out.println("Tien dien phai dong la: "+tien+" dong");
        }
    }
    
    public static void main(String[] args) {
        int luachon;
        System.out.println("+--------------------+");
	System.out.println("MENU \r\n 1.Giai phuong trinh bat nhat \r\n 2.Giai phong trinh bat hai \r\n 3.Tinh tien dien \r\n 4.Ket thuc");
	System.out.println("+--------------------+\r\n");
        Scanner hoc =new Scanner(System.in);
        luachon = hoc.nextInt();
        
        switch(luachon){
            
            case 1: bac1(); break;
            case 2: bac2(); break;
            case 3: dien(); break;
            case 4: break;
            default: System.out.println("Ban da nhap sai! DEO cho ban nhap nua :)");;
	}
    }
}
