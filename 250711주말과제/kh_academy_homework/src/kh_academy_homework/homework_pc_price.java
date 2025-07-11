package kh_academy_homework;

public class homework_pc_price 
{
	public static void main(String[] args) 
	{
		// PC방 요금이 한 시간에 1200원입니다
		// 10시 15분에 들어온 손님이 16시 5분에 나가려고 할때 이 손님이 계산해야할 이용요금을 구하여 출력
		// 단, 요금은 1분 단위로 받으며 자정을 넘기지 않음
		
		// 시간당 요금
		int priceH = 1200;
		//분당 요금
		int priceM = priceH / 60;

		// 들어온 시간
		int comein_time = (10 * 60) + 15;
		// 나간 시간
		int goout_time = (16 * 60) + 5;
		// 머무른 시간
		int stay_time = goout_time - comein_time;
		
		// 총 요금
		int totalPrice = stay_time * priceM;
		
		System.out.println("피시방에서 머무른 시간은 " + stay_time +"분이며, 내야 하는 금액은 " + totalPrice + "입니다.");
	}

}
