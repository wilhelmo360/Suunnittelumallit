
public class Tarjoilija {

    private HampurilaisBuilder hampurilaisBuilder;

    public void setHampurilaisBuilder(HampurilaisBuilder hampurilaisBuilder) {
        this.hampurilaisBuilder = hampurilaisBuilder;
    }

    public HampurilaisBuilder getHampurilaisBuilder() {
        return hampurilaisBuilder;
    }

    public Hampurilainen getHampurilainen() {
        return hampurilaisBuilder.getHampurilainen();
    }

    public void constructHampurilainen() {
        hampurilaisBuilder.uusiHampurilainen();
        hampurilaisBuilder.buildSämpylä();
        hampurilaisBuilder.buildPihvi();
        hampurilaisBuilder.buildMajoneesit();
    }

}
