public class Middle extends Top {
    public void meth(Object o) {
        System.out.println("MidObj ");
    }
    public void meth(Top t) {
        System.out.println("MidTop ");
    }
    public void meth(Middle m) {
        System.out.println("MidMid");
    }
}
