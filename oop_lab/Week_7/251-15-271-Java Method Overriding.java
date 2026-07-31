import java.util.Scanner;

class Sports {

    String getName() {
        return "Generic Sports";
    }

    void getNumberOfTeamMembers() {
        System.out.println("Each team has n players in " + getName());
    }
}

class Soccer extends Sports {

   
    String getName() {
        return "Soccer Class";
    }


    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }
}

public class Solution {

    public static void main(String[] args) {

        Sports s1 = new Sports();
        Soccer s2 = new Soccer();

        System.out.println(s1.getName());
        s1.getNumberOfTeamMembers();

        System.out.println(s2.getName());
        s2.getNumberOfTeamMembers();
    }
}
