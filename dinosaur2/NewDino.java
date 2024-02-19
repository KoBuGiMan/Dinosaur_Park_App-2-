package dinosaur2;

import java.util.Arrays;
import java.util.Scanner;

public class NewDino {
	Scanner sc = new Scanner(System.in);

	private String[][] dinoList;
	private String species;
	private String name;
	private String age;
	private String area;
	private String eat;

	public NewDino() {
		this.dinoList = new String[0][];
	}

	public String[][] getDinoList() {
		String[][] copyList = new String[dinoList.length][];
		for (int i = 0; i < copyList.length; i++) {
			copyList[i] = Arrays.copyOf(dinoList[i], dinoList[i].length);
		}
		return copyList;
	}

	public void setDinoList() {
		String ansRe = "미정";
		do {

			System.out.println("공룡의 종을 입력해주세요:");
			setSpecies(sc.next());
			System.out.println("공룡의 이름을 입력해주세요:");
			setName(sc.next());
			System.out.println("공룡의 나이를 입력해주세요:");
			setAge(sc.next());
			System.out.println("공룡의 구역을 입력해주세요:");
			setArea(sc.next());
			System.out.println("공룡의 식성을 입력해주세요:");
			setEat(sc.next());

			dinoList = Arrays.copyOf(dinoList, dinoList.length + 1);
			String[] newArr = new String[] { getSpecies(), getName(), getAge(), getArea(), getEat() };
			dinoList[dinoList.length - 1] = newArr;
			System.out.println(Arrays.deepToString(getDinoList()));

			System.out.println("공룡을 추가로 저장하시겠습니까? (네/아니요)");
			ansRe = sc.next();
		} while (ansRe.equals("네"));
	}

	public void removeDino() {
		System.out.println("공룡의 종을 입력해주세요:");
		setSpecies(sc.next());
		System.out.println("공룡의 이름을 입력해주세요:");
		setName(sc.next());
		dinoList = Arrays.copyOf(dinoList, dinoList.length);
		String[][] newArr = new String[dinoList.length - 1][];
		for (int i = 0; i < dinoList.length; i++) {
			if (dinoList[i][0].equals(getSpecies())) {
				if (dinoList[i][2].equals(getName())) {
					System.arraycopy(dinoList, 0, newArr, 0, i);
					System.arraycopy(dinoList, i + 1, newArr, i, dinoList.length - i - 1);
					dinoList = newArr;
				} else {
					continue;
				}
			}
		}
		System.out.println(Arrays.deepToString(dinoList));
	}

	public void findDino() {
		String ans;
		do {
		
		System.out.println("찾는공룡의 종을 입력하세요:");
		String spe = sc.next();
		System.out.println("찾는공룡의 이름을 입력하세요:");
		String name = sc.next();
		dinoList = Arrays.copyOf(dinoList, dinoList.length);
		String find;
		for(int i=0;i<dinoList.length;i++) {
			if(spe.equals(dinoList[i][0])) {
				if(name.equals(dinoList[i][1])) {
					int ran = (int) (Math.floor(Math.random()*5)+1);
					if(ran == 1) {
						find = "1구역";
					}else if(ran == 2) {
						find = "2구역";
					}else if(ran == 3) {
						find = "3구역";
					}else if(ran == 4) {
						find = "4구역";
					}else if(ran == 5) {
						find = "5구역";
					}else {
						System.out.println("error");
						return;
					}
					System.out.println("현재 "+ dinoList[i][1] + "은 "+ dinoList[i][3]+" "+find+"에 있습니다.");
				}else {
					continue;
				}
			}
		}
		System.out.println("다시 실행시키겠습니까? (네/아니요)");
		ans = sc.next();
	}while(ans.equals("네"));
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getEat() {
		return eat;
	}

	public void setEat(String eat) {
		this.eat = eat;
	}

}
