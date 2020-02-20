import java.awt.event.*;
import java.awt.*;

class Bg extends Frame implements ActionListener {
	Button r,g,b;

	Bg (){
		setTitle("Background");
		setLayout(new FlowLayout());
		setSize(500,500);

		r = new Button("Red");
		r.setBounds(5,10,150,200);
		add(r);

		r.addActionListener(this);

		g = new Button("Green");
		g.setBounds(5,10,150,200);
		add(g);

		g.addActionListener(this);

		b = new Button("Blue");
		b.setBounds(5,10,150,200);
		add(b);

		b.addActionListener(this);
		
		addWindowListener(
			new WindowAdapter(){
				@Override
				public void windowClosing(WindowEvent w){
					System.exit(0);
				}
			}
			
		);		

		setVisible(true);
	}

	@Override 
	public void actionPerformed(ActionEvent e){
		if (e.getSource().equals(r)){
			setBackground(Color.RED);
		}
		else if (e.getSource().equals(g)){
			setBackground(Color.GREEN);
		}
		else {
			setBackground(Color.BLUE);
		}
		
	}

	public static void main(String[] args){
		Bg bg = new Bg();
	}
	

}