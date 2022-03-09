import java.util.Scanner;

public class StartMenu {
    public void startMenuSelect() {
        Scanner scan = new Scanner(System.in);
        System.out.println( "1. 모험을 계속하다\n" +
                            "2. 새로운 모험을 시작하다\n" +
                            "3. 설정을 바꾸다\n");
        int selectNum = scan.nextInt();
    }
}