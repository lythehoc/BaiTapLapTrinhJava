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
public class Lab1Bai3 {
    public static void main(String[] args) {
       double canh, theTich;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai canh: ");
        canh = sc.nextDouble();
        
        theTich = Math.pow(canh, 3);
        System.out.println("The tich cua hinh lap phuong la: "+ theTich);    
    }
}
