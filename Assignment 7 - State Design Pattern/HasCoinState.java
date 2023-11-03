class HasCoinState implements VendingMachineState {
    private int totalAmount = 0;

    @Override
    public void insertCoin(int amount) {
        totalAmount += amount;
        System.out.println("Inserted " + amount + " cents. Total: " + totalAmount + " cents.");
    }

    @Override
    public void selectItem(String item) {
        System.out.println("Item selected: " + item);
    }

    @Override
    public void dispenseItem() {
        if (totalAmount >= 50) {
            System.out.println("Item dispensed. Enjoy your purchase!");
            totalAmount -= 50;
            System.out.println("Change returned: " + totalAmount + " cents.");
        } else {
            System.out.println("Please insert " + (50 - totalAmount) + " more cents.");
        }
    }
}
