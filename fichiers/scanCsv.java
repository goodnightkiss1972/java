package fichiers;

import java.io.*;
import java.util.Scanner;

public class scanCsv
{
  public static void main(String args[])
  {
    try
    {
      // Le fichier d'entrée
      FileInputStream file;
      if (args.length == 1) {
         file = new FileInputStream(args[0]);
      }
      else {
        file = new FileInputStream("data1.txt");
      }
   
      Scanner scanner = new Scanner(file);  
      
      //renvoie true s'il y a une autre ligne à lire
      while(scanner.hasNextLine())
      {
        System.out.println(scanner.nextLine());
      }
      scanner.close();    
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }
  }
}