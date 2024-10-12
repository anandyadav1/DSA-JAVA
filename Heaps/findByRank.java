import java.util.Comparator;
import java.util.PriorityQueue;

public class findByRank {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name, int rank){
            this.name=name;
            this.rank=rank;
        }

        @Override
        public int compareTo(Student s){
            return this.rank-s.rank;
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,1,7,4,56,344,778,346,45,22};
        String b[]={"Adarsh","Arun", "Aman","Anand","andgf","uuqwujf", "hdughaus", "ajdbhy","qwytti","sjadkjhdf","adsgjh","ahdsgahsg"};
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0; i<arr.length; i++){
            pq.add(new Student(b[i], arr[i]));
        }
        System.out.println("Name      Rank");
        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name+"  "+pq.peek().rank);
            pq.remove();
        }
    }
}
