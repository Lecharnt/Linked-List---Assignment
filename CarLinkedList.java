public class CarLinkedList {
    private CarNode head;// first node in the list
    private CarNode tail;// last node in the list

    public CarLinkedList(){// initialize the list
        head = null;
        tail = null;
    }

    public void insertNode(Car car){// insert a new car node at the end of the list
        CarNode node = new CarNode(car);
        if(head == null){// If the list is empty, set both head and tail to the new node
            head = node;
        }
        else {// If the list is not empty, set the next reference of the current tail to the new node
            tail.setNext(node);
        }
        tail = node;// Update the tail reference to the new node
    }
    public CarLinkedList copy(CarLinkedList list) {// create a copy of the provided CarLinkedList
        CarLinkedList newList = new CarLinkedList();// creates a new instance of CarLinkedList
        CarNode current = list.head; // start from the head of the provided list
        while (current != null) {// Iterate through the list
            Car newNode = current.getCar();// Getting the car object
            newList.insertNode(newNode);// Inserting the car
            current = current.getNext();// Moving to the next node
        }
        return newList;
    }
    public int max(){// find the maximum number of nodes in the list
        int amount = 0;// Initializing a counter
        CarNode current = head;// Starting from the head
        if(current.getNext() != null){// Checking if there is at least one node
            amount++;
        }
        while(current.getNext() != null){// Iterating through the list until reaching the last node
            amount++;
            current = current.getNext();
        }
        return amount;
    }
    public void removeDuplicate(String name) { //remove duplicate nodes with the specified name
        CarNode current = head;// Starting from the head of the list
        CarNode previous = null;//keeping track of the previous node
        while (current != null) {// Iterating through the list
            if (current.getCar().getName().equals(name)) {
                if (previous != null) {
                    previous.setNext(current.getNext());// Linking the previous node to the next node
                    current = previous.getNext();// Moving to the next node
                } else {// If the current node is the head
                    head = current.getNext();// Updating the head reference to skip the current node
                    current = head;// Moving to the next node after the removed node
                }
            } else {
                previous = current;// Updating the previous node
                current = current.getNext();// Moving to the next node
            }
        }
    }

    public void removeAfter(String name) {// remove the node after the node with the specified name
        CarNode current = head; // Starting from the head of the list
        while (current != null && !current.getCar().getName().equals(name)) { // Iterating through the list
            current = current.getNext();// Moving to the next node
        }
        if (current != null && !(current.getNext() == null)) {// Checking if the node with the specified name exists and if it's not the last node
            current.setNext(current.getNext().getNext());// Removing the node after the node
        }
        else {
            System.out.println("Car not found or it's the last node."); //if false, print this
        }
    }
    public void printList(){// print the list
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
