package Sort;
/**
 * @author xiaolot
 * 冒泡排序
 */
public class maopaosort {
    public static void main(String[] args){
        int[] array={7,21,23,15,2,6,3,0,28};
        print(array);
        sort(array);
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
        int count=array.length-1;
        while(count>1){
            for(int i=0;i<count;i++){
                if(array[i]>array[i+1]){
                    swap(array,i,i+1);
                }
            }
            count--;
        }
    }
}
