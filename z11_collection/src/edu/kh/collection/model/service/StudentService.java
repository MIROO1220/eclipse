package edu.kh.collection.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.model.vo.Student;

public class StudentService {
	
	// 필드
	private Scanner sc = new Scanner(System.in);
	
	// 학생 정보를 저장할 List를 생성(객체 배열 Upgrade 버전)
	
	// java.util.List 인터페이스 : List에 반드시 필요한 필수 기능을 모아둔 인터페이스
	// * 인터페이스는 객체 생성 X, 부모 참조 변수 O
	
	// java.util.ArrayList : 배열 형태 List (가장 대표적인 List 자식 클래스)
	
	// ArrayList() 기본 생성자 : 기본 크기 10짜리 리스트 생성
	//					-> 하지만 리스트는 크기가 늘었다 줄었다 하기 때문에 큰 의미 없음
	
	// ArrayList(용량) : 용량 만큼의 리스트 생성
	// 					-> 너무 큰 값을 작성하면 메모리를 많이 소모함
	
	private List<Student> studentList = new ArrayList<Student>();
	
	 public StudentService() {

	      studentList.add(new Student("홍길동", 25, "서울시 중구", 'M', 90));
	      studentList.add(new Student("고영희", 23, "경기도 안산시", 'F', 100));
	      studentList.add(new Student("김아지", 30, "서울시 강남구", 'M', 80));
	      studentList.add(new Student("오미나", 27, "충북 청주시", 'F', 90));
	      studentList.add(new Student("박주희", 24, "서울 서대문구", 'F', 70));

	   }

	
	public void ex() {
		// List 테스트
		
		// List.add(Object e) : 리스트에 객체를 추가
		// * 매개변수 타입이 Object == 모든 객체 매개변수로 전달할 수 있음
		//	 (매개변수 Object == 최상위 부모 참조 변수 == 다형성 적용 가능)
		
		studentList.add( new Student() ); // 0번 인덱스
		//studentList.add( sc );			  // 1번
		//studentList.add( "문자열" );		  // 2번
		//studentList.add( new Object() );  // 3번
		// -> 컬렉션 특징 : 여러 타입의 데이터를 저장할 수 있다.
		
		// (반환형)
		// Object List.get(index i) : 리스트에서 i번째 인덱스에 있는 객체(Object)를 반환
		// 반환형이 Object == 모든 객체를 반환할 수 있다.
		
		System.out.println( studentList.get(0).toString() );
		// 실행 전 : String java.lang.Object.toString() == 정적 바인딩
		// 실행 후 : 알고 보니 0번째는 Student 객체이고, toString()이 오버라이딩 되어있음
		//			-> Student의 toString()이 수행됨 == 동적 바인딩
		
		// [Student의 이름만 얻어오기]
		// Student 객체가 맞는지 확인하고 다운 캐스팅을 해야
		// Student 기능을 사용할 수 있다.
		
		if( studentList.get(0) instanceof Student ) {
			System.out.println( ((Student)studentList.get(0)).getName() );
		}
		
		// -> 길고 복잡함
		// -> 컬렉션의 장점인 여러 객체 저장이 코딩에 방해됨
		
		// ****************** 그래서 등장했다 -> 제네릭스(Generics) ******************
		
		// (보통 제네릭이라고 함) <>
		// [제일 중요한 역할]
		// -> 컬렉션에 저장되는 객체타입을 한 가지로 제한
		
		System.out.println( studentList.get(0).getName() );
		
	}
	
