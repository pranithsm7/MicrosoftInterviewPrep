package HashTable.HashTableImplementation;

public class HashEntry {

    public String key;
    public String value;
    public HashEntry next;

    public HashEntry(String key, String value){

        this.key=key;
        this.value=value;
        this.next=null;
    }


}
