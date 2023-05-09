package jusung;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        CarGame game = new CarGame();
        do{
            System.out.println("======== 자동차 게임 ========");
            System.out.println("1. 시작하기");
            System.out.println("2. 종료하기");
            System.out.print("메뉴 선택 : ");
            int x = sc.nextInt();
            System.out.println("");
            switch (x){
                case 1:
                    System.out.println("***** 게임을 시작합니다. *****");
                    game.start();
                    break;
                case 2:
                    System.out.println("게임을 종료합니다.");
                    return;
            }
        }while(true);
    }
}
