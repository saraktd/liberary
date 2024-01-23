package model;

public class BaysikModel {
    private String name;
    private String id;

    public BaysikModel() {
    }

    public BaysikModel(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId()  {
        return Long.parseLong(id);
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BaysikModel{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
