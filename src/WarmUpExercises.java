public class WarmUpExercises {

    public static void main(String[] args) {
        //Challenge 1 & 3
        for (int i = 100; i >= 0; i -= 5) {

            if (i%20 == 0)
                System.out.println(i + " Java");
            else
                System.out.println(i);
        }

        //Challenge 2 & 3
        for (int i = 0; i <= 100; i += 10) {
            //i%20==0? if statement
            //i + " Java" action
            //:i else statement
            System.out.println(i%20==0? i + " Java" : i);
        }

    }
}

