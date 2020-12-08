import java.util.ArrayList;
import java.util.Collections;

public class TuplaNauta extends HampurilaisBuilder {

    public void buildSämpylä() {
        hampurilainen.setSämpylä("seesami");
    }

    public void buildPihvi() {
        hampurilainen.setPihvi("tuplanauta");
    }

    public void buildMajoneesit() {
        ArrayList<String> majoneesit = new ArrayList<String>();
        Collections.addAll(majoneesit, "ranch", "ketsuppi", "perus");
        hampurilainen.setMajoneesit(majoneesit);
    }

}
