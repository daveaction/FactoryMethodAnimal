package uk.co.bayon.dan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal[] animals = new Animal[3];

        AnimalCreator creator = new AnimalCreator(Animal.MOUSE);
        animals[0] = creator.createAnimal();

        creator = new AnimalCreator(Animal.CHEETAH);
        animals[1] = creator.createAnimal();

        creator = new CheetahCreater(55);
        animals[2] = creator.createAnimal();

        for(int i = 0; i < animals.length; i++)
        {
            System.out.println(animals[i]);
            System.out.println("And runs 100 meters in " + animals[i].run(100) + " seconds.");
        }


    }
}
