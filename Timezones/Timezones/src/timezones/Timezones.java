// DMOJ Qeustion: CCC '09 J3 - Good Times
//https://dmoj.ca/problem/ccc09j3
package timezones;
import java.util.*;
public class Timezones {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String[] city = {"Ottawa","Victoria","Edmonton","Winnipeg","Toronto","Halifax","St. John's"};
    	int[] timeDif = {0, -300, -200,-100,0,100,130};
    	int time = sc.nextInt();
    	for(int x = 0; x < city.length;x++) {
    		int localTime = time + timeDif[x];
    		if(localTime>2400) {
    			localTime-= 2400;
    		}
    		else if(localTime<0) {
                localTime= 2400 - timeDif[x] + time;
    		}
    		if(timeDif[x] > 0 && localTime%100 > 60) {
    			localTime += 40;
    		}
    		if(timeDif[x] < 0 &&localTime%100 > 60) {
    			localTime -= 40;
    		} 
    		System.out.println(localTime +" in " + city[x]);
        }
    } 
}
