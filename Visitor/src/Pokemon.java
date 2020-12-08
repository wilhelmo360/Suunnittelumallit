
import java.util.Arrays;

public abstract class Pokemon {

  private final Pokemon[] children;

  public Pokemon(Pokemon... children) {
    this.children = children;
  }

  public void accept(PokeVisitor visitor) {
    Arrays.stream(children).forEach(child -> child.accept(visitor));
  }
}
