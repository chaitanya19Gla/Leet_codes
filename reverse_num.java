public class reverse_num {
    public static int reverse(int x){
        x = 123;
        int ans = 0;

        while (x!=0){
            int digit = x%10;
            if ((ans>Integer.MAX_VALUE/10) || (ans<Integer.MIN_VALUE/10)){
                return 0;

            }
            ans = (ans*10) + digit;
            x = x/10;
        }
        return ans;
    }


}
