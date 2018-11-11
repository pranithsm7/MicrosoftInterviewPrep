package HashTable.HashTableImplementation;

public class MyHashTable {

    private static int size=16;
    private HashEntry[] entries=new HashEntry[size];


    public void put(String key, String value){

        int entry=hash(key);
        final HashEntry hashEntry=new HashEntry(key,value);

        if(entries[entry]==null){
            entries[entry]=hashEntry;
        }else{
            HashEntry temp=entries[entry];
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=hashEntry;
        }
    }

    public String get(String key){

        int hash=hash(key);

        HashEntry entry=entries[hash];

        if(entries[hash]!=null) {

            while (!entry.key.equals(key) && entry.next != null) {
                entry = entry.next;
            }

            return entry.value;
        }
        return null;
    }

    public int hash(String key){
        return Math.abs(key.hashCode()%size);
    }

    public static void main(String[] args){

        MyHashTable hashTable=new MyHashTable();
        hashTable.put("somekey","somevalue");

        System.out.println(hashTable.get("somekey"));
    }

}
