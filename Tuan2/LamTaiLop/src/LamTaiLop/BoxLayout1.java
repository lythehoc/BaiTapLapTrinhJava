/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LamTaiLop;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

/**
 *
 * @author lythehoc
 */
public class BoxLayout1 extends JFrame{
     public BoxLayout1(){
        super("Tim em trong con mo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }    
 public static void main(String[] args) {
        FlowLayout1 hoc = new FlowLayout1();
        hoc.setSize(600, 180);
        hoc.setLocationRelativeTo(null);
        hoc.setVisible(true);
        
        JPanel pnBox = new JPanel();
        Font chu =new Font("Arial", Font.BOLD | Font.ITALIC,25 );//set phong chu,co chu
         
        pnBox.setLayout(new javax.swing.BoxLayout(pnBox,javax.swing.BoxLayout.Y_AXIS));// X theo chieu ngang, Y theo chieu doc
        
        JButton nut1 = new JButton("BoxLayout la day chu dau");
        nut1.setBackground(Color.red);//set color bakroud cua buuton
        nut1.setForeground(Color.yellow);// set color text trong button
        nut1.setFont(chu);//chon bien font da dat phia tren
        pnBox.add(nut1);//add buuton vao Jpanel
        
        JButton nut2 = new JButton("NUT 2");
        nut2.setForeground(Color.red);
        nut2.setFont(chu);
        pnBox.add(nut2);
        
        JButton nut3 = new JButton("NUT 3");
        nut3.setForeground(Color.blue);
        nut3.setFont(chu);
        pnBox.add(nut3);
        
        JButton nut4 = new JButton("NUT 4");
        nut4.setForeground(Color.blue);
        nut4.setFont(chu);
        pnBox.add(nut4);
        
        hoc.add(pnBox);//add jpanel vao man hinh
    }
}
