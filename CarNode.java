public class CarNode {
    private Car car;
    private CarNode next;

    public CarNode(Car car){
        this.car = car;
        this.next = null;
    }

    public Car getCar() {
        return car;
    }

    public CarNode getNext() {
        return next;
    }

    public void setNext(CarNode next) {
        this.next = next;
    }
}