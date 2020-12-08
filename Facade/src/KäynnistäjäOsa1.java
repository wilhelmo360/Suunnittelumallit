import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KäynnistäjäOsa1 extends Käynnistäjäosa2 {

  private static final Logger LOGGER = LoggerFactory.getLogger(KäynnistäjäOsa1.class);

  @Override
  public void herätteleMuistia() {
    LOGGER.info("{} muisti herää.", nimi());
  }

  @Override
  public String nimi() {
    return "muistin herättelijä";
  }
}
