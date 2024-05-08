public class sumOdd {
    public static void main(String[] args) {
        System.out.println(sumOdd(1,10));
    }

    public static boolean isOdd(int number){
        boolean result = false;
        if (number < 0){
            result = false;
        }
        else if (number % 2 !=0) {
            result = true;
        }

        return result;
    }
    public static int sumOdd(int start, int end){
        int sum = 0;
        if((end < start) || (end<0 || start < 0)){
            sum = -1;
        }
        else{
            for(;start <= end;start ++){
                if(isOdd(start)){
                    sum +=start;
                }
            }
        }

        return sum;
    }
}
