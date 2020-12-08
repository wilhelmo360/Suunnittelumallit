public abstract class ViestiDecorator implements Viesti {

    protected Viesti decoratedViesti;


    public ViestiDecorator(Viesti viesti) {

        this.decoratedViesti = viesti;
    }

    public abstract void lähetäViesti(String viesti);


    public Viesti getDecoratedViesti() {

        return this.decoratedViesti;
    }

}
