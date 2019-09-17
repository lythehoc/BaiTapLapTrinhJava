/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LamTaiLop;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author lythehoc
 */
public class FlowLayout1 extends JFrame {
    public FlowLayout1(){
        // KHONG HIEU CAI GI XEM GHI CHU O BOXLAYOUT
        super("Tim em trong con mo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }    
    public static void main(String[] args) {
        FlowLayout1 hoc = new FlowLayout1();
        hoc.setSize(300, 600);
        hoc.setLocationRelativeTo(null);
        hoc.setVisible(true);
      
        JPanel pnFlow = new JPanel();
        pnFlow.setLayout(new FlowLayout());
        pnFlow.setBackground(Color.blue);
        
        JButton nut1 = new JButton("Flow layout");
        JButton nut2 = new JButton("add cac control");
        JButton nut3 = new JButton("Tren 1 dong");
        JButton nut4 = new JButton("Het cho chua ");
        JButton nut5 = new JButton("Thi xuong dong");
        
        pnFlow.add(nut1);
        pnFlow.add(nut2);
        pnFlow.add(nut3);
        pnFlow.add(nut5);
        pnFlow.add(nut4);
        
        hoc.add(pnFlow);
        
    }  
}

