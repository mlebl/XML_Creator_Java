
import java.util.*;

public abstract class Element {

	HashMap<String,Integer> attributes;
	String name;
	
	public Element(String name){
		attributes = new HashMap<String,Integer>();
		this.name=name;
	}
	
	void addAttribute(String name, Integer value){
		attributes.put(name,value);
	}
	
	void printElement(){
	}
	
}
