package org.apache.myfaces.blank.template_pattern.example.solution3;

/**
 * @author zhangzetao
 */
public abstract class ProgramPapers {

    public void question1() {
        System.out.println("1. 1+1=?");
        System.out.println("答案是" + question1Ans());
    }

    abstract String question1Ans();

    public void question2() {
        System.out.println("1. 1+2=?");
        System.out.println("答案是" + question2Ans());
    }

    abstract String question2Ans();

}
