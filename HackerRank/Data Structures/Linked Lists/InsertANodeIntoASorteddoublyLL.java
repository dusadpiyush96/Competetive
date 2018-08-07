
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode curr = head;
        while(curr.data<data && curr.next!=null){
            curr = curr.next;
        }
        if(curr==head){
            DoublyLinkedListNode k = new DoublyLinkedListNode(data);
            k.next=head;
            k.next.prev = k;
            //head = k;
            return k;
        }
        if(curr.next==null && curr.data<data){
            DoublyLinkedListNode k = new DoublyLinkedListNode(data);
            k.prev = curr;
            curr.next = k;
            //k.next = curr;
        }
        else{
            DoublyLinkedListNode k = new DoublyLinkedListNode(data);
            k.prev = curr.prev;
            curr.prev = k;
            k.prev.next = k;
            k.next = curr;
        }
        return head;
    }