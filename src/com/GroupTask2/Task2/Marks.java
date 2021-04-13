package com.GroupTask2.Task2;

public interface Marks {

    int getPercentage();
}
class A implements Marks {
    int subject1;
    int subject2;
    int subject3;

    A(int subject1,int subject2,int subject3){
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
    }

    @Override
    public int getPercentage() {
        System.out.print("Average for student A: ");
        return (subject1+subject2+subject3)/3;
    }
}
class B implements Marks{
    int subject1;
    int subject2;
    int subject3;
    int subject4;

    public B(int subject1, int subject2, int subject3, int subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    @Override
    public int getPercentage() {
        System.out.print("Average for student B: ");
        return (subject1+subject2+subject3+subject4)/4;
    }
}
