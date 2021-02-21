package uk.co.bayon.dan;

public class CheetahCreater extends AnimalCreator {
    private int weight;

    public CheetahCreater(int weight)
    {
        super(Animal.CHEETAH);
        this.weight = weight;
    }

    @Override
    public Animal createAnimal() {
        return new Cheetah(weight);
    }
}
