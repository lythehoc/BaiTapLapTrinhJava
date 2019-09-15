/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

import java.util.Scanner;

/**
 *
 * @author lythehoc
 */
public class sanPham {

        // TODO code application logic here
        private String tenSP;
	private double giaSP,giamGia;
	public sanPham() {
		
	}
	public sanPham(String tenSP, double giaSP, double giamGia) {
		super();
		this.tenSP = tenSP;
		this.giaSP = giaSP;
		this.giamGia = giamGia;
	}
	public sanPham(String tenSp, double donGia){
		this(tenSp, donGia, 0);
		}

	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public double getGiaSP() {
		return giaSP;
	}
	public void setGiaSP(double giaSP) {
		
		this.giaSP = giaSP;
	}
	public double getGiamGia() {
		return giamGia;
	}
	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}
	
	private double getThueNhapKhau() {
		return (giaSP*10)/100;

	}
	public void nhap() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập tên SP: ");
		tenSP=sc.nextLine();
		System.out.println("Nhập giá SP: ");
		giaSP=sc.nextDouble();
		System.out.println("Nhập mã giảm giá: ");
		giamGia=sc.nextDouble();
		//System.out.println("");
		
	}
	public void xuat() {
		// TODO Auto-generated method stub
		System.out.println("Tên SP: "+tenSP);
		System.out.println("Giá SP: "+giaSP);
		System.out.println("Giảm giá: "+giamGia);
		System.out.println("Thuế nhập khẩu: "+getThueNhapKhau());
	}
	
    }
    
