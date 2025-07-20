import java.util.*;
class MinHeap{
    static List<Integer> arr = new ArrayList<>();
    public void hepify(int i){
        int leftChild=2*i+1;
        int rightChild=2*i+2;
        int par=i;
        if(leftChild<arr.size() && arr.get(par) < arr.get(leftChild)){
            par=leftChild;
        }
        if(rightChild<arr.size() && arr.get(par) < arr.get(rightChild)){
            par=rightChild;
        }

        if(par != i){
            int temp=arr.get(i);
            arr.set(i,arr.get(par));
            arr.set(par,temp);

            hepify(par);
        }
    }
    public int remove(){
        int data=arr.get(0);
        int temp=arr.get(0);
        arr.set(0,arr.get(arr.size()-1));
        arr.set(arr.size()-1,temp);

        arr.remove(arr.size()-1);

        hepify(0);

        return data;
    }
    public void add(int data){
        arr.add(data);
        int x=arr.size()-1;
        int par=(x-1)/2;
        while (arr.get(par) < arr.get(x)) {
            int temp=arr.get(x);
            arr.set(x,arr.get(par));
            arr.set(par, temp);
            x=par;
            par=(x-1)/2;
        }
    }

    public boolean isEmpty(){
        return arr.size()==0;
    }
}
public class maxHeaps {
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();
        minHeap.add(5);
        minHeap.add(2);
        minHeap.add(67);
        minHeap.add(1);
        minHeap.add(89);
        minHeap.add(15);
        minHeap.add(18);
        // System.out.println(minHeap.isEmpty());
        // System.out.println(minHeap.remove());
        // System.out.println(minHeap.remove());
        // System.out.println(minHeap.remove());
        // System.out.println(minHeap.remove());
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.remove());
        }
    }
}

