
public class tuna {
	private String girlName;
	
	public tuna(String name) {
			girlName=name;
	}
	
	public void setName(String name) {
		girlName = name;
	}
	
	public String getName() {
		return girlName;
	}
	
	public void saying() {
		System.out.printf("Your first girlfriend is %s", getName());
		
	}
	
}
