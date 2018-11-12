package HashTable.Test;

public class MyHashTable {

    private static int size=10000;
    private HashEntry[] entries=new HashEntry[size];

    public void put(String key, String value){

        int hash=hash(key);
        HashEntry entry= new HashEntry(key,value);

        if(entries[hash]==null){
            entries[hash]=entry;
        }else{

            HashEntry temp=entries[hash];

            while(temp.next!=null){
                temp=temp.next;
            }

            temp.next=entry;
        }
    }

    public String get(String key){

        int hash=hash(key);


        if(entries[hash]!=null){

            HashEntry temp=entries[hash];

            while(!temp.key.equals(key) && temp.next!=null){
                temp=temp.next;
            }

            return temp.value;
        }

        return null;
    }

    public int hash(String key){

        return Math.abs(key.hashCode()%size);
    }


    public class HashEntry{

        private String key;
        private String value;
        private HashEntry next;

        public HashEntry(String key, String value){
            this.key=key;
            this.value=value;
            next=null;
        }
    }

    public static void main(String[] args){

        MyHashTable hashTable=new MyHashTable();
        hashTable.put("pranith","mididoddi");
        hashTable.put("srinivas","pran");

        System.out.println(hashTable.get("pranith"));
        System.out.println(hashTable.get("srinivas"));
    }
}

