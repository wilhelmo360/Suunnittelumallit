public class Palauttaja {
    private Object savedState;

    public void saveState(Arvuuttaja arvuuttaja) {
        this.savedState = arvuuttaja.getState();
    }

    public void restoreState(Arvuuttaja arvuuttaja) {
        arvuuttaja.restoreState(savedState);
    }
}