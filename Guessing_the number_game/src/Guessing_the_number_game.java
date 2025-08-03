import java.util.Random;
import java.util.Scanner;
public class Guessing_the_number_game{
    public static void main(String [] args) {
        Random rand = new Random();
        int numb = rand.nextInt(10) + 1;
        System.out.println("Guess a number from 0-10. You have only 5 guesses. Good luck.( • ᴗ - ) ");
        Scanner sc = new Scanner(System.in);
        int i=1;
        int Guesses=5;
      while(i<=Guesses){
          int user = sc.nextInt();
          if(user==numb){
              System.out.println(
                      "Congratulations!(˶ᵔ ᵕ ᵔ˶) You guessed it right."

              );
          }

          else{
              System.out.println(
                      "Ohh no!(´•︵•`) You guessed it wrong! Try again.( • ᴗ - ) "
              );
              if(user>10){
                  System.out.println(
                          "Error: Your number should be between 0-10. Your number was "+ user
                  );
              }
              if(user<0){
                  System.out.println(
                          "Error: Your number should be between 0-10. Your number was "+ user
                  );
              }
              if(user>numb){
                  System.out.println(
                          "Hint: Your guessed number is larger. Go for a smaller number.( • ᴗ - )"
                  );
              }
              if(user<numb){
                  System.out.println(
                          "Hint: Your guessed number is smaller . Go for a larger number.( • ᴗ - )"
                  );
              }
          }
          i++;
      }

    }
}