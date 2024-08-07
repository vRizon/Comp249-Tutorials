public class Pair<K,V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void printTypes() {
        System.out.println("Key type: " + key.getClass().getSimpleName());
        System.out.println("Value type: " + value.getClass().getSimpleName());
    }
}
