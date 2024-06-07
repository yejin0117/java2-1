package chapter11;
import javax.swing.*;
import java.awt.*;

public class paintJPanelEx extends JFrame{
    public paintJPanelEx(){
        setTitle("JPanel의 paintCompoenet() 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());
        setSize(250, 200);
        setVisible(true);
    }

    class MyPanel extends JPanel{
        public void paintCompoenet(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.BLUE);
            g.drawRect(10,10,50,50);
            g.drawString("자바가 정말 재밌다",30,30);
            g.setColor(new Color(255,0,0));
            g.setFont(new Font("Arial", Font.ITALIC, 30));
            g.setColor(new Color(0x00ff00ff));
            g.drawLine(20,20,100,100);
            g.drawOval(20,300,80,100);
            g.drawRoundRect(20,20,120,80,40,60);
        }
    }
    public static void main(String[] args){
        new paintJPanelEx();
    }
}
