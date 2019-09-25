static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode n = head;
        DoublyLinkedListNode nuevo = new DoublyLinkedListNode(data);
        
        if(head==null){
            head = nuevo;
            head.next = null;
            head.prev = null;
            return head;
        }
        while(n.data<nuevo.data && n.next!=null){
            n = n.next;
        }
        //se inserta al final
        if(n.next == null){
            if(n.data <= nuevo.data){
                n.next = nuevo;
            nuevo.prev = n;
            return head;
            }
            else{
                n.prev.next = nuevo;
            nuevo.next = n;
            n.prev = nuevo;
            }
            
        }
        //se inserta al inicio de la lista
        if(n==head){
            nuevo.next = n;
            n.prev = nuevo;
            head = nuevo;
        }
        else{
            n.prev.next = nuevo;
            nuevo.next = n;
            n.prev = nuevo;
        }
        
        
        return head;
    }
