public class BasicHashTable {
    private Object[] table;
    private int size;

    public BasicHashTable(int capacity) {
        table = new Object[capacity];
        size = 0;
    }

    public int hash(String key) {
        int hashValue = 0;
        for (int idx = 0; idx < key.length(); idx++) {
            hashValue += key.charAt(idx);
        }
        return Math.abs(hashValue % table.length);
    }
    public void put(String key, Object value) {
        // check for the room to add
        if (size == table.length) {
            System.err.println( "Hass Table full!!");
            return;
        }
        int index = hash();
        int startIndex = index;

        while(table[index] != null && table[index].equals("DELETED
        ")) {
            
        }
    }


}
