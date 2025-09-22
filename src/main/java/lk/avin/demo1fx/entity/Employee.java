package lk.avin.demo1fx.entity;

public class Employee {
    private int id;
    private String name;
    private String address;

    public Employee(int id, String name, String address, String position) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.position = position;
    }

    private String position;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
