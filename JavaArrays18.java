//CadenK
public class JavaArrays18 {

    public static void main(String[] args){
        int[] grades = {98,87,74,63,82,54,92,87,78,100};
        int sum =0;
        int size =10;

        for (int x = 0; x < size; x++){

            sum  = sum + grades[x];

            double average = sum / size;

            System.out.println(" total "  + sum + " average " + average);

            if(grades[x] >99 ){
                System.out.println(" this " + grades[x] + " is an A+ ");
            }

            else if(grades[x] > 89 ){
                System.out.println(" this " + grades[x] + " is an A ");
            }

            else if(grades[x] >79 ){
                System.out.println(" this " + grades[x] + " is an B ");
            }

            else if(grades[x] > 69 ){
                System.out.println(" this " + grades[x] + " is an C ");
            }
            else{
                System.out.println(" you can do better than grades " + grades[x]);
            }
        }
    }
}