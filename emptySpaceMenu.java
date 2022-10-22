import java.awt.event.*;

import javax.swing.JTextField;
public class emptySpaceMenu implements ActionListener
{
    JTextField[][] t1;
    public void actionPerformed(ActionEvent e) 
    {
        for(int a=0;a<9;a++)
        {
            for(int b=0;b<9;b++)
            {
                t1[a][b].setText("");
            }
        }
        
    }
    public void getStoredArray(JTextField[][] t1)
    {
        this.t1=t1;
    }
    public JTextField[][] setEmpty()
    {
        return t1;
    }
}
