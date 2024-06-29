public class Minimum {
    public static int minimum(int numbers[] ){
    int minimum = Integer.MAX_VALUE;
    for(int i=0; i<numbers.length; i++){
        if(numbers[i]<minimum){
            minimum = numbers[i];
        }
    }
    return minimum;
}
    public static void main(String[] args) {
        int numbers[] = {433,351,46,-567,989,65,89,0, -3};
        System.out.println("Minimum = " + minimum(numbers));


    }
}
