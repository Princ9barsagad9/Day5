public class Student {
    int sum=0;

    public int sum() {
        int[] marks={24,74,84,99,73,83,92};
        for(int mark:marks){
             sum= mark + sum;
        }
        return sum;
    }
}
