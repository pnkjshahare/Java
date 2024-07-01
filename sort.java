class sort{
static void selectionSort(int []arr){
for(int i=0;i<arr.length;i++)
  {int min=i;
  for(int j=i;j<arr.length;j++){
  if(arr[min]>arr[j]){
  min=j;
  }
  }
  int temp=arr[min];
  arr[min]=arr[i];
  arr[i]=temp;
  }
  for(int i=0;i<arr.length;i++){
  System.out.println(arr[i]);
  }
  
}
public static void main(String args[]){
 int[] arr={0,34,12,90,78,34,1};
 selectionSort(arr);

}

}
