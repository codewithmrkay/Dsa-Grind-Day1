public class MyArray{
    //create an array 
    int[] arr;
    int index;
    public MyArray(int size){    
        arr = new int[size];
        index = 0;
    }
    public void add(int item){
        if(index==arr.length){
            System.out.println("arra is full boi");
            return;
        }
        arr[index]=item;
        index++;
    }
    public void print(){
        System.out.print("our array is : [ ");
        for(int i = 0;i<index;i++){
            if(i==index-1){
                System.out.print(arr[i]+"");                
            }
            else
            System.out.print(arr[i]+" ,");
        }
        System.out.print(" ]");
    }
    public void find(int val){
        for(int i =0;i<index; i++){
            if(arr[i]==val){
                System.out.println("item found at index : "+i);
                return;
            }
        }
        
    }
    public static void main(String[] args) {
       MyArray arr = new MyArray(5);
       arr.add(33);
       arr.add(52);
       arr.add(29);
       arr.add(77);
       arr.add(55);
       arr.print();
       arr.find(77);
    }
}