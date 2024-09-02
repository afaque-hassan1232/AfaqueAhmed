/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MS COMPUTER
 */
import java.util.Arrays;
public class task4 {
    public static void main(String[] args) {
     // Excersice 1 search by Index
        /*
        int arr[]={13,26,39,52,65};
        int index =4;
        int element=arr[index];
        System.out.println("Element at index "+index+" : "+element);
        */
// Excersice 2 linear Search 
/*
int arr[]={4,6,2,8,10};
int target=8;
boolean found=false;

for(int i=0; i<arr.length; i++){
if(arr[i] == target){
    System.out.println("Element "+target+" Found at Index "+i);
    found=true;
    break;
}
}
  if(found == false){
    System.out.println("Element "+target+"not found at index ");
}
*/
  // Excersice 3  Binary Search
  /*
  int []arr={11,22,33,44,55};
  int target=33;
  Arrays.sort(arr);

  int left=0;
  int right=arr.length-1;
  int middle;
  boolean found=false;
  while(left <= right){
      middle = left + (right-left) / 2;
  if(arr[middle] == target){
      System.out.println("Element "+target+" Found at index "+middle);
  found=true;
  break;
  }
  }
  if(found==false){
      System.out.println("Element "+target+" not Found");
  }
  */
  
    }
}
