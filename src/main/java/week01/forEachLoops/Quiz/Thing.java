package week01.forEachLoops.Quiz;

public class Thing {
    private int a;

    public Thing(int x) { a = x; }

    public int geta() {return a; }

    public void combine(Thing y){
        a = a + y.geta();
    }
}
