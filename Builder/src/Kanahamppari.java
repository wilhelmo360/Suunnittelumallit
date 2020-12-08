import java.util.ArrayList;
import java.util.Collections;

public class Kanahamppari extends HampurilaisBuilder {

    public void buildSämpylä() {
        hampurilainen.setSämpylä("seesami");
    }

    public void buildPihvi() {
        hampurilainen.setPihvi("kanapihvi");
    }

    public void buildMajoneesit() {
        ArrayList<String> majoneesit = new ArrayList<String>();
        Collections.addAll(majoneesit, "valkosipuli", "aurajuusto");
        hampurilainen.setMajoneesit(majoneesit);
    }

}
