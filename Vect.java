import java.util.Vector;
class Vect {
	public static void main(String[] args){
		  Vector<Object> v = new Vector<> (10);
		  v.add(100);
      		  v.addElement(new Integer(1));
		  System.out.println(v);
		  v.remove(1);
		System.out.println(v);
                 v.set(0,101);
   		System.out.println(v);
		System.out.println(v.size());
         	System.out.println(v.contains(5));
    
	}


}