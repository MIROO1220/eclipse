package ed.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	
	// 키보드로 입력 받은 정수가 양수이면서 짝수일 때만 "짝수입니다." 출력
	// 짝수가 아니면 "홀수입니다." 출력
	// 양수가 아니면 "양수만 입력해주세요."
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print( "숫자를 한개 입력하세요 : " );
		int input = sc.nextInt();
		
		if( !(input >= 0) ) {
			System.out.println( "양수만 입력해주세요." );
		}else {
			if( input %2 == 0 ) {
				System.out.println( "짝수입니다." );
			}else {
				System.out.println( "홀수입니다." );
			}
		}
	
	}
	
	
	// 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고
	// 합계와 평균을 계산하고
	// 합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
	// (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
	// 합격했을 경우 과목 별 점수와 합계, 평균, "축하합니다, 합격입니다!"를 출력하고
	// 불합격인 경우에는 "불합격입니다."를 출력하세요
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print( "국어점수 : " );
		int korScore = sc.nextInt();
		
		System.out.print( "수학점수 : " );
		int mathScore = sc.nextInt();
		
		System.out.print( "영어점수 : " );
		int engScore = sc.nextInt();
		
		int sum = korScore + mathScore + engScore;
		double average = sum/3;
		
		if( korScore >= 40 && mathScore >= 40 && engScore >= 40 && average >=60 ) {
			
			System.out.println( "국어점수 : " + korScore );
			System.out.println( "수학점수 : " + mathScore );
			System.out.println( "영어점수 : " + engScore );
			System.out.println( "합계 : " + sum );
			System.out.println( "평균 : " + average );
			System.out.println( "축하합니다. 합격입니다!");
			
		}else {
			System.out.println( "불합격입니다." );
		}
		
	}
	
	// 1~12 사이의 수를 입력 받아 해당 달의 일수를 출력하세요. (2월 윤달은 생각하지 않습니다.)
	// 잘못 입력한 경우 "-월은 잘못 입력된 달입니다."를 출력하세요. (switch문 사용)
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print( "1~12 사이의 정수 입력 : " );
		int month = sc.nextInt();
		
//		switch( month ) {
//		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//			System.out.println( month + "월은 31일까지 있습니다." );
//			break;
//		case 4: case 6: case 9: case 11:
//			System.out.println( month + "월은 30일까지 있습니다." );
//			break;
//		case 2: System.out.println( month + "월은 28일까지 있습니다."); break;
//		default : System.out.println( month + "월은 잘못 입력된 달입니다." );
//		}
		
		int date = 0;
		
		if( 1 <= month && month <= 12 ) {
			switch( month ) {
			case 2: date = 28; break;
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: date = 31; break;
			case 4: case 6: case 9: case 11: date = 30; break;
			}
			System.out.println( month + "월은 " + date + "일 까지 있습니다." );
		}else {
			System.out.println( month + "월은 잘못 입력된 달입니다." );
		}
	}
	
	
	// 키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
	// 저체중/정상체중/과체중/비만을 출력하세요.
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print( "키 입력 : " );
		double height = sc.nextDouble();
		
		System.out.print( "몸무게 입력 : " );
		double weight = sc.nextDouble();
		
		double BMI = weight / (height*height);
		
		if( BMI >= 30 ) {
			System.out.println( "고도 비만" );
		}else if( BMI >= 25 ) {
			System.out.println( "비만" );
		}else if( BMI >= 23 ) {
			System.out.println( "과체중" );
		}else if( BMI >= 18.5 ) {
			System.out.println( "정상체중" );
		}else {
			System.out.println( "저체중" );
		}
	}
	// 중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
	// 평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
	// 이 때, 출석 회수는 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산하세요. 
	// 70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print( "중간고사 점수 : " );
		double input1 = sc.nextDouble();
		
		System.out.print( "기말고사 점수 : " );
		double input2 = sc.nextDouble();
		
		System.out.print( "과제 점수 : " );
		double input3 = sc.nextDouble();
		
		System.out.print( "출석 횟수 : " );
		double input4 = sc.nextDouble();
		
		System.out.println( "====결과====" );
		
		double result1 = input1*0.2;
		double result2 = input2*0.3;
		double result3 = input3*0.3;
		double result4 = input4;
		
		double sum = result1+result2+result3+result4;
		
		if( input4<=20*0.7 ) {
			System.out.printf( "Fail[출석 횟수 부족 (%.0f/20)]", input4 );
		}else if( sum<70 ) {
			System.out.println( "중간고사 점수(20) : " + result1 );
			System.out.println( "기말고사 점수(30) : " + result2 );
			System.out.println( "과제 점수(30) : " + result3 );
			System.out.println( "출석 점수(20) : " + result4 );
			
			System.out.println( "총점 : " + sum );
			
			System.out.println( "Fail[점수미달]" );
		}else if( sum>=70 ) {
			System.out.println( "중간고사 점수(20) : " + result1 );
			System.out.println( "기말고사 점수(30) : " + result2 );
			System.out.println( "과제 점수(30) : " + result3 );
			System.out.println( "출석 점수(20) : " + result4 );
			
			System.out.println( "총점 : " + sum );
			
			System.out.println( "Pass" );
		}
		
		
	}

}

















