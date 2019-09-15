/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lythehoc
 */
public class Bai5 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhập số lượng SP: ");
		      Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		      ArrayList<sanPham> SanPham=new ArrayList<>(n);
		for(int i=0;i<n;i++) {
			sanPham sp=new sanPham();
			sp.nhap();
			SanPham.add(sp);
		}
		System.out.println("Các sản phẩm có trong mảng: ");
		for(int i=0;i<n;i++) {
			SanPham.get(i).xuat();
			System.out.println("------------");
		}
	}

}
