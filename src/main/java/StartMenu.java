import java.util.Scanner;

public class StartMenu {
    Scanner scan = new Scanner(System.in);

    public void startMenuSelect() {
        System.out.println( "1. 모험을 계속하다\n" +
                            "2. 새로운 모험을 시작하다\n" +
                            "3. 설정을 바꾸다\n");
        int selectNum = scan.nextInt();

        if(selectNum == 1) {
            // gameContinue();
        }
        else if(selectNum == 2) {
            // newGame();
        }
        else if(selectNum == 3) {
            // menuSetting();
        }
        else {
            System.out.println("다시 입력해주십시오.");
            startMenuSelect();
        }
    }
}