


public class TagElement extends Element {
	
	String tag;
	
	public TagElement(String name, String tag){
		super(name);
		this.tag=tag;
	}
	
	@Override
	public void printElement(){
		Object[] keyval = super.attributes.keySet().toArray();
		
		System.out.print("<"+name);
		for(int i=0;i<super.attributes.size();++i){
			System.out.print(" "+keyval[i]+"="+super.attributes.get(keyval[i]));
		}
		System.out.print(">");
		System.out.print(tag+" </"+name+"> ");
		System.out.println("");
	}

}
