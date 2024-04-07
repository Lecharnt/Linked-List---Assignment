public class CarLinkedList {
    private CarNode head;
    private CarNode tail;

    public CarLinkedList(){
        head = null;
        tail = null;
    }

    public void insertNode(Car car){
        CarNode node = new CarNode(car);
        if(head == null){
            head = node;
        }
        else {
            tail.setNext(node);
        }
        tail = node;
    }
    public CarLinkedList copy(CarLinkedList list) {
        CarLinkedList newList = new CarLinkedList();
        CarNode current = head;
        while (current != null) {
            Car newNode = current.getCar();
            newList.insertNode(newNode);
            current = current.getNext();
        }
        return newList;
    }
    public int max(){
        int amount = 0;
        CarNode current = head;
        if(current.getNext() != null){
            amount++;
        }
        while(current.getNext() != null){
            amount++;
            current = current.getNext();
        }
        return amount;
    }
    public void removeDuplicate(String name) {
        CarNode current = head;
        CarNode previous = null;
        while (current != null) {
            if (current.getCar().getName().equals(name)) {
                if (previous != null) {
                    previous.setNext(current.getNext());
                    current = previous.getNext();
                } else {
                    head = current.getNext();
                    current = head;
                }
            } else {
                previous = current;
                current = current.getNext();
            }
        }
    }

    public void removeAfter(String name) {
        CarNode current = head;
        while (current != null && !current.getCar().getName().equals(name)) {
            current = current.getNext();
        }
        if (current != null && !(current.getNext() == null)) {
            current.setNext(current.getNext().getNext());
        }
        else {
            System.out.println("Car not found or it's the last node.");
        }
    }



    public CarNode searchNode(String name){
        CarNode current = head;
        if(!current.getCar().getName().equals(name)){
            while(current.getNext() != null){
                String sname = current.getNext().getCar().getName();
                if(sname.equals(name)){
                    System.out.println("Prev    Node => " + current.getCar().getName());
                    System.out.println("Current Node => " + current.getNext().getCar().getName());
                    System.out.println("Next Node    => " + current.getNext().getNext().getCar().getName());
                    return current.getNext();
                }
                else
                    current = current.getNext();
            }
        }
        return current;
    }

    public void deleteNode(String name){
        CarNode current = head;
        if(!current.getCar().getName().equals(name)){
            while(current.getNext() != null){
                String sname = current.getNext().getCar().getName();
                if(sname.equals(name)){
                    System.out.println("Prev    Node => " + current.getCar().getName());
                    System.out.println("Current Node => " + current.getNext().getCar().getName());
                    System.out.println("Next Node    => " + current.getNext().getNext().getCar().getName());
                    current.setNext(current.getNext().getNext());
                    System.out.println("=====================");
                    break;
                }
                else
                    current = current.getNext();
            }
        }
    }


    public void printList(){
        CarNode current = head;
        System.out.println("========Print Start=============");
        System.out.println(current.getCar().getName());
        while(current.getNext() != null){
            System.out.println(current.getNext().getCar().getName());
            current = current.getNext();
        }
        System.out.println("========Print End=============");
    }

}