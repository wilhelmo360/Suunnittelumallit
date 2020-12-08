public class Client {

    public int palkka = 2;

    public String condition() {
        if (palkka < 2){
            return "nothng";
        } else if (2 < palkka < 5){
            return "ConcreteHandler1";
        } else {
            return "Concretehandler2";
        }
    }

    public static void main(String[] argsc ) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();

        handler1.successor = handler2;
        handler2.successor = handler1;

        handler1.handleRequest(condition);
    }

}