import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.lang.*;

public class calculator{

		// TODO: Refactor this God forsaken code
		
		private double num, ans;
		private int calc;
		private String Operator;

		//Header Images
		private ImageIcon background = new ImageIcon("assets/bg.png"); 
		private ImageIcon ic1 = new ImageIcon("assets/math.png"); 
		//Button Images
		private ImageIcon icb1 = new ImageIcon("assets/numbericons/1.png"); 
		private ImageIcon icb2 = new ImageIcon("assets/numbericons/2.png"); 
		private ImageIcon icb3 = new ImageIcon("assets/numbericons/3.png"); 
		private ImageIcon icb4 = new ImageIcon("assets/numbericons/4.png"); 
		private ImageIcon icb5 = new ImageIcon("assets/numbericons/5.png"); 
		private ImageIcon icb6 = new ImageIcon("assets/numbericons/6.png"); 
		private ImageIcon icb7 = new ImageIcon("assets/numbericons/7.png"); 
		private ImageIcon icb8 = new ImageIcon("assets/numbericons/8.png"); 
		private ImageIcon icb9 = new ImageIcon("assets/numbericons/9.png"); 
		private ImageIcon icb0 = new ImageIcon("assets/numbericons/0.png"); 
		private ImageIcon icb10 = new ImageIcon("assets/operatoricons/add.png"); 
		private ImageIcon icb11 = new ImageIcon("assets/operatoricons/subt.png"); 
		private ImageIcon icb12 = new ImageIcon("assets/operatoricons/multi.png"); 
		private ImageIcon icb13 = new ImageIcon("assets/operatoricons/div.png"); 
		private ImageIcon icb14 = new ImageIcon("assets/extraicons/clear.png"); 
		private ImageIcon icb15 = new ImageIcon("assets/operatoricons/equal.png");
		private ImageIcon icb16 = new ImageIcon("assets/extraicons/delete.png");  
		private ImageIcon icb17 = new ImageIcon("assets/operatoricons/dot.png"); 

		/*Swing Components Declaration*/
		//Frame
		private JFrame myFrame = new JFrame();
		//Panel
		private JPanel myPanel = new JPanel();
		//Labels
		private JLabel bg = new JLabel(null,background,0);
		private JLabel icon1 = new JLabel(null,ic1,0);
		private JLabel lbl1 = new JLabel();
		//Textfields
		private JTextField tf = new JTextField();
		//Buttons
		private JButton n1 = new JButton();
		private JButton n2 = new JButton();
		private JButton n3 = new JButton();
		private JButton n4 = new JButton();
		private JButton n5 = new JButton();
		private JButton n6 = new JButton();
		private JButton n7 = new JButton();
		private JButton n8 = new JButton();
		private JButton n9 = new JButton();
		private JButton n0 = new JButton();
		private JButton add = new JButton();
		private JButton subt = new JButton();
		private JButton div = new JButton();
		private JButton multi = new JButton();
		private JButton cls = new JButton();
		private JButton eq = new JButton();
		private JButton del = new JButton();
		private JButton dot = new JButton();


	public void operations(){
		switch(calc){

			case 1: {
				ans = num + Double.parseDouble(tf.getText());
				tf.setText(Double.toString(ans));
				break;
			}
			case 2: {
				ans = num - Double.parseDouble(tf.getText());
				tf.setText(Double.toString(ans));
				break;
			}
			case 3: {
				ans = num / Double.parseDouble(tf.getText());
				tf.setText(Double.toString(ans));
				break;
			}
			case 4: {
				ans = num * Double.parseDouble(tf.getText());
				tf.setText(Double.toString(ans));
				break;
			}

		}
	}
		
	public calculator(){
		ui();
	}

