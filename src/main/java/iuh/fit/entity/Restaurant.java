package iuh.fit.entity;

public class Restaurant {
    private String id;
    private boolean isClosed;
    private String name;
    private Address address;
    private String borough;
    private String cuisine;
    private Grade[] grades;

    public Restaurant(String id, boolean isClosed, String name, Address address, String borough, String cuisine, Grade[] grades) {
        this.id = id;
        this.isClosed = isClosed;
        this.name = name;
        this.address = address;
        this.borough = borough;
        this.cuisine = cuisine;
        this.grades = grades;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getBorough() {
        return borough;
    }

    public void setBorough(String borough) {
        this.borough = borough;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public Grade[] getGrades() {
        return grades;
    }

    public void setGrades(Grade[] grades) {
        this.grades = grades;
    }

    public String toString() {
        return "Restaurant{" +
                "id='" + id + '\'' +
                ", isClosed=" + isClosed +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", borough='" + borough + '\'' +
                ", cuisine='" + cuisine + '\'' +
                ", grades=" + grades +
                '}';
    }
}
