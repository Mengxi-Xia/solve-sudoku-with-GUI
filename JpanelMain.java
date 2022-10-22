import java.awt.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class JpanelMain 
{
    static JTextField[][] allBlock=new JTextField[9][9];
    public static void setPanelProp(JPanel j)
    {
        
        j.setLayout(null);
        //set font
        Font allFont=new Font("Arial",Font.BOLD,15);
        UIManager.put("Label.font",allFont);
        UIManager.put("TextField.font",allFont);
        UIManager.put("Button.font",allFont);

        //set lisenter
        listener lis=new listener();

        //set row number
        JLabel[] rowNum=new JLabel[10];
        for(int a=1;a<=9;a++)
        {
            rowNum[a]=new JLabel(Integer.toString(a));
            rowNum[a].setBounds((a-1)*40+60,25,25, 25);
            rowNum[a].setForeground(Color.BLUE);
            j.add(rowNum[a]);
        }

        //set column number
        JLabel[] colNum=new JLabel[10];
        for(int a=1;a<=9;a++)
        {
            colNum[a]=new JLabel(Integer.toString(a));
            colNum[a].setBounds(30,(a-1)*40+53,25, 25);
            colNum[a].setForeground(Color.BLUE);
            j.add(colNum[a]);
        }

        //set cells
        
        for(int a=0;a<9;a++)
        {
            for(int b=0;b<9;b++)
            {
                allBlock[a][b]=new JTextField();
                allBlock[a][b].setBounds(a*40+50,b*40+50,30,30);
                j.add(allBlock[a][b]);
            }
        }

        
        //set buttom
        JButton process=new JButton("Go!");
        process.setBounds(450,150,100,50);
        process.addActionListener(lis);
        lis.getTextField(allBlock);
        j.add(process);

        //set fill in buttom
        JButton fillIn=new JButton("自动填充");
        fillIn.setBounds(450, 250, 100, 50);
        Font fillInFont=new Font("宋体",Font.BOLD,15);
        fillIn.setFont(fillInFont);
        fillInLisenter fillLis=new fillInLisenter();
        fillIn.addActionListener(fillLis);
        fillLis.getStoredArray(allBlock);
        fillLis.setDotOnEmpty();
        j.add(fillIn);

    }
    public static JTextField[][] getStoredTextField()
    {
        return allBlock;
    }
    
}
