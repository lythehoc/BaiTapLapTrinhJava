/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.util.Scanner;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author lythehoc
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        boolean kiemTra = true;
        Scanner hoc = new Scanner(System.in);
        System.out.println("Nhap vao mot so nguyen: ");
        a= hoc.nextInt();
        for(int i=2 ;i < a -1 ; i++ ){
            if ( a % i == 0) {
                kiemTra = false; break;
            }
        }
        if (kiemTra == false ) {
            System.out.println("So ban vua nhap KHONG phai la so nguyen to!");
        }
        else System.out.println("So ban vua nhap la so nguyen to!");
    }
}
