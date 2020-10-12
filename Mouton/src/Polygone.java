
public class Polygone extends Forme {
	private int N;        
    private Point[] points;    
   
    
    public Polygone() {
        N = 0;
        points = new Point[4];
    }

	@Override
	public double aire() {
		double sum = 0.0;
        for (int i = 0; i < N; i++) {
            sum = sum + (points[i].getX() * points[i+1].getY()) - (points[i].getY() * points[i+1].getX());
        }
        return 0.5 * sum;

		
	}

	@Override
	public double perimetre() {
		double sum = 0.0;
        for (int i = 0; i < N; i++)
            sum = sum + points[i].distance(points[i+1]);
        return sum;
	}

}
