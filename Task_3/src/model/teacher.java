package model;

public class teacher {
    private int id;
    private String name = "";
    public teacher(int id, String name){
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}
