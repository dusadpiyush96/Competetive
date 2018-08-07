    // Complete the reverse function below.

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */
    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        Stack<Integer> al = new Stack<Integer>();
        DoublyLinkedListNode curr = head;
        while(curr!=null){
            al.push(curr.data);
            curr=curr.next;
        }
        curr = head;
        while(al.size()!=0){
            curr.data=al.pop();
            curr=curr.next;
        }
        return head;
    }