	// 메소드 설명용 주석
	/**
	 * 메뉴 출력용 메소드(여기다 작성한 내용이 이클립스 설명으로 보임)
	 * @author 한미루
	 */
	public void displayMenu() {
		
		int menuNum = 0;
		
		do {
			
			System.out.println( "\n======== 학생 관리 프로그램 ========" );
			System.out.println( "1. 학생 정보 추가" );
			System.out.println( "2. 학생 전체 조회" );
			System.out.println( "3. 학생 정보 수정" );
			System.out.println( "4. 학생 정보 제거" );
			System.out.println( "5. 이름으로 검색(일치)" );
			System.out.println( "6. 이름으로 검색(포함)" );
			
			System.out.println( "0. 프로그램 종료" );
			
			System.out.print( "메뉴 번호 선택 >> " );
			
			try {
				menuNum = sc.nextInt();
				System.out.println(); // 줄바꿈
				
				switch( menuNum ) {
				 case 1: System.out.println( addStudent() );break;
		         case 2: selectAll(); break;
		         case 3: System.out.println(updateStudent());break;
		         case 4: System.out.println(removeStudent()); break;
		         case 5: searchName1(); break;
		         case 6: searchName2(); break;

				
				case 0: System.out.println( "<프로그램 종료>" ); break;
				default : System.out.println( "메뉴에 작성된 번호만 입력해주세요." );
				}
				
			}catch(InputMismatchException e) {
				System.out.println( "\nerror : 입력 형식이 유효하지 않습니다. 다시 시도해 주세요." );
				sc.nextLine(); // 입력 버퍼에 남아있는 잘못 입력된 문자열 제거
				menuNum = -1; // 첫 반복시 잘못 입력하는 경우 menuNum이 0을 가지고 있어 종료되는데
						      // 이를 방지하기 위해 임의값 -1을 대입
			}
			
		}while( menuNum !=0 );
	}
	
	 // 메소드 설명용 주석 
	   /**
	    * 메뉴 출력용 메소드(여기다 작성한 내용이 이클립스 설명으로 보임)
	    * @author user1
	    */
	   public void displayMunu() {
	      
	      int menuNum = 0;
	      
	      do {
	         
	         System.out.println("\n================ 학생 관리 프로그램 ================");
	         System.out.println("1. 학생 정보 추가");
	         System.out.println("2. 학생 전체 조회");
	         System.out.println("3. 학생 정보 수정");
	         System.out.println("4. 학생 정보 제거");
	         System.out.println("5. 이름으로 검색(일치)");
	         System.out.println("6. 이름으로 검색(포함)");

	         System.out.println("0. 프로그램 종료");
	         
	         System.out.print("메뉴 번호 선택 >> ");
	         
	         try {
	            menuNum = sc.nextInt(); 
	            System.out.println(); // 줄 바꿈
	            
	            switch(menuNum) {
	            
	            case 1: System.out.println( addStudent() );break;
	            case 2: selectAll(); break;
	            case 3: System.out.println(updateStudent());break;
	            case 4: System.out.println(removeStudent()); break;
	            case 5: searchName1(); break;
	            case 6: searchName2(); break;
	            
	            case 0: System.out.println("<프로그램 종료>"); break;
	            default : System.out.println("메뉴에 작성된 번호만 입력해주세요.");
	            
	            }
	            
	         } catch(InputMismatchException e) {
	            System.out.println("\nerror : 입력 형식이 유효하지 않습니다. 다시 시도해 주세요.");
	            
	            sc.nextLine(); // 입력 버퍼에 남아있는 잘못 입력된 문자열 제거
	            
	            menuNum =  -1; // 첫 반복 시 잘못 입력하는 경우 menuNum이 0을 가지고 있어 종료되는데
	                        // 이를 방지하지 위해 임의값 -1을 대입
	         }
	         
	      }while (menuNum != 0);
	      
	      
	   }
	   // 2023-03-16 1-1
	   /**
	   /* 1.학생 정보 추가 메소드
	    * - 추가 성공 시 "성공", 실패 시 "실패" 문자열 반환
	    */
	   public String addStudent() throws InputMismatchException{
	      
	      System.out.println("===== 학생 정보 추가 =====");
	      
	      System.out.print("이름 : ");
	      String name = sc.next();
	      
	      System.out.print("나이 : ");
	      int age = sc.nextInt();
	      sc.nextLine(); // 입력 버퍼 개행 문자 제거
	      
	      System.out.print("사는곳 : ");
	      String region = sc.nextLine();
	      
	      System.out.print("성별(M/F) : ");
	      char gender = sc.next().charAt(0);
	               // String -> char
	      
	      System.out.print("점수 : ");
	      int score = sc.nextInt(); // InputMismatchException
	      
	      // Student 객체 생성 후 List에 추가 
	      if(studentList.add(new Student(name,age,region,gender,score))) {
	         // boolean java.util.List.add(Student e)
	         // (반환형)               -> 제네릭 <Student> 때문에 List 타입이 Student로 제한됨
	         
	         // add()는 무조건 true 반환하기 때문에 
	         // 솔직히 실패하는 경우는 없음 
	         // 대신 예외가 발생해서 add() 수행 전 메소드가 종료될 순 있음 
	         
	         return "성공";
	      } else {

	         return "실패";
	      }
	       
	   }
	   
	   
	   
