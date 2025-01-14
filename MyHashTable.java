public class MyHashTable<K, V> {
    private class HashNode<K, V>{}
    private HashNode<K, V>[] chainArray;
    private int M = 11;
    private int size;

    public MyHashTable(){}
    public MyHashTable(int M){}
    public int hash(K key){}
    public void put(K key, V value){}
    public V get(K key){}
    public V remove(K key){}
    public boolean contains(V value){}
    public K getKey(V value){}
}
private class HashNode<K, V>{
    private K key;
    private V value;
    private HashNode<K, V> next;

    public HashNode(K key, V value){
        this.key = key;
        this.value = value;
    }
    @Override
    public String toString(){
        return "{" + key + " " + value + "}";
    }
}