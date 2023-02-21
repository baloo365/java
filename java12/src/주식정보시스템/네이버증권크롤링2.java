package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링2 {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930");
		System.out.println("1. 네트워크 연결 성공." +con);
		
		Document doc = null; //로컬변수 초기화! 수동으로!
		
		try {
			doc = con.get(); //html 코드를 다 가지고 온다.!
			Elements codeList = doc.select(".code"); //
			System.out.println(codeList.size());
			
				System.out.println(codeList.size());
				Element tag = codeList.get(0); //tag추출
				//System.out.println(codeList);
				String code = tag.text();
				//<a class="nav">메일</a> ==> 태그 사이의 텍스트 추출
				System.out.println("코드는 " + code);
				//클래스가 nav인 태그를 다 가지고 와서 ArrayList를 상속받은 Elements에 자동으로 넣어준다.
				//[Element, Element, Element(tag)]
				
			
				Elements list = doc.select("span.blind"); //<span class="blind">
				System.out.println(list.size());
				System.out.println(list);
				for (int i = 0; i < list.size(); i++) {
					System.out.println(i + ": " + list.get(i));
				}
				System.out.println();
				System.out.println(list.get(12));
				Element tag2 = list.get(12);
				String today = tag2.text();
				System.out.println("현재가" +today);
				
				System.out.println(list.get(20));
				Element tag3 = list.get(20);
				String low = tag3.text();
				System.out.println("최저가" + low);
				
				System.out.println(list.get(16));
				Element tag4 = list.get(16);
				String high = tag4.text();
				System.out.println("최고가" + high);
				
			
		} catch (IOException e) {
			e.printStackTrace();
		}//html코드를 다 가지고 와서 doc변수에 넣어놨음.
	}

}
