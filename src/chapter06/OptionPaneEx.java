package chapter06;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionPaneEx extends JFrame{
    public OptionPaneEx(){
        setTitle("옵션 팬 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        setSize(500, 200);
        c.add(new MyPanel(), BorderLayout.NORTH);
        setVisible(true);
    }
    class MyPanel extends Panel{
        private JButton inputBtn = new JButton("Input Name");
        private JTextField tf = new JTextField(10);
        private JButton confirmBtn = new JButton("confirmBtn");
        private JButton messageBtn = new JButton("Message");

        public MyPanel(){
            setBackground(Color.LIGHT_GRAY);
            add(inputBtn);
            add(confirmBtn);
            add(messageBtn);
            add(tf);
            inputBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    tf.setText(name);
                }
            });

            confirmBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    int result = JOptionPane.showConfirmDialog("계속할 것 입니까?", JOptionPane.YES_NO_OPTION);
                    if(result == JOptionPane.CLOSED_OPTION)
                        tf.setText("Just Closed without Selecti");
                    else if(result == JOptionPane.YES_OPTION)
                        tf.setText("Yes");
                    else 
                        tf.setText("No");
                    
                }
            });
        }
    }
}
