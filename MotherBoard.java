package lis_lab2;

/**
 * Created by student on 17.11.2017.
 */
public class MotherBoard
{
    private String nameBoard;
    private String socket;
    private boolean vga;

    public MotherBoard(String nameBoard, String socket, boolean vga) {
        this.nameBoard = nameBoard;
        this.socket = socket;
        this.vga = vga;
    }

    public MotherBoard(String nameBoard, String socket) {
        this.nameBoard = nameBoard;
        this.socket = socket;
        this.vga = false;
    }

    public String getNameBoard() {
        return nameBoard;
    }

    public void setNameBoard(String nameBoard) {
        this.nameBoard = nameBoard;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public boolean isVga() {
        return vga;
    }

    public void setVga(boolean vga) {
        this.vga = vga;
    }
}
