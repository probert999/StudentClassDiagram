package com.probert999.studentclass;

public class Student {

    private String name;
    private char grade;
    private int group;
    private String secretNickName = "MySecretNickName";
    private final String GRADES = "FEDCBA";

    public Student(String name, char grade, int group) {

        if (!isValidGrade(Character.toUpperCase(grade))) {
            throw new IllegalArgumentException("Invalid grade");
        }
        if (!isValidGroup(group)) {
            throw new IllegalArgumentException("Invalid group");
        }
        this.name = name;
        this.grade = Character.toUpperCase(grade);
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return grade;
    }

    public void upgrade() {
        if (GRADES.indexOf(grade) != GRADES.length() - 1) {
            updateGrade(1);
        }
    }

    public void downgrade() {
        if (GRADES.indexOf(grade) != 0) {
            updateGrade(-1);
        }
    }

    public int getGroup() {
        return group;
    }

    private void updateGrade(int changeBy) {
        grade = GRADES.charAt(GRADES.indexOf(grade) + changeBy);
    }

    private boolean isValidGrade(char checkGrade) {
        return (GRADES.contains(Character.toString(checkGrade)) ? true : false);
    }

    private boolean isValidGroup(int group) {
        return (group >= 1 && group <= 5 ? true : false);
    }


}
