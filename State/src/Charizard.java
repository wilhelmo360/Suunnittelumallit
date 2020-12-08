/**
 * Charizard implements a behavior associated with a state of the Context.
 *
 */
public class Charizard implements State {

  private boolean handleInvoked = false;

  public void handle() {
    this.handleInvoked = true;
  }

  protected boolean isHandleInvoked() {
    return handleInvoked;
  }
}
