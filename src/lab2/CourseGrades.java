/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author 2476382
 */
public class CourseGrades implements Analyzable {

    private GradedActivity[] grades;
    private final int NUM_GRADES = 4;

    public CourseGrades() {
        this.grades = new GradedActivity[this.NUM_GRADES];
    }

    @Override
    public double getAverage() {
        double sum = 0;

        for (GradedActivity activity : grades) {
            sum += activity.getScore();
        }

        return sum / grades.length;
    }

    @Override
    public GradedActivity getHighest() {
        GradedActivity max = grades[0];

        for (GradedActivity activity : grades) {
            if (activity.getScore() > max.getScore()) {
                max = activity;
            }
        }

        return max;
    }

    @Override
    public GradedActivity getLowest() {
        GradedActivity min = grades[0];

        for (GradedActivity activity : grades) {
            if (activity.getScore() < min.getScore()) {
                min = activity;
            }
        }

        return min;
    }

    public void setLab(GradedActivity aLab) {
        grades[0] = aLab;
    }

    public void setPassFailExam(PassFailExam aPassFailExam) {
        grades[1] = aPassFailExam;
    }

    public void setEssay(Essay anEssay) {
        grades[2] = anEssay;
    }

    public void setFinalExam(FinalExam aFinalExam) {
        grades[3] = aFinalExam;
    }

    @Override
    public String toString() {
        return String.format("Lab Score: %.1f    Grade: %c\n", grades[0].getScore(), grades[0].getGrade())
                + String.format("Pass/Fail Exam Score: %.1f\tGrade: %c\n", grades[1].getScore(), grades[1].getGrade())
                + String.format("Essay Score: %.1f\tGrade: %c\n", grades[2].getScore(), grades[2].getGrade())
                + String.format("Final Exam Score: %.1f\tGrade: %c", grades[3].getScore(), grades[3].getGrade());
    }
}
