public class CarLinkedListTest {
    public static void main(String[] args) {
        // Create a new linked list
        CarLinkedList carList = new CarLinkedList();

        // Create some car objects
        Car car1 = new Car("Toyota", 2020, 25000.0);
        Car car2 = new Car("Honda", 2018, 22000.0);
        Car car3 = new Car("BMW", 2021, 50000.0);
        Car car4 = new Car("Mercedes", 2019, 55000.0);

        // Insert cars into the linked list
        carList.insertNode(car1);
        carList.insertNode(car2);
        carList.insertNode(car3);
        carList.insertNode(car4);
        carList.insertNode(car1);

        // Print the list
        carList.printList();

        // Search for a car
        CarNode searchedNode = carList.searchNode("Honda");
        if (searchedNode != null) {
            System.out.println("Car found: " + searchedNode.getCar().getName());
        } else {
            System.out.println("Car not found.");
        }

        // Delete a car
        carList.removeDuplicate(car1.getName());

        // Print the updated list
        carList.printList();
        System.out.println(carList.max());
        carList.copy(carList).printList();
    }
}
