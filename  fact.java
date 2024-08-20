class Fact {
    public static void main(String[] args) {
        int a = 5;
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i; 
        } 
        System.out.println("Factorial of " + a + " is " + fact);
    }
}
