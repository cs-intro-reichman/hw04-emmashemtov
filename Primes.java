public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
      
        if (args.length != 1) {
            System.out.println("<n>");
            return;
        }

        int n = Integer.parseInt(args[0]);

        if (n < 2) {
            System.out.println("< n >=2 >");
            return;
        }

        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        int p = 2;
        while (p * p <= n) {
            
            if (isPrime[p]) {
                
                int i = p * p;
                while (i <= n) {
                    isPrime[i] = false;
                    i += p; 
                }
            }
            
            p++; 
        }

        System.out.println("Prime numbers up to " + n + ":");
        int count = 0;
        
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                count++;
            }
        }
        
        double percentage = (double) count / (n - 1) * 100;

        System.out.println("There are " + count + " primes between 2 and " + n + 
                           " (" + Math.round(percentage) + "% are primes)");

    }
}