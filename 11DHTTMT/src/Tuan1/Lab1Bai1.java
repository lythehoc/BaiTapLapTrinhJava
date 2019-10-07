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
public class Lab1Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        String hoTen = sc.nextLine();
        
        System.out.println("Nhap diem trung binh: ");
        double diemTB = sc.nextDouble();
        
        System.out.println("Ho va ten: " + hoTen );
        System.out.println("Diem trung binh: " + diemTB );
    }
}
