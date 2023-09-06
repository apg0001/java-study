package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int time = 10;
        int cost;
        boolean light = true;
        boolean disable = false;

        cost=time*4000;
        cost=cost>=30000?30000:cost;
        if(light||disable){
            cost/=2;
        }

        System.out.println("주차 요금은 "+cost+" 원입니다.");
    }
}