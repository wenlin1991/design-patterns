/* Monkey.jva */
public class Monkey implements Living{

	private String name;
	private double height;
	private double weight;
	private String favFood;
	private String sound;
	
	@Override
	public void setName(String newName) {
		name = newName;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setHeight(double newHeight) {
		height = newHeight;
	}

	@Override
	public double getHeight() {
		return height;
	}

	@Override
	public void setWeight(double newWeight) {
		weight = newWeight;
	}

	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public void setFavFood(String newFood) {
		favFood = newFood;
	}

	@Override
	public String getFavFood() {
		return favFood;
	}

	@Override
	public void setSound(String newSound) {
		sound = newSound;
	}

	@Override
	public String getSound() {
		return sound;
	}
	
	public static void main(String[] args) {
		
		Monkey monkey = new Monkey();
		monkey.setName("Xingzhe Sun");
		monkey.setHeight(185);
		monkey.setWeight(70);
		monkey.setFavFood("banana");
		monkey.setSound("妖怪，哪里跑！");
		
		// test code 
		System.out.println("Hello, I am " + monkey.getName());
		System.out.println("My height and weight are " + monkey.getHeight() + " " +
		monkey.getWeight());
		System.out.println("My favorite food is " + monkey.getFavFood());
		System.out.println("My slogan is " + monkey.getSound());
	}
    
}
