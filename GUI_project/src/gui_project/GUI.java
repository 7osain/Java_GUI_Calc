/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author gue
 */
public class GUI implements ActionListener{
    int count=0;
    private JFrame frame;
    private JPanel p;
    private JButton button1;
    private JLabel label;
    
    public GUI(){
frame=new JFrame();
p=new JPanel();
button1=new JButton("click here");
button1.addActionListener(this);
label=new JLabel("Number of clicks: 0");
p.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
p.setLayout(new GridLayout(0,1));
p.add(button1);
p.add(label);
frame.add(p, BorderLayout.CENTER);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setTitle("first GUI");
frame.pack();
frame.setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent ae) {
       count++;
       label.setText("Number of clicks: "+count);
    }
}
