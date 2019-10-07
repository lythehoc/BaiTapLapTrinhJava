/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan1;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import org.w3c.dom.traversal.NodeFilter;

/**
 *
 * @author lythehoc
 */
public class Lab3Bai3 {
    public static void main(String[] args) {
        int n;
        double trungBinhCong, tong =0, dem=0;
        Scanner hoc = new Scanner(System.in);
        System.out.println("Nhap vao so luong cac phan tu cua mang: ");
        n = hoc.nextInt();
        int []mang = new int[n];        
        for(int i=0; i < n; i++ ){
            System.out.println("Nhap vao phan tu thu a["+i+"]: ");
            mang[i]= hoc.nextInt();
        }
       
        Arrays.sort(mang); //sap xep mang
        System.out.println("Cac phan tu cua mang sau khi sap xep la: ");
        for(int i=0; i<n; i++){
            System.out.print(+mang[i]+" ");
        }
        
        int min=mang[0];
        for(int i=0; i<n; i++){
            if(mang[i] < min)  min= mang[i];
        }
        System.out.println("\r\nGia tri nho nhat cua mang la: "+min);
        
        for(int i=0; i<n; i++){
            if(mang[i] %3 == 0){
               tong= tong + mang[i];
               dem++;
            }
        }
        System.out.println("Tong cac phan tu chia het cho 3 la: "+tong);
        trungBinhCong=tong/ dem;
        System.out.println("Trung binh cong cua cac so do la: " +trungBinhCong );
    }    
}    
