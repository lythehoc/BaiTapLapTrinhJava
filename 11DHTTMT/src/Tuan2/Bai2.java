/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan2;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author lythehoc
 */
public class Bai2 extends JFrame{
     public Bai2(){
        super("DEMO WINDOWS");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Bai2 ui =new Bai2();
        ui.setSize(400, 300);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
        
        JPanel hoc = new JPanel();
        hoc.setLayout(new FlowLayout());
        hoc.setBackground(Color.pink);
        
        JButton nut1= new JButton("Flowlayout");
        JButton nut2 = new JButton("add cac control tren 1 dong");
        JButton nut3 = new JButton("het cho chua");
        JButton nut4 = new JButton("THI XUONG DONG");
        
        hoc.add(nut1);
        hoc.add(nut2);
        hoc.add(nut3);
        hoc.add(nut4);
        
        ui.add(hoc);
    }
    
}
