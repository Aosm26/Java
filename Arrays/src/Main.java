public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String[] students = new String[3];
        students[0] = "Ali";
        students[1] = "Alp";
        students[2] = "Berat";

        for(String student:students){
            System.out.println(student);
        }

        char[][] myCity = new char[3][3];
        myCity[0][0] = 'E';
        myCity[0][1] = 'S';
        myCity[0][2] = 'K';
        myCity[1][0] = 'İ';
        myCity[1][1] = 'Ş';
        myCity[1][2] = 'E';
        myCity[2][0] = 'H';
        myCity[2][1] = 'İ';
        myCity[2][2] = 'R';

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(myCity[i][j]);
            }
        }
    }
}