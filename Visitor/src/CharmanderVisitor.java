
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CharmanderVisitor implements PokeVisitor {

  private static final Logger LOGGER = LoggerFactory.getLogger(CharmanderVisitor.class);

  @Override
  public void visitCharmander(Charmander charmander) {
    LOGGER.info("Greetings {}", charmander);
  }

  @Override
  public void visitCharmeleon(Charmeleon charmeleon) {
    // Do nothing
  }

  @Override
  public void visitCharizard(Charizard charizard) {
    // Do nothing
  }
}
