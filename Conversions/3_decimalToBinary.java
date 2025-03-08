class Main {
    public static void main(String[] args) {
        int i =1;
        int num =8;
        long binary = 0;
        int remainder;
        while(num != 0){
            remainder = num % 2;
            num = num / 2;
            binary = remainder * i;
            i = i * 10;
        }
        System.out.println(binary);
    }
}

