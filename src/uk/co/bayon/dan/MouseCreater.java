package uk.co.bayon.dan;

public class MouseCreater extends AnimalCreator{

    public MouseCreater() {
        super(Animal.MOUSE);
    }

    @Override
    public Animal createAnimal() {
        return new Mouse();
    }
}
