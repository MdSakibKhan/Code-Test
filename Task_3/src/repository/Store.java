package repository;

import model.ClassPlan;
import model.subject;
import model.teacher;

import java.util.ArrayList;

public class Store {

    private ArrayList<subject> all_subjects;

    private ArrayList<teacher> all_teachers;

    private ArrayList<ClassPlan> ClassPlan_items;

    public Store(){
        all_subjects = new ArrayList<subject>();
        all_teachers = new ArrayList<teacher>();
        ClassPlan_items = new ArrayList<ClassPlan>();
    }

    public ArrayList<subject> getAll_subjects() {
        return all_subjects;
    }

    public ArrayList<teacher> getAll_teachers() {
        return all_teachers;
    }

    public ArrayList<ClassPlan> getClassPlan_items() {
        return ClassPlan_items;
    }
}
