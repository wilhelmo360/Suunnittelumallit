public class Main {
    public static void main(String[] args) {
        Arvuuttaja arvuuttaja = new Arvuuttaja();
        arvuuttaja.setAsiakas1("State Dependent Variable 1");
        arvuuttaja.setAsiakas2("State Dependent Variable 2");
        arvuuttaja.setLuku1(100);
        arvuuttaja.setLuku2(200);

        Palauttaja palauttaja = new Palauttaja();
        palauttaja.saveState(arvuuttaja);

        System.out.println(arvuuttaja);

        arvuuttaja.setAsiakas1("State Dependent Variable 1 changed");

        System.out.println("Changed value " + arvuuttaja);
        palauttaja.restoreState(arvuuttaja);

        System.out.println("Restored value " + arvuuttaja);
    }
}
