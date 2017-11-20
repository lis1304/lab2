package lis_lab2;


public class PowerBlock
{
    private String name;
    private String formFactor;
    private int power;

    public PowerBlock(String name, int power) {
        this.name = name;
        this.power = power;
        this.formFactor = "ATX";
    }

    public PowerBlock(String name, String formFactor, int power) {

        this.name = name;
        this.formFactor = formFactor;
        this.power = power;
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

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "PowerBlock{" +
                "name='" + name + '\'' +
                ", formFactor='" + formFactor + '\'' +
                ", power=" + power +
                '}';
    }
}
