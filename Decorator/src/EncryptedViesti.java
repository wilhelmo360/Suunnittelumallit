public class EncryptedViesti extends ViestiDecorator {

    public EncryptedViesti(Viesti viesti) {
        super(viesti);
    }

    @Override
    public void lähetäViesti(String viesti) {
        SalausOperaatio salausOperaatio = new SalausOperaatio();
        String salattuViesti = salausOperaatio.B64Encode(viesti);
        this.getDecoratedViesti().lähetäViesti(salattuViesti);
    }
}
