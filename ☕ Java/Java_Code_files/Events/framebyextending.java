class MyFrame extends Frame
{
MyFrame()
{
setVisible(true);
setSize(400,300);
setTitle(”Creation of Frame”);
setBackground(Color.green);
}
public void paint(Graphics g)
{
Font f=new Font(”ARIAL”, Font.BOLD+Font.ITALIC,35); g.setFont(f);
setForeground(Color.red);
g.drawString(”VEDAVYAS”,100,100);
}
}
class FrameByExtendingFrameClass
{
public static void main(String args[ ])
{
MyFrame m=new MyFrame();
}
}
public class framebyextending {

}
