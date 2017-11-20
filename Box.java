package lis_lab2;


public class Box
{
    private String name;
    private String formFactor;

    public Box(String name, String formFactor) {
        this.name = name;
        this.formFactor = formFactor;
    }

    public Box(String formFactor) {
        this.formFactor = formFactor;
        this.name = "ColorSite";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    @Override
    public String toString() {
        return "Box{" +
                "name='" + name + '\'' +
                ", formFactor='" + formFactor + '\'' +
                '}';
    }
}
