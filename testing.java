import java.util.Scanner;
import java.io.File;


public class testing{
    public static void main(String[] args)throws Exception{
 File info = new File("puzzle.txt");
        Scanner reader = new Scanner(info);
        String text = reader.nextLine();
        int count = 0;
        int index = 0;
        for(int i=0; count<10;i++){
            if(text.substring(i,text.length()-1).indexOf("giraffe") != 1){
                count++;
                i += text.substring(i,text.length()-1).indexOf("giraffe");
                index = i + 7;
            }
        }
  //      String keyword1 = text.substring(index);
     //   System.out.println(index + " " + count + " " + keyword1 );

        int maxLength = 1;
        int maxIndex = 0;
        int currentLength = 1;
        int currentIndex = 0;
        String previousChar = " ";
        String currentChar = " ";

        for(int a = 1; a<text.length(); a++){
                previousChar = text.substring(a-1, a);
                currentChar = text.substring(a, a+1);

                if(currentChar.equals(previousChar)){
                    currentLength++;
                }else{
                    if(currentLength>maxLength){
                        maxLength = currentLength;
                        maxIndex = currentIndex;
                    }
                    currentLength = 1;
                    currentIndex = a;
                }



        }
String keyword2 = text.substring(maxIndex + maxLength);
//System.out.print(keyword2);

int count2 = 0;
int maxVowel = 0;
int vowelIndex = 0;
String thirty = text.substring(0, 30);
for(int c=0;c+30<text.length();c++){
for(int b=0; b<30; b++){
    if(thirty.substring(b,b+1).equals("a") || thirty.substring(b,b+1).equals("e") || thirty.substring(b,b+1).equals("i") || thirty.substring(b,b+1).equals("o") || thirty.substring(b,b+1).equals("u")){
        count2++;
    }
 if(count2>maxVowel){
        maxVowel=count2;
        vowelIndex = c;
    }
}
thirty=text.substring(c, c+30);
count2=0;


}
vowelIndex+=29;
 String keyword3=text.substring(vowelIndex);
//System.out.println(keyword3);
//System.out.println(maxVowel);


  String palindrome = "";
int bestLength = 0;
int bestIndex = 0;
 boolean flag = false;
while (flag==false){
     for (int i = 0; i < text.length(); i++) {
            int bestOdd = 1;
            for (int j = 1; i - j >= 0 && i + j < text.length(); j++) {
                if (text.charAt(i - j) == text.charAt(i + j)) {
                    bestOdd += 2;
                } else {
                    break;
                }
            }

            int bestEven = 0;
            if (i + 1 < text.length() && text.charAt(i) == text.charAt(i + 1)) {
                bestEven = 2;
                for (int j = 1; i - j >= 0 && i + j + 1 < text.length(); j++) {
                    if (text.charAt(i - j) == text.charAt(i + j + 1)) {
                        bestEven += 2;
                    } else {
                        break;
                    }
                }
            }
            if (bestOdd == 11) {
                bestLength = bestOdd;
                bestIndex = i - bestLength / 2;
                System.out.println("Found 11-character palindrome: " + text.substring(bestIndex, bestIndex + bestLength));
                flag = true;
                System.out.println(bestIndex);
            }
            if (bestEven == 11) {
                bestLength = bestEven;
                bestIndex = i - bestLength / 2;
                System.out.println("Found 11-character palindrome: " + text.substring(bestIndex, bestIndex + bestLength));
                flag = true;
            }
        }

}
String keyword4 = text.substring(bestIndex);
System.out.println(keyword4);



      
        // welcome to your first coding puzzle of the course your second task and first keyword are located in the one hundred and twenty three characters after the tenth giraffe

      //armadillo 
      //your next task and keyword  are located in the one hundred and five characters after the longest string of the same consecutive character

      //penguin
      //your next task and keyword are located in the eighty characters after the string of length thirty with the most vowels


        //ostrich
        //your final keyword is located in the six characters after a palindrome of length eleven

        //yobananaboy 
        //badger
    }
}