	public void ui(){
		/*Component configuration*/

		//bg creation using jlabel
		bg.setBounds(0,0,300,400);

		//Icons using jlabel
		icon1.setBounds(0, 0, 100,100);

		//Labels
		lbl1.setBounds(100,0,200,15);
		lbl1.setForeground(Color.white);
		lbl1.setFont(new Font("Arial", Font.BOLD, 16));
		//Textfield
		tf.setHorizontalAlignment(SwingConstants.RIGHT);
		tf.setBounds(120,25,140,35);
		tf.setOpaque(false);
		tf.setForeground(Color.white);
		tf.setFont(new Font("Arial", Font.BOLD, 16));
		tf.setEditable(false);
		//Number Buttons
		n1.setBounds(30,100,50,50);
		n1.setOpaque(false);
		n1.setContentAreaFilled(false);
		n1.setBorderPainted(false);
		n1.setIcon(icb1);
		n1.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){
		tf.setText(tf.getText()+1); 
        }  
    	});  
		n2.setBounds(90,100,50,50);
		n2.setOpaque(false);
		n2.setContentAreaFilled(false);
		n2.setBorderPainted(false);
				n2.setIcon(icb2);
		    n2.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){
		tf.setText(tf.getText()+2); 
        }  
    	});  
		n3.setBounds(150,100,50,50);
		n3.setOpaque(false);
		n3.setContentAreaFilled(false);
		n3.setBorderPainted(false);
		n3.setIcon(icb3);
		n3.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){
		tf.setText(tf.getText()+3);  
        }  
    	});  
		n4.setBounds(210,100,50,50);
		n4.setOpaque(false);
		n4.setContentAreaFilled(false);
		n4.setBorderPainted(false);
		n4.setIcon(icb4);
		n4.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){
		tf.setText(tf.getText()+4); 
        }  
    	}); 
		n5.setBounds(30,160,50,50);
		n5.setOpaque(false);
		n5.setContentAreaFilled(false);
		n5.setBorderPainted(false);
		n5.setIcon(icb5);
		n5.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){
		tf.setText(tf.getText()+5); 
        }  
    	}); 
		n6.setBounds(90,160,50,50);
		n6.setOpaque(false);
		n6.setContentAreaFilled(false);
		n6.setBorderPainted(false);
		n6.setIcon(icb6);
		n6.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){
		tf.setText(tf.getText()+6); 
        }  
    	}); 
		n7.setBounds(150,160,50,50);
		n7.setOpaque(false);
		n7.setContentAreaFilled(false);
		n7.setBorderPainted(false);
		n7.setIcon(icb7);
		n7.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){
		tf.setText(tf.getText()+7); 
        }  
    	}); 
		n8.setBounds(210,160,50,50);
		n8.setOpaque(false);
		n8.setContentAreaFilled(false);
		n8.setBorderPainted(false);
		n8.setIcon(icb8);
		n8.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){
tf.setText(tf.getText()+8); 
        }  
    }); 
		n9.setBounds(30,220,50,50);
		n9.setOpaque(false);
		n9.setContentAreaFilled(false);
		n9.setBorderPainted(false);
		n9.setIcon(icb9);
		n9.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){
tf.setText(tf.getText()+9); 
        }  
    }); 
		n0.setBounds(90,220,50,50);
		n0.setOpaque(false);
		n0.setContentAreaFilled(false);
		n0.setBorderPainted(false);
		n0.setIcon(icb0);
		n0.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){
tf.setText(tf.getText()+0); 
        }  
    }); 
		// Delete / Clear
		cls.setBounds(150,220,50,50);
		cls.setOpaque(false);
		cls.setContentAreaFilled(false);
		cls.setBorderPainted(false);
		cls.setIcon(icb14);
		cls.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){
tf.setText(""); 
        }  
    }); 
		//Equals button
		eq.setBounds(210,220,50,50);
		eq.setOpaque(false);
		eq.setContentAreaFilled(false);
		eq.setBorderPainted(false);
		eq.setIcon(icb15);
		eq.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){
operations();
lbl1.setText("");
        }  
    }); 
		//Arithmetic Operators
		add.setBounds(30,280,50,50);
		add.setOpaque(false);
		add.setContentAreaFilled(false);
		add.setBorderPainted(false);
		add.setIcon(icb10);
		add.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){
num = Double.parseDouble(tf.getText());
calc=1;
tf.setText("");
lbl1.setText(num + "+");
        }  
    }); 
		subt.setBounds(90,280,50,50);
		subt.setOpaque(false);
		subt.setContentAreaFilled(false);
		subt.setBorderPainted(false);
		subt.setIcon(icb11);
		subt.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){
num = Double.parseDouble(tf.getText());
calc=2;
tf.setText("");
lbl1.setText(num + "-");
        }  
    }); 
		div.setBounds(150,280,50,50);
		div.setOpaque(false);
		div.setContentAreaFilled(false);
		div.setBorderPainted(false);
		div.setIcon(icb13);
		div.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){
num = Double.parseDouble(tf.getText());
calc=3;
tf.setText("");
lbl1.setText(num + "/");
        }  
    }); 
		multi.setBounds(210,280,50,50);
		multi.setOpaque(false);
		multi.setContentAreaFilled(false);
		multi.setBorderPainted(false);
		multi.setIcon(icb12);
		multi.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){
num = Double.parseDouble(tf.getText());
calc=4;
tf.setText("");
lbl1.setText(num + "*");
        }  
    }); 
		del.setBounds(125,65,35,35);
		del.setOpaque(false);
		del.setContentAreaFilled(false);
		del.setBorderPainted(false);
		del.setIcon(icb16);
		del.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){
		int length = tf.getText().length();
		int num = tf.getText().length()-1;
		String remain;
		if(length>0){
			StringBuilder back = new StringBuilder(tf.getText());
			back.deleteCharAt(num);
			remain=back.toString();
			tf.setText(remain);
		}
        }  
    	}); 

    	dot.setBounds(190,65,35,35);
		dot.setOpaque(false);
		dot.setContentAreaFilled(false);
		dot.setBorderPainted(false);
		dot.setIcon(icb17);
		dot.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){
		tf.setText(tf.getText()+"."); 
        }  
    	}); 



		/*Panel components*/
		myPanel.add(del);
		myPanel.add(dot);
		myPanel.add(lbl1);
		myPanel.add(eq);
		myPanel.add(cls);
		myPanel.add(multi);
		myPanel.add(div);
		myPanel.add(subt);
		myPanel.add(add);
		myPanel.add(n0);
		myPanel.add(n9);
		myPanel.add(n8);
		myPanel.add(n7);
		myPanel.add(n6);
		myPanel.add(n5);
		myPanel.add(n4);
		myPanel.add(n3);
		myPanel.add(n2);
		myPanel.add(n1);
		myPanel.add(tf);
		myPanel.add(icon1);
		myPanel.add(bg);
		
		/*Panel settings*/
		myPanel.setLayout(null);
		
		/*Frame Components*/
		myFrame.add(myPanel);

		/*Frame setting*/
		myFrame.setResizable(false);
		myFrame.setTitle("Calculator in Java");
		myFrame.setSize(300,400);
		myFrame.setVisible(true);
		myFrame.setLocationRelativeTo(null);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		new calculator();
	}
}