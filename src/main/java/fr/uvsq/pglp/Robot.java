package fr.uvsq.pglp;

public class Robot {
    public int position;
    public Robot(int position) {
        this.position=position;
    }
    public void avance()
    {
        this.position+=10;

    }
}