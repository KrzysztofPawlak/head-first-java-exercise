package ch11;

class MojEx extends Exception { }

public class ExTester {

    public static void main(String[] args) {
        String test = args[0];
        System.out.print("p");
        System.out.print("i");

        try {
            zaryzykuj(test);
        } catch (MojEx e) {

        } finally {
            System.out.print("a");
            System.out.print("n");
            System.out.print("a");
        }
    }

    static void zaryzykuj(String t) throws MojEx {
        if ("tak".equals(t)) {
            throw new MojEx();
        }
        System.out.print("j");
    }
}
