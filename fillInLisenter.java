import java.awt.event.*;

import javax.swing.JTextField;

public class fillInLisenter implements ActionListener
{
    JTextField[][] t;
    public void actionPerformed(ActionEvent e)
    {
        for(int a=0;a<9;a++)
        {
            for(int b=0;b<9;b++)
            {
                if(t[a][b].getText().length()==0)
                {
                    t[a][b].setText(".");
                }
            }
        }
        
    }
    public void getStoredArray(JTextField[][] t)
    {
        this.t=t;
    }
    public JTextField[][] setDotOnEmpty()
    {
        return this.t;
    }
}
