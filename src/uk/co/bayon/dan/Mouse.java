package uk.co.bayon.dan;

public class Mouse implements Animal {

    private String type = Animal.MOUSE;
    //Mice run at 2 meter per second
    private static int speed = 2;

    public Mouse(){
    }

    @Override
    public String toString(){
        return "The " + type +  " can run at " + speed + " meters per second.";
    }

    @Override
    public int run(int distance) {
        return distance/speed;
    }
}
