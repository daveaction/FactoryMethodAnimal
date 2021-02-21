package uk.co.bayon.dan;

public class AnimalCreator {

    protected String type;
    AnimalCreator concreteCreator;

    public AnimalCreator(String type)
    {
        this.type = type;
    }

    public Animal createAnimal(){


        if(type == Animal.MOUSE){
            MouseCreater mouseCreator = new MouseCreater();
            return mouseCreator.createAnimal();

        } else if (type == Animal.CHEETAH){
            CheetahCreater cheetahCreater = new CheetahCreater(40);
            return cheetahCreater.createAnimal();
        }
        else
            return null;

    }

}
