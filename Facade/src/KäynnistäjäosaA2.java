
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KäynnistäjäosaA2 extends Käynnistäjäosa2 {

  private static final Logger LOGGER = LoggerFactory.getLogger(KäynnistäjäosaA2.class);

  @Override
  public void herätteleMuistia() {
    LOGGER.info("{} muisti kphta herännyt.", nimi());
  }

  @Override
  public String nimi() {
    return "Viimeinen herätys";
  }
}
