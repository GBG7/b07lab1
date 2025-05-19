public class Polynomial {
	double[] coefficients;
	
	public Polynomial() {
		this.coefficients = new double[0];
	}
	
	public Polynomial(double[] coefficient) {
		this.coefficients = new double[]{0};
	}
	public Polynomial add(Polynomial other) { // [1,0,1,2] + [1,1,3]
		int max_len = Math.max(this.coefficients.length, other.coefficients.length);
	    int min_len = Math.min(this.coefficients.length, other.coefficients.length);
		double[] result = new double[max_len];
		for (int i = 0; i < min_len; i++) {
			result[i] = this.coefficients[i] + other.coefficients[i];
		}
		if (this.coefficients.length > other.coefficients.length) {
			for (int i = min_len; i < max_len; i ++) {
				result[i] = this.coefficients[i];
			}
		} else {
			for (int i = min_len; i < max_len; i ++) {
				result[i] = other.coefficients[i];
			}
		}
	    return new Polynomial(result);
	}
	public double evaluate(double x) {
		double ans = 0;
		for (int i = 0; i < this.coefficients.length; i ++) {
			ans += this.coefficients[i] * Math.pow(x, i);
		}
		return ans;
	}
	public boolean hasRoot(double x2) {
		if (this.evaluate(x2) == 0) {
			return true;
		} else {
			return false;
		}
	}
	
}