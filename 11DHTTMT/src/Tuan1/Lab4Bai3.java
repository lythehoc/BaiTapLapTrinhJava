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
public class Lab4Bai3 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab4sanPham sp1=new Lab4sanPham();
		Lab4sanPham sp2=new Lab4sanPham();
		System.out.println("Nhập Thông Tin SP1: ");
		sp1.nhap();
		System.out.println();
		System.out.println("Nhập Thông Tin SP2: ");
		sp2.nhap();
		System.out.println();		
		System.out.println("Sản Phẩm Giảm Giá");
		sp1=new Lab4sanPham(sp1.getTenSP(),sp1.getGiaSP(),sp1.getGiamGia());
		sp1.xuat();
		
		System.out.println("--------------");
		System.out.println("Sản Phẩm Không Giảm Giá");
		sp2=new Lab4sanPham(sp2.getTenSP(),sp2.getGiaSP());
		sp2.xuat();
		System.out.println();
	}

}
