public class Main {
    public static void main(String[] args) {
        int number = 6;
        int plus = 0;
        if(number==1){
            plus = number;
        } else if(number>1){
            for (int i =1; i < number; i++) {
                if (number % i == 0) {
                    plus += i;
                }
            }
        }

        if (plus == number) {
            System.out.println("Sayı mükemmel :"+plus);
        } else {
            System.out.println("Sayı mükemmel değil : "+plus);
        }
    }
}
/* public class Main {
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
}*/