public class Main {
    public static void main(String[] args) {
        // Create rooms
        Room room1 = new Room("Living Room");
        Room room2 = new Room("Bedroom");
        Room room3 = new Room("Kitchen");

        // Create floors and add rooms to them
        Floor floor1 = new Floor("First Floor");
        floor1.addStructure(room1);
        floor1.addStructure(room2);

        Floor floor2 = new Floor("Second Floor");
        floor2.addStructure(room3);

        // Create a building and add floors to it
        Building building = new Building("My House");
        building.addStructure(floor1);
        building.addStructure(floor2);

        // Display the building hierarchy
        building.display();
    }
}
