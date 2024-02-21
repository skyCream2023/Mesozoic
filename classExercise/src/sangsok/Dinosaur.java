package sangsok;


	public class Dinosaur {
		private String name;
		private String species;
		private int lifespan;
		private int size;
		Dinosaur(String name, String species, int lifespan, int size){
		name = this.name;
		species = this.species;
		lifespan = this.lifespan;
		size = this.size;
		}
		
		public String getName(){
			return name;
		}
		public String getSpecies(){
			return species;
		}
		public int getLifespan(){
			return lifespan;
		}
		public int getSize(){
			return size;
		}
			
	}	
	class FDinosaur extends Dinosaur{
		int wingSize;
		FDinosaur(){}
		public int getWingSize(){
			return wingSize;
			}
	}
	class ADinosaur extends Dinosaur{
		String water;
	}
	class LDinosaur extends Dinosaur{
		String lend;
	}
	
	
	
	class Test{
	public static void main(String[] args) {		

	}

}