	   /**
	    * 2. 학생 전체 조회 메소드
	    */
	   public void selectAll() {
	      
	      // - List는 인덱스가 있다. (0번 부터 시작)
	      // - List에 저장된 데이터의 개수를 얻어오는 방법 : int List.size()
	      // -> 배열명.length 대신 사용
	      
	      // - List가 비어있는지 확인하는 방법 : 
	      // boolean java.util.List.isEmpty() : 비어있으면 true를 반환
	      
	      System.out.println("==== 학생 전체 조회 ====");
	      
	      // studentList가 비어있는 경우 "학생 정보가 없습니다." 출력
	      //if(studentList.size()==0) {
	      if(studentList.isEmpty()) {
	      
	         System.out.println("학생 정보가 없습니다.");
	         
	         return; // 현재 메소드를 종료하고 호출한 곳으로 돌아감 
	               // 단, 반환값은 없음 (void)
	      }
	      
	      /* 일반 for문
	      for(int i = 0; i < studentList.size(); i++) {
	         
	         System.out.println(studentList.get(i));
	         // sutdentList에서 i번째 인덱스 요소를 얻어와 출력
	         
	      }
	      */
	      
	      // 향상된 for문 (for each 문)
	      // - 컬렉션, 배열의 모든 요소를 순차적으로 반복 접근할 수 있는 for문
	      // (순차적 : 0번 인덱스부터 마지막 요소까지 인덱스를 1씩 증가)
	      
	      // [작성법]
	      // for( 컬렉션 또는 배열에서 꺼낸 한개의 요소를 저장할 변수 : 컬렉션명 또는 배열명){ }
	      int index = 0;
	      for( Student std : studentList ) {
	         // std에는 for문 반복 시 마다 0, 1, 2, ... 인덱스 요소들 한 번씩 저장됨 
	         
	         System.out.println((index++) +"번 : " ); // 후위연산 : 출력 후 연산증감! 
	         System.out.println(std);
	      } 
	      
	      /* 이렇게 사용하는 방법도 있다! 
	      for(int i = 0; i<studentList.size(); i++) {
	         
	         System.out.println(i+ "번 : " + studentList.get(i));
	         
	      }
	      */
	      
	   }
	   
	   
	   /**
	    * 3. 회원 정보 수정 메소드
	    */
	   public String updateStudent() throws InputMismatchException{
	      
	      // - Student List.set(int index, Student e)
	      // -> List의 i번째 요소를 전달 받은 e로 변경 
	      // -> 반환값 Student == 변경 전 Student 객체가 담겨있음 
	      
	      System.out.println("===== 학생 정보 수정 =====");
	      
	      System.out.print("인덱스 번호 입력 : ");
	      int index = sc.nextInt();
	      sc.nextLine();
	      
	      // 1) 학생 정보가 studentList에 있는가?
	      if(studentList.isEmpty()) {
	         
	         return "입력된 학생 정보가 없습니다.";
	         
	         // 2) 입력된 숫자가 0보다 작은가? (음수 검사)
	      } else if(index < 0) {
	         
	         return "음수는 입력할 수 없습니다.";
	               
	         // 3) 만약 문자열을 입력한 경우 -> throws로 예외 처리
	         
	         // 4) 입력 받은 숫자가 studentList 범위 내 인덱스 번호인가?
	      } else if(index >= studentList.size()) {
	         
	         return "범위를 넘어선 값을 입력할 수 없습니다.";
	               
	      } else {
	         
	         // 수정 코드 작성 
	         System.out.println(index + "번째 인덱스에 저장된 학생 정보");
	         System.out.println(studentList.get(index));
	         
	         System.out.print("이름 : ");
	         String name = sc.next();
	         
	         System.out.print("나이 : ");
	         int age = sc.nextInt();
	         sc.nextLine(); // 입력 버퍼 개행 문자 제거
	         
	         System.out.print("사는곳 : ");
	         String region = sc.nextLine();
	         
	         System.out.print("성별(M/F) : ");
	         char gender = sc.next().charAt(0);
	                  // String -> char
	         
	         System.out.print("점수 : ");
	         int score = sc.nextInt(); // InputMismatchException
	         
	         // 입력 받은 index번재에 새로운 학생 정보를 세팅 == 수정 
	         // 이때, index번재에 있던 기존 학생 정보가 반환된다.
	         Student temp = studentList.set(index, new Student(name,age,region,gender,score));
	         
	         return temp.getName() + "의 정보가 변경되었습니다.";
	         
	      }
	   }
	   
