package imports;

public class HashTable {

    private Item[] data;
    private int capacity;
    private int size;
    private static final Item AVAILABLE = new Item("Available", null);

    public HashTable(int capacity) {

        this.capacity = capacity; 
        data = new Item[capacity];
        for(int i = 0; i < data.length; i++) {

            data[i] = AVAILABLE;
        }
        size = 0;
    }

    public int size() {

        return size;
    }

    public int hashThis(String key) {
    	int keyi = Integer.parseInt(key);
        return keyi% capacity; 
    }

    public Object get(String key) {

        int hash = hashThis(key);
        int i = 0;
        while(data[hash] != AVAILABLE && data[hash].key() != key) {

            hash = (hash + (i^2)) % capacity;
            i++;
        }
        return hash/*data[hash].element()*/;
    }

    public void put(String key, Object element) {

        if(key != null) {
            size++;
            int i=0;
            int hash = hashThis(key);
            while(data[hash] != AVAILABLE && data[hash].key() != key) {
            	
                hash = (hash + (i^2)) % capacity;
                i++;
            }

            data[hash] = new Item(key, element);

        }

    }
    
    public String listafinal(){
    	String listaf="";
    	for(int i=0; i<=capacity; i++){
    		if (data[i]!=null){
    			listaf+=(data[i].key()+" ");
    			listaf+=(data[i].element())+"\n";
    		}
    	}
    	return listaf;
    }

    public Object remove(String key) {
        // not important now.
        throw new UnsupportedOperationException("Can't remove");
    }

}