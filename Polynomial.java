
public class Polynomial{
    // fields
    double [] coefficients;

    public Polynomial() {
        this.coefficients = new double[]{0};
    }
    public Polynomial(double Array []){
        this.coefficients = Array;
    }
    public Polynomial add(Polynomial addedPolynomial){
        int max_length = Math.max(this.coefficients.length, addedPolynomial.coefficients.length);
        double[] ttl = new double[max_length];

        for (int i = 0; i < max_length; i++){
            double x = 0;
            double y = 0;

            if (i < this.coefficients.length){
                x = this.coefficients[i];
            }
            
            if (i < addedPolynomial.coefficients.length){
                y = addedPolynomial.coefficients[i];
            }
            ttl[i] = x + y;
        }

        return new Polynomial(ttl);
    }

    public double evaluate(double x){
        double ttl = 0;
        
        for (int i = 0; i < this.coefficients.length; i++){
            ttl +=this.coefficients[i]*Math.pow(x,i);
        }

        return ttl;
    }
    public String hasRoot(double y){
        double ttl = evaluate(y);
        
        if (Math.abs(ttl) < 0){
            return "yes there's a root";

        } else {
            return "no, no roots";
        }
    }
    
}