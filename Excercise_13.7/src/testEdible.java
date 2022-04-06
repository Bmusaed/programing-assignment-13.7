
public class testEdible {

	public class TestEdible {
		 public static void main(String[] args) { 
			 Object[] objects = {new Wolf(), new Duck(), new Banana()}; 
			 for (int i = 0; i < objects.length; i++) { 
				 if (objects[i] instanceof Edible) 
					 System.out.println(((Edible)objects[i]).howToEat()); 
				 if (objects[i] instanceof Animal) { 
					 System.out.println(((Animal)objects[i]).sound()); 
					 }
				 }
			 }
		 } 
	abstract class Animal {
		private double weight;
		
		public double getWeight() {
			return weight;
		} 
		public String howToEat() {
			// TODO Auto-generated method stub
			return null;
		}
		public void setWeight(double weight) {
			this.weight = weight;
		} 
		/** Return animal sound */ 
		public abstract String sound();
		} 
	class Duck extends Animal implements Edible {
		@Override 
		public String howToEat() {
			return "Duck: Grill it";
			} 
		@Override 
		public String sound() {
			return "Duck: Quack";
			}
		} 
	class Wolf extends Animal {
		@Override 
		public String sound() {
			return "Wolf: Awooooooohhh";
			}
		} 
	abstract class Fruit implements Edible {

		public String howToEat() {
			// TODO Auto-generated method stub
			return null;
		}
		} 
	class Banana extends Fruit {
		@Override 
		public String howToEat() {
			return "banana: Make banana pudding";
			}
		}
	class watermelon extends Fruit {
		@Override
		public String howToEat() {
			return "Watermelon: Make Watermelon juice";
	}
	}
}
