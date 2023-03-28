import java.util.Enumeration;
import java.util.Hashtable;
class chapter4
{

public static void hashtables()
{
    Hashtable<String, Integer> hashtable = new Hashtable<>();

    hashtable.put("A", 1);
    hashtable.put("B", 2);
    hashtable.put("C", 3);
    Enumeration<String> keys = hashtable.keys();
    while (keys.hasMoreElements()) {
        String key = keys.nextElement();
        System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
    }
}

	public static void main(String[] args) 
    {
     hashtables();
	}
}
