package ch9;

import java.util.ArrayList;

// rozwiazanie rozni sie od ksiazkowego !!!
public class SPZTester {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();

        KlimatyzatorV2 v2 = new KlimatyzatorV2(lista);
        KlimatyzatorV3 v3 = new KlimatyzatorV3(lista);

        var liczbaKlima = lista.size();

        var klimaEnerg = 0;
        for(int i = 0; i < lista.size(); i++) {
            klimaEnerg += new JednSym("KlimatyzatorV2").zuzycieEnergi();
        }

        var grzejEnerg = 0;
        lista = new ArrayList(); // naliczany od nowa
        for(int z = 0; z < 20; z++) {
            Grzejnik grz = new Grzejnik(lista);
            grzejEnerg += new JednSym("Grzejnik").zuzycieEnergi();
        }
        var liczbaGrzej = lista.size();

        System.out.println("kimatyzator energia: " + klimaEnerg);
        System.out.println("grzejnik energia: " + grzejEnerg);
        System.out.println("kimatyzator liczba: " + liczbaKlima);
        System.out.println("grzejnik liczba: " + liczbaGrzej);
    }
}
