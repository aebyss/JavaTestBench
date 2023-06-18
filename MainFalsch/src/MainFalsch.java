import java.sql.SQLOutput;
/*
public class MainFalsch {
    public static void main(String[] args) {
        MainFalsch m = new MainFalsch();
        Finder f = new Finder() {
            @Override
            public boolean find(Object o) {
                return false;
            }
        };
        MyFinder s = new MySearch();
        s.find(f.find(m));
        System.out.println(MyFinder.toFind);
    }

    static interface Finder {
        public boolean find(Object o);
    }

     static class MyFinder implements Finder {
        private String toFind = "42";
        public void getFind() {
            return toFind;
        }
        public boolean find(Object o) {
            String s = o;
            return s.equals(toFind);
        }
    }

    static class MySearch implements Finder {
        private String toSearch = toFind;

        abstract void foo();
    }
}
*/