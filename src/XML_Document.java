

import java.util.*;

public class XML_Document {

	static ArrayList<Element> elements;
	
	public XML_Document(){
		elements = new ArrayList<Element>();
	}
	
	public void addElement(Element element){
		elements.add(element);
	}
	
	public static void main(String[] args) {
		
		XML_Document testdoc = new XML_Document();
		SuperElement course = new SuperElement("course");
		Element code = new TagElement("code","SYSC3110");
		Element prof = new TagElement("prof","Babak");
		SuperElement classes= new SuperElement("classes");
		Element student = new TagElement("student","Michael");
		Element student2 = new TagElement("student","Alan");
		
		classes.addSubElement(student);
		classes.addSubElement(student2);
		course.addSubElement(code);
		course.addSubElement(prof);
		course.addSubElement(classes);
		
		testdoc.addElement(course);
		
		for(int i=0;i<elements.size();++i){
			elements.get(i).printElement();
		}
		

	}

}
