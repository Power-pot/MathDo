package GCD;

public class ArjiliD_GCD{
    public void numberOfCD(int n){
        int b_math = 0;
        int c_math = 0;
        int count = 0;

        for(int  i = 2; i < n; i++){
            b_math = n;
            c_math = i;
            while(b_math % c_math != 0){
                int tmp = c_math;
                c_math = b_math % c_math;
                b_math = tmp;
            }

            if(c_math == 1){
                count++;
            }
        }

        System.out.println(count+1);
    }
}
