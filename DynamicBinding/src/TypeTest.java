public class TypeTest {
    public static void main(String[] args) {
        Top top = new Top();
        Top tm = new Middle();
        Middle mid = new Middle();
        top.meth(mid); //TopMid
        tm.meth(top); //MidTop
        tm.meth(mid); //MidMid
    }
}
