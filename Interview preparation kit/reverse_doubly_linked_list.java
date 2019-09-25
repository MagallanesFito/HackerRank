static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        //unico elemento en lista
        if(head.next == null && head.prev == null)
        {
            //System.out.println("sjd");
            return head;
        } 
        DoublyLinkedListNode n = head.next;
        
        while(n.next != null){
            n.prev.next = n.prev.prev;
            n.prev.prev = n;
            n = n.next;
        }
        n.prev.next = n.prev.prev;
        n.prev.prev = n;
        n.next = n.prev;
        n.prev  = null;
        head = n;
        return head;
    }
