package chapter06;
import javax.swing.*;
import java.awt.*;

public class ButtonImageEx extends JFrame {
    public ButtonImageEx(){
        setTitle("이미지 버튼 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        ImageIcon normalIcon = new ImageIcon("images/tel.jpg");
        ImageIcon rolloverIcon = new ImageIcon("images/tel.jpg");
        ImageIcon pressedIcon = new ImageIcon("images/tel.jpg");

        JButton btn = new JButton("call~~", normalIcon);
        btn.setPressedIcon(pressedIcon);
        btn.setRolloverIcon(rolloverIcon);

        c.add(btn);
        setSize(250, 150);
        setVisible(true);
    }
    public static void main(String[] args){
        new ButtonImageEx();
    }
}
