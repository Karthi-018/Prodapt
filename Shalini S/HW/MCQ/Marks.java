public class Marks{
    char arr1[]={'a','c','d','b','b','d','b','b','b','a'};
    int total=0;
    int evaluate(char arr[]){
        for(int i=0;i<arr1.length;i++){
            if(arr[i]==arr1[i]){
                total+=1;
            }
        }
        return total;
    }

}
