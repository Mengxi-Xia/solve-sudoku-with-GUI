import javax.swing.JLabel;
import javax.swing.JPanel;

public class JpanelRes 
{
    public static void setResultPanel(JPanel resultP)
    {
        resultP.setLayout(null);
        JLabel[][] resultMap=new JLabel[9][9];
        for(int a=0;a<9;a++)
        {
            for(int b=0;b<9;b++)
            {
                resultMap[a][b]=new JLabel(String.valueOf(listener.getStoredMap()[a][b]));
                resultMap[a][b].setBounds(a*40+50,b*40+50,30,30);
                resultP.add(resultMap[a][b]);
            }
        }
        
    }    
}
