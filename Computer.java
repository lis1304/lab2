package lis_lab2;


public class Computer {

    public static PowerBlock powerBlock;
    public static Box box;
    public static Cpu cpu;
    public static MemoryHdd memoryHdd;
    public static MemoryRam memoryRam1;
    public static MemoryRam memoryRam2;
    public static MotherBoard motherBoard;
    public static VideoCard videoCard;
    public static boolean onOff;

    public static void main(String[] args) {

        makeComputer();

        printConfigComp();

        onComp();

        offComp();
        


    }
    public static void offComp(){
        System.out.println("Идет завершение работы");
        onOff = false;
    }
    public static void onComp(){
        if (onOff){
            System.out.println("Компьютер УЖЕ включен");
        }
        else{
            System.out.println("Питание подано, идет загрузка системы");
            onOff = true;
        }
    }
    public static void printConfigComp() {
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

    public static void makeComputer(){
         powerBlock = new PowerBlock("SFX","ATX",600);
         box = new Box("ColorSit","ATX");
         cpu = new Cpu(100,200,5000,"Inter I5");
         memoryHdd = new MemoryHdd("SSD","Samsung",5);
         memoryRam1 = new MemoryRam("DIMM","DDR3","Kingstion", 2000);
         memoryRam2 = new MemoryRam("DIMM","DDR3","Kingstion", 2000);
         motherBoard = new MotherBoard("GigaByte","Intel Socket 2066",true);
         videoCard = new VideoCard("ASUS","PCI Express",2000);

    }

}