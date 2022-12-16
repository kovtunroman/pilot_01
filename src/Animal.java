public class Animal {
    public String species;
    public String name;
    public int age;

    public Animal(String species, int age){
        this.species = species;
        this.age = age;
    }
    public Animal(String species, String name, int age){
        this.species = species;
        this.name= name;
        this.age = age;
    }
    public void displayInfo(){
        System.out.printf("Name: %s Species: %s  Age: %d",name, species, age);
    }
}
