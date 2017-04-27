package exercici1;

import static java.lang.Math.sqrt;

/**
 * @author Eloy Albiach Forner
 * @version 1.0
 */
public class PrimeNumber {

    /**
     * Returns if a number is or not Prime
     * @param n Must be an integer
     * @return Returns a boolean value
     * @throws Exception if n less than zero
     */
    public boolean isPrime(int n) throws IllegalArgumentException{
        if (n < 0){
            throw new IllegalArgumentException();
        }

        if (n == 1 || n == 2){
            return true;
        }

        boolean checkingIfBool = true;
        for (int i = 2; i < sqrt(n) + 1; i++){
            if (n % i == 0){
                checkingIfBool = false;
            }
        }
        return checkingIfBool;
    }
}
