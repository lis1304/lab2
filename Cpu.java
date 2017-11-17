package lis_lab2;


public class Cpu
{
    private int cashl1;
    private int cashl2;
    private int mhz;
    private String nameCpu;

    public Cpu(int cashl1, int cashl2, int mhz, String nameCpu) {
        this.cashl1 = cashl1;
        this.cashl2 = cashl2;
        this.mhz = mhz;
        this.nameCpu = nameCpu;
    }

    public Cpu(int mhz, String nameCpu) {
        this.mhz = mhz;
        this.nameCpu = nameCpu;
        this.cashl1 = 200;
        this.cashl2 = 300;
    }

    public int getCashl1() {
        return cashl1;
    }

    public void setCashl1(int cashl1) {
        this.cashl1 = cashl1;
    }

    public int getCashl2() {
        return cashl2;
    }

    public void setCashl2(int cashl2) {
        this.cashl2 = cashl2;
    }

    public int getMhz() {
        return mhz;
    }

    public void setMhz(int mhz) {
        this.mhz = mhz;
    }

    public String getNameCpu() {
        return nameCpu;
    }

    public void setNameCpu(String nameCpu) {
        this.nameCpu = nameCpu;
    }
}
