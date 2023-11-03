public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.selectItem("Chips");
        vendingMachine.dispenseItem();

        System.out.println();

        vendingMachine.insertCoin(25);
        vendingMachine.insertCoin(10);
        vendingMachine.selectItem("Soda");
        vendingMachine.dispenseItem();

        System.out.println();
        
        vendingMachine.insertCoin(50);
        vendingMachine.selectItem("Candy");
        vendingMachine.dispenseItem();
    }
}