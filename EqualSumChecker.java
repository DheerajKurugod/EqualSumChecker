public class EqualSumChecker {

    public static void main(String[] args) {

        boolean x = hasEqualSum(1,1,2);
        System.out.println(x);
    }

    public static boolean hasEqualSum(int var1, int var2, int var3){

                if((var1+var2)==var3){
            return true;
        }
        return false;

        //return ((var1+var2)==var3); this is also correct
    }
}




