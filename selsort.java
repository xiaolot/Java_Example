package Sort;
/**
 * @author xiaolot
 * 选择排序
 */
public class selsort {
    static void sort(int [] array){
        if(array==null||array.length<2){
            return;
        }
        for(int i=0;i<array.length;i++){
            int minIndex=i;
            for(int j=i+1;j<array.length;j++){
                minIndex=array[j]<array[minIndex]?j:minIndex;
            }
            swap(array,i,minIndex);

        }
    }
    static void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;

    }

    static void print(int[] array){

        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args){
        int[] array={7,21,23,15,2,6,3,0,28};
        print(array);
        sort(array);
        print(array);
    }

}
