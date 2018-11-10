package HashTable.HashTableImplementation;

public class HashEntry {

    private String key;
    private String value;
    private HashEntry next;

    public HashEntry(String key, String value){

        this.key=key;
        this.value=value;
        this.next=null;
    }


}
