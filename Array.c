#include<stdio.h>
#include<stdlib.h>
struct Array{
    int *A;
    int length;
    int size;
}*a;
//Initialisation of struct Array pointer *a
void create(){
    a1=(struct Array*)malloc(sizeof(struct));
    a1->A=(int *)malloc(10*sizeof(int));
    a1->length=3;
    a1->A[0]=1;a1.A[1]=2;a1.A[2]=3;
}
//Displaying all elements of an array
void display(struct Array *a){
    int i;
    for(i=0;i<a->length;i++){
        printf("%d",a->A[i]);
    }
}
//Deleting element at given index from the array
int Delete(struct Array *a,int index){
    int i;
    int elem = a->A[index];
    for(i=index;i<a->length-1;i++){
        a->A[i] = a->A[i+1];
    }
    a->length--;
    return elem;
}
//Applying linear search for finding an element in the array
int lsearch(struct Array *a,int key){
    int i;
    for(i=0;i<a->length;i++){
        if(a->A[i]==key){
            return i;
        }
    }
    return -1;
}
//Applying binary search to find an element in the array
int Bsearch(struct Array *a, int key){
    int i,l,m,h;
    l=0;
    h=a->length-1;
    m=(l+h)/2;
    while(l<=h){
        if(a->A[m]==key){
            return m;
        }
        else if(key<a->A[m]){
             h=m-1;
        }
        else if(key>a->A[m]){
           l=m+1;
        }
    }
    return -1;
}
//Get an element at a given index
int Get(struct Array *a, int index){
    return a->A[index];
}
//Set an element at a given index
void Set(struct Array *a, int index, int key){
    a->A[index] = key;
}
//Get maximum element in the array
int getMax(struct Array *a){
    int max, i;
    max=a->A[0];
    for(i=1;i<a->length;i++){
        if (max<a->A[i])
        {
            max = a->A[i];
        }    
    }
    return max;
}
//Get minimum element in the array
int getMin(struct Array *a){
    int min, i;
    min = a->A[0];
    for(i=1;i<a->length;i++){
        if(min>a->A[i]){
            min = a->A[i];
        }
    }
    return min;
}
//Sum up all the elements in the array
int getSum(struct Array *a){
    int sum=0,i;
    for(i=0;i<a->length;i++){
        sum+=a->A[i];
    }
    return sum;
}
//Get sum of all the elements in the array recursively
int getSumRec(struct Array *a, int n){
    if(n<0){
        return 0;
    }
    else
    {
        return getSumRec(a,n-1)+a->A[n];
    }   
}
//Reverse all the elements of the array (Using new array)
int Reverse(struct Array *a){
    int *b,i,j;
    b = (int*)malloc(a->length*sizeof(int));
    for(i=a->length-1,j=0;i>=0;i--,j++){
        b[j] = a->A[i];
    }
    for(i=0;i<a->length;i++){
        a->A[i] = b[i];
    }
    free(b);
    return 1;
    
}
//Reversing array using original array only
int Reverse2(struct Array *a){
    int i,j,temp;
    for(i=a->length-1,j=0;i>j;i--,j++){
        temp=a->A[i];
        a->A[i]=a->A[j];
        a->A[j]=temp;
    }
    return 1;
}
//Insert element in a sorted array
int insertSorted(struct Array *a,int key){
    int i=a->length-1;
    if(a->length!=a->size){
    while(i>=0 && a->A[i]>key){
        a->A[i+1] = a->A[i];
        i--;
    }
    a->A[i+1] = key;
    a->length++;
    return 1;
    }
    else return -1;
}
//Check if array is sorted or not
int checkSorted(struct Array *a){
    int i;
    for(i=0;i<a->length-1;i++){
        if(a->A[i]>a->A[i+1]) return 0;
    }
    return 1;
}
//Shift all negative numbers on left side
void shiftNeg(struct Array *a){
    int i,j,temp;
    i=0;
    j=a->length-1;
    while (i<j)
    {
        while(a->A[i]<0){
            i++;
        }
        while(a->A[j]>=0){
            j--;
        }
        if(i<j){
            temp = a->A[j];
            a->A[j] = a->A[i];
            a->A[i] = temp;
        }
    }   
}
//Union two arrays
struct Array* Union(struct Array *a1,struct Array *a2){
    int i=0,j=0,k=0;
    struct Array *a3;
    a3=(struct Array *)malloc(sizeof(struct Array));
    a3->size = a1->size + a2 -> size;
    a3->A=(int *)malloc(a3->size*sizeof(int));
    while(i<a1->length && j<a2->length){
        if(a1->A[i]<a2->A[j]){
            a3->A[k]=a1->A[i];
            i++;
            k++;
            }
        else if(a1->A[i]>a2->A[j]){
            a3->A[k] = a2->A[j];
            j++;
            k++;
        }
        else{
            a3->A[k]=a1->A[i];
            i++;
            j++;
            k++;
        }
    }
    for(;i<a1->length;i++){
        a3->A[k++]=a1->A[i];
    }
    for(;j<a2->length;j++){
        a3->A[k++]=a2->A[j];
    }
    a3->length = k;
    return a3;
}
//Difference two arrays
struct Array* Difference(struct Array *a1,struct Array *a2){
    int i=0,j=0,k=0;
    struct Array *a3;
    a3=(struct Array *)malloc(sizeof(struct Array));
    a3->A=(int *)malloc(a3->size*sizeof(int));
    while(i<a1->length && j<a2->length){
        if(a1->A[i]<a2->A[j]){
            a3->A[k]=a1->A[i];
            i++;
            k++;
            }
        else if(a1->A[i]>a2->A[j]){
              j++;
            }
        else{
            i++;
            j++;
        }
    }
    for(;i<a1->length;i++){
        a3->A[k++]=a1->A[i];
    }
    a3->size = a1->size + a2 -> size;
    a3->length = k;
    return a3;
}
//Intersect two arrays
struct Array* Intersection(struct Array *a1,struct Array *a2){
    int i=0,j=0,k=0;
    struct Array *a3;
    a3=(struct Array *)malloc(sizeof(struct Array));
    a3->A=(int *)malloc(a3->size*sizeof(int));
    while(i<a1->length && j<a2->length){
        if(a1->A[i]<a2->A[j]){
            i++;
            }
        else if(a1->A[i]>a2->A[j]){ 
            j++;
        }
        else{
            a3->A[k]=a1->A[i];
            i++;
            j++;
            k++;
        }
    }
    a3->size = a1->size + a2 -> size;
    a3->length = k;
    return a3;
}
//Merge two arrays
struct Array* Merge(struct Array *a1,struct Array *a2){
    int i=0,j=0,k=0;
    struct Array *a3;
    a3=(struct Array *)malloc(sizeof(struct Array));
    a3->size = a1->size + a2 -> size;
    a3->length = a1->length + a2->length;
    a3->A=(int *)malloc(a3->size*sizeof(int));
    while(i<a1->length && j<a2->length){
        if(a1->A[i]<=a2->A[j]){
            a3->A[k]=a1->A[i];
            i++;
            k++;
            }
        if(a1->A[i]>=a2->A[j]){
            a3->A[k] = a2->A[j];
            j++;
            k++;
        }
    }
    for(;i<a1->length;i++){
        a3->A[k++]=a1->A[i];
    }
    for(;j<a2->length;j++){
        a3->A[k++]=a2->A[j];
    }
    return a3;
}
