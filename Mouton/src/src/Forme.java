


public abstract class Forme {
 protected Point centre;
 
 
 
 public Forme() {
	this.centre = new Point(0,0);
	
}
 public Forme(final int x, final int y) {
		this.centre = new Point(x, y);
		
	}
 public abstract double aire();
 public abstract double perimetre();
 public void translation(final int dx, final int dy) {
		Point p = null;
		p = centre.translation(dx, dy);
		centre = p;
	}
@Override
public String toString() {
	return "Forme [centre=" + centre + "]";
}
 
}
