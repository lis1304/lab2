package lis_lab2;


public class MemoryRam
{
    private String tip;
    private String formFactor;
    private String name;
    private int memorySum;
    public static int itogMemorySum=0;

    public MemoryRam(String tip, String formFactor, String name, int memorySum) {
        this.tip = tip;
        this.formFactor = formFactor;
        this.name = name;
        this.memorySum = memorySum;
        itogMemorySum+=memorySum;
    }

    public MemoryRam(String tip, String formFactor, int memorySum) {
        this.tip = tip;
        this.formFactor = formFactor;
        this.memorySum = memorySum;
        this.name = "Kingston";
        itogMemorySum+=memorySum;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemorySum() {
        return memorySum;
    }

    public void setMemorySum(int memorySum) {
        this.memorySum = memorySum;
    }
}
