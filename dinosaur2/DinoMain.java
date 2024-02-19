package dinosaur2;

import java.util.Scanner;

public class DinoMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NewDino dino = new NewDino();
		Employee employee = new Employee();
		Ticket ticket = new Ticket();
		Danger danger = new Danger();
		String ans = "미정";

		do {
			System.out.println();
			System.out.println("<<<<<<<<<< 메인 메뉴 >>>>>>>>>>");
			System.out.println("0번부터 10번까지 메뉴를 골라주세요.");
			System.out.println("1. 공룡추가");
			System.out.println("2. 공룡삭제");
			System.out.println("3. 공룡위치조회");
			System.out.println("4. 직원추가");
			System.out.println("5. 직원삭제");
			System.out.println("6. 티켓발권");
			System.out.println("7. 관람객조회");
			System.out.println("8. VIP티켓발권");
			System.out.println("9. VIP위치조회");
			System.out.println("10.비상버튼");
			System.out.println("11.관리자변경");
			System.out.println("12.전체조회");
			System.out.println("0. 메뉴종료");
			System.out.println("-----------------------------");
			int num = sc.nextInt();

			if (num == 1) {
				dino.setDinoList();
			} else if (num == 2) {
				dino.removeDino();
			} else if (num == 3) {
				dino.findDino();
			} else if (num == 4) {
				employee.setEmployeeList();
			} else if (num == 5) {
				employee.removeEmployee();
			} else if (num == 6) {
				ticket.ticketAll();
			} else if (num == 7) {
				ticket.ticketNum();
			} else if (num == 8) {
				ticket.vip();
			} else if (num == 9) {
				ticket.vipService();
			} else if (num == 10) {
				danger.setOnOff();
			} else if (num == 11) {
				danger.setOner();
			}else if(num == 12){
				danger.onerAll();
			}else {
				System.out.println();
				System.out.println("종료되었습니다.");
			}

			System.out.println("다시 실행하시겠습니까(네/아니요)");
			ans = sc.next();
		} while (ans.equals("네"));
		return;
	}

}
