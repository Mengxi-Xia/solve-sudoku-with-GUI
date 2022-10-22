import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class listener implements ActionListener
{
    JTextField[][] textField;
    static char[][] sudokuMap=new char[9][9];
    public void actionPerformed(ActionEvent e)
    {
        for(int a=0;a<9;a++)
        {
            for(int b=0;b<9;b++)
            {
                String cache=textField[a][b].getText();
                sudokuMap[a][b]=cache.charAt(0);
            }
        }
        sudokuMap=SolveSudoku.solveSudoku(sudokuMap);

        //make a new windows and print the result
        JFrame resultF=new JFrame("Result");
        
        resultF.setBounds(600, 300, 600, 510);
        JPanel resultP=new JPanel();
        resultP.setOpaque(false);
        JpanelRes.setResultPanel(resultP);
        resultF.add(resultP);
        
        //resultF.getContentPane().add(new drawLine());
        resultF.setVisible(true);
    }    
    public void getTextField(JTextField[][] t)
    {
        this.textField=t;
    }
    public static char[][] getStoredMap()
    {
        return sudokuMap;
    }

}
