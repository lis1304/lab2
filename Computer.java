package lis_lab2;


public class Computer {

    public static void main(String[] args) {
        makeComputer();
    }

    public static void makeComputer(){
        PowerBlock powerBlock = new PowerBlock("SFX","ATX",600);
        Box box = new Box("ColorSit","ATX");
        Cpu cpu = new Cpu(100,200,5000,"Inter I5");
        MemoryHdd memoryHdd = new MemoryHdd("SSD","Samsung",5);
        MemoryRam memoryRam1 = new MemoryRam("DIMM","DDR3","Kingstion", 2000);
        MemoryRam memoryRam2 = new MemoryRam("DIMM","DDR3","Kingstion", 2000);
        MotherBoard motherBoard = new MotherBoard("GigaByte","Intel Socket 2066",true);
        VideoCard videoCard = new VideoCard("ASUS","PCI Express",2000);

        System.out.println(
                "Вы собрали системный блок из следующих комплектующих:  "+
                        "\nКорпус:  "+ box.getName() +
                        "\nБлок питания: "+ powerBlock.getName() +
                        "\nМатеринская плата: " + motherBoard.getNameBoard() +
                        "\nОбъём жесткого диска: " + memoryHdd.getHddSum() +
                        "\nОбъем оперативной памяти : "+ MemoryRam.itogMemorySum +
                        "\nВидео карта: " + ((videoCard.getMemorySum() > 1) ? "Играть можно" : "Не айс видюха")



        );
    }
}