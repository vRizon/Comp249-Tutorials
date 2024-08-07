public class GenericArray<T> {
    T data[]  = (T[]) new Object[10];

    int length=0;

    public void addData(T t){
        //
        data[length++]=t;
    }

    public void print(){
        for(T temp:data){
            System.out.println(temp);
        }
    }
}
