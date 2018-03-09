import java.util.*;
class TestCollection1{
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
        list.add("vijay");
        list.add("shyam");

        Iterator itr=list.iterator();
        while(itr.hasNext()){
        	System.out.println(itr.next());
        }		
	}
}