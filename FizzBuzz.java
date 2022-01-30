//Za uneti celobrojni nenegativan broj n, ispisati za sve brojeve od 1 do i zakljucno
// sa n nisku "Fizz" ako je on deljiv sa 3, nisku "Buzz" ako je on deljiv sa 5, a nisku
//"FizzBuzz" ako je on deljiv i sa 3 i sa 5.

package Domaci0312;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite neki broj: ");
        int broj = s.nextInt();

        int levaStrana = 1;

        for(levaStrana = 1; levaStrana <= broj; levaStrana++){
            if(levaStrana % 5 == 0 && levaStrana % 3 == 0){
                System.out.println(levaStrana + ":" + "FizzBuzz");
            }
            else if(levaStrana % 5 == 0){
                System.out.println(levaStrana + ":" + "Buzz");
            }
            else if(levaStrana % 3 == 0){
                System.out.println(levaStrana + ":" + "Fizz");
            }
            else{
                System.out.println(levaStrana + ":" );
            }
        }

        System.out.println("Kraj programa.");


    }
}

