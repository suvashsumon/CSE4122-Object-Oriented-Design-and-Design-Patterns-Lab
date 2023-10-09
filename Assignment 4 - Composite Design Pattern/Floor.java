import java.util.ArrayList;
import java.util.List;

public class Floor implements HousingStructure {
    private List<HousingStructure> rooms = new ArrayList<>();
    private String name;

    public Floor(String name) {
        this.name = name;
    }

    public void addStructure(HousingStructure room) {
        rooms.add(room);
    }

    @Override
    public void display() {
        System.out.println("Floor: " + name);
        for (HousingStructure room : rooms) {
            room.display();
        }
    }
}
