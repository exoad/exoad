public class Complex extends Object {

    private double x,y;
    
    /**
        @param u Real part
        @param v Imaginary part
    */
    public Complex(double u,double v) {x=u;y=v;}
    
    /**
        @return Re[z] where z is this Complex number.
    */
    public double real() {
        return x;
    }
    
    /**
        @return Im[z] where z is this Complex number.
    */
    public double imag() {
        return y;
    }
    
    /**
        @return |z| where z is this Complex number.
    */
    public double mod() {
        if (x!=0 || y!=0) {
            return Math.sqrt(x*x+y*y);
        } else {
            return 0d;
        }
    }
    
    /**
        @return arg(z) where z is this Complex number.
    */
    public double arg() {
        return Math.atan2(y,x);
    }
    
    /**
        @return z-bar where z is this Complex number.
    */
    public Complex conj() {
        return new Complex(x,-y);
    }
    
    /**
        @param w is the number to add.
        @return z+w where z is this Complex number.
    */
    public Complex plus(Complex w) {
        return new Complex(x+w.real(),y+w.imag());
    }
    
    /**
        @param w is the number to subtract.
        @return z-w where z is this Complex number.
    */
    public Complex minus(Complex w) {
        return new Complex(x-w.real(),y-w.imag());
    }
    
    /**
        @return z*w where z is this Complex number.
    */
    public Complex times(Complex w) {
        return new Complex(x*w.real()-y*w.imag(),x*w.imag()+y*w.real());
    }
    
    /**
        @param w is the number to divide by
        @return new Complex number z/w where z is this Complex number  
    */
    public Complex div(Complex w) {
        double den=Math.pow(w.mod(),2);
        return new Complex((x*w.real()+y*w.imag())/den,(y*w.real()-x*w.imag())/den);
    }
    
    /**
        @return exp(z) where z is this Complex number.
    */
    public Complex exp() {
        return new Complex(Math.exp(x)*Math.cos(y),Math.exp(x)*Math.sin(y));
    }
    
    /**
        @return log(z) where z is this Complex number.
    */
    public Complex log() {
        return new Complex(Math.log(this.mod()),this.arg());
    }
    
    /**
        @return sqrt(z) where z is this Complex number.
    */
    public Complex sqrt() {
        double r=Math.sqrt(this.mod());
        double theta=this.arg()/2;
        return new Complex(r*Math.cos(theta),r*Math.sin(theta));
    }
    private double cosh(double theta) {
        return (Math.exp(theta)+Math.exp(-theta))/2;
    }
    private double sinh(double theta) {
        return (Math.exp(theta)-Math.exp(-theta))/2;
    }
    
    /**
        @return sin(z) where z is this Complex number.
    */
    public Complex sin() {
        return new Complex(cosh(y)*Math.sin(x),sinh(y)*Math.cos(x));
    }
    
    /**
        @return cos(z) where z is this Complex number.
    */
    public Complex cos() {
        return new Complex(cosh(y)*Math.cos(x),-sinh(y)*Math.sin(x));
    }
    
    /**
        @return sinh(z) where z is this Complex number.
    */
    public Complex sinh() {
        return new Complex(sinh(x)*Math.cos(y),cosh(x)*Math.sin(y));
    }
    
    /**

        @return cosh(z) where z is this Complex number.
    */
    public Complex cosh() {
        return new Complex(cosh(x)*Math.cos(y),sinh(x)*Math.sin(y));
    }
    
    /**
        @return tan(z) where z is this Complex number.
    */
    public Complex tan() {
        return (this.sin()).div(this.cos());
    }
    
    /**
        @return -z where z is this Complex number.
    */
    public Complex chs() {
        return new Complex(-x,-y);
    }
    
    /**
        @return x+i*y, x-i*y, x, or i*y as appropriate.
    */
    public String toString() {
        if (x!=0 && y>0) {
            return x+" + "+y+"i";
        }
        if (x!=0 && y<0) {
            return x+" - "+(-y)+"i";
        }
        if (y==0) {
            return String.valueOf(x);
        }
        if (x==0) {
            return y+"i";
        }
        return x+" + i*"+y;
        
    }       
}
