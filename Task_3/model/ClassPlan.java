package model;

public class ClassPlan {
    private int dayIndex;
    private int hourIndex;
    private String course_name;
    public ClassPlan(int dayIndex, int hourIndex, String name) {
        this.dayIndex = dayIndex;
        this.hourIndex = hourIndex;
        this.course_name = name;
    }
    public String getInfo() {
        return dayIndex + " "+ hourIndex + " " + course_name;
    }
}
