/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MS COMPUTER
 */
import java.util.ArrayList;
public class task6 {
    public static void main(String[] args) {
        
        System.out.println(isAnagram("listen","silent"));
    }
    private static boolean isAnagram(String str1,String str2){
    int count[]=new int[14];
    for(int i=0; i<str1.length(); i++){
      count[str1.charAt(i)]++;
      count[str2.charAt(i)]--;
    }
    for(int i=0; i<count.length; i++){
        if(count[i] !=0){
        return false;
        }
    
    }
    return true;
    }
}
