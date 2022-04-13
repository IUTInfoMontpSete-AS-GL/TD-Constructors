package TestCardFactory;

import CardFactoryV2.*;

import java.util.Scanner;

public class App {

    public static void main (String [] args){

         Scanner scanner = new Scanner( System.in );
         System.out.println("Faire un choix : " +  "\n" +  "1 - VISA CREDIT  " + "\n" + "2 - VISA DEBIT  "
                 + "\n" +"3 - MC CREDIT  " + "\n" +"4 - MC DEBIT  " + "\n" );
         int choix = scanner.nextInt();
         if (choix == 1){
             VisaCredit c = new CreditCardCreator().createVisa();
             System.out.println(c.toString());
         }
         else if ( choix == 2 ){
             VisaDebit c = new DebitCardCreator().createVisa();
             System.out.println(c.toString());
         }

         else if (choix == 3){
            Card c=  new CreditCardCreator().createMC();
             System.out.println(c.toString());
         }

         else if (choix == 4 ){
             MCDebit c = new DebitCardCreator().createMC();
             System.out.println(c.toString());
         }
         else {
             System.out.println("erreur de choix ");
         }


    }
}
