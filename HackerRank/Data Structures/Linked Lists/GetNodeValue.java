    // Complete the getNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        SinglyLinkedListNode curr = head;
        int count = 1;
        while(curr.next!=null){
            curr=curr.next;
            count++;
        }
        System.out.println(count);
        int positionFromHead = count-positionFromTail-1;
        curr = head;
        for(int i=0;i<positionFromHead;i++){
            curr = curr.next;
        }
        return curr.data;
    }