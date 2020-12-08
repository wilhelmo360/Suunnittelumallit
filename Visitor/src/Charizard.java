
public class Charizard extends Pokemon {

  public Charizard(Pokemon... children) {
    super(children);
  }

  @Override
  public void accept(PokeVisitor visitor) {
    visitor.visitCharizard(this);
    super.accept(visitor);
  }

  @Override
  public String toString() {
    return "charizard";
  }
}
