import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	
	double num1=0, num2=0, result=0;
	int maths;
	 
	JFrame frame=new JFrame("Imad's Calculator");
    JLabel jlabel=new JLabel();
    JTextField textField=new JTextField();
    JButton bOne=new JButton("1");
    JButton bTwo=new JButton("2");
    JButton bThree=new JButton("3");
    JButton bFour=new JButton("4");
    JButton bFive=new JButton("5");
    JButton bSix=new JButton("6");
    JButton bSeven=new JButton("7");
    JButton bEight=new JButton("8");
    JButton bNine=new JButton("9");
    JButton bZero=new JButton("0");
    JButton bDec=new JButton(".");
    JButton bAdd=new JButton("+");
    JButton bMin=new JButton("-");
    JButton bDiv=new JButton("/");
    JButton bMult=new JButton("*");
    JButton bClear=new JButton("CL"); 
    JButton bAllclear=new JButton("DELETE");
    JButton bEqualto=new JButton("=");
    JButton my=new JButton("SIMPLE_CALCULATOR");
    
	
    
    
    Calculator() {
		window();
		displyTextComponenets();
		addActionEvent();
		
	}
	    
	
	public void window() {
		frame.setBounds(300, 200, 305, 400);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.gray);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void displyTextComponenets() {
	  jlabel.setBounds(250, 0, 50, 50);
	  jlabel.setForeground(Color.white);
	  frame.add(jlabel);
	  
	  textField.setBounds(10, 40, 270, 40);
	  textField.setFont(new Font("Arial",Font.BOLD,20 ));
	  textField.setEditable(false);
	  textField.setHorizontalAlignment(SwingConstants.RIGHT);
	  frame.add(textField);
	  
	  bAllclear.setBounds(10, 89, 135, 50);
	  bAllclear.setFont(new Font("Arial",Font.BOLD,25));
	  bAllclear.setSelected(true);
	  bAllclear.setBackground(Color.black);
	  bAllclear.setForeground(Color.red);
	  frame.add(bAllclear);
	  
	  
	  bClear.setBounds(146, 89, 67, 50);
	  bClear.setFont(new Font("Arial",Font.BOLD,25));
	  bClear.setSelected(true);
	  bClear.setBackground(Color.black);
	  bClear.setForeground(Color.orange);
	  frame.add(bClear);
	
	  bDiv.setBounds(214, 89, 67, 50);
	  bDiv.setFont(new Font("Arial",Font.BOLD,20));
	  bDiv.setSelected(true);
	  bDiv.setBackground(Color.orange);
	  bDiv.setForeground(Color.black);
	  frame.add(bDiv);
	  
	  bSeven.setBounds(10, 140, 67, 50);
	  bSeven.setFont(new Font("Arial",Font.BOLD,30));
	  bSeven.setSelected(true);
	  bSeven.setBackground(Color.black);
	  bSeven.setForeground(Color.white);
	  frame.add(bSeven);
	  
	  bEight.setBounds(78, 140, 67, 50);
	  bEight.setFont(new Font("Arial",Font.BOLD,30));
	  bEight.setSelected(true);
	  bEight.setBackground(Color.black);
	  bEight.setForeground(Color.white);
	  frame.add(bEight);
	  
	  bNine.setBounds(146, 140, 67, 50);
	  bNine.setFont(new Font("Arial",Font.BOLD,30));
	  bNine.setSelected(true);
	  bNine.setBackground(Color.black);
	  bNine.setForeground(Color.white);
	  frame.add(bNine);
	  
	  bMult.setBounds(214, 140, 67, 50);
	  bMult.setFont(new Font("Arial",Font.BOLD,30));
	  bMult.setSelected(true);
	  bMult.setBackground(Color.orange);
	  bMult.setForeground(Color.black);
	  frame.add(bMult);
	  
	  bFour.setBounds(10, 190, 67, 50);
	  bFour.setFont(new Font("Arial",Font.BOLD,30));
	  bFour.setSelected(true);
	  bFour.setBackground(Color.black);
	  bFour.setForeground(Color.white);
	  frame.add(bFour);
	  
	  bFive.setBounds(78, 190, 67, 50);
	  bFive.setFont(new Font("Arial",Font.BOLD,30));
	  bFive.setSelected(true);
	  bFive.setBackground(Color.black);
	  bFive.setForeground(Color.white);
	  frame.add(bFive);
	  
	  bSix.setBounds(146, 190, 67, 50);
	  bSix.setFont(new Font("Arial",Font.BOLD,30));
	  bSix.setSelected(true);
	  bSix.setBackground(Color.black);
	  bSix.setForeground(Color.white);
	  frame.add(bSix);
	  
	  bMin.setBounds(214, 190, 67, 50);
	  bMin.setFont(new Font("Arial",Font.BOLD,20));
	  bMin.setSelected(true);
	  bMin.setBackground(Color.orange);
	  bMin.setForeground(Color.black);
	  frame.add(bMin);
	  
	  
	  bOne.setBounds(10, 241, 67, 50);
	  bOne.setFont(new Font("Arial",Font.BOLD,30));
	  bOne.setSelected(true);
	  bOne.setBackground(Color.black);
	  bOne.setForeground(Color.white);
	  frame.add(bOne);
	  
	  bTwo.setBounds(78, 241, 67, 50);
	  bTwo.setFont(new Font("Arial",Font.BOLD,30));
	  bTwo.setSelected(true);
	  bTwo.setBackground(Color.black);
	  bTwo.setForeground(Color.white);
	  frame.add(bTwo);
	  
	  bThree.setBounds(146, 241, 67, 50);
	  bThree.setFont(new Font("Arial",Font.BOLD,30));
	  bThree.setSelected(true);
	  bThree.setBackground(Color.black);
	  bThree.setForeground(Color.white);
	  frame.add(bThree);
	  
	  bAdd.setBounds(214, 241, 67, 50);
	  bAdd.setFont(new Font("Arial",Font.BOLD,20));
	  bAdd.setSelected(true);
	  bAdd.setBackground(Color.orange);
	  bAdd.setForeground(Color.black);
	  frame.add(bAdd);
	  
	  
	  bDec.setBounds(10, 292, 67, 50);
	  bDec.setFont(new Font("Arial",Font.BOLD,20));
	  bDec.setSelected(true);
	  bDec.setBackground(Color.black);
	  bDec.setForeground(Color.white);
	  frame.add(bDec);
	  
	  bZero.setBounds(78, 292, 67, 50);
	  bZero.setFont(new Font("Arial",Font.BOLD,30));
	  bZero.setSelected(true);
	  bZero.setBackground(Color.black);
	  bZero.setForeground(Color.white);
	  frame.add(bZero);
	  
	  bEqualto.setBounds(146, 292, 135, 50);
	  bEqualto.setFont(new Font("Arial",Font.BOLD,40));
	  bEqualto.setSelected(true);
	  bEqualto.setBackground(Color.orange);
	  bEqualto.setForeground(Color.black);
	  frame.add(bEqualto);
	  
	  my.setBounds(10, 343, 271, 20);
	  my.setFont(new Font("Arial",Font.BOLD,10));
	  my.setSelected(false);
	  my.setBackground(Color.black);
	  my.setForeground(Color.GRAY);
	  frame.add(my);
	  
	}
	
	public void addActionEvent() {
		
		bOne.addActionListener(this);
		bTwo.addActionListener(this);
		bThree.addActionListener(this);
		bFour.addActionListener(this);
		bFive.addActionListener(this);
		bSix.addActionListener(this);
		bSeven.addActionListener(this);
		bEight.addActionListener(this);
		bNine.addActionListener(this);
		bZero.addActionListener(this);
		bAllclear.addActionListener(this);
		bClear.addActionListener(this);
		bDiv.addActionListener(this);
		bMult.addActionListener(this);
		bMin.addActionListener(this);
		bAdd.addActionListener(this);
		bEqualto.addActionListener(this);
		 
		
		
		
	}
	
	
	public static void main(String[] args) {
		new Calculator();
	}


	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==bAllclear) {
			
			int lenght  = textField.getText().length();
			int number = lenght-1;
			
			if(lenght>0) {
				
				StringBuilder back = new StringBuilder(textField.getText());
				back.deleteCharAt(number);
				textField.setText(back.toString());
				if(textField.getText().endsWith(""));
				jlabel.setText("");
				
			}
		}
		else if(e.getSource()==bClear) {
			jlabel.setText("");
			textField.setText("");
		}
	     else if(e.getSource()==bZero) {
	    	 if(textField.getText().equals("0")) {
	    		 return;
	    }
	     else {
	    	 textField.setText(textField.getText() + "0");
	    }
	    }
       else if(e.getSource()==bOne) {
    	   textField.setText(textField.getText() + "1");
		}
       else if(e.getSource()==bTwo) {
    	   textField.setText(textField.getText() + "2");
		}
       else if(e.getSource()==bThree) {
    	   textField.setText(textField.getText() + "3");
		}
       else if(e.getSource()==bFour) {
    	   textField.setText(textField.getText() + "4");
		}
       else if(e.getSource()==bFive) {
    	   textField.setText(textField.getText() + "5");
		}
       else if(e.getSource()==bSix) {
    	   textField.setText(textField.getText() + "6");
		}
       else if(e.getSource()==bSeven) {
    	   textField.setText(textField.getText() + "7");
		}
       else if(e.getSource()==bEight) {
    	   textField.setText(textField.getText() + "8");
		}
       else if(e.getSource()==bNine) {
    	   textField.setText(textField.getText() + "9");
		}
       else if(e.getSource()==bDec) {
    	   if(textField.getText().contains(".")){
    	      return;
    	       }
    	  else {
    		 textField.setText(textField.getText() + ".");
    	       }
		}
       else if(e.getSource()==bAdd) {
    	   String str = textField.getText();
    	   num1 = Double.parseDouble(textField.getText());
    	   maths = 1;
    	   textField.setText("");
    	   jlabel.setText(str + "+");
    	   
		}
       else if(e.getSource()==bMin) {
    	   String str = textField.getText();
    	   num1 = Double.parseDouble(textField.getText());
    	   maths = 2;
    	   textField.setText("");
    	   jlabel.setText(str + "-");
		}
       else if(e.getSource()==bMult) {
    	   String str = textField.getText();
    	   num1 = Double.parseDouble(textField.getText());
    	   maths = 3;
    	   textField.setText("");
    	   jlabel.setText(str + "*");
		}
       else if(e.getSource()==bDiv) {
    	   String str = textField.getText();
    	   num1 = Double.parseDouble(textField.getText());
    	   maths = 4;
    	   textField.setText("");
    	   jlabel.setText(str + "/");
		}
       else if(e.getSource() == bEqualto) {
    	   num2 = Double.parseDouble(textField.getText());
    	   
    	   switch(maths) {
    	   case 1:
    		   result = num1+num2;
    		   break;
    	   case 2:
    		   result = num1-num2;
    		   break;
    	   case 3:
    		   result = num1*num2;
    		   break;
    	   case 4:
    		   result = num1/num2;
    		   break;
    	}
    	   
    	   if(Double.toString(result).endsWith(".0")) 
    	   {
    		   textField.setText(Double.toString(result));
    		    }
    	   jlabel.setText("");
    	   num2 = result;
    	   
    	   
    }
	}
	}
