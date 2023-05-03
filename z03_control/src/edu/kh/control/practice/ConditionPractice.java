package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {

	public void practice1() {
		// 키보드로 입력 받은 정수가 양수이면서 짝수일 때만 "짝수입니다." 출력
		// 짝수가 아니면 "홀수입니다." 출력
		// 양수가 아니면 "양수만 입력해주세요."

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한개 입력 하세요 : ");
		int input = sc.nextInt();

//		if (input > 0 && input%2 == 0) {
//			System.out.println("짝수 입니다.");
//		}else if(input < 0)  {
//			System.out.println("양수만 입력해주세요.");
//			
//		}else {
//			System.out.println("홀수 입니다.");
//		}
		if (input < 0) {
			System.out.println("양수만 입력해주세요");

		} else {
			if (input % 2 == 0) {
				System.out.println("짝수 입니다.");

			} else {
				System.out.println("홀수 입니다.");
			}
		}

	}

	public void practice2() {
		// 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고
		// 합계와 평균을 계산하고
		// 합계와 평균을 이용하려 합격/ 불합격 처리하는 기능을 구현하세요.
		// (합격 조건 : 세과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)

		// 합격했을 경우 과목 별 점수와 합계, 평균, "축하합니다, 합격입니다!" 출력하고
		// 불합격인 경우에는 "불합격 입니다."를 출력하세요

		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();

		System.out.print("수학 점수 : ");
		int math = sc.nextInt();

		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();

		int sum = kor + math + eng;
		double avg = sum / 3;

		if (kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.print("합계 : " + sum + " ");
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다.");
		} else {
			System.out.println("불합격 입니다.");
		}

//		System.out.println("합계 : " + (kscore + mscore + escore));
//		System.out.println("평균 : " + (kscore + mscore + escore)/3);
//		
//		int sum = kscore + mscore + escore;
//		int avg = (kscore + mscore + escore)/3;
//		
//		if (avg >= 60) {
//			System.out.println("축하합니다, 합격입니다.");
//		}else {
//			System.out.println("불합격 입니다.");

	}

	public void Practice3() {

		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 12 사이의 정수 입력 : ");
		int month = sc.nextInt();

		int date = 0;

		switch (month) {

		case 1:
		case 3:
		case 7:
		case 8:
		case 10:
		case 12:
			date = 31;
			break;

		case 2:
			date = 28;
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			date = 30;
			break;

		default: {
			System.out.println("없는 달 입니다.");

		}
			System.out.println(month + "월은 " + date + "일까지 있습니다.");

		}

	}

	public void practice4() {

		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해 주세요 : ");
		double m = sc.nextDouble();

		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double kg = sc.nextDouble();

		double bmi = kg / (m * m);

		if (bmi < 18.5) {
			System.out.println();
		}
	}

	public void practice5() {
		// 중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
		// 평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
		// 이 때, 출석 회수는 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
		// 70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요

		Scanner sc = new Scanner(System.in);
		System.out.print("중간 고사 점수 : ");
		double midTerm = sc.nextDouble();

		System.out.print("기말 고사 점수 : ");
		double finalTerm = sc.nextDouble();

		System.out.print("과제 점수 : ");
		double homework = sc.nextDouble();

		System.out.print("출석 횟수 : ");
		double attendance = sc.nextDouble();

		if (attendance <= 20 * (1 - 0.3)) { // 30% 이상 결석
			System.out.println("Fail [출석 횟수 부족 (" + (int) attendance + "/20]");

		} else {

			midTerm *= 0.2;
			finalTerm *= 0.3;
			homework *= 0.3;
			attendance *= 5 * 0.2;

			// 합계
			double sum = midTerm + finalTerm + homework + attendance;

			System.out.printf("중간 고사 점수(20) : %.1f\n ", midTerm);
			System.out.printf("기말 고사 점수(30) : %.1f\n ", finalTerm);
			System.out.printf("과제 점수(30) : %.1f\n ", homework);
			System.out.printf("출석 점수(20) : %.1f\n ", attendance);
			System.out.printf("총점 : %.1f\n ", sum);

			if (sum >= 70) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail [점수미달]");
			}

		}

	}

}
