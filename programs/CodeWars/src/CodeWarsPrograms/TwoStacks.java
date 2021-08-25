package CodeWarsPrograms;

import java.util.stream.IntStream;

public class TwoStacks {
    public static void main(String[] args) {

        TwoWayStact twoWayStact = new TwoWayStact(5);
        twoWayStact.push1(10);
        twoWayStact.push2(20);
        twoWayStact.push2(30);
        twoWayStact.push1(40);
        twoWayStact.push1(50);
        //twoWayStact.push1(60);
        twoWayStact.show();
        System.out.println("---------------");
        twoWayStact.pop1();
        twoWayStact.show();
        twoWayStact.pop1();
        twoWayStact.show();
        twoWayStact.pop1();
        twoWayStact.show();
        System.out.println("---------------");
        twoWayStact.pop2();
        twoWayStact.show();

    }
    static class TwoWayStact {
        int[] arr;
        int top1, top2;

        public TwoWayStact(int size) {
            this.arr = new int[size];
            top1 = 0;
            top2 = size - 1;
        }

        public void push1(int data) {
            if (top1 <= top2)
                arr[top1++] = data;
            else
                System.out.println("Stack overflow");
        }

        public void push2(int data){
            if(top1 <= top2)
                arr[top2--] = data;
            else
                System.out.println("Stack Overflow");
        }

        public int pop1(){
            int temp =0;
            if(--top1>=0){
                temp = arr[top1];
                arr[top1] =0;
            }else{
                System.out.println("Stack Underflow");
            }
            return temp;
        }
        public int pop2(){
            int temp =0;
            if(++top2 <=arr.length-1){
                temp = arr[top2];
                arr[top2] =0;
            }else{
                System.out.println("Stack Underflow");
            }
            return temp;
        }
        public void show(){
            int start = 0, end = arr.length-1;
            IntStream.rangeClosed(start, end).forEach(i -> System.out.println(arr[end-i]));
        }
    }
}
