import java.awt.*;
import java.awt.event.*;

public class A {

 public static void main(String[] args) {
	 
	 
  Frame frame = new Frame("Frame name");

  frame.setLayout(new FlowLayout());

  Label text = new Label("Text");
  frame.add(text);

  TextField field = new TextField(20);
  frame.add(field);

  Button btn = new Button("Button");
  frame.add(btn);
  
  frame.setSize(389, 305); 
  frame.setLocation(200,200);
  frame.setVisible(true); 

  frame.addWindowListener(new WindowAdapter(){
   public void windowClosing (WindowEvent  e) {
    System.exit(1);
   }
  });
  
 }
}
