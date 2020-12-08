public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList(){
        this.head = null;
    }

    public void add(int value){
        Node newNode = new Node(value);
        if (this.head == null){
            this.head = newNode;
        } else {
            Node runner = head;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void remove(){
        if (this.head != null){
            Node runner = head;
            Node previous = null;
            while (runner.next != null){
                previous = runner;
                runner = runner.next;
            }
            runner = previous;
            previous.next = null;
        }
    }

    public void printValues(){
        if(this.head != null){
            Node runner = head;
            while (runner != null){
                System.out.println(runner.value);
                runner = runner.next;
            }
        }
    }
}