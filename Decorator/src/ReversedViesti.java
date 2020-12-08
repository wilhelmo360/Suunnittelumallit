public class ReversedViesti extends ViestiDecorator {

    public ReversedViesti(Viesti viesti) {

        super(viesti);
    }

    @Override
    public void lähetäViesti(String viesti) {

        SalausOperaatio salausOperaatio = new SalausOperaatio();
        String käännettyViesti = salausOperaatio.kääntäjä(viesti);
        this.getDecoratedViesti().lähetäViesti(käännettyViesti);
    }
}
