class VendingMachine {
    private VendingMachineState currentState;

    public VendingMachine() {
        currentState = new NoCoinState();
    }

    public void setState(VendingMachineState state) {
        currentState = state;
    }

    public void insertCoin(int amount) {
        currentState.insertCoin(amount);
        if (currentState instanceof NoCoinState) {
            setState(new HasCoinState());
        }
    }

    public void selectItem(String item) {
        currentState.selectItem(item);
    }

    public void dispenseItem() {
        currentState.dispenseItem();
        if (currentState instanceof HasCoinState) {
            setState(new NoCoinState());
        }
    }
}
