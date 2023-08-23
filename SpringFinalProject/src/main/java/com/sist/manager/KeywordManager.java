package com.sist.manager;

import org.snu.ids.ha.index.Keyword;
import org.snu.ids.ha.index.KeywordExtractor;
import org.snu.ids.ha.index.KeywordList;

public class KeywordManager {
	public static void main(String[] args) {
		String keyword="예전부터 유명했던 안암동 분식집 \"고른햇살\" 주문할 때 음식에 들어가는 재료들 중 빼고 싶은 재료를 뺄 수있도록 선택지가 나와있어서 참 좋았습니다! 저는 '오이를 뺀 치즈김밥'을 선택했어요. 떡볶이도 '떡은 적고 오뎅이 많은 떡볶이'를 선택했습니다! 고른햇살 트레이드마크인 '흑미밥' 김밥에 달달 매콤한 떡볶이가 저의 분식 최애 조합입니다 ㅎㅎ";
		KeywordExtractor ke=new KeywordExtractor();
		KeywordList list=ke.extractKeyword(keyword, true);
		
		for(int i=0;i<list.size();i++)
		{
			Keyword wrd=list.get(i);
			System.out.println(wrd.getString()+":"+wrd.getCnt());
		}
	}
}
