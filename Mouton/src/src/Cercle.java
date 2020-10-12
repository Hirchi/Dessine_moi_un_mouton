

public class Cercle extends Forme {
	private final int rayon;

    public Cercle(final int x, final int y,  final int rayon) {
    	super(x, y);
        this.rayon = rayon;
    }
    
    public Cercle() {
    	this(0, 0, 1);
    }

    @Override
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public double aire() {
        return Math.PI * rayon * rayon;
    }
        
    @Override
    public String toString() {
        return "(" + super.toString() + " " + rayon + ")";
    }
}
