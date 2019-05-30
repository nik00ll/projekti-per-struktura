import javax.swing.*;
 public class InstructionReader
{private String input_line;

public InstructionReader()
{input_line="";}

public String readCommand(String message)
{input_line=JOptionPane.showInputDialog(message).trim();
return input_line;
}
public void showCommand(String message)
{JOptionPane.showMessageDialog(null,message);
}

}
