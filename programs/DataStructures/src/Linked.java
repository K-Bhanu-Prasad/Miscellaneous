public class Linked {
    SinglyLinkedListNode num1 = new SinglyLinkedListNode();
    SinglyLinkedListNode num11 = new SinglyLinkedListNode();

     public void init(){


         num1.data = 2;
         SinglyLinkedListNode num2= new SinglyLinkedListNode();
         num2.data = 3;
         num1.next = num2;

         num11.data = 9;
         SinglyLinkedListNode num12= new SinglyLinkedListNode();
         num12.data = 8;
         num11.next = num12;
         getSum(num1, num11);
     }


     public static int getcount(SinglyLinkedListNode node){
         SinglyLinkedListNode temp1 = node;
         int count = 0;
         while (temp1 != null)
         {
             count++;
             temp1 = temp1.next;
         }
         return count;
     }
    public static SinglyLinkedListNode getSum(SinglyLinkedListNode num11, SinglyLinkedListNode num12) {

        int firstNumber =0;
        int secondNumber =0;
        int sum = 0;
        int [] firstArray = new int[getcount(num11)];

        int [] secondArray = new int[getcount(num12)];
        SinglyLinkedListNode finalList= new SinglyLinkedListNode();

        for(int i= 0; num11 != null ; i++){
            firstArray[i] = num11.data;
            num11 = num11.next;
        }
        for(int i=firstArray.length-1; i>=0; i--){
            firstNumber = 10*firstNumber + firstArray[i];
        }
        for(int j= 0; num12 != null ; j++){
            secondArray[j] = num12.data;
            num12 = num12.next;
        }
        for(int j=secondArray.length-1; j>=0; j--){
            secondNumber = 10*secondNumber + secondArray[j];
        }
        sum = firstNumber + secondNumber;
        SinglyLinkedListNode temp  = finalList;
        while(sum!=0){
            temp.data = sum%10;
            sum/=10;
            temp.next = new SinglyLinkedListNode();
            temp = temp.next;
        }
        return finalList;

    }
}
