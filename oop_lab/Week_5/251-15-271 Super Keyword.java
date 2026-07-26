class Main {

    String d() {
        return "a vehicle with pedals.";
    }
}

class Motor extends Main {

    String d() {
        return "a cycle with an engine.";
    }

    Motor() {
        System.out.println("Hello I am a motorcycle, I am " + d());

        String s = super.d();
        System.out.println("My ancestor is a cycle who is " + s);
    }
}

public class Solve {
    public static void main(String[] args) {
        Motor m = new Motor();
    }
}