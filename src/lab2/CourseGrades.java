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
            sum += activity.getGrade();
        }
        
        return sum / grades.length;
    }

    @Override
    public GradedActivity getHighest() {
        GradedActivity max = grades[0];
        
        for (GradedActivity activity : grades) {
            if (activity.getGrade() > max.getGrade()) {
                max = activity;
            }
        }
        
        return max;
    }

    @Override
    public GradedActivity getLowest() {
        GradedActivity min = grades[0];
        
        for (GradedActivity activity : grades) {
            if (activity.getGrade() < min.getGrade()) {
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
        return String.format("Lab Score: %f\tGrade: %c\n", grades[0].getScore(), grades[0].getGrade()) +
                String.format("Pass/Fail Exam Score: %f\tGrade: %c", grades[1].getScore(), grades[1].getGrade()) +
                String.format("Essay Score: %f\tGrade: %c", grades[2].getScore(), grades[2].getGrade()) +
                String.format("Final Exam Score: %f\tGrade: %c", grades[2].getScore(), grades[2].getGrade()) +
                String.format("Average score: %f", this.getAverage()) +
                String.format("Highest score: %f", this.getHighest()) +
                String.format("Lowest score: %f", this.getLowest());
    }
}
