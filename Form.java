import java.awt.event.*;
import java.awt.*;

class Form extends Frame implements ActionListener {
	TextField t;
	Choice c;
	Checkbox at,m,f;
	Button b;
	CheckboxGroup cbg;
	List l;
	TextArea ta;
	Label res;
	
	Form(){
		setTitle("Background");
		setLayout(null);
		setSize(500,500);
		
		genLabel("Name",50);
		genLabel("Gender",100);		
		genLabel("Class: ",150);
		genLabel("Hobbies: ",200);
		genLabel("About Me: ",250);
		genLabel("Accept Terms: ",300);
		
		t = new TextField();
		t.setBounds(200,50,100,20);
		add(t);
	
		cbg = new CheckboxGroup();
		m = new Checkbox("Male",true,cbg);
		f = new Checkbox("Female",false,cbg);
		m.setBounds(200,100,70,20);
		f.setBounds(300,100,70,20);
		add(m);
		add(f);

		c = new Choice();
		c.setBounds(200,150,100,20);
		c.add("FY");
		c.add("SY");
		c.add("TY");
		add(c);

		l = new List(3);
		l.setBounds(200,200,100,20);
		l.add("Chess");
		l.add("Sports");
		l.add("Reading");
		add(l);
	
		ta = new TextArea();
		ta.setBounds(200,250,100,50);
		add(ta);

		at = new Checkbox();
		at.setBounds(200,300,100,20);
		add(at);

		b = new Button("Submit");
		b.setBounds(200,350,100,20);
		b.addActionListener(this);
		add(b);

		res = new Label("Status");
		res.setBounds(200,400,100,100);
		add(res);
		

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

	public void genLabel(String text,int y){
		Label l = new Label(text);
		l.setBounds(50,y,100,20);
		add(l);
	}

	@Override 
	public void actionPerformed(ActionEvent e){
		if (e.getSource().equals(b)){
			res.setText("Submitted Succesfully");
		}
	}

	public static void main(String[] args){
		new Form();
	}
	

}