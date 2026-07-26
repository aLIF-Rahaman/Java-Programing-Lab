
import java.util.Scanner;

class Singleton {

    private static Singleton instance = new Singleton();

    public String str;
    private Singleton() {
    }

    public static Singleton getSingleInstance() {
        return instance;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        Singleton obj = Singleton.getSingleInstance();
        obj.str = s;

        System.out.println("Hello I am a singleton! Let me say " + obj.str + " to you");

        sc.close();
    }
}