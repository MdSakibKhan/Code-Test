package model;

public class subject {
    private int id;
    private String subject;
    public subject(int id, String name){
        this.subject = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return subject;
    }
}
