package t20230413;
// 읽은 정숫값의 부호(양수/음수/0)를 판정해서 표시
import java.util.Scanner;

public class Train05 {
class Sign {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정숫값:");
		int n = stdIn.nextInt();
		
		if (n > 0)
			System.out.println("값이 양수입니다.");
		else if (n < 0)
			System.out.println("값이 음수입니다.");
		else
			System.out.println("값이 0입니다.");

	}

}
}