// question no1

class l {
    int value;
    l next;
    
    l(int value) {
        this.value = value;
        this.next = null;
    }
}

public class reverse {

    public static l reverseLinkedList(l head) {
        l previous = null;
        l current = head;
        
        while (current != null) {
            l nextNode = current.next; 
            current.next = previous; 
            previous = current; 
            current = nextNode; 
        }
        
        return previous; 
    }

   
    public static l createLinkedList(int[] values) {
        if (values.length == 0) {
            return null;
        }
        l head = new l(values[0]);
        l current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new l(values[i]);
            current = current.next;
        }
        return head;
    }

    
    public static void printLinkedList(l head) {
        l current = head;
        while (current != null) {
            System.out.print(current.value + (current.next != null ? " -> " : ""));
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] values = {10, 11, 12, 13, 14};
        l head = createLinkedList(values);
        System.out.println("Original list:");
        printLinkedList(head);

        l reversedHead = reverseLinkedList(head);
        System.out.println("Reversed list:");
        printLinkedList(reversedHead);
    }
}