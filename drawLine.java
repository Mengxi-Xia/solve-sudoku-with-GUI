import javax.swing.JComponent;
import java.awt.*;
public class drawLine extends JComponent
{
    public void paint(Graphics g)
    {
        Graphics2D g2=(Graphics2D)g;
        g2.setStroke(new BasicStroke(3.0f));
        g2.drawLine(50,165,400,165);//horizontal
        g2.drawLine(165,50,165,400);//vertical
        g2.drawLine(50, 285, 400, 285);//horizontal
        g2.drawLine(285, 50, 285, 400);//vertical

        g2.drawLine(47, 47, 400, 47);
        g2.drawLine(47, 403, 400, 403);

        g2.drawLine(47,50,47,400);
        g2.drawLine(403, 47, 403, 400);
    }
}
