package elevator;

public class Elevator {

    public enum DIRECTION{
        NONE, UP, DOWN;
    }
    private DIRECTION direction= DIRECTION.NONE;
    private Boolean move=false;
    private boolean []floors;
    private int countUp=0;
    private  int countDown=0;
    private int cf=0;
    private int min= Constant.MIN_FLOOR;
    private int max= Constant.MAX_FLOOR;
    private int numFloor;
    private ElevatorEventListener elevatorEventListener;

    public Elevator(int numFloor){
        if(numFloor<0) throw new IllegalArgumentException();
        this.numFloor= numFloor;
        floors= new boolean[numFloor];
    }

    public int getCurrentFloor() {
        return cf;
    }

    public int getGoalfloor(){
        if(direction == DIRECTION.UP ) return max;
        if(direction == DIRECTION.DOWN ) return min;
        return -1;
    }


    public boolean getMove() {
        return move;
    }

    public DIRECTION getDirection() {
        return direction;
    }

    public void setElEventListener(ElevatorEventListener elEventListener) {
        this.elevatorEventListener = elEventListener;
    }
}
