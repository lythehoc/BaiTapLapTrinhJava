/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan2;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author lythehoc
 */
public class Bai4 extends JFrame{
     public Bai4(){
        super("Bai 4");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }    
 public static void main(String[] args) {
        FlowLayout1 hoc = new FlowLayout1();
        hoc.setSize(600, 600);
        hoc.setLocationRelativeTo(null);
        hoc.setVisible(true);
        
        JPanel pBorder = new JPanel();
            pBorder.setLayout(new BorderLayout());
        JPanel pNorth = new JPanel();
            pNorth.setBackground(Color.red);
            pBorder.add(pNorth, BorderLayout.NORTH);
        JPanel pSouth = new JPanel();
            pSouth.setBackground(Color.red);
            pBorder.add(pSouth, BorderLayout.SOUTH);
        JPanel pWest = new JPanel();
            pWest.setBackground(Color.blue);
            pBorder.add(pWest, BorderLayout.WEST);
        JPanel pEast = new JPanel();
            pEast.setBackground(Color.blue);
            pBorder.add(pEast, BorderLayout.EAST);
        JPanel pCenter = new JPanel();
            pCenter.setBackground(Color.yellow);
            pBorder.add(pCenter, BorderLayout.CENTER);
        
        hoc.add(pBorder);
    
    }
 }