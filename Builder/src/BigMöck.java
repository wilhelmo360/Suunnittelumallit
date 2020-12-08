import java.util.ArrayList;
import java.util.Collections;

public class BigMöck extends HampurilaisBuilder {

    public void buildSämpylä() {
        hampurilainen.setSämpylä("joku");
    }

    public void buildPihvi() {
        hampurilainen.setPihvi("testiliha");
    }

    public void buildMajoneesit() {
        ArrayList<String> majoneesit = new ArrayList<String>();
        Collections.addAll(majoneesit, "perus");
        hampurilainen.setMajoneesit(majoneesit);
    }

}
