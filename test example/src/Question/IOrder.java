package Question;

public interface IOrder {
    void addWine(Wine wine);
    double calculateTotalCostOfOrder();
    int getOrderNumber();
    int howManyWinesInOrder();
    boolean isMixedOrder();
    void printOrder();
}
