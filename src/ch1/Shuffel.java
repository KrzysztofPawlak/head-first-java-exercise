package ch1;

/**
 * Created by Krzysiek on 2017-12-21.
 */
public class Shuffel {

    public static void main(String [] args) {

        int x = 3;

        while(x > 0) {
            if(x == 1) {
                System.out.print("d");
                x = x - 1;
            }
            if(x == 2) {
                System.out.print("b c");
            }

            if(x > 2) {
                System.out.print("a");
            }

            x = x - 1;
            System.out.print("-");
        }
    }
}
