public class ListMain {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.remove();
        sll.remove();
        sll.printValues();

        Node findTest = sll.find(3);
        System.out.println(findTest.value);
        System.out.println("New List");
        sll.removeAt(3);
        sll.printValues();
    }
}
