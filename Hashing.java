import java.util.Scanner;

/**
 *
 * @author Abe-r
 */
public class Hashing {
    static String hash(String s, int size, String chars) {
        String hash = "";
        int hash_array[] = new int[size];
        
        for(int i = 0; i < s.length(); i++) {
            for(int j = 0; j < size; j++) {
                int c = s.charAt(i);
                hash_array[j] = (hash_array[i] + c + j + i + size) % chars.length();
            }
        }
        
        for(int j = 0; j < size; j++) {
            hash += chars.charAt(hash_array[j]);
        }
        
        return hash;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int size;
        String chars;
        
        String input[] = in.nextLine().split(" ");
        
        size = Integer.parseInt(input[0]);
        chars = input[1];
        
        while(in.hasNext()) {
            System.out.println(hash(in.nextLine(), size, chars));
        }

    }
}
