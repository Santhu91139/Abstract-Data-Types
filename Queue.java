import java.util.Scanner;  
  
public class Queue_Data_Structure {  
  int SIZE_OF_QUEUE = 8;  
  int array_of_Queue[] = new int[SIZE_OF_QUEUE];  
  int front_index, rear_index;  
  Queue_Data_Structure() {  
    front_index = -1;  
    rear_index = -1;  
  }  
  
  boolean isFull() {  
    if (front_index == 0 && rear_index == SIZE_OF_QUEUE - 1) {  
      return true;  
    }  
    return false;  
  }  
  
  boolean isEmpty() {  
    if (front_index == -1)  
      return true;  
    else  
      return false;  
  }  
  
  void enQueue_Data_Structure(int element) {  
  
    if (isFull()) {  
      System.out.println("Queue_Data_Structure is full");  
    }  
    else {  
      if (front_index == -1) {  
        front_index = 0;  
      }  
      rear_index++;  
      array_of_Queue[rear_index] = element;  
      System.out.println("Inserted " + element);  
    }  
  }  
  
  int deQueue_Data_Structure() {  
    int element;  
  
    if (isEmpty()) {  
      System.out.println("Queue_Data_Structure is empty");  
      return (-1);  
    }  
    else {  
      element = array_of_Queue[front_index];  
  
      if (front_index >= rear_index) {  
        front_index = -1;  
        rear_index = -1;  
      }  
      else {  
        front_index++;  
      }  
      System.out.println( element + " Deleted");  
      return (element);  
    }  
  }  
  
  void display() {  
    int i;  
    if (isEmpty()) {  
      System.out.println("Empty Queue_Data_Structure");  
    }  
    else {  
      System.out.println("\nfront_index index-> " + front_index);  
  
      System.out.println("array_of_Queue -> ");  
      for (i = front_index; i <= rear_index; i++)  
        System.out.print(array_of_Queue[i] + "  ");  
  
      System.out.println("\nrear_index index-> " + rear_index);  
    }  
  }  
