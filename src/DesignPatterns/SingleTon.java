package DesignPatterns;

public class SingleTon {


    public static SingleTon singleTon=new SingleTon();

    private SingleTon(){

    }

    public static synchronized SingleTon getSingleTon() {
        if(singleTon==null){
            System.out.println("singleton is null");
            singleTon=new SingleTon();
        }
        System.out.println("singleton instance has been created");
        return singleTon;
    }
}
