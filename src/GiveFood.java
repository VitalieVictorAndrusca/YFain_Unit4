
public class GiveFood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      Food animals[] = new Food [2];
	            animals[0] = new Dog("Baron");
	            animals[1] = new Cat("Liza");
	              
		        System.out.println("Trying to give 400gr. of Food for animals."); 
	            
	                   for (Food p: animals){
	                            p.giveFood(400);
	                   }
	}

}
