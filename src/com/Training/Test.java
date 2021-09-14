package com.Training;

public class Test {

    static int num;

    Test(){
        num++;
        //System.out.println(num);
    }
    void print(){
        //System.out.println(num);
    }

    public static void main(String[] args) {
            Test obj1=new Test();
            Test obj2=new Test();
            Test obj3=new Test();


            //obj1.print();

            double p;
            p=((double)10/100);
        //System.out.println(p);


        int[]arr1={1,3,5,7,9};
        int[]arr2={1,2,3,4,10};
        int[]arr3=new int[arr1.length+arr2.length];
        int num=0;
        int temp;

        for(int i =0;i<arr1.length;i++ ){
                arr3[num]=arr1[i];
                arr3[num+1]=arr2[i];
            num+=2;
        }
        for(int i=0;i<arr3.length;i++){
            for(int m=i+1;m<arr3.length;m++){
                if(arr3[i]>arr3[m]) {
                    temp=arr3[i];
                    arr3[i]=arr3[m];
                    arr3[m]=temp;
                }
            }
        }


        for(int i =0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }



        int num2=10;

        String str=Integer.toString(num2);

        //System.out.println("String: "+str);
    }


}
