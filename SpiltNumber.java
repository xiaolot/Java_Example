package Sort;
//快排

public class SpiltNumber {
    public static void splitNum(int [] arr){
        int N=arr.length;
        int lessArea=-1;
        int moreArea=N-1;
        int index=0;
        while (index <  moreArea){
            if(arr[index]<arr[N-1]){
                swap(arr,index++,++lessArea);
            }else if(arr[index]>arr[N-1]){
                swap(arr,index,--moreArea);
            }else if(arr[index]==arr[N-1]){
                index++;
            }
        }
        swap(arr,moreArea,N-1);
    }
    public static void swap(int[] arr,int i1,int i2){
        int temp=arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=temp;
    }

    public static int[] partition(int[]arr,int L,int R){
        int lessA=L-1;
        int moreA=R;
        int index=L;
        while (index <  moreA){
            if(arr[index]<arr[R]){
                swap(arr,index++,++lessA);
            }else if(arr[index]>arr[R]){
                swap(arr,index,--moreA);
            }else if(arr[index]==arr[R]){
                index++;
            }
        }
        swap(arr,moreA,R);

        int [] ans=new int[]{lessA+1,moreA};

        return ans;
    }

    public static void quickSort(int[] arr){
        if(arr==null||arr.length<2){
            return;
        }
        process(arr,0,arr.length-1);
    }

    public static void process(int[] arr,int L,int R){
        if(L>=R){
            return;
        }
        int[] midEqual=partition(arr,L,R);
        process(arr,L,midEqual[0]-1);
        process(arr,midEqual[1]+1,R);
    }

    public static int[] randomArray(int maxLen, int maxValue){
        int len=(int)(Math.random()*maxLen);
        int[] arr=new int[len];
        if (len>0){
            arr[0]=(int)(Math.random()*maxValue);
            for(int i=1;i<len;i++){
                do{
                    arr[i]=(int)(Math.random()*maxValue);
                }while(arr[i]==arr[i-1]);
            }
        }

        return arr;
    }

    public static int[] copyArray(int [] arr){
        int [] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=arr[i];
        }
        return ans;
    }

    public static boolean isEqual(int[] arr1,int[] arr2){
        if(arr1.length!=arr2.length){
            return false;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=(arr2[i])){

                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        /*
        int [] arr1=randomArray(20,100);
        int [] arr3=copyArray(arr1);
        quickSort(arr1);
        sort(arr3);
        System.out.println(arr1[0]);
        System.out.println(arr3[0]);
        System.out.println(isEqual(arr1,arr3));
        for(int l:arr1){
            System.out.print(l+" ");
        }
        System.out.println("");
        for(int J:arr1){
            System.out.print(J+" ");
        }
        System.out.println("");
        */

        int testTime=500000;
        int maxSize=100;
        int maxValue=100;
        boolean succeed =true;
        System.out.println("Test begin");
        for(int i=0;i<testTime;i++){
            int [] arr1=randomArray(maxSize,maxValue);
            int [] arr3=copyArray(arr1);
            quickSort(arr1);
            insertsort.sort(arr3);
            if(!isEqual(arr1,arr3)){
                System.out.println(("Wrong!"));
                succeed=false;
                break;
            }
        }
        System.out.println("test end");
        System.out.println(succeed?"Nice!":"Oops!");
    }
}
