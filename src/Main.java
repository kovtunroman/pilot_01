public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Animal jeffCat = new Animal("Cat", "Jeff", 13);
        jeffCat.displayInfo();

        Vehicle plane = new Vehicle("Plane", "Turbine", 1455, true);

        System.out.println();
        System.out.printf(Double.toString(Arithmetic.sumOperation(1,3,4)));

        System.out.println();
        System.out.printf(Double.toString(Arithmetic.substractOperation(1,2)));

        System.out.println();
        System.out.printf(Double.toString(Arithmetic.multiplyOperation(2,2)));

        System.out.println();
        System.out.printf(Double.toString(Arithmetic.devideOperation(4,2)));
    }
}