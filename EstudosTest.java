public class EstudosTest {

    public static void main(String[] args) {

        int [][] student = {{87,96,70},{68,87,90},
                {94,100,90},{100,81,82},{83,65,85},
                {85,75,65},{91,94,83},{76,72,100},{87,93,73},{78,81,82}};

        System.out.println("Welcome to the grade book for\nCS101 instrution to Java programming\n\nThe grades are: ");
        System.out.printf("%190s%7s%7s%10s%n","Test1","Test2","Test3", "Avarege");

        for (int counter = 0; counter < student.length; counter++) {
            double avarege;
            int total = 0;
            System.out.printf("%s%02d: ","Student ",counter + 1);
            for (int note: student[counter]) {
                total += note;
                System.out.printf("%5d ", note);

            }
            avarege =(double) total / 3;
            System.out.printf("%10.2f", avarege);
            System.out.println();
        }
        System.out.println();
        System.out.println("Lowest grade in grade book: "+Lowest(student));
        System.out.println("Highest grade in grade book: "+Biggest(student));
        System.out.println();
        Grafic(student);

    }

    public static int Biggest(int[][] array){
        int biggest = 0;
        for (int counter = 0; counter < array.length; counter++)
            for (int big: array[counter])
                if (biggest < big)
                    biggest = big;

        return biggest;
    }

    public static int Lowest(int[][] array){
        int lowest = 100;
        for (int counter = 0; counter < array.length; counter++)
            for (int low: array[counter])
                if (lowest > low)
                    lowest = low;

        return lowest;
    }

    public static void Grafic(int[][] array){

        int[] frequency = new int[11];
        for (int counter = 0; counter < array.length; counter++)
            for (int nota: array[counter])
                ++frequency[nota/10];

        for (int counter = 0; counter < frequency.length; counter++) {
            if (counter == 10)
                System.out.printf("%5d: ", counter * 10);
            else
                System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9);

            for (int i = 0; i < frequency[counter]; i++)
                System.out.print("#");
            System.out.println();
        }
    }
}

