class countofprimenumbersofn {

    public int countPrimes(int n) {

        if (n <= 2) {
            return 0;
        }

        boolean[] prime = new boolean[n];

        for (int i = 2; i < n; i++) {
            prime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {

            if (prime[i]) {

                for (int j = i * i; j < n; j += i) {
                    prime[j] = false;
                }
            }
        }

        int count = 0;

        for (int i = 2; i < n; i++) {
            if (prime[i]) {
                count++;
            }
        }

        return count;
    }

     public static void main(String[] args) {

        int n = 50;

        countofprimenumbersofn obj = new countofprimenumbersofn();

        System.out.println("Number of primes less than " + n + " = " + obj.countPrimes(n));
    }
}

