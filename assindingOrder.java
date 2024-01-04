class assindingOrder{
public static void main(String args[]){
int a[] = {20,10,30,50,40};
System.out.println("Array Without Shorting: ");
for(int i=0;i<=4;i++){
System.out.println(a[i]);
}
System.out.println("Array After Shorting: ");
for(int i = 0;i<=4;i++){
for(int j = i+1;j<=4;j++){

if(a[i]>a[j]){
int temp = a[i];
a[i]=a[j];
a[j]=temp;
}}}
for(int i=0;i<=4;i++){
System.out.println(a[i]);
}

}
}


