package Functions;

public class Functions {
	
	  
	    class LinkedHash {
	        String key;
	        int value;
	        LinkedHash next;
	  
	        LinkedHash(String key, int value)
	        {
	            this.key = key;
	            this.value = value;
	            this.next = null;
	        }
	    }
	  
	    private int tableSize;
	    private int size;
	    private LinkedHash[] table;
	  
	  
	    public Functions(int ts)
	    {
	        size = 0;
	        tableSize = ts;
	        table = new LinkedHash[tableSize];
	  
	        
	        for (int i = 0; i < tableSize; i++)
	            table[i] = null;
	    }
	  
	   
	    public int getSize() { return size; }
	  
	  
	    public void makeEmpty()
	    {
	        for (int i = 0; i < tableSize; i++)
	            table[i] = null;
	    }
	  
	    
	    public int get(String key)
	    {
	        int value = (myhash(key) % tableSize);
	        if (table[value] == null)
	            return -1;
	        else {
	            LinkedHash current = table[value];
	            while (current != null && !current.key.equals(key)) 
	            {
	                current = current.next;
	            }
	            if (current == null) {
	                return -1;
	            }
	            else {
	                return current.value;
	            }
	        }
	    }
	  
	   
	    public void insert(String key, int value)
	    {
	        int hash = (myhash(key) % tableSize);
	        if (table[hash] == null) {
	            table[hash] = new LinkedHash(key, value);
	        }
	        else {
	            LinkedHash entry = table[hash];
	            while (entry.next != null && !entry.key.equals(key)) 
	            {
	                entry = entry.next;
	            }
	            if (entry.key.equals(key)) {
	                entry.value = value;
	            }
	            else {
	                entry.next = new LinkedHash(key, value);
	            }
	        }
	        size++;
	    }
	  
	   
	    public void remove(String key)
	    {
	        int value = (myhash(key) % tableSize);
	        if (table[value] != null) {
	            LinkedHash prev = null;
	            LinkedHash current = table[value];
	            while (current.next != null && !current.key.equals(key)) 
	            {
	                prev = current;
	                current = current.next;
	            }
	            if (current.key.equals(key)) {
	                if (prev == null) {
	                    table[value] = current.next;
	                }
	                else {
	                    prev.next = current.next;
	                }
	                size--;
	            }
	        }
	    }
	  
	    private int myhash(String x)
	    {
	        int value = x.hashCode();
	        value %= tableSize;
	        if (value < 0)
	        {
	            value = value + tableSize;
	        }
	        return value;
	    }
	  
	    
	    public void printHashTable()
	    {
	        for (int i = 0; i < tableSize; i++) 
	        {
	            LinkedHash current = table[i];
	            while (current != null) 
	            {
	                System.out.println( "Value = " + current.value + " "+ "Key = " + current.key);
	                current = current.next;
	            }
	        }
	        System.out.println();
	    }
	
	
	public Functions(Object nextInt) {
		// TODO Auto-generated constructor stub
	}

	public void insert1(String key, int value) {
		// TODO Auto-generated method stub
		
	}

	public void remove1(String key2) {
		// TODO Auto-generated method stub
		
	}

	public void printHashTable1() {
		// TODO Auto-generated method stub
		
	}

	public String get1(String key3) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public void makeEmpty1() {
		// TODO Auto-generated method stub
		
	}

	public String getSize1() {
		// TODO Auto-generated method stub
		return null;
	}

}
