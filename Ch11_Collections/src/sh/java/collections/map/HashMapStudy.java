package sh.java.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import sh.java.collections.student.Student;

/**
 * 
 * - HashMap 
 * - LinkedHashMap : 저장된 순서를 유지
 * - TreeMap : key값기준으로 정렬지원
 *
 */
public class HashMapStudy {

	public static void main(String[] args) {
		HashMapStudy study = new HashMapStudy();
//		study.test1();
//		study.test2();
		study.test3();
	}

	/**
	 * 커스텀클래스 객체를 Map으로 관리하기
	 * - key 커스텀객체의 고유한 필드값
	 * - value 커스텀객체
	 */
	private void test3() {
		Map<Integer, Student> studentMap = new HashMap<>();
		studentMap.put(1, new Student(1, "홍길동"));
		studentMap.put(2, new Student(2, "신사임당"));
		studentMap.put(3, new Student(3, "이순신"));
		
		// studentMap 열람하기
		
		// keySet
		Set<Integer> keySet = studentMap.keySet();
		// a. forEach
//		for(Integer key : keySet) {
//			Student value = studentMap.get(key);
//			System.out.println(key + " = " + value);
//		}
		// b. iterator
		Iterator<Integer> keyIter = keySet.iterator();
		while(keyIter.hasNext()) {
			Integer key = keyIter.next();
			Student value = studentMap.get(key);
			System.out.println(key + " = " + value);
		}
		
		
		// entrySet
		// a. forEach
		Set<Map.Entry<Integer, Student>> entrySet = studentMap.entrySet();
//		for(Map.Entry<Integer, Student> entry : entrySet) {
//			Integer key = entry.getKey();
//			Student value = entry.getValue();
//			System.out.println(key + " : " + value);
//		}
		// b. iterator
		Iterator<Map.Entry<Integer, Student>> entryIter = entrySet.iterator();
		while(entryIter.hasNext()) {
			Map.Entry<Integer, Student> entry = entryIter.next();
			int key = entry.getKey(); 
			// int -----> Integer  auto-boxing기능 지원
			// Integer -----> int  auto-unboxing기능 지원
			Student value = entry.getValue();
			System.out.println(key + " : " + value);
		}
		
	}

	/**
	 * 요소 열람 - Set 먼저 변환후에 열람이 가능
	 * 1. Map#keySet():Set<K> 키만 set으로 반환
	 * 2. Map#entrySet():Set<Entry<K,V>> Entry(키, 밸류)를 set으로 반환
	 * 
	 */
	private void test2() {
		Map<String, Integer> map = new HashMap<>();
		map.put("국어", 80);
		map.put("영어", 77);
		map.put("수학", 93);
		map.put("사회", 60);
		
		// 1. keyset()
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			Integer value = map.get(key);
			System.out.println(key + " 과목의 점수는 " + value + "점입니다.");			
		}
		
		// 2. entrySet():Set<Map.Entry<K,V>>
		// Map.Entry는 map의 요소의 부모인터페이스이다.
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		for(Map.Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value + "점");
		}
		
		
	}

	/**
	 * Map - HashMap
	 * - Map<K,V> 
	 * - key와 value로 하나의 요소를 구성
	 * - key는 중복될 수 없다.
	 * - key를 통해 value를 조회
	 * - 동일한 key로 다시 저장하면 value가 덮어써진다.
	 * 
	 */
	private void test1() {
		// Key - String, Value - Object를 타입제한
		Map<String, Object> map1 = new HashMap<>();
		HashMap<String, Object> map2 = new HashMap<>();
		
		// 요소추가
		map1.put("나이", 33);
		map1.put("나이", 20);
		map1.put("이름", "홍길동");
		map1.put("addr", "서울시 강남구 역삼동");
//		map1.put(123, "abc");
		
		// 요소조회
		System.out.println(map1.get("나이"));
		System.out.println(map1.get("addr"));
		
		// 삭제
		map1.remove("addr");
		
		// 요소의 개수
		System.out.println(map1.size());
		
		// 특정 key를 가지고 있는가?
		System.out.println(map1.containsKey("나이"));
		
		// 특정 Value를 가지고 있는가?
		System.out.println(map1.containsValue("홍길동"));
		
		// toString()
		System.out.println(map1);
		
	}

}
