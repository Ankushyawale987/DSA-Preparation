//Using the concept of typecasting (Naive Approach)
//Using Character.forDigit() function
class Main {
    public static void main(String[] args) {
        // 1 typecasting
        int i = 65;
        char c = (char)i;
        System.out.println(c);
        
        int j = 65;
        char d = (char)(j + '3');
        System.out.println(d);
        
        // Using Character.forDigit() function
        int base = 10;
        int a = 5;
        char ans = Character.forDigit(a, base);
        System.out.println(ans);
    }
}
