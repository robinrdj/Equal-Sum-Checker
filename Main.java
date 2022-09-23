package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean isthesumisequaltofirsttwono = hasEqualSum(-1,-4,-5);
        System.out.println(isthesumisequaltofirsttwono);

    }
    public static boolean hasEqualSum(int one,int two, int three){
        if (one+two==three){
            return true;}
        else return false;
    }
}
