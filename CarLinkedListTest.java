public class CarLinkedListTest {
    public static void main(String[] args) {

        CarLinkedList carList = new CarLinkedList();
//these are the instances of the different kinds of cars
        Car car1 = new Car("Toyota", 2023, 2400.0);
        Car car2 = new Car("Honda", 2015, 2000.0);
        Car car3 = new Car("BMW", 2000, 5000.0);
        Car car4 = new Car("Mercedes", 2009, 6000.0);

        carList.insertNode(car1);//these insert the cars to the list
        carList.insertNode(car2);
        carList.insertNode(car3);
        carList.insertNode(car4);
        carList.insertNode(car1);

        carList.printList();//print the original list
        carList.removeAfter("Toyota");//method removeAfter() takes a linked-list Node as its argument and removes the node following the given one
        carList.printList();
        carList.removeAfter("Mercedes");//method removeAfter() takes a linked-list Node as its argument and removes the node following the given one
        carList.printList();
        carList.removeDuplicate("Toyota");//remove the duplicate car type
        carList.printList();
        carList.copy(carList).printList();//print and create the duplicate linked list
        System.out.println(carList.max());//print and find the max number of objects in the liked list
    }
}
