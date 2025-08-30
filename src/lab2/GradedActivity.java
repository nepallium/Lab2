// Git repo: https://github.com/nepallium/Lab2
package lab2;

/**
 *
 * @author 2476382 Alex Huang
 */
public class GradedActivity {

    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score > 100 && score < 0) {
            System.out.println("Score is not within an acceptable range");
            return;
        }

        this.score = score;
    }

    /**
     * Returns the letter associated with the numeric score
     *
     * @return the grade as a char
     */
    public char getGrade() {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
