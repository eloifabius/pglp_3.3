package fr.uvsq.pglp;

public class RobotType1 extends Robot{

    public RobotType1(int position) {
        super(position);
    }
    public void avance()
    {
        super.position+=10;
    }
}