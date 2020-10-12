
public class Point {
	private final int x;
	private final int y;

	public Point(final int x, final int y){
		this.x = x;
		this.y = y;
	}

	public Point() {
		this(0,0);
	}

	
	public Point(final Point b){
		this(b.x,b.y);
	}

	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	// p1.distance(p2)
	public double distance(final Point p) {
		return Math.sqrt(((this.x) - (p.x)) * ((this.x) - (p.x)) 
							+ ((this.y) - (p.y)) * ((this.y) - (p.y)));
	}

	// copie défensive car point immutable
	public Point translation(final int dx, final int dy) {
		return new Point(x + dx, y + dy);
	}

	@Override
	public String toString(){
		return "(" + x + "," + y + ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Point other = (Point) obj;
		if (x != other.x) {
			return false;
		}
		if (y != other.y) {
			return false;
		}
		return true;
	}

	
}
