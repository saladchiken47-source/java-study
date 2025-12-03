package ex0;

public class FizzBuzz {
    public void execute() {
        for (int i = 1; i <= 100; i += 1) {
            String result = getFizzBuzz(i);
            System.out.print(i);

            System.out.println(" "+result);
        }


    }

    private String getFizzBuzz(int n){
        if(n%15 == 0) {
            return "FizzBuzz";
        }
        else if(checkBizz(n)){
            if(n%3 == 0){
                return "FizzBizz";

            }
            return "Bizz";
        } else if(n%5== 0){
            return "Buzz";
        } else{
            return "other";
        }
    }

    private boolean checkBizz(int n){
        while(n>0){
            if(n%10==3){
                return true;
            }
            n/=10;
        }
        return false;
    }
}