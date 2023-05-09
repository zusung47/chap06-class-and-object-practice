package jusung;

public class Car {
    private String[] arr = new String[] {"0","0","car","0","0","0","0","0","0"};
    private  int index = 2;
    public void left() {
        if (index == 0) {
            this.index = 0;
        } else {
            arr[this.index] = "0";
            this.index -= 1;
            arr[this.index] = "car";
        }
        System.out.println("=======================");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("=======================");
    }

    public void right() {
        if(this.index == 8){
            this.index = 8;
        }else{
            arr[this.index] = "0";
            index += 1;
            arr[this.index] = "car";
        }
        System.out.println("=======================");
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("=======================");
    }
}
