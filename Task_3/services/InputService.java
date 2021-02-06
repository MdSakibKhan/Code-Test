package services;

import java.util.Scanner;

public class InputService {

    Scanner scan;

    public InputService(){
        scan = new Scanner(System.in);
    }
    public char takeChar(){
        return scan.nextLine().charAt(0);
    }
    public  int takeInt(){
        return scan.nextInt();
    }
    public void next() {
        scan.nextLine();
    }
}
