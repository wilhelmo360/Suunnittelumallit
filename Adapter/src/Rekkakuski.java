
public final class Rekkakuski {

  private HenkilöAuto henkilöAuto;

  public Rekkakuski() {
  }

  public Rekkakuski(final HenkilöAuto auto) {
    this.henkilöAuto = auto;
  }

  void setHenkilöAuto(final HenkilöAuto auto) {
    this.henkilöAuto = auto;
  }

  void row() {
    henkilöAuto.aja();
  }

}
