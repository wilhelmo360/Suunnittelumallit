import java.util.Base64;

public class SalausOperaatio {

    public String B64Encode(String salattavaViesti) {

        byte[] enkoodatut = Base64.getEncoder().encode(salattavaViesti.getBytes());
        return new String(enkoodatut);
    }

    public String kääntäjä(String käännettäväViesti) {

        return new StringBuilder(käännettäväViesti).reverse().toString();
    }
}

