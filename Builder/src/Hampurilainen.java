import java.util.ArrayList;

public class Hampurilainen {

    private String sämpylä = "";
    private String pihvi = "";
    private ArrayList<String> majoneesit = new ArrayList<>();

    public void setSämpylä(String sämpylä) {
        this.sämpylä = sämpylä;
    }

    public void setPihvi(String pihvi) {
        this.pihvi = pihvi;
    }

    public void setMajoneesit(ArrayList<String> majoneesit) {
        this.majoneesit = majoneesit;
    }

    public String getSämpylä() {
        return sämpylä;
    }

    public String getPihvi() {
        return pihvi;
    }

    public ArrayList<String> getMajoneesit() {
        return majoneesit;
    }
}
