package ch9;

import java.util.ArrayList;

public class KlimatyzatorV3 extends KlimatyzatorV2 {
    KlimatyzatorV3(ArrayList lglista) {
        super(lglista); // blad - dodatkowe 5 klimatyzatorow
        for(int g = 0; g < 5; g++) {
            lglista.add(new JednSym("KlimatyzatorV3"));
        }
    }
}
