package jusung;

import java.util.Scanner;

public class CarGame {
    Scanner sc = new Scanner(System.in);
    Car car = new Car();
    private String[] arr = new String[] {"0","0","car","0","0","0","0","0","0"};
    private int index = 2;
    public void start() {
        System.out.println("=======================");
        System.out.println("0 0 car 0 0 0 0 0 0 ");
        System.out.println("=======================");
        do{
            System.out.println("1. 좌로 이동하기");
            System.out.println("2. 우로 이동하기");
            System.out.println("3. 메인으로 이동");
            System.out.println("선택 : ");
            int x = sc.nextInt();

            switch (x){
                case 1:
                    car.left();
                    break;
                case 2:
                    car.right();
                    break;
                case 3:
                    System.out.println("메인으로 이동합니다.");
                    return;
            }
        }while(true);
    }
}
