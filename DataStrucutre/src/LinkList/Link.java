/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkList;

import java.util.NoSuchElementException;

class Link {

    public int Data;
    public Link next;

    public Link(int id, Link next) {
        Data = id;
        this.next = next;
    }
}

class LinkList {

    private Link head;
    private int size;

    public LinkList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return (head == null); // condition if head has null reference link list is empty
    }

    public int size() {
        return size;
    }

    public void addFirst(int item) {
        head = new Link(item, head);
        size++;
    }

    public int readitem(Link head) {
        if (head != null) {
            return head.Data;
        } else {
            throw new NoSuchElementException();
        }

    }

    public static void main(String[] args) {
        LinkList ll = new LinkList();
        ll.addFirst(30);
        ll.addFirst(52);
        ll.addFirst(43);
        ll.addFirst(60);  // insert an element beginning of the linklist

        System.out.println(ll.readitem(ll.head));
        System.out.println(ll.size());
    }
}
