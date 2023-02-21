package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 추출연습 {
//크롤링은 인터넷 문서(html)를 다 받아와서,
//html문서를 분석(parser, 파싱!)을 해서 내가 원하는 정보를 추출하는 것.
	public static void main(String[] args){
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930");
		//https://finance.naver.com/item/main.naver?code=041510
		System.out.println("네트워크 연결 성공" + con);
		
		
		Document doc = null; //로컬변수 초기화! 수동으로!
		try {
			//System.out.println(list);
			//for (int i = 0; i < list.size(); i++) {
			//	System.out.println(i + ": " + list.get(i));
			//}
			//System.out.println();
			doc = con.get(); //html코드를 다 가지고온다.!
			Elements nameList = doc.select(".wrap_company a");
			System.out.println(nameList);
			System.out.println(nameList.size());
			Element tag5 = nameList.get(0);
			String name = tag5.text();
			System.out.println("주식명은 " + name);
			

		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}