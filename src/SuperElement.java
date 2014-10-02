
import java.util.*;

public class SuperElement extends Element {

	ArrayList<Element> subElements;
	
	public SuperElement(String name){
		super(name);
		subElements = new ArrayList<Element>();
	}
	
	public void addSubElement(Element element){
		subElements.add(element);
	}
	
	@Override
	public void printElement(){
		Object[] keyval = super.attributes.keySet().toArray();
		
		System.out.print("<"+name);
		for(int i=0;i<super.attributes.size();++i){
			System.out.print(" "+keyval[i]+"="+super.attributes.get(keyval[i]));
		}
		System.out.print(">");
		System.out.println("");
		for(int i=0;i<subElements.size();++i){
			subElements.get(i).printElement();
		}
		System.out.println("</"+name+">");
		
	}
	
}
