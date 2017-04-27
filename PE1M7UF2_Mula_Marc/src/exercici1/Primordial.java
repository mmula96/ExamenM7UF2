package exercici1;

public class Primordial {
	
	
	
    public double get_primordial(double n) throws IllegalArgumentException{
        if (n < 0){
            throw new IllegalArgumentException() ;
        }

        if(n == 1 || n == 0){
            return 1;
        }

        PrimeNumber primer = new PrimeNumber();
        Primordial unprimordial = new Primordial();
        
        if (primer.isPrime((int) n)){
            return n * unprimordial.get_primordial(n - 1);
            
        }

        return unprimordial.get_primordial(n - 1);
    }
    
}