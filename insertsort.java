package Sort;
/**
 * @author xiaolot
 * 插入排序
 */
public class insertsort {
    public static void main(String[] args){
        int[] array={7,21,23,15,2,6,3,0,28};
        print(array);
        sort1(array);
        print(array);
    }
    static void print(int[] array){

        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();

    }
    static void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    static void sort(int[] array){

        for(int end=1;end<array.length;end++){
            int newNumIndex=end;
            while( newNumIndex-1>=0 && (array[newNumIndex]<array[newNumIndex-1])){
                swap(array,newNumIndex,newNumIndex-1);
                newNumIndex--;
            }
        }
    }

    static void sort1(int[] array){
        for(int i=1;i<array.length;i++){
            for(int j=i-1;j>=0&&array[j]>array[j+1];j--){

                    swap(array,j,j+1);
            }
        }
    }
}
