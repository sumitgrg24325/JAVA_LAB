class Demo{  
public static void main(String args[]){  
int a[]={1,2,3,4};
for(int i=0;i<a.length;i++) 
System.out.println(a[i]);  
}} 


Output:
1
2
3
4

class Demo{  
public static void main(String args[]){  
//declaring and initializing 2D array  
int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
for(int i=0;i<3;i++){  
 for(int j=0;j<3;j++){  
   System.out.print(arr[i][j]+" ");  
 }  
 System.out.println();  
}  
}}  

Output :
1 2 3
4 5 6
7 8 9
