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
public class Lab1Bai2 {
   public static void main(String[] args) {
        double  a, b, chuVi,dienTich;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai canh thu nhat: ");
        a = sc.nextDouble();
        System.out.println("Nhap chieu dai canh thu hai: ");
        b = sc.nextDouble();
        
        chuVi = (a+b)*2;
        dienTich = a*b;
        System.out.println("Chu vi hinh chu nhat la: "+ chuVi);
        System.out.println("Dien tich hinh chu nhat la: "+ dienTich);
        System.out.println("Canh co do dai nho nhat la "+ Math.min(a,b));
     }
}
