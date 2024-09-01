package org.example.TechMahindra;

public class CheckBinaryNumberOrNot {

        public static boolean checkBinary(int number){
            if(number == 0 || number ==1 || number <0){
                return false;
            }

            while(number!=0){
                if(number % 10>1){
                    return false;
                }
                number/=10;
            }
            return true;
        }
        public static void main(String[] args) {
            int number = 10105;

            System.out.println("The binary number is " + checkBinary(number));
        }

}
