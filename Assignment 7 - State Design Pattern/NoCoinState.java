public class NoCoinState implements VendingMachineState {
    @Override
    public void insertCoin(int amount) {
        System.out.println("Inserted " + amount + " cents.");
    }

    @Override
    public void selectItem(String item) {
        System.out.println("Please insert a coin first.");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Please select an item and insert a coin.");
    }
}