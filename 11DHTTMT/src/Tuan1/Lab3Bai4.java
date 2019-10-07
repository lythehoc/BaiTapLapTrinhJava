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
public class Lab3Bai4 {
    public static void main(String[] args) {
        System.out.println("Nhập số lượng học sinh:");
		      Scanner Sc = new Scanner (System.in);
		int amount= Sc.nextInt();
		double [] score = new double[amount];
		String [] name = new String [amount];
		if (amount >0)
		{
			importArray(name,score);
			System.out.println("Danh sách học sinh:");
			exportArray (name,score);
			System.out.println("Sắp xếp danh sách học sinh: ");
			sapxep(name,score);
		}
		else
		{
			System.out.println("Số lượng học sinh không hợp lệ.");
		}
		
}
	
	public static void importArray(String[] name, double [] score)
	{
		Scanner Sc = new Scanner(System.in);
		for (int i =0; i< name.length;i++)
		{
			System.out.println("Nhập tên học sinh:" +i);
			Sc = new Scanner (System.in);
			name[i] = Sc.nextLine();
			System.out.println("Nhập điểm học sinh:"+i);
			
			do
					{
				score[i] = Sc.nextDouble();
				if (score[i]<0|| score[i]>10)
				{
					System.out.println("Điểm không hợp lệ. Vui lòng nhập lại:");
				}
					}
				while
					(score[i] < 0 || score[i] >10);
				
				
				
		}
			
	}
	public static void exportArray (String [] name, double [] score)
	{
		 
		        for (int i = 1; i < name.length; i++) {
		            System.out.print("Tên: " + name[i] + " - Điểm = " + score[i]);
		            if (score[i] < 5) 
		            {
		                System.out.println(" - Học lực: Yếu");
		            }
		            else if (score[i] < 6.5) 
		            {
		            
		            	System.out.println(" - Học lực: Trung bình");
		            } 
		            else if (score[i] < 7.5) 
		            {
		                System.out.println(" - Học lực: Khá");
		            }
		            else if (score[i] < 9) 
		            {
		                System.out.println(" - Học lực: Giỏi");
		            }
		            else
		            {
		                System.out.println(" - Học lực: Xuất sắc");
		            }
		        }
		
	}
	public static void sapxep (String [] name, double [] score)
	{
		for (int i = 0 ; i < score.length; i++)
		{
			for (int j = i+1 ; j<score.length;j++)
			{
				if (score[i] > score[j])
				{
					double tempscore = score[i];
					score[i] = score [j];
					score[j] = tempscore;
					
					String tempname = name[i];
					name [i] = name[j];
					name [j] = tempname;
					
				}
			}
		}

		for(int i=0;i<name.length;i++)
		{
			System.out.println("Student " + (i+1));
			if(score[i]>=9)
			{
				System.out.println("Tên học sinh: " + name[i] +"\nĐiểm học sinh: " + score[i] +"\nHọc Lực:: Xuất Sắc");
			}
			else if(score[i] <9 && score[i] >=7.5)
			{
				System.out.println("Tên học sinh: " + name[i] +"\nĐiểm học sinh: " + score[i]+"\nHọc Lực:: Giỏi");
			}
			else if(score[i] <7.5 && score[i] >=6.5)
			{
				System.out.println("Tên học sinh: " + name[i] +"\nĐiểm học sinh: " + score[i]+"\nHọc Lực:: Khá");
			}
			else if(score[i] <6.5 && score[i] >=5)
			{
				System.out.println("Tên học sinh: " + name[i] +"\nĐiểm học sinh: " + score[i]+"\nHọc Lực:: Trung Bình");
			}
			else
			{
				System.out.println("Tên học sinh: " + name[i] +"\nĐiểm học sinh: " + score[i]+"\nHọc Lực:: Yếu");
			}
		}
    }
}
