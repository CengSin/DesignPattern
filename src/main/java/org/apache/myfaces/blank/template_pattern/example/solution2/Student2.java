package org.apache.myfaces.blank.template_pattern.example.solution2;

/**
 * @author zhangzetao
 */
public class Student2 {
    private ProgramPaper programPaper;

    public Student2() {
        programPaper = new ProgramPaper();
    }

    public void question1() {
        programPaper.question1();
        System.out.println("答案是asd");
    }

    public void question2() {
        programPaper.question2();
        System.out.println("答案是56");
    }
}
