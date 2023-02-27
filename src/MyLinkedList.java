class Node<E>{
    public Node next;
    public Node pre;
    public E data;
    public Node(E data){
        this.data = data;
    }
}


public class MyLinkedList<E> {
    private Node head;
    private Node last;
    private int size;
    public MyLinkedList(E data){
        this.size = 1;
        this.head = new Node(data);
        this.last = this.head;

    }
    //尾插法
    public void addEnd(E data){
        Node newNode = new Node(data);
        if (head == null){
            this.head = newNode;
            this.last = newNode;
        }else {
            newNode.pre = this.last;
            this.last.next = newNode;
            this.last = newNode;
        }
    }

    public void print(){
        Node cur = this.head;
        if(cur == null){
            System.out.println("This is null");
            return;
        }
        System.out.println("-----------------------------");
        System.out.println("head的地址是："+head);
        System.out.println("last的地址是："+last);
        while (cur.next!=null){
            System.out.println(cur.data+"的地址是："+cur);
            System.out.println(cur.data+"的pre的地址是："+cur.pre);
            System.out.println(cur.data+"的next的地址是："+cur.next);
            cur = cur.next;
            this.size ++;
        }
    }

}
