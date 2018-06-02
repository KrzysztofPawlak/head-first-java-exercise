package ch9;

public class JednSym {
    String typUrz;

    JednSym(String typ) {
        typUrz = typ;
    }

    int zuzycieEnergi() {
        if("Grzejnik".equals(typUrz)) {
            return 2;
        } else {
            return 4;
        }
    }
}
