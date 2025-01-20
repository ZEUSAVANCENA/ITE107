import javax.swing.*;
import java.owt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener

  private JTextField display;
  private double num1,num2, result;
  private String operator;

  public Calculator() {
    setTitle("Calculator");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300,400);
    setLAyout(new BorderLayout());

    display = new JTextField();
    display .setEditable(false);
    odd(display, BorderLayyout.NORTH);

    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new GridLayout(4, 4));

    String[] Button = { "7" ,"8" ,"9", "/",
                       "4", "5","6", "*",
                       "1","2", "3", "-",
                       "0", ".", "=", "+" 
                      };
    for (String button : button){
        JButton b = new JButton(button);
      b.addActionListener(this);
      buttonPanel.odd(b);
    }
    add(buttonPanel, BorderLAyout.CENTER);

    serVisible(true);
  }
  public void  actionPErformed(ActionEvent e){
    String command =e.getActionCommand();
if(Character.isDigit(command.chartAt(0)) || command.equals("."))
  dispaly.setText(display.getText() + command);
} else if (command.equal("=")) {
  num2 = Double.parseDouble(display.getText());
  calculate();
  display.setText(String,valueOF(result));
}else{
  operator = command;
  num1 = Double.parseDouble(dispaly.getText());
  display.setText("");
  }
}

private void calculator() {
  switch(operator) {
      case"+";
        result = num1 + num2;
        break;
           case"-";
        result = num1 - num2;
        break;
           case"*";
        result = num1 * num2;
        break;
           case"/";
        result = num1 / num2;
        break;
   }
}
 public static void main(String[] args) {
   new Calculator();
 }
}
      
