
public class RekkakuskiAdapteri implements HenkilöAuto {

  private final RekkaAuto rekka;

  public RekkakuskiAdapteri() {
    rekka = new RekkaAuto();
  }

  public final void aja() {
    rekka.rahtaa();
  }
}
