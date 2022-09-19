public class Main {
    public static void main(String[] args) {
        int number = 37;
        boolean isPrime = true;
        if(number==2){
            isPrime = true;
        } else if(number>2){
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime == true) {
            System.out.println("Sayı asal");
        } else {
            System.out.println("Sayı asal değil");
        }
    }
}