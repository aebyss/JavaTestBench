public class TypeTest {
    public static void main(String[] args) {
        Top top = new Top();
        Object obj = new Middle();
        Middle mb = new Bottom();
        mb.meth(top); //MidTop
        mb.meth(obj); //BotObj
        mb.meth(mb); //MidMid

    }
}
