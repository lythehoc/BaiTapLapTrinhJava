/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan1;

/**
 *
 * @author lythehoc
 */
public class Lab4Bai2 {
    public static void main(String[] args) {
        Lab4sanPham sp1=new Lab4sanPham();
		Lab4sanPham sp2=new Lab4sanPham();
		System.out.println("Nhập Thông Tin SP1: ");
		sp1.nhap();
		System.out.println();
		System.out.println("Nhập Thông Tin SP2: ");
		sp2.nhap();
		System.out.println();
		
		System.out.println("Thông tin SP1: ");
		sp1.xuat();
		System.out.println("--------------");
		System.out.println("Thông tin SP2: ");
		sp2.xuat();
		System.out.println();

    }
}
