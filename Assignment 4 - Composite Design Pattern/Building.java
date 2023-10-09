import java.util.ArrayList;
import java.util.List;

public class Building implements HousingStructure {
    private List<HousingStructure> floors = new ArrayList<>();
    private String name;

    public Building(String name) {
        this.name = name;
    }

    public void addStructure(HousingStructure floor) {
        floors.add(floor);
    }

    @Override
    public void display() {
        System.out.println("Building: " + name);
        for (HousingStructure floor : floors) {
            floor.display();
        }
    }
}