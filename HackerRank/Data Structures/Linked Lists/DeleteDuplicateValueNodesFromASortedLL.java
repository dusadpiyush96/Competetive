    // Complete the removeDuplicates function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        if(head.next==null) return head;
        SinglyLinkedListNode curr = head;
        SinglyLinkedListNode prev = head;
        while(curr.next!=null){
            curr=curr.next;
            while(prev.data==curr.data){
                curr=curr.next;
                prev.next=curr;
                if(curr==null) break;
            }
            prev=prev.next;
            if(curr==null) break;
        }
        return head;
    }