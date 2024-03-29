import java.util.Scanner;

public class Ex2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("시간을 입력하세요: ");
        int time = scanner.nextInt();
        int second = time % 60;
        int minute = (time / 60)%60;
        int hour = (time/60)/60;

        System.out.println("초: "+second);
        System.out.println("분: "+minute);
        System.out.println("시간: "+hour);
        
        scanner.close();
    }    
}
