/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author 2476382
 */
public class FinalExam extends GradedActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public FinalExam(int numQuestions, int numMissed) {
        this.numQuestions = numQuestions;
        this.numMissed = numMissed;
        this.pointsEach = 100 / numQuestions;
        super.setScore(100 - (numMissed * pointsEach));
    }

    public double getPointsEach() {
        return this.pointsEach;
    }

    public int getNumMissed() {
        return this.numMissed;
    }
    
    @Override
    public String toString() {
        return String.format("Each question counts %.1f points\n", getPointsEach()) +
                String.format("The exam score is %.1f\n", super.getScore()) +
                String.format("The exam grade is %c\n", super.getGrade());
    }
}
