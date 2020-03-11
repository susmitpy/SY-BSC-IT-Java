// Write a AWT Program to calculate Area of a Circle

import java.awt.*;
import java.awt.event.*; // necessary because above statement does not import sub packages of java.awt

class AOC extends Frame implements ActionListener {
  /*
    extends Frame So that Frame methods can be used directly without creating an object
    ActionListener because we want to listen to actions
  */

  TextField t; // An uninitialized text field
  Button b; // An uninitialized button
  Label res;

  AOC() { //Constructor
    setTitle("Area Of Circle"); // Set Title
    setLayout(null); // Set Layout FlowLayout(),null
    setSize(500,500); //W x H
    setVisible(true);

    Label l = new Label("Radius: "); // Creates a label OBJECT with text radius
    l.setBounds(20,50,50,50); // X, Y, W, H
    add(l); // Add the label to the Frame

    t = new TextField(); // Initialized the declared text field
    t.setBounds(80,50,50,50);
    add(t);

    b = new Button("Calculate");
    b.setBounds(140,50,150,50);
    add(b);

    b.addActionListener(this); // When the button is clicked, "this" which refers
    // to the current context will receive the event

    res = new Label("");
    res.setBounds(100,100,50,50);
    add(res);


    addWindowListener(  // A listener
        new WindowAdapter(){  // Crate an anonymous class
          @Override   // Override the class's method
          public void windowClosing(WindowEvent w){
              System.exit(0);  // Method triggered when close button is clicked.
          }
        }
    );
  }

  double aoc(){
    String s = t.getText();
    double r = Double.parseDouble(s);
    double a = Math.PI * r * r;
    return a;
  }

  // This method is called whenever ANY action is performed
  @Override
  public void actionPerformed(ActionEvent e){
      if (e.getSource() == b){ // Checks if b is the Source of event e
          double area = aoc();
          String s = String.format("%.2f",area);
          res.setText(s);
      }
  }

  public static void main(String[] args){
      new AOC(); // Calls the Constructor
  }
}
