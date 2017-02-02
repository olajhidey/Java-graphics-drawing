/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2dpack;

import javax.swing.JFrame;


public class GraphicsMain {

    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Surface srf = new Surface();
  
        frame.add(srf);
        frame.setSize(400,250);
        frame.setVisible(true);
        
    }
    
}
