package chapter06;
import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
    public ContentPaneEx() {
        setTitle("ContentPane과 JFrame 예제"); // 프레임의 타이틀 달기
        setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
        
        Container contentPane = getContentPane(); // 컨텐트팬 알아내기
        contentPane setBackground(ColorORANGE); // 오렌지색 배경 설정 
        contentPane setLayout(new FlowLayouto()); // 컨텐트팬에 FlowLayout배치관리자 달기
        contentPane.add(new JButton("OK"); // OK 버튼 달기
        contentpane.add(new JButton("Cancel")): // Cancel 버튼 달기 
        contentPane.add(new JButton("lgnore"): // Ignore 버튼 달기 setSize(300, 150): // 프레임 크기 300x150 설정
        setVisible(true); // 화면에 프레임 즙력
    }
    public static void main(String[] args) { 
        new ContentPaneEx();
    }
}