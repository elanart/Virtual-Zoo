public class Penguin extends Animal implements Walk, Swim {
    private boolean isSwimming;
    private int walkSpeed;
    private int swimSpeed;

    public Penguin() {
        super("Penguin");
    }

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    @Override
    public void eatingFood() {
        System.out.print("Penguin: I am eating delicious fish");
    }

    @Override
    public void eatingCompleted() {
        System.out.print("I have eaten fish");
    }

    @Override
    public void walking() {
        System.out.println("Penguin: I am walking at the speed of " + this.getWalkSpeed() + " mph");
    }

    @Override
    public void swimming() {
        System.out.println("Penguin: I am swimming at the speed of " + this.getSwimSpeed() + " nautical miles per hour");
    }
}
