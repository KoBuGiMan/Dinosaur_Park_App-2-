package dinosaur2;

import java.util.Arrays;
import java.util.Scanner;

public class Danger {
	Scanner sc = new Scanner(System.in);
	private String onOff;
	private String password;
	private String name;

	public Danger() {
		onOff = "off";
		name = "오너";
		password = "1234";
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getOnOff() {
		return onOff;
	}

	public void setOnOff() {
		System.out.println("해당 메뉴는 공원의 위험상황을 알리기 위해 존재하는 메뉴입니다.");
		System.out.println("본인인증을 위해 관리자 이름을 입력해주세요;");
		if (getName().equals(sc.next())) {
			System.out.println("본인인증을 위해 비밀번호를 입력해주세요");
			if (getPassword().equals(sc.next())) {
				onOff = "on";
				System.out.println("<<<<<<<현재는 비상사태입니다.>>>>>>>");
				System.out.println("공원내에 모든 관람객을 대피시키십시오.");
				System.out.println("공원내부의 직원들을 진행중인 업무를 중단하고");
				System.out.println("관람객대피에 총력을 다해주시기 바랍니다");

				return;
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
				return;
			}
		} else {
			System.out.println("관리자 이름이 일치하지 않습니다.");
			return;
		}

	}

	public void setOner() {
		System.out.println("관리자 정보를 바꾸시겠습니까? (네/아니요)");
		String ans = sc.next();
		if (ans.equals("네")) {
			System.out.println("현재 저장된 관리자의 이름을 입력하세요:");
			if (getName().equals(sc.next())) {
				System.out.println("현재 저장된 관리자의 비밀번호를 입력하세요:");
				if (getPassword().equals(sc.next())) {
					System.out.println("인증이 완료하였습니다.");
					System.out.println();
					System.out.println("변경할 관리자의 이름을 입력하세요:");
					setName(sc.next());
					System.out.println("변경할 관리자의 비밀전호를 입력하세요:");
					setPassword(sc.next());
					System.out.println();
					System.out.println("<<<변경할 정보가 일치하는지 확인해주세요>>>");
					System.out.println();
					System.out.println("////////////////////////////////");
					System.out.println("관리자이름: " + getName());
					System.out.println("관리자 비밀번호: " + getPassword());
					System.out.println("////////////////////////////////");
					return;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
					return;
				}
			} else {
				System.out.println("이름이 일치하지 않습니다.");
				return;
			}
		} else {

			return;
		}
	}

	public void onerAll() {
		NewDino dino = new NewDino();
		Employee employee = new Employee();
		Ticket ticket = new Ticket();
		System.out.println();
		System.out.println("////////////////////////////////////////");
		System.out.println("!!현재 메뉴는 모든 정보를 조회하는 메뉴입니다.!!");
		System.out.println("보안에 유의해주세요.");
		System.out.println("////////////////////////////////////////");
		System.out.println();
		System.out.println("관리자의 이름을 입력해주세요:");
		if (getName().equals(sc.next())) {
			System.out.println("관리자의 비밀번호를 입력해주세요:");
			if (getPassword().equals(sc.next())) {
				System.out.println("<<<<<< 통과 >>>>>>");
				System.out.println();
				System.out.println("<<<<<<<<<<<<<< 공룡 리스트 >>>>>>>>>>>>>>");
				System.out.println("//////////////////////////////////////");
				if (dino.getDinoList().length == 0) {
					System.out.println("등록된 공룡이 없습니다.");
				} else {
					for (int i = 0; i < dino.getDinoList().length; i++) {
						System.out.println((i+1)+"번 "+dino.getDinoList()[i]);
					}
				}
				System.out.println("//////////////////////////////////////");
				System.out.println();

				System.out.println("<<<<<<<<<<<<<< 직원 리스트 >>>>>>>>>>>>>>");
				System.out.println("//////////////////////////////////////");
				if (employee.getEmployeeList().length == 0) {
					System.out.println("등록된 직원이 없습니다.");
				} else {
					for (int i = 0; i < employee.getEmployeeList().length; i++) {
						System.out.println(employee.getEmployeeList()[i]);
					}
				}

				System.out.println("//////////////////////////////////////");
				System.out.println();
				
				System.out.println("<<<<<<<<<<<<<< 관람객 인원수 >>>>>>>>>>>>>>");
				System.out.println("//////////////////////////////////////");
				ticket.ticketNum();
				System.out.println("//////////////////////////////////////");
				System.out.println();
				System.out.println("<<<<<<<<<<<<<< VIP 조회 >>>>>>>>>>>>>>");
				System.out.println("//////////////////////////////////////");
				ticket.vipService();
				System.out.println("//////////////////////////////////////");
				System.out.println();
				System.out.println("<<<<<<<<<<<<<< 관리자 정보 >>>>>>>>>>>>>>");
				System.out.println("//////////////////////////////////////");
				System.out.println("관리자 이름: "+getName());
				System.out.println("관리자 비밀번호: "+getPassword());
				System.out.println("//////////////////////////////////////");
			
			}
		}

	}

}
