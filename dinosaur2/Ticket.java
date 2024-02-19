package dinosaur2;

import java.time.LocalDate;
import java.util.Scanner;

public class Ticket {
	Scanner sc = new Scanner(System.in);
	LocalDate date = LocalDate.now();
	int year;
	int month;
	int day;
	int ticketNum;
	private String name;
	int vipNum;

	public Ticket() {
		vipNum = 0;
		ticketNum = 0;
		year = date.getYear();
		month = date.getMonthValue();
		day = date.getDayOfMonth();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public void ticketAll() {
		String ans = null;
		do {
			if (ticketNum < 30000) {
				System.out.println("개표자의 성함을 입력해주세요:");
				setName(sc.next());
				System.out.println("-----------------------------------");
				System.out.println("<각 연령별 인원을 입력해주세요>");
				System.out.println("0세~7세  : 3000원");
				System.out.println("8세~19세 : 5000원");
				System.out.println("20세~60세: 7000원");
				System.out.println("60세~    : 4000원");
				System.out.println("-----------------------------------");
				System.out.println("0세~7세  :");
				int baby = sc.nextInt();
				System.out.println("8세~19세 :");
				int child = sc.nextInt();
				System.out.println("20세~60세:");
				int adult = sc.nextInt();
				System.out.println("60세~    :");
				int old = sc.nextInt();
				System.out.println();
				System.out.println("0세~7세: " + baby + "명");
				System.out.println("8세~19세: " + child + "명");
				System.out.println("20세~60세: " + adult + "명");
				System.out.println("60세~: " + old + "명");
				System.out.println("총액: " + (baby * 3000 + child * 5000 + adult * 7000 + old * 4000) + "원");
				System.out.println("입력된 인원이 정확한지 확인해주세요");
				System.out.println("(네/아니요)");
				ans = sc.next();
				if (ans.equals("네")) {
					System.out.println("//////////////////////////////");
					System.out.println("개표자: " + getName());
					System.out.println("날짜: " + year + "년" + month + "월" + day + "일");
					System.out.println("<입장인원>");
					System.out.println("0세~7세: " + baby + "명");
					System.out.println("8세~19세: " + child + "명");
					System.out.println("20세~60세: " + adult + "명");
					System.out.println("60세~: " + old + "명");
					System.out.println("총액: " + (baby * 3000 + child * 5000 + adult * 7000 + old * 4000) + "원");
					System.out.println("//////////////////////////////");
					ticketNum++;
				}
			} else {
				System.out.println("현재 인원이 초과되어 더이상 입장이 불가합니다.");
				return;
			}
		} while (ans.equals("아니요"));
	}

	public void ticketNum() {
		if (ticketNum < 30000) {
			System.out.println("현재인원: " + ticketNum + "명");
			System.out.println("입장가능인원: " + (30000 - ticketNum) + "명");
		} else if (ticketNum >= 30000) {
			System.out.println("현재인원: " + ticketNum + "명");
			System.out.println("현재 입장이 불가합니다.");
		}
	}

	public void vip() {
		String ans = null;
		do {
			if (ticketNum < 30000) {
				System.out.println("현재 메뉴는 VIP입장권 구매메뉴 입니다.");
				System.out.println("구매를 진행하시겠습니까? (네/아니요)");
				String vipAns = sc.next();
				if (vipAns.equals("네")) {
					System.out.println("개표자의 성함을 입력해주세요:");
					setName(sc.next());
					System.out.println("-----------------------------------");
					System.out.println("<각 연령별 인원을 입력해주세요>");
					System.out.println("0세~7세  : 7000원");
					System.out.println("8세~19세 : 10000원");
					System.out.println("20세~60세: 15000원");
					System.out.println("60세~    : 8000원");
					System.out.println("-----------------------------------");
					System.out.println("0세~7세  :");
					int baby = sc.nextInt();
					System.out.println("8세~19세 :");
					int child = sc.nextInt();
					System.out.println("20세~60세:");
					int adult = sc.nextInt();
					System.out.println("60세~    :");
					int old = sc.nextInt();
					System.out.println();
					System.out.println("0세~7세: " + baby + "명");
					System.out.println("8세~19세: " + child + "명");
					System.out.println("20세~60세: " + adult + "명");
					System.out.println("60세~: " + old + "명");
					System.out.println("총액: " + (baby * 7000 + child * 10000 + adult * 15000 + old * 8000) + "원");
					System.out.println("입력된 인원이 정확한지 확인해주세요");
					System.out.println("(네/아니요)");
					ans = sc.next();
					if (ans.equals("네")) {
						System.out.println("//////////////////////////////");
						System.out.println("개표자: " + getName());
						System.out.println("날짜: " + year + "년" + month + "월" + day + "일");
						System.out.println("<입장인원>");
						System.out.println("0세~7세: " + baby + "명");
						System.out.println("8세~19세: " + child + "명");
						System.out.println("20세~60세: " + adult + "명");
						System.out.println("60세~: " + old + "명");
						System.out.println("총액: " + (baby * 7000 + child * 10000 + adult * 15000 + old * 8000) + "원");
						System.out.println("//////////////////////////////");
						vipNum++;
						ticketNum++;
					}
				} else {
					System.out.println("현재 인원이 초과되어 더이상 입장이 불가합니다.");
					return;
				}
			}
		} while (ans.equals("아니요"));

	}
	
	public void vipService() {
		System.out.println("현재 공원 내 VIP고객의 수는 "+vipNum+"명 입니다.");
		for(int i=1;i<=vipNum;i++) {
			int ran = (int) (Math.floor(Math.random()*5)+1);
			String now = null;
			if(ran == 1) {
				now = "1동";
			}else if(ran == 2) {
				now = "2동";
			}else if(ran == 3) {
				now = "3동";
			}else if(ran == 4) {
				now = "4동";
			}else if(ran == 5) {
				now = "5동";
			}
			System.out.println("VIP "+ i +"번째 손님은 현재 "+now+"에 있습니다.");
		}
	}
}
