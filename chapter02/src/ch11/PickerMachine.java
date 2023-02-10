package ch11;
import java.util.Random;
import java.util.Scanner;

public class PickerMachine {
   String productName;

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      // 경품 데이터 메모리에 올리기
      // 배열 사용하기
      // 기능 만들기
      // 랜덤 번호 1 ~ 3 하나 추출
      // 사용자 1 ~ 3 입력받기
      // 맞으면 --> 상품 전달
      // 틀리면 --> 다시 시도, 돈을 넣어라

      PickerMachine machine1 = new Bear();
      PickerMachine machine2 = new Money();
      PickerMachine machine3 = new ToyCar();

      PickerMachine[] machine = new PickerMachine[3];
      machine[0] = machine1;
      machine[1] = machine2;
      machine[2] = machine3;
      int userNumber=10;
      while (userNumber != 0) {
         System.out.println("어떤 숫자를 뽑으시겠습니까(안할거면 0~)");
         System.out.println("1번 , 2번 , 3번");
         Random random = new Random();
         int answer = random.nextInt(3)+1; // 1, 2, 3 중 하나 랜덤으로 나옴.
         userNumber = sc.nextInt();
         if (answer == userNumber && userNumber != 0) {
            System.out.println(machine[answer-1].productName + "을 뽑으셨네요~! 축하드립니다~");
            System.out.println("==========================");
         } else if (userNumber != answer && userNumber != 0) {
            System.out.println("아쉽네요~아무것도 뽑지 못하셨습니다.");
            System.out.println("==========================");
         }

      }
      System.out.println("==========================");
      System.out.println("게임을 종료합니다.");

      
            
      
   } // end of main
   
   

} // end of class


