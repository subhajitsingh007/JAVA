package LinkedList;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next= null;
    }
}

class MyLinkedList {
    Node head;

    // Insert at the end
    public void insertAtEnd(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;

    }

    // Insert at the beginning
    public void insertAtBegin(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    // Delete a node by value
    public void deleteNode(int key) {
        if (head == null) return;

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;

        // Traverse until the next node is null or its data matches the key
        while (temp.next != null) {
            if (temp.next.data == key) {
                temp.next = temp.next.next; // skip the node to be deleted
                return;
            }
            temp = temp.next;
        }
    }

    // Search for a value
    public boolean search(int key){
        Node temp = head;
        while(temp!=null){
            if(temp.data==key) return true;
            temp = temp.next;
        }
        return false;
    }

    // Print the LinkedList
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

}














public class LinkedListImplementation {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtBegin(5);
        list.insertAtEnd(30);

        list.printList();  // Output: 5 -> 10 -> 20 -> 30 -> null

        list.deleteNode(10);
        list.printList();  // Output: 5 -> 20 -> 30 -> null

        System.out.println(list.search(20)); // true
        System.out.println(list.search(99)); // false
    }
}



