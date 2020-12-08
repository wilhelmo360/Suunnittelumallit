
public final class App {

  private App() {
  }

  public static void main(final String[] args) {

    var rekkakuski = new Rekkakuski(new RekkakuskiAdapteri());
    rekkakuski.row();
  }
}
