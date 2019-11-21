import java.util.Arrays;

public class Home {
    private Animal[] myAnimal = new Animal[0];
    void adoptPet(Animal pet ) {
        for (Animal myAnimal : myAnimal) {
            if (myAnimal == pet) {
                System.out.println(pet.getClass().getClass().getName() + "THE ANIMAL ALREADY EXISTS.");
                return;
            }
        }
        myAnimal = Arrays.copyOf(myAnimal,myAnimal.length+1);
        myAnimal[myAnimal.length - 1] = pet;
    }
    void makeAllSounds(){
        for (Animal myAnimal : myAnimal){
            myAnimal.sound();
        }
    }
}
