import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class StartMenu {
    Scanner scan = new Scanner(System.in);

    public void startMenuSelect() {
        System.out.println( "1. 모험을 계속하다\n" +
                            "2. 새로운 모험을 시작하다\n" +
                            "3. 설정을 바꾸다\n");
        int selectNum = scan.nextInt();
        scan.nextLine();

        if(selectNum == 1) {
            // gameContinue();
        }
        else if(selectNum == 2) {
            newGame();
        }
        else if(selectNum == 3) {
            // menuSetting();
        }
        else {
            System.out.println("다시 입력해주십시오.");
            startMenuSelect();
        }
    }

    private void newGame() {
        System.out.println("게임 진행 시에는 엔터(enter)로 대화를 넘겨주십시오");
        scan.nextLine();

        Scanner textScan = null;
        try {
            textScan = new Scanner(new File("./src/main/resources/newGameText.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (textScan.hasNextLine()) {
            String text = textScan.nextLine();
            System.out.println(text);
            if(text.equals("그럼... 슬슬 너의 이름을 가르쳐다오")) {
                String userName = null;
                int nameCheck = 0;
                do {
                    System.out.println("이름을 입력하세요:");
                    userName = scan.next();
                    System.out.println("자네의 이름이" + userName + "이(가) 맞는가?\n" +
                            "1. 맞습니다. 2. 아닙니다.");
                    nameCheck = scan.nextInt();
                    while (!(nameCheck == 1 || nameCheck == 2)) {
                        System.out.println("1 혹은 2로 다시 입력해주세요");
                        nameCheck = scan.nextInt();
                    }
                } while (nameCheck == 2);
            }
            scan.nextLine();
        }
    }
}