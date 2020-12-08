public class Main {

    public static void Main() {


        Charmeleon state1 = new Charmeleon();
        Charizard state2 = new Charizard();

        assertEquals(false, state1.isHandleInvoked());
        assertEquals(false, state2.isHandleInvoked());

        Context context = new Context();
        context.setState(state1);
        context.request();

        assertEquals(true, state1.isHandleInvoked());

        context.setState(state2);
        context.request();

        assertEquals(true, state2.isHandleInvoked());
    }

    private static void assertEquals(boolean b, boolean handleInvoked) {

    }
}
