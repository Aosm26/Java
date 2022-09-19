public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//ctrl+shift+alt+l tüm kodu düzenler
        int n1 = 300;
        int n2 = 500;
        int n3 = 700;
        int big = n1;

        if (n1 > n2) {
            big = n1;
        } else if (n1 < n2) {
            big = n2;
        }
        if (n3 > big) {
            big = n3;
        }
        System.out.println("Biggest number is : " + big);


        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Absolute");
                break;
            case 'B':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Retry");
                break;
            default:
                System.out.println("Unassigned Grade");
                break;
        }
    }
}