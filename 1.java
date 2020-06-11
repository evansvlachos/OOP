public class MyClass {
  public static void main(String[] args) {
   //VALUES 
   int GCP= 600;
   int OLD=601;

 /*FORM     
JLABEL lblName =new label ("");*/

import java.util.Scanner;  // Import the Scanner class

class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter gcp");
    int GCP = myObj.nextLine();  // Read user input
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter old");
    int old = myObj.nextLine();  // Read user input
    
    
    System.out.println("Username is: " + userName);  // Output user input
  }
}
    
    
  
//gcp select LOOP 
 if (GCP < OLD) {
  System.out.println("Depresion");
} 
else (GCP=OLD){
  System.out.println("stable");
}   
  else (GCP>OLD){
  System.out.println("growth");
}
    
  }
}
