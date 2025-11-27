package javatraining;
public class stringDemo {
    public static void main(String[] args) {
        String s1 = "One piece is real";
        String[] s2 = s1.split(" "); 
        
        for(String word : s2) {
            System.out.println(word);
        }
    }
}