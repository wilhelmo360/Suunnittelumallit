/*
 * The MIT License
 * Copyright © 2014-2019 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
ic abstract class Käynnistäjäosa2 {

  private static final Logger LOGGER = LoggerFactory.getLogger(Käynnistäjäosa2.class);

  public void käynnistys1() {
    LOGGER.info("{} 3.", nimi());
  }

  public void käynnistys2() {
    LOGGER.info("{} 2.", nimi());
  }

  public void käynnistys3() {
    LOGGER.info("{} 1.", nimi());
  }

  public void käynnistyi() {
    LOGGER.info("{} käy.", nimi());
  }

  private void action(Action action) {
    switch (action) {
      case KÄYNNISTYS1:
        käynnistys1();
        break;
      case KÄYNNISTYS2:
        käynnistys2();
        break;
      case KÄYNNISTYS3:
        käynnistys3();
        break;
      case KÄY:
        käynnistyi();
        break;
      case KÄYNNISSÄ:
        herätteleMuistia();
        break;
      default:
        LOGGER.info("Undefined action");
        break;
    }
  }

  public void action(Action... actions) {
    Arrays.stream(actions).forEach(this::action);
  }

  public abstract void herätteleMuistia();

  public abstract String nimi();

  enum Action {
    KÄYNNISTYS1, KÄYNNISTYS2, KÄYNNISTYS3, KÄY, KÄYNNISSÄ
  }
}
