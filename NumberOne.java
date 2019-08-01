package day03;

/**
 * @ClassName NumberOne
 * @Description TODO
 * @Auther danni
 * @Date 2019/8/1 9:17]
 * @Version 1.0
 **/

public class NumberOne {
    public int num(int x){
        int num1=0;
        int num2=0;
        //方法1
        for (int i = 0; i <32 ; i++) {
            if((x&(1<<i))!=0){
                num1++;
            }
        }
        //方法2
        while(x!=0){
                x=x&(x-1);
                num2++;
            }
        return num2;
    }
    public static void main(String[] args) {
     NumberOne one=new NumberOne();
        System.out.println(one.num(8));
        System.out.println(one.num(7));
    }
}
