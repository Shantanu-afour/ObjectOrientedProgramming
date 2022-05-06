package Abstraction;
import java.util.Scanner;

public abstract class Stack {
	abstract void insert();
    abstract void push();
    abstract void pop();
    abstract void display();
    int size = 10, top = 0;
}
class StackDefine extends Stack{
    int a[] = new int[size];
    int n, data;
    Scanner sc = new Scanner(System.in);
    public void insert(){
        System.out.print("\nEnter the number of elements : ");
        n = sc.nextInt();
        System.out.println("Enter the elements : ");
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        top = n - 1;
    }
    public void push(){
        int push;
        System.out.println("Enter the element to push : ");
        push = sc.nextInt();
        top += 1;
        a[top] = push;
    }
    public void pop(){
        System.out.println("The element popped is: " + a[top]);
        n = top;
        top -= 1;
    }
    public void display(){
        System.out.println("Elements of stack: ");
        for (int i = top; i >= 0; i--)
            System.out.println(a[i]);
    }
}
