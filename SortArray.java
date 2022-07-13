import java.lang.reflect.Array;

public class SortArray {
    public static void main(String[] args) {
        int [] sort = {5,7,4,2,8,0,3,1,6,9};
        System.out.println("Initial array is:");
        for (int i=0; i<sort.length; i++) {
            System.out.println(sort[i]);
        }
        for ( int i=0; i<sort.length; i++){
            for (int j=i+1; j<sort.length; j++){

                if(sort[j]<sort[i]){
                    int buffer = sort[i];
                    sort[i] = sort[j];
                    sort[j]= buffer;
                }
            }
        }
        System.out.println("Sorted array is:");
        for (int i=0; i<sort.length; i++){
            System.out.println(sort[i]);
        }
    }
}
