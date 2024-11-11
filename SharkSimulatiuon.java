import java.util.Scanner;

class Shark {
private String name;
private int hunger;
private int cleanliness;

public Shark(String name) {
this.name = name;
this.hunger = 0; // 0: 배고프지 않음, 10: 매우 배고픔
this.cleanliness = 10; // 0: 더럽다, 10: 깨끗하다
}

public void feed() {
if (hunger > 0) {
hunger--;
System.out.println(name + "에게 먹이를 주었습니다. 현재 배고픔: " + hunger);
} else {
System.out.println(name + "은(는) 배고프지 않습니다.");
}
}

public void wash() {
if (cleanliness < 10) {
cleanliness++;
System.out.println(name + "을(를) 씻었습니다. 현재 청결도: " + cleanliness);
} else {
System.out.println(name + "은(는) 이미 깨끗합니다.");
}
}

public void status() {
System.out.println(name + "의 상태: 배고픔 = " + hunger + ", 청결도 = " + cleanliness);
}
}

public class SharkSimulation {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("상어의 이름을 입력하세요: ");
String sharkName = scanner.nextLine();
Shark shark = new Shark(sharkName);

while (true) {
System.out.println("\n1. 먹이주기");
System.out.println("2. 씻기기");
System.out.println("3. 상태 확인");
System.out.println("4. 종료");
System.out.print("원하는 작업을 선택하세요: ");
int choice = scanner.nextInt();

switch (choice) {
case 1:
shark.feed();
break;
case 2:
shark.wash();
break;
case 3:
shark.status();
break;
case 4:
System.out.println("게임을 종료합니다.");
scanner.close();
return;
default:
System.out.println("잘못된 선택입니다. 다시 선택하세요.");
}
}
}
}
