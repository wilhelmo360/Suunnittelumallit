package factorymethod;

public class Henkilö extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Vesi();
    }

}
