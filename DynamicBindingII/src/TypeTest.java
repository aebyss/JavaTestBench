public class TypeTest {
    public static void main(String[] args) {
        Top top = new Top();
        Top tm = new Middle();
        Object obj = new Middle();
        top.meth(tm); //TopTop
        tm.meth(tm); //MidTop
        //tm.meth(obj); //Error no method in Top that can use that
    }
}
