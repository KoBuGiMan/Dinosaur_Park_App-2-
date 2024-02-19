package dinosaur2;

import java.util.Arrays;
import java.util.Scanner;

public class Employee {

	Scanner sc = new Scanner(System.in);
	private String[][] employeeList;
	private String eName;
	private String age;
	private String job;
	private String work;

	public Employee() {
		employeeList = new String[0][];
	}

	public String[][] getEmployeeList() {
		String[][] newArr = new String[employeeList.length][];
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = employeeList[i];
		}
		return newArr;
	}

	public void setEmployeeList() {
		String ansRe = "미정";
		do {

			System.out.println("직원의 이름을 입력해주세요:");
			seteName(sc.next());
			System.out.println("직원의 나이를 입력해주세요:");
			setAge(sc.next());
			System.out.println("직원의 직업을 입력해주세요:");
			setJob(sc.next());
			System.out.println("직원의 작업내용을 입력해주세요:");
			setWork(sc.next());
			System.out.println("/////////");
			String[] newArr = new String[] { geteName(), getAge(), getJob(), getWork() };
			employeeList = Arrays.copyOf(employeeList, employeeList.length + 1);
			employeeList[employeeList.length - 1] = newArr;
			System.out.println(Arrays.deepToString(getEmployeeList()));
			System.out.println("직원을 추가로 저장하시겠습니까? (네/아니요)");
			ansRe = sc.next();
		} while (ansRe.equals("네"));
	}
	
	public void removeEmployee() {
		System.out.println("직원의 이름을 입력해주세요:");
		seteName(sc.next());
		System.out.println("직원의 직업을 입력해주세요:");
		setJob(sc.next());
		employeeList = Arrays.copyOf(employeeList, employeeList.length);
		String[][] newArr = new String[employeeList.length-1][];
		for(int i=0;i<employeeList.length;i++) {
			if(employeeList[i][0].equals(geteName())) {
				if(employeeList[i][2].equals(getJob())) {
					System.arraycopy(employeeList, 0, newArr, 0, i);
					System.arraycopy(employeeList, i+1, newArr, i, employeeList.length-i-1);
					employeeList = newArr;
				}else {
					continue;
				}
			}
		}System.out.println(Arrays.deepToString(employeeList));
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

}
