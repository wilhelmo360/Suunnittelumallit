import java.util.ArrayList;
import java.util.List;

public class Composite extends Komponentti {

  private List<Komponentti> hinnat = new ArrayList<Komponentti>();

  public double hintaoperaatio() {
    double sum = 0;
    for(int i = 0; i < hinnat.size(); i++)
      sum += hinnat.get(i);
    return sum;
  }

  public void add(Komponentti komponentti) {
    hinnat.add(komponentti);
  }

  public void remove(Komponentti komponentti) {
    hinnat.remove(komponentti);
  }

  public Komponentti getChild(int index) {
    return hinnat.get(index);
  }
}
