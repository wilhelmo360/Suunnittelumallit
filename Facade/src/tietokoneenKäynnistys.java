
import java.util.Collection;
import java.util.List;

public class tietokoneenKäynnistys {

  private final List<Käynnistäjäosa2> workers;

  /**
   * Constructor.
   */
  public tietokoneenKäynnistys() {
    workers = List.of(
        new KäynnistäjäosaA1(),
        new KäynnistäjäOsa1(),
        new KäynnistäjäosaA2());
  }

  public void aloitaKäynnistys() {
    makeActions(workers, Käynnistäjäosa2.Action.KÄYNNISTYS2, Käynnistäjäosa2.Action.KÄY);
  }

  public void käynnistyskesken() {
    makeActions(workers, Käynnistäjäosa2.Action.KÄYNNISSÄ);
  }

  public void käynnistetty() {
    makeActions(workers, Käynnistäjäosa2.Action.KÄYNNISTYS3, Käynnistäjäosa2.Action.KÄYNNISTYS1);
  }

  private static void makeActions(
      Collection<Käynnistäjäosa2> workers,
      Käynnistäjäosa2.Action... actions
  ) {
    workers.forEach(worker -> worker.action(actions));
  }
}
