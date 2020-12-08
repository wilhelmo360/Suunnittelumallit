
public abstract class HampurilaisBuilder {

    protected Hampurilainen hampurilainen;

    public Hampurilainen getHampurilainen() {
        return hampurilainen;
    }

    public void uusiHampurilainen() {
        hampurilainen = new Hampurilainen();
    }

    public abstract void buildSämpylä();

    public abstract void buildPihvi();

    public abstract void buildMajoneesit();
}
