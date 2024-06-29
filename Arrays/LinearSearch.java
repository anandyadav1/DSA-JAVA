
public class LinearSearch {
    public static int linearSearchsrch(int ele[], int key){
        for(int i=0; i<ele.length; i++){
            if(ele[i]==key){
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int ele[]={43, 56, 67, 33, 23, 67, 89, 12};
        int key=23;
        int index=linearSearchsrch(ele, key);
        System.out.println("Key is place at "+ "" +linearSearchsrch(ele, key));
        if(index == -1){
            System.out.println("Not found key");
        }else{
            System.out.println("found");
        }

    }
}
