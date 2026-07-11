//package MemoryManagement;
//import java.util.*;
//
//
//public class LRUcache<K, V> {
//
//    private class Node {
//        K key;
//        V value;
//        Node next;
//        Node prev;
//
//        public Node(K key, V value) {
//            this.key = key;
//            this.value = value;
//        }
//    }
//
//    private final int capacity;
//    private final Node head;
//    private final Node tail;
//    private final Map<K, Node> map;
//
//    public LRUcache(int capacity) {
//        if (capacity < 1) {
////            throw new IllegalArgumentException {
////                System.out.println("Provide positive capacity");
////            }
//        }
//        this.capacity = capacity;
//        this.head = new Node(null, null);
//        this.tail = new Node(null, null);
//        this.map = new HashMap<>();
//        head.prev = tail;
//        tail.next = head;
//    }
//
//    public int Size() {
//        return map.size();
//    }
//
//    public V get(K key) {
//        Node node = map.get(key);
//        moveToFront(node);
//        return node.value;
//    }
//
//    public void put(K key, V value) {
//        Node existing = map.get(key);
//        if (existing != null) {
//            map.put(key,existing);
//            moveToFront(existing);
//        }
//    }
//
//    Node node = new Node(key,value);
//    int currentSize = Size();
//    if(currentSize >= capacity){
//        removeTail(node);
//    }
//    addToFront(node);
//
//    public void removeTail(Node node) {
//        Node x = new Node(null, null);
//        head.next = x;
//        x.next = tail.prev;
//        tail.prev = head;
//        tail.next = null;
//        x = tail;
//    }
//
//    public void addToFront(Node node) {
//        Node y = new Node(null, null);
//        head.next = y;
//        tail.prev =
//    }
//
//    public void moveToFront(Node node) {
//
//    }
//
//    public void remove(Node node){
//
//    }
//}