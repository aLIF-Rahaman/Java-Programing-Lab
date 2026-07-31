import java.util.*;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    Person(String firstName, String lastName, int idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    public void printPerson() {
        System.out.println("Name: " + lastName + ", " + firstName);
        System.out.println("ID: " + idNumber);
    }
}

class Student extends Person {

    private int[] testScores;

    Student(String firstName, String lastName, int idNumber, int[] testScores) {
        super(firstName, lastName, idNumber);
        this.testScores = testScores;
    }

    char calculate() {

        int sum = 0;

        for (int score : testScores) {
            sum += score;
        }

        int avg = sum / testScores.length;

        if (avg >= 90)
            return 'O';
        else if (avg >= 80)
            return 'E';
        else if (avg >= 70)
            return 'A';
        else if (avg >= 55)
            return 'P';
        else if (avg >= 40)
            return 'D';
        else
            return 'T';
    }
}

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();

        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];

        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }

        Student s = new Student(firstName, lastName, id, testScores);

        s.printPerson();
        System.out.println("Grade: " + s.calculate());

        scan.close();
    }
}
