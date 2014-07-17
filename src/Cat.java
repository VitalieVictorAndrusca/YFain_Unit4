
public class Cat implements Food{
	private String name;
	
	public Cat(String name){
		this.name=name;
	}
	
	public boolean giveFood(int amount){
		if(amount < Food.MAX_GIVE){
	        System.out.println("Giving " + amount + "gr. of Food for " + name); 
	        return true;
		} else {
	        System.out.println("Sorry, I can't give more than " + MAX_GIVE + "gr. of Food for " + name); 
 	       	return false;
		}

	}
}
