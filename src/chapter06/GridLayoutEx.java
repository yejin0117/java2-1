package chapter06;
import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame{
    public GridLayoutEx(){
        super("GridLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane(); //컨텐트팬 알아내기

        contentPane.setLayout(new GridLayout(4, 3, 10, 10));

        for(int i=9; i>=0; i--){
                String text = Integer.toString(i);
                JButton button = new JButton(text);
                contentPane.add(button);
        }
        contentPane.add(new JButton("*"));
        contentPane.add(new JButton("0"));

        setSize(250, 250);
        setVisible(true);
    }
    public static void main(String[] args){
        new GridLayoutEx();
    }

}
