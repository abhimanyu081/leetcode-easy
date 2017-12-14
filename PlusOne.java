

public class PlusOne{
    public static void main(String[] args) {
        int[] digits = new int[]{9,9,9,9};
        print(plusOne(digits));
    }

    public static void print(int[] arr){
        for(int a :arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }

    public static int[] plusOne(int[] digits) {
        int carry=1;
        if(digits[digits.length-1]==0){
            digits[digits.length-1]=1;
            return digits;
        }
        for(int i=digits.length-1;i>=0;i--){
            int sum=digits[i]+carry;
            int res = sum%10;
            carry = sum/10;
            digits[i]=res;
        }
        if(carry!=0){
            int[] tempArr = new int[digits.length+1];
            for(int i=0;i<digits.length;i++){
                tempArr[i+1]=digits[i];
            }
            tempArr[0]=carry;
            return tempArr;
        }
        return digits;
        
    }
}