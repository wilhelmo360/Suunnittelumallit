
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CharmeleonVisitor implements PokeVisitor {

  private static final Logger LOGGER = LoggerFactory.getLogger(CharmeleonVisitor.class);

  @Override
  public void visitCharmander(Charmander charmander) {
    // Do nothing
  }

  @Override
  public void visitCharmeleon(Charmeleon charmeleon) {
    LOGGER.info("Hello {}", charmeleon);
  }

  @Override
  public void visitCharizard(Charizard charizard) {
    // Do nothing
  }
}
