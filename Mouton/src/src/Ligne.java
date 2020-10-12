
public class Ligne extends Forme{
    private int loungeur;
    private double angle;
    
	public Ligne(int x, int y,int loungeur, double angle) {
		super(x,y);
		this.setLoungeur(loungeur);
		this.setAngle(angle);
	}

	@Override
	public double aire() {
		
		return 0;
	}

	@Override
	public double perimetre() {
		
		return 0;
	}

	public int getLoungeur() {
		return loungeur;
	}

	public void setLoungeur(int loungeur) {
		this.loungeur = loungeur;
	}

	public double getAngle() {
		return angle;
	}

	public void setAngle(double angle) {
		this.angle = angle;
	}

}
