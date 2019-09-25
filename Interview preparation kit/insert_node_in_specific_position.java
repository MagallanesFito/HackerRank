 static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode n = head;
        SinglyLinkedListNode nuevo = new SinglyLinkedListNode(data);
        
        for(int i=0;i<position-1;i++){
            n = n.next;
        }
        nuevo.next = n.next;
        n.next = nuevo;
        return head;
    }
