package lk.avin.demo1fx.dto;

public class EmployeeDto {
    private int id;
    private String name;
    private String address;
    private String position;


    public EmployeeDto(int id, String position, String name, String address) {
        this.id = id;
        this.position = position;
        this.name = name;
        this.address = address;
    }


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
