package models;

public class Course {

    private String id;
    private String title;
    private int units;

    public Course(String id, String title, int units) {
        this.id = id;
        this.title = title;
        this.units = units;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getUnits() {
        return units;
    }
}