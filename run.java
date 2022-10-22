import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
class run
{   
    public static void main(String[] args) 
    {
        //declear all frame and panel (two windows)
        JFrame mainFrame=new JFrame("Slove sudoku");

        JFrame beforeUse=new JFrame("Before you use...");
        JPanel beforeUsePanel=new JPanel();
        JLabel text1=new JLabel("This is used to solve sudoku, type your sudoku here, then press auto fill in");
        JLabel text2=new JLabel("这是一个用来解数独的程序，在输入完成后请使用自动填充来填补空位");
        beforeUsePanel.add(text1);  
        beforeUsePanel.add(text2);
        beforeUse.add(beforeUsePanel);
        beforeUse.setBounds(300, 325, 500, 100);
        JPanel meanPanel=new JPanel();
        meanPanel.setOpaque(false);
        mainFrame.add(meanPanel);
        JpanelMain.setPanelProp(meanPanel);
        mainFrame.setBounds(100, 100, 600, 510);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
        beforeUse.setVisible(true);
        //menu bar
        JMenuBar menuBar=new JMenuBar();
        JMenu function=new JMenu("功能");
        JMenuItem emptySpace=new JMenuItem("清空");
        function.add(emptySpace);
        menuBar.add(function);
        mainFrame.setJMenuBar(menuBar);
        menuBar.setVisible(true);
        //实现清空功能
        emptySpaceMenu lis=new emptySpaceMenu();
        emptySpace.addActionListener(lis);
        lis.getStoredArray(JpanelMain.getStoredTextField());

        mainFrame.getContentPane().add(new drawLine());
        mainFrame.setVisible(false);
        mainFrame.setVisible(true);
        
        

    }
}