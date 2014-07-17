
public class Dog implements Food {
	private String name;
	
	public Dog(String name){
		this.name=name;
	}
	
	public boolean giveFood(int amount){
        System.out.println("Giving " + amount + "gr. of Food for " + name); 
       return true;
	}
}
