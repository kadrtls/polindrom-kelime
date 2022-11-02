import java.util.Scanner;

public class Main {
    public static boolean isPolindrom(String word){
        int i=0,j=word.length()-1;
        while (i<j){
            if (word.charAt(i)!=word.charAt(j)){
                System.out.println(word+" polindrom bir kelime değil");
                return false;
            }
            i++;
            j--;
        }
        System.out.println( word+" polindrom bir kelime");
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Polindrom olup olmadığını kotrol edeceğiniz kelimeyi giriniz:");
        String word= scanner.next();
        isPolindrom(word);
    }
}