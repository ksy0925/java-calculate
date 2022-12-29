package calculate;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class mycalc3 extends JFrame implements ActionListener{
	JButton b01, b02, b03, b04, b05, b06, b07, b08, b09, b10;
	JButton b11, b12, b13, b14, b15, b16, b17;
	JPanel p1;
	JLabel Lb;
	int num_st=1;
	double d1, d2, d3;
	int op = 0;
	
	public mycalc3() {
		setTitle("계산기");
		setLayout(new BorderLayout());
		
		Lb = new JLabel("0",JLabel.RIGHT);
		p1 = new JPanel();
		b01 = new JButton("1");
		b02 = new JButton("2");
		b03 = new JButton("3");
		b04 = new JButton("4");
		b05 = new JButton("5");
		b06 = new JButton("6");
		b07 = new JButton("7");
		b08 = new JButton("8");
		b09 = new JButton("9");
		b10 = new JButton("0");
		b11 = new JButton(".");
		b12 = new JButton("+");
		b13 = new JButton("-");
		b14 = new JButton("*");
		b15 = new JButton("/");
		b16 = new JButton("C");
		b17 = new JButton("=");
		
		
		b01.addActionListener(this);
		b02.addActionListener(this);
		b03.addActionListener(this);
		b04.addActionListener(this);
		b05.addActionListener(this);
		b06.addActionListener(this);
		b07.addActionListener(this);
		b08.addActionListener(this);
		b09.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		p1.setLayout(new GridLayout(4, 4));
		p1.add(b02); p1.add(b03); p1.add(b04); p1.add(b05);
		p1.add(b06); p1.add(b07); p1.add(b08); p1.add(b09);
		p1.add(b10); p1.add(b01); p1.add(b11); p1.add(b16);
		p1.add(b12); p1.add(b13); p1.add(b14); p1.add(b15);
		add("North",Lb);
		add("Center",p1);
		add("South",b17);
		setSize(200,210);
		setVisible(true);
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String s = Lb.getText();
		
		if(e.getSource() == b10) {
			if(num_st>0)
			{
				num_st=1;
				Lb.setText("0");
			}
			else
				Lb.setText(s+"0");
		}
		if(e.getSource() == b01) {
			if(num_st>0){
				num_st=0;
				Lb.setText("1");
			}
			else
				Lb.setText(s+"1");
		}
		if(e.getSource() == b02){
			if(num_st>0){
				num_st=0;
				Lb.setText("2");
			}
			else
				Lb.setText(s+"2");
		}

		if(e.getSource() == b03){
			if(num_st>0){
				num_st=0;
				Lb.setText("3");
			}
			else
				Lb.setText(s+"3");
		}
		if(e.getSource() == b04){
			if(num_st>0){
				num_st=0;
				Lb.setText("4");
			}
			else
				Lb.setText(s+"4");
		}
		if(e.getSource() == b05){
			if(num_st>0){
				num_st=0;
				Lb.setText("5");
			}
			else
				Lb.setText(s+"5");
		}
		if(e.getSource() == b06){
			if(num_st>0){
				num_st=0;
				Lb.setText("6");
			}
			else
				Lb.setText(s+"6");
		}
		if(e.getSource() == b07){
			if(num_st>0){
				num_st=0;
				Lb.setText("7");
			}
			else
				Lb.setText(s+"7");
		}
		if(e.getSource() == b08){
			if(num_st>0){
				num_st=0;
				Lb.setText("8");
			}
			else
				Lb.setText(s+"8");
		}
		if(e.getSource() == b09){
			if(num_st>0){
				num_st=0;
				Lb.setText("9");
			}
			else
				Lb.setText(s+"9");
		}
		if(e.getSource() == b11){
			if(num_st>0){
				num_st=0;
				Lb.setText(".");
			}
			else
				Lb.setText(s+".");
		}
		if(e.getSource() == b16){
			Lb.setText("0");
			num_st=1;
			op=0;
		}
		if(e.getSource() == b12){
			if(op>0){
			d2 = Double.parseDouble(Lb.getText());
			if(op == 1)
				d3 = d1 + d2;
			else if(op==2)
				d3 = d1 - d2;
			else if(op==3)
				d3 = d1 * d2;
			else if(op==4)
				d3 = d1 / d2;
			Lb.setText(""+d3);
			}
			num_st =1;
			op =1;
			d1 = Double.parseDouble(Lb.getText());
		}
		if(e.getSource()==b13) {
			if(op>0) {
				d2 = Double.parseDouble(Lb.getText());
				if(op==1)
					d3 = d1 + d2;
				else if(op==2)
					d3 = d1 - d2;
				else if(op==3)
					d3 = d1 * d2;
				else if(op==4)
					d3 = d1 / d2;
				Lb.setText(""+d3);
			}
			num_st =1;
			op = 2;
			d1 = Double.parseDouble(Lb.getText());
		}
		if(e.getSource()==b14) {
			if(op>0) {
				d2 = Double.parseDouble(Lb.getText());
				if(op==1)
					d3 = d1 + d2;
				else if(op==2)
					d3 = d1 - d2;
				else if(op==3)
					d3 = d1 * d2;
				else if(op==4)
					d3 = d1 / d2;
				Lb.setText(""+d3);
			}
			num_st =1;
			op = 3;
			d1 = Double.parseDouble(Lb.getText());
		}
		if(e.getSource()==b15) {
			if(op>0) {
				d2 = Double.parseDouble(Lb.getText());
				if(op==1)
					d3 = d1 + d2;
				else if(op==2)
					d3 = d1 - d2;
				else if(op==3)
					d3 = d1 * d2;
				else if(op==4)
					d3 = d1 / d2;
				Lb.setText(""+d3);
			}
			num_st =1;
			op = 4;
			d1 = Double.parseDouble(Lb.getText());
		}
		if(e.getSource()==b17) {
			num_st = 1;
				d2 = Double.parseDouble(Lb.getText());
				if(op==1)
					d3 = d1 + d2;
				else if(op==2)
					d3 = d1 - d2;
				else if(op==3)
					d3 = d1 * d2;
				else if(op==4)
					d3 = d1 / d2;
				
				Lb.setText(""+d3);
				op=0;
			}
		}
		

public static void main(String[] args) {
	new mycalc3();

}
}