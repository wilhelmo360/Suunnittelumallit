public class App {

    public static void main(String[] args) {


        String messageToSend = "This is an important viesti about the decorator pattern";

        Viesti viesti = new PerusViesti();
        viesti.lähetäViesti(messageToSend);

        Viesti encodedViesti = new EncryptedViesti(new PerusViesti());
        encodedViesti.lähetäViesti(messageToSend);

        Viesti reversedViesti = new ReversedViesti(new PerusViesti());
        reversedViesti.lähetäViesti(messageToSend);

        Viesti encodedAndReversedViesti = new EncryptedViesti(new ReversedViesti(new PerusViesti()));
        encodedAndReversedViesti.lähetäViesti(messageToSend);

        Viesti reversedAndEncoded = new ReversedViesti(new EncryptedViesti(new PerusViesti()));
        reversedAndEncoded.lähetäViesti(messageToSend);

        Viesti doubleReversed = new ReversedViesti(new ReversedViesti(new PerusViesti()));
        doubleReversed.lähetäViesti(messageToSend);


    }
}
