interface VendingMachineState {
    void insertCoin(int amount);
    void selectItem(String item);
    void dispenseItem();
}