package org.apache.myfaces.blank.template_pattern.example.solution2;

/**
 * @author zhangzetao
 */
public class Student1 {

    private ProgramPaper programPaper;

    public Student1() {
        programPaper = new ProgramPaper();
    }

    public void question1() {
        programPaper.question1();
        System.out.println("答案是2");
    }

    public void question2() {
        programPaper.question2();
        System.out.println("答案是3");
    }
}
