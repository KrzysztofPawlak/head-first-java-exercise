package ch1;

/**
 * Created by Krzysiek on 2017-12-21.
 */
public class Exercise1B {

    public static void main(String [] args) {
        int x = 5;

        while(x > 1) {
            x = x - 1;
            if( x < 3) {
                System.out.println("small x");
            }
        }
    }
}
