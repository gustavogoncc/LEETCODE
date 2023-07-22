 class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class MesclarDuasListas {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1); // Cabeçalho fictício para simplificar a inserção
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Se uma das listas ainda tiver elementos, adicionamos diretamente na lista resultante
        if (list1 != null) {
            current.next = list1;
        }

        if (list2 != null) {
            current.next = list2;
        }

        return dummy.next; // O primeiro nó real contém o resultado
    }

    public static void main(String[] args) {
        // Exemplo 1:
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        MesclarDuasListas  merger = new MesclarDuasListas();
        ListNode mergedList = merger.mergeTwoLists(list1, list2);
        printList(mergedList); // Output: 1 -> 1 -> 2 -> 3 -> 4 -> 4

        // Exemplo 2:
        ListNode list3 = null;
        ListNode list4 = null;
        ListNode mergedList2 = merger.mergeTwoLists(list3, list4);
        printList(mergedList2); // Output: (empty list)

        // Exemplo 3:
        ListNode list5 = null;
        ListNode list6 = new ListNode(0);
        ListNode mergedList3 = merger.mergeTwoLists(list5, list6);
        printList(mergedList3); // Output: 0
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
