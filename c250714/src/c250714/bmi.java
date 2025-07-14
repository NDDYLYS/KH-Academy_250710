package c250714;

public class bmi 
{
	public static void main(String[] args) 
	{
		float tall = 1.8f;
		float weight = 80f;
		
		float bmi = weight / (tall * tall);
		
		System.out.println("키는 " + tall + "cm이며 체중은 " + weight + "kg인 사람의 BMI 수치는" + bmi + "입니다.");
	}
}
