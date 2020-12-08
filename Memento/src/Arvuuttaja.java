
public class Arvuuttaja {

    private int luku1, luku2;

    private String asiakas1, asiakas2;

    public void setLuku1(int luku1) {
        this.luku1 = luku1;
    }

    public void setLuku2(int luku2) {
        this.luku2 = luku2;
    }

    public void setAsiakas1(String asiakas1) {
        this.asiakas1 = asiakas1;
    }

    public void setAsiakas2(String asiakas2) {
        this.asiakas2 = asiakas2;
    }

    public Memento getState() {
        return new Memento(asiakas1, asiakas2);
    }

    public void restoreState(Object object) {
        Memento memento = (Memento)object;
        this.asiakas1 = memento.asiakas1;
        this.asiakas2 = memento.asiakas2;
    }

    @Override
    public String toString() {
        return "Arvuuttaja{" + "luku1=" + luku1 +  ", luku2=" + luku2;
    }

    private class Memento {
        String asiakas1, asiakas2;

        public Memento(String asiakas1, String asiakas2) {
            this.asiakas1 = asiakas1;
            this.asiakas2 = asiakas2;
        }
    }
}