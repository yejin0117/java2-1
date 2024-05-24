package chapter06;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AnonymousClassListener extends JFrame{
    private JLabel la = new JLabel("<Enter>키로 배경색이 바뀝니다.");

    public AnonymousClassListener() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        btn.addActionListener(new MyActionListener());
        c.add(btn);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JButton b = (JButton)e.getSource();
                if(b.getText().equals("Action"))
                    b.setText("액션");
                else
                    b.setText("Action");
                
            }
        });
    }
}