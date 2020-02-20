import java.awt.event.*;
import java.awt.*;

public class Fact extends Frame implements ActionListener {
	TextField t;
	Button b;
	Label r;
	Fact(){
		setTitle("Factorial");
		setLayout(new FlowLayout());
		setSize(500,500);

		Label l = new Label("Enter: ");
		l.setBounds(200,50,150,20);
		add(l);

		t = new TextField();
		t.setBounds(20,50,150,30);
		add(t);
		
		b = new Button("Find");
		b.setBounds(10,200,100,30);
		add(b);
		
		r = new Label("Result");
		r.setBounds(90,140,150,30);
		add(r);

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
	
	public void fact(){
		int n = Integer.parseInt(t.getText());
		int f=1;
		for (int i=2;i<=n;i++){
			f *= i;
		}
		r.setText(String.valueOf(f));
	}
	

	@Override public void actionPerformed(ActionEvent e){
		if (e.getSource().equals(b)){
			fact();
		}

	}

	public static void main(String[] args){
		Fact f = new Fact();

	}



}
