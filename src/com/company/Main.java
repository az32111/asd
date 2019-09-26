package com.company;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;
// for (자료형 변수=값; 변수&조건; 가감식)
public class Main {
//    public static void main(String[] args) {
//        for (int i = 1; i < 10; i++) {
//            System.out.println("ㅁㅁㅁ");
//        }
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("숫자를 입력하세요");
    int a = scanner.nextInt();
    if(a>0){
        for(int i=0; i <=a; i++){
            System.out.println(a-i);
        }
        System.out.println("뿡");
}

    }
}




        // 나이가 19세 이상이며, 내신점수 90점 이상인 사람은 카이스트
        // 나머지는 서울대
//        int age = 19
//        int score = 90
//      int(age >= 19 && score >= 90) {
//            System.out.println("카이스트");
//        }
//        System.out.println("서울대");

////Loop => 반복문 => 조건문 + 반복문 => 특정 조건을 만족할때까지 반복작업
////
//        int a = 1;
//        while (a<=100){
//            System.out.println("안녕하세요");
//            a++;
//        }



        // 스위치 (switch)
        // 월별로 계절을 출력하는 프로그램을 만들어보세요(입력한 숫자=>월)
        // 예) 11~2 겨울, 3~5 봄 6~8 여름, 9~10 가을
        // 9 를 입력하면 현재 계절을 가을 입니다.
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("현재 몇월 인가요?");
//        int a = scanner.nextInt();
//
//        switch (a) {
//            case 11:
//            case 12:
//            case 1:
//                System.out.println("현재 계절은 겨울입니다.");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("현재 계절은 봄 입니다.");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("현재 계절은 여름입니다.");
//                break;
//            case 9:
//            case 10:
//                System.out.println("현재 계절은 가을입니다.");
//                break;
//            default:
//                System.out.println("입력범위초과");
//        }
//    }
//}

//    public static void main(String[] args) {
//        // 스위치 (switch)
//        int a = 2;
//        switch (a) {
//            switch (a)
//            case 1:
//                System.out.println("1입니다.");
//                break;
//            case 2:
//                System.out.println("2입니다.");
//                break;
//            case 3:
//                System.out.println("3입니다.");
//                break;
//        }
//    }
//   Scanner scanner = new Scanner(System.in);
//    System.out.println("숫자를 입력해주세요")
//    int val = scanner.nextInt();
//    switch (val){
//        case 1:
//            System.out.println("1을 입력하였습니다.");
//            break;
//        case 2:
//            System.out.println("2을 입력하였습니다.");
//            break;
//        case 3:
//            System.out.println("2을 입력하였습니다.");
//            break;
//        case 4:
//            System.out.println("2을 입력하였습니다.");
//            break;
//        default:
  //  }
   // Scanner scanner = new Scanner(System.in);
  //  System.out.println("점수를 입력 하세요.");
  //  int score = scanner.nextInt();
   // if (score >= 0) {
  //  if (score >=0 && score <= 60) {
   //     System.out.println("학점 C ");
   // }}

//    public static void main(String[] args) {
//        //입력한 두 값(int) 중 큰 값을 출력하세요
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("값입력1");
//        int a = scanner.nextInt();
//        System.out.println("값입력2");
//        int b = scanner.nextInt();
//        int c = a > b? a : b;
//        System.out.println(c+"의 값이 제일 큰 값입니다.");
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("성적을 입력 하세요.");
//        int a = sc.nextInt();
//        if (100 <= a && 91 >= a) {
//            System.out.println("A 학점 입니다.");
//        } else if (90 <= a && 81 >= a) {
//            System.out.println("B 학점 입니다.");
//        } else if (70 <= a && 61 >= a) {
//            System.out.println("C 학점 입니다.");
//        } else if (60 <= a && 51 >= a) {
//            System.out.println("D 학점 입니다.");
//        } else {
//            System.out.println("F 학점 입니다.");
//
//        }
//    }
//}
//        Scanner scanner = new Scanner(System.in);
//        int score = scanner.nextInt();
//        if (score >= 0) ;
//        if (score >= 0 && score <= 50) {
//            System.out.println("학점 F");
//        } else if (score >= 51 && score <= 60) {
//            System.out.println("학점 D");
//        } else if (score >= 61 && score <= 70) {
//            System.out.println("학점 C");
//        } else if (score >= 71 && score <= 80) {
//            System.out.println("학점 B");
//        } else if (score >= 81 && score <= 90) {
//            System.out.println("학점 A");
//        } else if (score >= 91 && score <= 100) {
//            System.out.println("학점 A+");
//        } else {
//            System.out.println("입력범위에서 벗어난 값입니다. 다시 입력해주세요");
//        }
//    }
//}
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        if (a < b) {
//            System.out.println("나중이 더 큼");
//        } else if (a == b) {
//            System.out.println("두 수가 같음");
//        } else {
//            System.out.println("처음이 더 큼");
//        }
//    }
//}

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        if (a % 2 == 0)
//            System.out.println("짝수 입니다.");
//        else
//            System.out.println("음수 입니다.");
//    }
//}









//    public static void main(String[] args) {
//        // 입력값(숫자)을 받아서 입력한 숫자가 양수인지 음수인지 판단하여 양수면
//        //"  입력한 값은 양수입니다" 라고 출력하고
//        //음수일 경우 "입력한 값은 음수입니다"라고 출력하도록 알고리즘을 짜보세요
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        if (a == 0) {
//            System.out.println("0 입니다.");
//        } else if (a < 0) {
//            System.out.println("음수 입니다.");
//        } else {
//            System.out.println("양수 입니다.");
//        }
//    }
//}

//    public static void main(String[] args) {
//        int tvprogram = 99;
//        if (tvprogram <= 15) {
//            System.out.println("15세 관람가입니다");
//        } else if (tvprogram<=16&&tvprogram>=19) {
//            System.out.println("청소년 관람가 입니다");
//        } else {
//            System.out.println("미성년자관람불가");
//        }
//    }
//}



//>=
//==
//!= <= not
//&& <= and
//|| <= or

//        int a = 10;
//        int b = 7;
//        if (a>b){
//            System.out.println("a가 더 큽니다");
//        }else{
//            System.out.println("b가 더 큽니다");
//        }
//    }
//}

//    public static void main(String[] args) {
////        // write your code here
////        //조건문
////        int val = 50;
////        if (val < 10){
////            System.out.println("성공");
////        }else{
////            System.out.println("실패");
////        }
//    public static void main(String[] args) {}
//    // write your code here
//    // 조건문
//    int age = 19;
//    if (age >=19){
//        System.out.println("성인");}
//    }else{
//        System.out.println("미성년");}
//}
//        // write your code here
//        // 조건문
//        // int i =  15라고 가정했을때 값이 15일 경우에는 "성공"이라고 출력하고 값이 15가 아닐 경우에는
//        //"실패"라고 출력되도록 코딩
////        int i = 15;
////        if (i == 15){
////        System.out.println("실패");
////    }else{
////            System.out.println("성공");
////        }
