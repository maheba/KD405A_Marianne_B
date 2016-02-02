
public class House {
	private int yearBuilt;
	private int size;
	private final int minSize = 10;

	public House(int yearBuilt, int size) {
		this.yearBuilt = yearBuilt;
		if (yearBuilt > 2015) {
			this.yearBuilt = 2015;
		}
		if (yearBuilt < 1800) {
			this.yearBuilt = 1800;
		}
		this.size = size;
		if (size < minSize) {
			this.size = minSize;
		}
		if (size > 1000) {
			this.size = 1000;
		}
	}
	public int getYearBuilt() {
		return this.yearBuilt;
	}
	public int getSize() {
		return this.size;
	}
}
