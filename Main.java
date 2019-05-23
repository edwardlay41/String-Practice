
public class Main
{

  public static void main(String[] args)
  {
    String word1 = "aabbCccddead12";
    String returned = remove_repeats(word1);
    System.out.println(returned);
  }
  
  //This method removes any duplicate letters that next to each other. Example aabccc becomes bc
  public static String remove_repeats(String word)
  {
    int length = word.length();
    StringBuilder builder = new StringBuilder(word);
    //loops through each letter of the word to look for repeating letters
    for(int i = 0; i < length - 1;)
    {
      //makes sure that upper case and lower case letters are treated the same
      if(Character.toUpperCase(builder.toString().charAt(i)) == Character.toUpperCase(builder.toString().charAt(i+1)))
      {
        builder.deleteCharAt(i);
        builder.deleteCharAt(i);
        length = length - 2; 
      }
      else
      {
      i++;
      }
    }
    return builder.toString();
  }
}
