import java.util.Scanner;
 
class Node {
    int rollno;
    String name;
    Node next;
    Node prev;   // NEW for DLL

    public Node(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
        this.next = null;
        this.prev = null; // NEW
    }
}

public class DoubleLinkedList1 
{
    Node head;

    // Insert at Beginning
    Node insertBegin(int rollno, String name, Node head) {
        Node nnode = new Node(rollno, name);

        if (head != null) {
            nnode.next = head;
            head.prev = nnode; // New code
        }
        return nnode; // new head
    }

    // Insert at End
    Node insertEnd(int rollno, String name, Node head) {
        Node nnode = new Node(rollno, name);

        if (head == null)
            return nnode;

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = nnode;
        nnode.prev = temp;// New Code

        return head;
    }

    // Insert at Position
    Node insertinpos(int rollno, String name, int pos, Node head) {
        Node nnode = new Node(rollno, name);

        if (pos == 1) {
            if (head != null) {
                nnode.next = head;
                head.prev = nnode; // New Code
            }
            return nnode;
        }

        Node temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++)
            temp = temp.next;

        if (temp != null) {
            nnode.next = temp.next;
            nnode.prev = temp; // New Code

            if (temp.next != null)
                temp.next.prev = nnode;

            temp.next = nnode;
        }
        return head;
    }

    // Display (forward traversal – same as singly)
    void display(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (head != null) {
            System.out.println("Roll No : " + head.rollno + " - Name : " + head.name);
            head = head.next;
        }
        System.out.println("null");
    }

    // Delete at Position
    Node delete(int pos, Node head) {
        if (head == null)
            return head;

         if (pos == 1) {
            head = head.next;
            if (head != null)
                head.prev = null; // New Code
            return head;
        }

        Node temp = head;
        for (int i = 1; temp != null && i < pos; i++)
            temp = temp.next;

        if (temp != null) {
            if (temp.prev != null)
                temp.prev.next = temp.next;

            if (temp.next != null)
                temp.next.prev = temp.prev;
        }
        return head;
    }

    // Length (no change)
    int length(Node head) {
        int cnt = 0;
        while (head != null) {
            cnt++;
            head = head.next;
        }
        return cnt;
    }

    // Reverse (DLL specific)
    Node reverse(Node head) {
        Node temp = null;
        Node curr = head;

         while (curr != null) { // Complete New Code
            temp = curr.prev; 
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }

        if (temp != null)
            head = temp.prev;

        return head;
    }

    // Sum 
    void sum(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        int s = 0;
        while (head != null) {
            s += head.rollno;
            head = head.next;
        }
        System.out.println("Sum of elements : " + s);
    }

    // Search
    void search(int k, Node head) {
        while (head != null) {
            if (head.rollno == k) {
                System.out.println("Value found");
                return;
            }
            head = head.next;
        }
        System.out.println("Value not found");
    }

    // Min & Max
    void minmax(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        int min = head.rollno, max = head.rollno;

        while (head != null) {
            if (head.rollno < min) min = head.rollno;
            if (head.rollno > max) max = head.rollno;
            head = head.next;
        }
        System.out.println("Min : " + min + "  Max : " + max);
    }

    // Sort (selection sort – data swap)
    void sort(Node head) {
        for (Node i = head; i != null; i = i.next) {
            Node min = i;
            for (Node j = i.next; j != null; j = j.next) {
                if (j.rollno < min.rollno)
                    min = j;
            }

            int tRoll = i.rollno;
            i.rollno = min.rollno;
            min.rollno = tRoll;

            String tName = i.name;
            i.name = min.name;
            min.name = tName;
        }
    }

    // ---------------- NEW OPERATIONS ----------------

    // Forward Traversal
    void forwardTraversal(Node head) {
        display(head);
    }

    // Backward Traversal
    void backwardTraversal(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        while (temp != null) {
            System.out.println("Roll No : " + temp.rollno + " - Name : " + temp.name);
            temp = temp.prev;
        }
    }

    // Delete from Beginning
    Node deleteBegin(Node head) {
        if (head == null)
            return null;

        head = head.next;
        if (head != null)
            head.prev = null;

        return head;
    }

    // Delete from End
    Node deleteEnd(Node head) {
        if (head == null)
            return null;

        if (head.next == null)
            return null;

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.prev.next = null; // important
        return head;
    }

    // Delete by Value
    Node deleteByValue(int key, Node head) {
        if (head == null)
            return head;

        Node temp = head;

        if (temp.rollno == key) {
            head = temp.next;
            if (head != null)
                head.prev = null;
            return head;
        }

        while (temp != null && temp.rollno != key)
            temp = temp.next;

        if (temp != null) {
            if (temp.prev != null)
                temp.prev.next = temp.next;
            if (temp.next != null)
                temp.next.prev = temp.prev;
        }
        return head;
    }

    // MAIN
    public static void main(String[] args) {
        DoubleLinkedList1 l = new DoubleLinkedList1();
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("\n-------Menu-------");
            System.out.println("1. Insert in Beginning");
            System.out.println("2. Insert in End");
            System.out.println("3. Insert in a Position");
            System.out.println("4. Display (Forward)");
            System.out.println("5. Delete by Position");
            System.out.println("6. Length");
            System.out.println("7. Reverse");
            System.out.println("8. Sum of elements");
            System.out.println("9. Search");
            System.out.println("10. Min and Max");
            System.out.println("11. Sort");
            System.out.println("12. Backward Traversal");
            System.out.println("13. Delete from Beginning");
            System.out.println("14. Delete from End");
            System.out.println("15. Delete by Value");
            System.out.println("16. Exit");

            System.out.print("Enter Your Option : ");
            String n = in.next();

            switch (n) {
                case "1":
                    System.out.print("Enter Rollno and Name : ");
                    l.head = l.insertBegin(in.nextInt(), in.next(), l.head);
                    break;

                case "2":
                    System.out.print("Enter Rollno and Name : ");
                    l.head = l.insertEnd(in.nextInt(), in.next(), l.head);
                    break;

                case "3":
                    System.out.print("Enter Rollno, Name and Position : ");
                    l.head = l.insertinpos(in.nextInt(), in.next(), in.nextInt(), l.head);
                    break;

                case "4":
                    l.forwardTraversal(l.head);
                    break;

                case "5":
                    System.out.print("Enter Position : ");
                    l.head = l.delete(in.nextInt(), l.head);
                    break;

                case "6":
                    System.out.println("Length : " + l.length(l.head));
                    break;

                case "7":
                    l.head = l.reverse(l.head);
                    break;

                case "8":
                    l.sum(l.head);
                    break;

                case "9":
                    System.out.print("Enter value to search : ");
                    l.search(in.nextInt(), l.head);
                    break;

                case "10":
                    l.minmax(l.head);
                    break;

                case "11":
                    l.sort(l.head);
                    l.display(l.head);
                    break;

                case "12":
                    l.backwardTraversal(l.head);
                    break;

                case "13":
                    l.head = l.deleteBegin(l.head);
                    break;

                case "14":
                    l.head = l.deleteEnd(l.head);
                    break;

                case "15":
                    System.out.print("Enter value to delete : ");
                    l.head = l.deleteByValue(in.nextInt(), l.head);
                    break;

                case "16":
                    System.exit(0);
            }

            System.out.print("Do you want to continue (Y/N): ");
        } while (in.next().equalsIgnoreCase("Y"));
    }
}
