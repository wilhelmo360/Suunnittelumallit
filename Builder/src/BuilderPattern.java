
public class BuilderPattern {

    public static void main(String[] args) {
        Tarjoilija tarjoilija = new Tarjoilija();

        HampurilaisBuilder chrissyFaveHampurilaisBuilder = new BigMöck();
        HampurilaisBuilder farhadFaveHampurilaisBuilder = new Lemppari();
        HampurilaisBuilder kanaHampurilaisBuilder = new Kanahamppari();
        HampurilaisBuilder tuplanautaHampurilaisBuilder = new TuplaNauta();

        tarjoilija.setHampurilaisBuilder(chrissyFaveHampurilaisBuilder);
        tarjoilija.constructHampurilainen();
        Hampurilainen hampurilainen1 = tarjoilija.getHampurilainen();
        System.out.println(hampurilainen1.getSämpylä() + hampurilainen1.getPihvi() + hampurilainen1.getMajoneesit());

        tarjoilija.setHampurilaisBuilder(tuplanautaHampurilaisBuilder);
        tarjoilija.constructHampurilainen();
        Hampurilainen hampurilainen2 = tarjoilija.getHampurilainen();
        System.out.println(hampurilainen2.getSämpylä() +hampurilainen2.getPihvi() + hampurilainen2.getMajoneesit());

        tarjoilija.setHampurilaisBuilder(farhadFaveHampurilaisBuilder);
        tarjoilija.constructHampurilainen();
        Hampurilainen hampurilainen3 = tarjoilija.getHampurilainen();
        System.out.println(hampurilainen3.getSämpylä() + hampurilainen3.getPihvi() + hampurilainen3.getMajoneesit());

        tarjoilija.setHampurilaisBuilder(kanaHampurilaisBuilder);
        tarjoilija.constructHampurilainen();
        Hampurilainen hampurilainen4 = tarjoilija.getHampurilainen();
        System.out.println(hampurilainen4.getSämpylä() + hampurilainen4.getPihvi() + hampurilainen4.getMajoneesit());

    }
}
