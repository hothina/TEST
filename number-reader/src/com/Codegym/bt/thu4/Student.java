package com.Codegym.bt.thu4;

public class Student {
    private int Id;
    private String name;
    private int classId;
    private String email;
    private float mathScore;
    private float historyScore;

    public Student(){}

    public Student(int id, String name) {
        Id = id;
        this.name = name;
    }

    public Student(int id, int classId, float mathScore, float historyScore) {
        Id = id;
        this.classId = classId;
        this.mathScore = mathScore;
        this.historyScore = historyScore;
    }

    public float getMathScore() {
        return mathScore;
    }

    public void setMathScore(float mathScore) {
        this.mathScore = mathScore;
    }

    public float getHistoryScore() {
        return historyScore;
    }

    public void setHistoryScore(float historyScore) {
        this.historyScore = historyScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", classId=" + classId +
                ", mathScore=" + mathScore +
                ", historyScore=" + historyScore +
                '}';
    }

    public float gpa(){
        float average = (this.historyScore + this.mathScore)/2;
        return average;
    }

    public static void main(String[] args) {
        Student student = new Student(1,"Nam");
        student.classId = 2;

        student.mathScore = 6;
        student.historyScore =7;

        System.out.println(student.gpa());
        System.out.println(student.toString());


    }

}
