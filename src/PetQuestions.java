/*The following code is supposed to ask the user their pet's name, breed and age. Add the 3 lines necessary to make this work...*/

import java.util.Scanner;

public class PetQuestions {

    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print( "Greetings. What is your pet's name? " );
        System.out.println( " What kind of animal?" );
        System.out.println( "How old is your pet?" );
        System.out.println( "What is the breed?" );

        String name= null, breed = null  ;
        int age = 0 ;
        System.out.println( "What kind of animal is ?" + name  );
        name = keyboard.nextLine();
        System.out.println( "How old is your pet ?" + age);
        age = keyboard.nextInt();
        System.out.println ("What is the breed ?" + breed);
        breed = keyboard.nextLine();

    }
}

