public class QuizWork {

  public static void main(String[] args) {
    
    int [ ] sortArray = { 55, 22, 66, 44, 77, 11, 33 };
    
    int i;
    int j;
    int temp;
    char ch = 'a';
    for (i = 1; i < sortArray.length; i++) {
      // print out char
      System.out.printf("%c - ", ch);
      // create copy of i 
      j = i; 
      while (j > 0 && sortArray[j] < sortArray[j-1]) {
        // swap
        temp = sortArray[j];
        sortArray[j] = sortArray[j - 1];
        sortArray[j-1] = temp;
        j--;
      }
      // print out arr 
      for (int x = 0; x < sortArray.length; x++) {

        System.out.printf("%d", sortArray[x]);
        if (x == sortArray.length-1) break;
        System.out.print(", ");
      } System.out.println();
      // increment the character
      ch = (char)(((int)ch) + 1);
    }
  }
}
