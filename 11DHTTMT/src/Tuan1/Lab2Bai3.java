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
public class Lab2Bai3 {
    public static void main(String[] args) {
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
}    
