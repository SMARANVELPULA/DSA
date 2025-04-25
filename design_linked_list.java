

public class Node{
     Node next;
        int val;
        Node(int val){
            this.val = val;
            next = null;
        }
}
class MyLinkedList {
    Node head;
   int length;

    public MyLinkedList() {
      this.head = null;
      this.length = 0;
    }

    public int get(int index) { 
        if(index < 0 || index >length) return -1;
            
        Node temp = head;
        for (int i =0; i< length ;i++){
            if(i == index){
                 return temp.val;
            }
           temp = temp.next;
            
            
        }
        return -1;
       

    }

    public void addAtHead(int val) {
        Node temp = head;
        if(head == null ){
            head=new Node(val);
            length++;
            return;
        }
        Node new_node = new Node(val);
         new_node.next = temp;
        temp.next = new_node;
        length ++;
        
    }

    public void addAtTail(int val) {
       Node temp = head;
        Node new_node = new Node(val);
        if(temp == null){
            temp = new_node;
            length += 1;
            return;
            
        }
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = new_node;
            new_node.next = null;
            length += 1;

    }

    public void addAtIndex(int index, int val) {
        if(index < 0 || index >length) return ;
        Node temp=head;
        if(index ==0){
            addAtHead(val);
            // length+=1;
        }
        for(int i = 0; i<index -1 ; i++){
            temp = temp.next;
        }
        Node new_node=new Node(val);
        new_node.next = temp.next;
        temp.next = new_node;
        length +=1;

    }

    public void deleteAtIndex(int index) {
         if(index < 0 || index >length) return ;
        if(index ==0){
            head = head.next;
            }else{
                Node temp =head;
                for (int i=0;i<index -1 ;i++){
                     temp = temp.next;
                }
                temp.next = temp.next.next;
            }
            length -=1;


    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */