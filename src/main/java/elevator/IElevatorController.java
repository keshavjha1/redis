package elevator;

public interface IElevatorController {
    public void status();
    public void update(int elevatorId, int floor);
    public void pickup(int floor,boolean direction);
    public void reset(int elevatorId, int floor);
    public void step();


}
