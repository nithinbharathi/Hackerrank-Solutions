    // Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        
        if(position == 0){
            node.next = head;
            return node;
        }

        int i=0;
        SinglyLinkedListNode ptr = head;
        while(i != position-1){
            ptr =  ptr.next;
            i++;
        }
        node.next = ptr.next;
        ptr.next = node;
          return head;

    }
