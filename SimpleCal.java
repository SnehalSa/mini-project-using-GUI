import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.*;

class MyFrame extends JFrame implements ActionListener{
	private Container c;
	private JLabel lable1,lable2;
	private JTextField t1,t2;
	private JButton add,sub,mult,div;
	private JLabel result;
	
	MyFrame()
	{
		setTitle("Simle Calculator");
		setSize(300,300);
		setLocation(100,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		c=getContentPane();
		c.setLayout(null);
		
		lable1=new JLabel("Firstnum :");
		lable1.setBounds(10,20,100,20);
		c.add(lable1);
		
		t1=new JTextField();
		t1.setBounds(120,20,100,20);
		c.add(t1);
		
		lable2=new JLabel("Secoundnum :");
		lable2.setBounds(10,50,100,20);
		c.add(lable2);
		
		t2=new JTextField();
		t2.setBounds(120,50,100,20);
		c.add(t2);
		
		add=new JButton("+");
		add.setBounds(10,80,50,30);
		c.add(add);
		
		sub=new JButton("-");
		sub.setBounds(70,80,50,30);
		c.add(sub);
		
				mult=new JButton("*");
		mult.setBounds(130,80,50,30);
		c.add(mult);
		
		div=new JButton("/");
		div.setBounds(190,80,50,30);
		c.add(div);
		
		result=new JLabel("Result : ");
		result.setBounds(10,120,150,20);
		c.add(result);
		
		add.addActionListener(this);
		sub.addActionListener(this);
		mult.addActionListener(this);
		div.addActionListener(this);
		
		
	}
	public void actionPerformed(ActionEvent e){
		try{
	if(e.getSource()==add){
		int a=Integer.parseInt(t1.getText());
		int b=Integer.parseInt(t2.getText());
		int c=a+b;
		result.setText("Result : "+c);
	}
	if(e.getSource()==sub){
		int a=Integer.parseInt(t1.getText());
		int b=Integer.parseInt(t2.getText());
		int c=a-b;
		result.setText("Result : "+c);
	}
	if(e.getSource()==mult){
		int a=Integer.parseInt(t1.getText());
		int b=Integer.parseInt(t2.getText());
		int c=a*b;
		result.setText("Result : "+c);
	}
	if(e.getSource()==div){
		int a=Integer.parseInt(t1.getText());
		int b=Integer.parseInt(t2.getText());
		int c=a/b;
		result.setText("Result : "+c);
	}
	
		}
		catch(NumberFormatException e1){
			result.setText("Plese input integer only");
		}
		catch(ArithmeticException e2)
		{
			result.setText("Can not divide by zero");
		}
			
	
	

		
		


	
		
	}
}
class SimpleCal{
	public static void main(String arg[])
	{
		MyFrame frame=new MyFrame();
	}
}