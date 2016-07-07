import javax.swing.*;
public class Detyra7_2 {
	/*Program i cili heq shkronjat e dyfishta nga
    fjala e cila jepet ne menyre interaktive nga shfrutezuesi  */
   public String removeDuplicateLetters(String s)
   { String answer = "";
      for ( int i = 0; i != s.length(); i = i + 1 )
      
      { 
         if ( NotFound(answer, s.charAt(i)) )
         { answer = answer + s.charAt(i); }
      }
      return answer;
   }
   public boolean NotFound(String a, char c)
   { boolean b = true;
      for ( int j = 0; j != a.length(); j = j + 1 )
      { b = b && (c != a.charAt(j)); }
      return b;
   }
   public static void main(String[]args)   {
      Detyra7_2 k= new Detyra7_2();
      String fjala = JOptionPane.showInputDialog("shkruaj fjalen");
      JOptionPane.showMessageDialog(null,k.removeDuplicateLetters(fjala));
   
   }

}