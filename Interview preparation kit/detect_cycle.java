boolean hasCycle(Node head){
        if(head == null )return false;
        Node slow = head;
        Node fast = head.next;
        
        while(slow!=fast){
            if(fast.next == null || fast==null) return false;
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }
