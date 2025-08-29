/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author 2476382
 */
public class CourseGrades {
    private GradedActivity[] grades;
    private final int NUM_GRADES = 4;

    public CourseGrades() {
        this.grades = new GradedActivity[this.NUM_GRADES];
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
                String.format("Final Exam Score: %f\tGrade: %c", grades[2].getScore(), grades[2].getGrade());
    }
}
