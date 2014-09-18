
public class PrimzahlBerechnen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		berechnen();
		
	}
	
	
	public static void berechnen(){
		for (int i=2; i<=50000; i++){
			boolean prime = true;
			for (int j=2; j<i; j++){
				if(i%j == 0){
					prime= false;
					break;
				}
			}
			if (prime){
				System.out.println("Primzahl: "+i);
			}
			
		}
	}
	
}

