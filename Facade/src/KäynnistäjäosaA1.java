
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KäynnistäjäosaA1 extends Käynnistäjäosa2 {

  private static final Logger LOGGER = LoggerFactory.getLogger(KäynnistäjäosaA1.class);

  @Override
  public void herätteleMuistia() {
    LOGGER.info("{} muistiherää.", nimi());
  }

  @Override
  public String nimi() {
    return "toinen herätttäjä";
  }
}
