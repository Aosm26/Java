public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 3, 5, 7, 9, 59, 54, 35, 23};
        int findNumber = 59;
        int arrayCode = 0;
        for (int i = 0; i < 9; i++) {
            if (numbers[i] == findNumber) {
                System.out.println("Sayı var");
                arrayCode = numbers[i];
                break;
            }

        }
        if (arrayCode != findNumber) {
            System.out.println("Sayı yok");
        }
    }
}