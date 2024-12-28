public class AhmetHasanCelikCircularList {
    private AhmetHasanCelikNode head = null;

    // Create a circular linked list for hours
    public void initialize(int hours) {
        AhmetHasanCelikNode last = null;
        for (int i = 1; i <= hours; i++) {
            AhmetHasanCelikNode newNode = new AhmetHasanCelikNode(i);
            if (head == null) {
                head = newNode;
                newNode.next = head;
            } else {
                last.next = newNode;
                newNode.next = head;
            }
            last = newNode;
        }
    }

    // Get the head of the list
    public AhmetHasanCelikNode getHead() {
        return head;
    }

    // Display the clock hours
    public void traverse() {
        AhmetHasanCelikNode current = head;
        if (head != null) {
            do {
                System.out.println("The Hour: " + current.hour);
                current = current.next;
            } while (current != head);
        }
    }
}
