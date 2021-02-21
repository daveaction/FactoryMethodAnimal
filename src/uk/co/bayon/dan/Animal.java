package uk.co.bayon.dan;

public interface Animal {

    static final String MOUSE = "Mouse";
    static final String CHEETAH = "Cheetah";

    //Run for a distance metres and return the time it took in seconds
    public int run(int distance);

}
