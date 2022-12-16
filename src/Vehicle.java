public class Vehicle {
    public String name;
    public boolean isFlying = false;
    public String engineType;
    public int maxSpeed;

    public Vehicle(String name, String engineType, int maxSpeed){
        this.name = name;
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
    }

    public Vehicle(String name, String engineType, int maxSpeed, boolean isFlying){
        this(name, engineType, maxSpeed);
        this.isFlying = isFlying;
    }
}
