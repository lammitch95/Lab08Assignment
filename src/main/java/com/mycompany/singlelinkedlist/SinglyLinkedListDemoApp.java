
package com.mycompany.singlelinkedlist;

public class SinglyLinkedListDemoApp {
    
    public static boolean primeNumCheck(int num){
        if(num <= 1){
            return false;
        }else{
            
            for(int i = 2; i <= num/2; i++){
                if(num % i == 0){
                    return false;
                }
            }
            
            return true;
        }
        
    }
    
    public static boolean containThreeCheck(int num){
        
        while(num > 0){
            if(num % 10 == 3){
                return true;
            }
            
            num /= 10;
        }
        return false;
    }
    
    
    
   public static void main(String[] args) {
       
       LinkedList list1 = new LinkedList();
       LinkedList list2 = new LinkedList();
       int n = 100;
       
       for(int i = 0; i <= n; i++){
           if(primeNumCheck(i)){
               list1.append(new Node(i));
               
           }
       }
       System.out.print("All Prime Numbers from 0-n: ");
       list1.printList();
       
       Node nd = list1.getHead();
       while(nd != null){
           if(containThreeCheck(nd.data)){
               list2.append(nd);
           }
           nd = nd.next;
       }
       System.out.print("All Prime Numbers that contain 3: ");
       list2.printList();
      
       int sum = 0;
       nd = list2.getHead();
       while(nd != null){
           sum += nd.data;
           nd = nd.next;
       }
       System.out.println("SUM OF All Prime Numbers that contain 3: " + sum);
       
           
       
   }
}
