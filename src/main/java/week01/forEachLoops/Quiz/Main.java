package week01.forEachLoops.Quiz;

public class Main {
    public static void main(String[] args) {
        Thing f = new Thing(6);
        Thing g = new Thing(8);
        f.combine(g);
        System.out.println(f.geta()); // returns
        System.out.println(g.geta());
    }
}

/*
* Output:
* 14
* 8
* */
