public class Dolphin extends Animal implements Swim {
    private String colorOfDolphin;
    private int swimmingSpeed;

    public Dolphin() {
        super("Dolphin");
    }

    public String getColorOfDolphin() {
        return colorOfDolphin;
    }

    public void setColorOfDolphin(String colorOfDolphin) {
        this.colorOfDolphin = colorOfDolphin;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void eatingFood() {
        System.out.print("Dolphin: I am eating delicious fish");
    }

    @Override
    public void eatingCompleted() {
        System.out.print("I have eaten fish");
    }


    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed of " + this.getSwimmingSpeed() + " nautical miles per hour");
    }
}
