import java.util.*;
	public class Hashset {
	    public static void main(String[] args) {
	        List l = new ArrayList();
	        l.add("janu");
	        l.add("shakthi");
	        System.out.println(l);
	        Map m = new HashMap();
	        m.put(10,"Mithi");
	        m.put(11,"janu");
	        Set s = m.entrySet();
	        Iterator it = s.iterator();
	        while(it.hasNext()){
	            System.out.println(it.next());
	          
	           }
	           
	        }
	    }
	    
	


