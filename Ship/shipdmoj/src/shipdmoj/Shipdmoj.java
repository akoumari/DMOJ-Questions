
package shipdmoj;
import java.util.*;
public class Shipdmoj {

    public static void main(String[] args) {
        String input = "";
        char[] missing = new char[5];
        boolean isPrez;
        boolean isStacked = false;
        int count = 0;
        char[] parts = {'B','F','T','L','C'};
        Scanner sc = new Scanner(System.in);
        input = sc.next();
        for(int i = 0; i < parts.length; i++){
            isPrez = false;
            for(int x = 0; x < input.length(); x++){
                if(input.charAt(x) == parts[i]){
                    isPrez = true;
                }
            }
            if(!isPrez){
                missing[count] = parts[i];
                count++;
                isStacked = true;                
            }
            
        }
        if(!isStacked){
            System.out.print("NO MISSING PARTS");
        }
        else{
            for(int i = 0; i < count; i++){
                System.out.print(missing[i]);
            }
        }
        
    }
    
}
