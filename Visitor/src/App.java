
public class App {

  public static void main(String[] args) {

    var commander = new Charizard(
        new Charmeleon(new Charmander(), new Charmander(), new Charmander()),
        new Charmeleon(new Charmander(), new Charmander(), new Charmander())
    );
    commander.accept(new CharmanderVisitor());
    commander.accept(new CharmeleonVisitor());
    commander.accept(new CharizardVisitor());

  }
}
