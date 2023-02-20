package 형변환;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class 콜렉션확인문제 {

	public static void main(String[] args) {
			HashSet tour = new HashSet();
			tour.add("제주도");
			tour.add("부산");
			tour.add("대만");
			tour.add("싱가포르");
			tour.add("프랑스");
			System.out.println(tour);
			
			HashMap room = new HashMap(); 
			room.put("안방", "TV");
			room.put("거실", "쇼파");
			room.put("부엌", "냉장고");
			room.put("현관", "신발");
			System.out.println(room);
			System.out.println("현관에는 무엇이 있나요? " + room.get("현관"));
			room.replace("거실", "책상");
			System.out.println(room);
			
			ArrayList todayList = new ArrayList<>();
			todayList.add("자바공부");
			todayList.add("운동");
			todayList.add("자격증공부");
			todayList.add("쉬기");
			todayList.add("잠자기");
			System.out.println(todayList);
			System.out.println(todayList.get(0)+ ", " + todayList.get(todayList.size()-1));
			todayList.set(1, "청소");
			System.out.println(todayList);
}

}
