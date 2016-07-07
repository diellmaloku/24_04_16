import javax.swing.*;
public class Figura7_8 {

/** alphabetize merr nje string ne menyre interaktive dhe paraqet fjalen me shkronja te renditura*/
   public String alphabetize(String s)
   { String answer = "";
      for ( int i = 0; i != s.length(); i = i + 1 )
      { answer = insertAlphabetically(s.charAt(i), answer); }
      return answer;
   }

   private String insertAlphabetically(char c, String alpha)
   { int index = 0; 
      boolean searching_for_c_position = true;
      while ( searching_for_c_position && index < alpha.length() )
      { 
         if ( c <= alpha.charAt(index) ) 
         { searching_for_c_position = false; }
         else { index = index + 1; }
      }
   
      return alpha.substring(0, index)
         + c + alpha.substring(index, alpha.length());
   }
   public static void main(String[]args)
   {Figura7_8 k= new Figura7_8();
      String s = JOptionPane.showInputDialog("shkruaje fjalen");
      JOptionPane.showMessageDialog(null,k.alphabetize(s));}
}