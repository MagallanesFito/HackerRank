static int listLength(SinglyLinkedListNode head){
        SinglyLinkedListNode n = head;
        int len = 0;
        while(n != null){
            n = n.next;
            len++;
        }
        return len;
    }
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        int a = listLength(head1);
        int b = listLength(head2);
        int diff = 0;
        if(a>b){
            diff = a-b;
            for(int i=0;i<diff;i++) head1 = head1.next;
        }
        else{
            diff = b-a;
            for(int i=0;i<diff;i++) head2 = head2.next;
        }
        while(head1!=head2){
            head1 = head1.next;
            head2 = head2.next;
        }
        return head1.data;
    }
