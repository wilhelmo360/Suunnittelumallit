
public class Charmeleon extends Pokemon {

  public Charmeleon(Pokemon... children) {
    super(children);
  }

  @Override
  public void accept(PokeVisitor visitor) {
    visitor.visitCharmeleon(this);
    super.accept(visitor);
  }

  @Override
  public String toString() {
    return "charmeleon";
  }
}
