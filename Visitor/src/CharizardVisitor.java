
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CharizardVisitor implements PokeVisitor {

  private static final Logger LOGGER = LoggerFactory.getLogger(CharizardVisitor.class);

  @Override
  public void visitCharmander(Charmander charmander) {
    // Do nothing
  }

  @Override
  public void visitCharmeleon(Charmeleon charmeleon) {
    // Do nothing
  }

  @Override
  public void visitCharizard(Charizard charizard) {
    LOGGER.info("Good to see you {}", charizard);
  }
}
