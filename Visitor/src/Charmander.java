
public class Charmander extends Pokemon {

  public Charmander(Pokemon... children) {
    super(children);
  }

  @Override
  public void accept(PokeVisitor visitor) {
    visitor.visitCharmander(this);
    super.accept(visitor);
  }

  @Override
  public String toString() {
    return "charmander";
  }
}
