package lis_lab2;


public class VideoCard
{
    private String name;
    private String formFactor;
    private int memorySum;

    public VideoCard(String formFactor, int memorySum) {
        this.formFactor = formFactor;
        this.memorySum = memorySum;
        this.name = "Asus";
    }

    public VideoCard(String name, String formFactor, int memorySum) {

        this.name = name;
        this.formFactor = formFactor;
        this.memorySum = memorySum;
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

    public int getMemorySum() {
        return memorySum;
    }

    public void setMemorySum(int memorySum) {
        this.memorySum = memorySum;
    }
}
