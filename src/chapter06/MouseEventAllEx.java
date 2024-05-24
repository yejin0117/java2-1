package chapter06;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventAllEx extends JFrame{
    private JLabel la = new JLabel("Move Me");
    
    public MouseEventAllEx(){
        setTitle("MouseListener와 MouseMotionListener 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        MyMouseListener listener = new MyMouseListener();
        c.addMouseListener(listener);
        c.addMouseMotionListener(listener);
        c.setLayout(null);
        la.setSize(80, 20);
        la.setLocation(100,80);
        c.add(la);

        setSize(300,200);
        setVisible(true);
    }
    class MyMouseListener implements MouseListener
        public void
}