	   /**
	    * 학생 정보 제거 메소드
	    */
	   public String removeStudent() throws InputMismatchException{
	      
	      // - Student List.remove(int index)
	      //  리스트에서 index번째 요소를 제거 
	      //  이 때, 제거된 요소가 반환된다.
	      // * List는 중간에 비어있는 인덱스가 없게 하기 위해서 
	      //   remove() 동작 시 뒤쪽 요소를 한 칸씩 당겨온다.
	      
	      System.out.println("===== 학생 정보 제거 ======");
	      
	      System.out.print("인덱스 번호 입력 : ");
	      int index = sc.nextInt();
	      sc.nextLine();
	      
	      // 1) 학생 정보가 studentList에 있는가?
	      if(studentList.isEmpty()) {
	         
	         return "입력된 학생 정보가 없습니다.";
	         
	         // 2) 입력된 숫자가 0보다 작은가? (음수 검사)
	      } else if(index < 0) {
	         
	         return "음수는 입력할 수 없습니다.";
	               
	         // 3) 만약 문자열을 입력한 경우 -> throws로 예외 처리
	         
	         // 4) 입력 받은 숫자가 studentList 범위 내 인덱스 번호인가?
	      } else if(index >= studentList.size()) {
	         
	         return "범위를 넘어선 값을 입력할 수 없습니다.";
	               
	      } else {
	         
	         // 학생 정보 제거 
	         
	         System.out.print("정말 삭제 하시겠습니가??(Y/N) : ");
	         char ch = sc.next().toUpperCase().charAt(0);
	               // String -> 대문자 String -> 대문자 0번 인덱스 문자
	         
	               // String.toUpperCase() : 문자열을 대문자로 변경
	         
	         if(ch == 'Y') {
	            
	            Student temp = studentList.remove(index); 
	            return temp.getName() + "의 정보가 제거되었습니다.";
	            
	         } else {
	            
	            return "취소";
	         }
	      }
	   }
	   
	   
	   
	   
	   /**
	    * 이름이 일치하는 학생을 찾아서 조회하는 메소드 
	    */
	   public void searchName1() {
	      
	      System.out.println("===== 학생 검색(이름 일치) =====");
	      
	      System.out.print("검색할 이름 입력 : ");
	      String input = sc.next();
	      int index = 0;
	      // 향상된 for문
	      
	      boolean flag = true;
	      for(Student std : studentList) {
	         
	         if(input.equals(std.getName())) { // 이름이 일치하는 경우 
	            System.out.println(std);
	                                 // 동명이인이 있을 수도 있기에 break 사용X
	            flag =false;
	         } 
	      }
	   
	      if(flag) { // flag = true인 경우 == for문 내에 있는 if가 수행된적 없다.
	               // 검색 결과가 없다
	         System.out.println("검색 결과가 없습니다.");
	      }
	      
	   }
	   
	   /**
	    * 이름에 특정 문자열이 포함되는 학생을 찾아서 조회하는 메소드 
	    */
	   public void searchName2() {

	      System.out.println("===== 학생 검색(문자열 포함) =====");

	      System.out.print("이름에 포함되는 문자열 입력 : ");
	      String input = sc.next();
	      int index = 0;
	      
	      // 향상된 for문
	      boolean flag = true;
	      for(Student std : studentList) {

	         // contains : 포함
	         // boolean String.contains(문자열) : String에 문자열이 포함되어 있으면 true
	         if(std.getName().contains(input)) { // 이름이 일치하는 경우 
	            System.out.println(std);
	            
	            flag =false;
	         } 
	      }

	      if(flag) { // flag = true인 경우 == for문 내에 있는 if가 수행된적 없다.
	         // 검색 결과가 없다
	         System.out.println("검색 결과가 없습니다.");
	      }
	   }

	
}












