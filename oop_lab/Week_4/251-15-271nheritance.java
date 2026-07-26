
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