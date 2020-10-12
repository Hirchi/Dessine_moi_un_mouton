
public class Ellipse extends Forme {
	private int grandAxe, petitAxe;

	   public Ellipse(int x,int y,int grandAxe, int petitAxe) {
		   super(x,y);
	      this.grandAxe=grandAxe;
	      this.petitAxe=petitAxe;
	   }
	   
	
	
	
	@Override
	public double aire() {
		return (float)Math.PI * petitAxe * grandAxe;
	}

	@Override
	public double perimetre() {
		float resultat = 0;
	      float pcarre = petitAxe * petitAxe;
	      float gcarre = grandAxe * grandAxe;
	      float sinus, cosinus;

	      for (int i = 0; i < 1000; i++) {
		  sinus=(float)Math.sin(i*Math.PI/2000);
		  cosinus=(float)Math.cos(i*Math.PI/2000);
		  resultat += Math.sqrt(pcarre * sinus * sinus + gcarre * cosinus *cosinus);
	      }
	      resultat *= 4*Math.PI / 2000;
	      return resultat;
	}

}
