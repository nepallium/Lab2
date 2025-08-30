/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author 2476382
 */
public class Essay extends GradedActivity {

    private double grammar;
    private double spelling;
    private double correctLength;
    private double content;

    public void setScore(double gr, double sp, double len, double cnt) {
        if (gr > 30) {
            throw new IllegalArgumentException("Grammar is max 30 points");
        }
        if (sp > 20) {
            throw new IllegalArgumentException("Spelling is max 20 points");
        }
        if (len > 20) {
            throw new IllegalArgumentException("Correct length is max 20 points");
        }
        if (cnt > 30) {
            throw new IllegalArgumentException("Content is max 30 points");
        }
        this.grammar = gr;
        this.spelling = sp;
        this.correctLength = len;
        this.content = cnt;

        super.setScore(gr + sp + len + cnt);
    }

    public double getGrammar() {
        return grammar;
    }

    public void setGrammar(double grammar) {
        this.grammar = grammar;
    }

    public double getSpelling() {
        return spelling;
    }

    public void setSpelling(double spelling) {
        this.spelling = spelling;
    }

    public double getCorrectLength() {
        return correctLength;
    }

    public void setCorrectLength(double correctLength) {
        this.correctLength = correctLength;
    }

    public double getContent() {
        return content;
    }

    public void setContent(double content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return String.format("Total points: %.1f\n", super.getScore())
                + String.format("Grade %c", super.getGrade());
    }
}
