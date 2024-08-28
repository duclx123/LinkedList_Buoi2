package mylinkedlist;


public class MyLinkedList {
    public static Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        // Sau câu lenh nay, anh da tim duoc node cuoi cung, va duoc gan cho
        // temp
        // Nhiem vu cuôi cung: Naruto: The Last => Boruto: Naruto Next Generation
        temp.next = newNode;

    }

    // 0
    public void add(int data, int index) {
        Node newNode = new Node(data);
        if (index == 0) {
            addFirst(data);
            return;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node nextNode = temp.next;
            temp.next = newNode;
            newNode.next = nextNode;
        }
    }
    // BTVN: Viet code cho cac ham sau
    // 1. public int length()
    // 2. public void display()
    // 3. public void deleteFirst()


    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        LinkedList.length();
        System.out.println();
        System.out.printf("Display:");
        LinkedList.DisplayLinkedList();
        System.out.println();
        LinkedList.deletefirst();
    }

    public class LinkedList {
        public static int length() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.getNext();
            }
            System.out.print("So luong node:"+count);
            return count;
        }

        public static void show(int x) {
            System.out.print(x);
        }

        public static void DisplayLinkedList() {
            Node temp = head;
            while (temp != null) {
                show(temp.getData());
                if (temp.getNext() != null) {
                    System.out.printf("-->");
                }
                temp = temp.getNext();
            }
        }
        public static void deletefirst(){
            System.out.printf("Display da xoa node dau:");
            head = head.getNext();
            LinkedList.DisplayLinkedList();
        }
    }
}
