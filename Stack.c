#include <stdio.h>
int MAXSIZE = 8;       
int stack[8];     
int top = -1;
//Check if stack is empty or not
int isempty() {

   if(top == -1)
      return true;
   else
      return false;
}
//Check stack is full or not
int isfull() {

   if(top == MAXSIZE)
      return true;
   else
      return false;
}
//retrun the topmost element in an array
int peek() {
   return stack[top];
}
//delete and return the topmost element
int pop() {
   int data;
   if(!isempty()) {
      data = stack[top];
      top = top - 1;   
      return data;
   } else {
      printf("Could not retrieve data, Stack is empty.\n");
   }
}
//insert elemnt at one end
int push(int data) {

   if(!isfull()) {
      top = top + 1;   
      stack[top] = data;
   } else {
      printf("Could not insert data, Stack is full.\n");
   }
}
