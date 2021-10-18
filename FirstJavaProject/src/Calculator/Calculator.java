package Calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Calculator {
      JFrame frame =new JFrame();
      JPanel panel =new JPanel();
      JTextArea textarea =new JTextArea(2,10);
      
      JButton button1=new JButton();
      JButton button2=new JButton();
      JButton button3=new JButton();
      JButton button4=new JButton();
      JButton button5=new JButton();
      JButton button6=new JButton();
      JButton button7=new JButton();
      JButton button8=new JButton();
      JButton button9=new JButton();
      JButton button0=new JButton();
      
      JButton buttonadd=new JButton(); 
      JButton buttonsub=new JButton();
      JButton buttonmul=new JButton();
      JButton buttondiv=new JButton();
      JButton buttonclear=new JButton();
      JButton buttondot=new JButton();
      JButton buttonequal=new JButton();
      
      double number1,number2,result;
      int addc=0,mulc=0,divc=0,subc=0,zero=0;
      
      public Calculator(){
    	  
    frame.setSize(340,450);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setTitle("My Calculator");
    frame.setResizable(false);
    frame.add(panel);
    panel.setBackground(Color.GRAY);
    Border border = BorderFactory.createLineBorder(Color.BLUE,4);
    
    
    panel.add(textarea);
    
    textarea.setBackground(Color.BLACK);
    Border tborder=BorderFactory.createLineBorder(Color.BLUE,3);
    textarea.setBorder(tborder);
    Font font =new Font("arial",Font.BOLD,33);
    textarea.setFont(font);
    textarea.setForeground(Color.WHITE);
    
    textarea.setPreferredSize(new Dimension(2,10));
    textarea.setLineWrap(true);
    
    button1.setPreferredSize(new Dimension(100,40));
    button1.setIcon(new ImageIcon("C:\\Users\\india\\Desktop\\Icon.png"));
    
    button2.setPreferredSize(new Dimension(100,40));
    button2.setIcon(new ImageIcon("C:\\Users\\india\\Desktop\\Icon.png"));
    
    button3.setPreferredSize(new Dimension(100,40));
    button3.setIcon(new ImageIcon("C:\\Users\\india\\Desktop\\Icon.png"));
    
    button4.setPreferredSize(new Dimension(100,40));
    button4.setIcon(new ImageIcon("C:\\Users\\india\\Desktop\\Icon.png"));
    
    button5.setPreferredSize(new Dimension(100,40));
    button5.setIcon(new ImageIcon("C:\\Users\\india\\Desktop\\Icon.png"));
    
    button6.setPreferredSize(new Dimension(100,40));
    button6.setIcon(new ImageIcon("C:\\Users\\india\\Desktop\\Icon.png"));
    
    button7.setPreferredSize(new Dimension(100,40));
    button7.setIcon(new ImageIcon("C:\\Users\\india\\Desktop\\Icon.png"));
    
    button8.setPreferredSize(new Dimension(100,40));
    button8.setIcon(new ImageIcon("C:\\Users\\india\\Desktop\\Icon.png"));
    
    button9.setPreferredSize(new Dimension(100,40));
    button9.setIcon(new ImageIcon("C:\\Users\\india\\Desktop\\Icon.png"));
    
    
    button0.setPreferredSize(new Dimension(100,40));
    button0.setIcon(new ImageIcon("C:\\Users\\india\\Desktop\\Icon.png"));
    
    
    buttondot.setPreferredSize(new Dimension(100,40));
    buttondot.setIcon(new ImageIcon("C:\\Users\\india\\Desktop\\Icon.png"));
    
    buttonadd.setPreferredSize(new Dimension(100,40));
    buttonadd.setIcon(new ImageIcon("C:\\Users\\india\\Desktop\\Icon.png"));
    
    buttonsub.setPreferredSize(new Dimension(100,40));
    buttonsub.setIcon(new ImageIcon("C:\\Users\\india\\Desktop\\Icon.png"));
    
    buttonmul.setPreferredSize(new Dimension(100,40));
    buttonmul.setIcon(new ImageIcon("C:\\Users\\india\\Desktop\\Icon.png"));
    
    buttondiv.setPreferredSize(new Dimension(100,40));
    buttondiv.setIcon(new ImageIcon("C:\\Users\\india\\Desktop\\Icon.png"));
    
    buttonequal.setPreferredSize(new Dimension(100,40));
    buttonequal.setIcon(new ImageIcon("C:\\Users\\india\\Desktop\\Icon.png"));
    
    buttonclear.setPreferredSize(new Dimension(100,40));
    buttonclear.setIcon(new ImageIcon("C:\\Users\\india\\Desktop\\Icon.png"));
    
    panel.add(button0);
    panel.add(button1);
    panel.add(button2);
    panel.add(button3);
    panel.add(button4);
    panel.add(button5);
    panel.add(button6);
    panel.add(button7);
    panel.add(button8);
    panel.add(button9);
    panel.add(buttonadd);
    panel.add(buttonsub);
    panel.add(buttonmul);
    panel.add(buttondiv);
    panel.add(buttonequal);
    panel.add(buttonclear);
    panel.add(buttondot);
    
    button0.addActionListener((ActionListener) this);
    button1.addActionListener((ActionListener) this);
    button2.addActionListener((ActionListener) this);
    button3.addActionListener((ActionListener) this);
    button4.addActionListener((ActionListener) this);
    button5.addActionListener((ActionListener) this);
    button6.addActionListener((ActionListener) this); 
    button7.addActionListener((ActionListener) this);
    button8.addActionListener((ActionListener) this);
    button9.addActionListener((ActionListener) this);
    buttonadd.addActionListener((ActionListener) this);
    buttonsub.addActionListener((ActionListener) this);
    buttonmul.addActionListener((ActionListener) this);
    buttondiv.addActionListener((ActionListener) this);
    buttonequal.addActionListener((ActionListener) this);
    buttonclear.addActionListener((ActionListener) this);
    buttondot.addActionListener((ActionListener) this);
    
    
      }
      public void actionPerformed(ActionEvent e){
Object source=new e.getSource();
if(source==buttonclear)
{
	number1=0.0;
	number2=0.0;
	textarea.setText("");
}
if(source==button1){
	textarea.append("1");
}
if(source==button2){
	textarea.append("2");
}
if(source==button3){
	textarea.append("3");
}
if(source==button4){
	textarea.append("4");
}
if(source==button5){
	textarea.append("5");
}
if(source==button6){
	textarea.append("6");
}
if(source==button7){
	textarea.append("7");
}
if(source==button8){
	textarea.append("8");
}
if(source==button9){
	textarea.append("9");
}
if(source==button0){
	textarea.append("0");
}
if(source==buttondot){
	textarea.append(".");
}
if(source==buttonadd){
	textarea.append("+");
}
if(source==buttonsub){
	textarea.append("-");
}
if(source==buttonmul){
	textarea.append("*");
}
if(source==buttondiv){
	textarea.append("/");
}
if(source==button1){
	textarea.append("%");



}
      }
}












      