public class AnimalVehicle implements Animal, Vehicle {
    String name;

    public AnimalVehicle(String name)
    {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(this.name+" is eating.");
    }

    @Override
    public void drive() {
        System.out.println(this.name+" is driving.");
    }
}