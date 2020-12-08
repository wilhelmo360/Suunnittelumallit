import java.util.ArrayList;
import java.util.Collections;

public class Lemppari extends HampurilaisBuilder {

    public void buildSämpylä() {
        hampurilainen.setSämpylä("ohut");
    }

    public void buildPihvi() {
        hampurilainen.setPihvi("Halloumi");
    }

    public void buildMajoneesit() {
        ArrayList<String> majoneesit = new ArrayList<String>();
        Collections.addAll(majoneesit, "tomaatti");
        hampurilainen.setMajoneesit(majoneesit);
    }

}