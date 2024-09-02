/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MS COMPUTER
 */
public class task2 {
    public static void main(String[] args) {
  
        // Excersice 1 
        /*
        int []array=new int[6];
        System.out.println("Before the insertion ");
array[0]=12;
array[1]=24;
array[2]=36;
array[3]=48;
array[4]=60;

for(int i=0; i<array.length; i++){
    System.out.println(array[i]);
}

        
        
        int newelement=6;
        for (int i=array.length-1; i>0; i--){
            array[i]=array[i-1];
        }
        System.out.println("\n\n\n After the insertion of start \n");
        array[0]=newelement;
for(int i=0; i<array.length; i++){
    System.out.print(array[i]);
}
*/
        /*
        System.out.println("Before the insertion ");
        int []arr=new int[5];
        arr[0]=100;
        arr[1]=200;
        arr[2]=300;
        arr[3]=400;
   for(int i=0; i<arr.length; i++){
       System.out.print("("+arr[i]+")");
   }
   int newelement=250;
   int position=2;
   for(int i=arr.length-1; i>position; i--){
   arr[i]=arr[i-1];
   }
   arr[position]=newelement;
   System.out.print("\n\n After the insertion of middle \n");
      
for(int i=0; i<arr.length; i++){
    System.out.print("("+arr[i]+")");
}
*/
        System.out.println("Before the insertion ");
        int []arr=new int[6];
        arr[0]=3;
        arr[1]=6;
        arr[2]=9;
        arr[3]=12;
         arr[4]=15;
   for(int i=0; i<arr.length; i++){
       System.out.print("("+arr[i]+")");
   }
   int newelement=18;
  
   
   arr[arr.length-1]=newelement;
   System.out.print("\n\n After the insertion of End \n");
      
for(int i=0; i<arr.length; i++){
    System.out.print("("+arr[i]+")");
}
    }
    
}
