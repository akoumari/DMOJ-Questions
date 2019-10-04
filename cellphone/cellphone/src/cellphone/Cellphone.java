package cellphone;
import java.util.*;


public class Cellphone {

    public static void main(String[] args) {
        int time = 0;
        String[] input = new String[100];
        int count = 0;
        boolean stop = false;
        int lastCharCode = 0;
        Scanner sc = new Scanner(System.in);
        while(!stop){
            input[count] = sc.next();
            if(input[count].compareTo("halt") == 0){
                stop = true;
            }
            else{
                count++;
            }
        }
        for(int i = 0; i < count; i++){
            
            for(int x = 0; x < input[i].length(); x++){
                int charCode = 0;
                if(((int)(input[i].charAt(x)) -96) >19){
                    charCode = ((int)(input[i].charAt(x)) -97);
                }
                else{
                    charCode = ((int)(input[i].charAt(x)) -96);
                }
                if((int)(input[i].charAt(x)) == 122 || (int)(input[i].charAt(x)) == 115){
                    time += 4;
                }
                else if(charCode%3 == 0){
                    time += 3;

                }
                else{
                    time += charCode%3;

                }
                if(x != 0 && (charCode == lastCharCode || (charCode/3 == lastCharCode/3 && lastCharCode%3 != 0))){
                    time += 2;

                }
                lastCharCode = charCode;
                
            }
            System.out.println(time);
            time = 0;
        }
    }
    
}
