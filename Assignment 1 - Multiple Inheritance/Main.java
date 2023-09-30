public class Main {
    public static void main(String[] args) {
        AnimalVehicle horse = new AnimalVehicle("Horse");
        horse.eat();
        horse.drive();

        AnimalVehicle donkey = new AnimalVehicle("Donkey");
        donkey.eat();
        donkey.drive();
    }
}

