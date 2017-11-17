package lis_lab2;


public class MemoryHdd
{
    private String tipe;
    private String name;
    private int hddSum;

    public MemoryHdd(String tipe, String name, int hddSum) {
        this.tipe = tipe;
        this.name = name;
        this.hddSum = hddSum;
    }

    public MemoryHdd(String tipe, int hddSum) {
        this.tipe = tipe;
        this.hddSum = hddSum;
        this.name = "WD";
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHddSum() {
        return hddSum;
    }

    public void setHddSum(int hddSum) {
        this.hddSum = hddSum;
    }
}
