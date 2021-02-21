package uk.co.bayon.dan;

public class Cheetah implements Animal {

    private String type = Animal.CHEETAH;
    private int weight;                 //The cheetahs weight in kg
    private static int baseSpeed = 10;  //The speed of an average cheetah in meters per second, which is about 40kg

    public Cheetah(int weight)
    {
        this.weight = weight;
    }

    @Override
    public String toString(){
        return "The " + type +  " can run at " + calculateSpeed() + " meters per second.";
    }

    @Override
    public int run(int distance) {
        return distance/calculateSpeed();
    }

    private int calculateSpeed()
    {
        int diffFromAvereage = weight-40;
        return baseSpeed - diffFromAvereage/4;
    }
}
