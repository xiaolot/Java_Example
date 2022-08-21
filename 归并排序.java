package Sort;

public class 归并排序 {
    public static void main(String[] args){
        int[] array=new int[]{1,5,9,2,2,4};
        for(int i:array){
            System.out.print(i);
        }
        System.out.println("");
        merge(array,0,2,5);
        for(int i:array){
            System.out.print(i);
        }
    }

    public static void merge(int[] arr,int L, int M, int R){
        int[] help = new int[R-L+1];
        int index=0;
        int p1=L;
        int p2=M+1;
        while(p1<=M && p2<=R){
            if(arr[p1]<arr[p2]){
                help[index]=arr[p1];
                p1++;
                index++;
            }else{
                help[index]=arr[p2];
                p2++;
                index++;
            }
        }
        while(p1<=M){
            help[index]=arr[p1];
            p1++;
            index++;
        }
        while(p2<=R){
            help[index]=arr[p2];
            p2++;
            index++;
        }

        for(int i=0;i<help.length;i++){
            arr[L+i]=help[i];
        }
    }
}
