package com.biz.exec;

import com.biz.model.ScoreVO;

public class Exec_05 {

	public static void main(String[] args) {

		ScoreVO[] scores = new ScoreVO[20];

		for(int i = 0 ; i < scores.length; i++) {
			scores[i] = new ScoreVO();
		}
		
		for(int i = 0; i < scores.length; i++) {
			
		}
		//scores 배열 전체를 반복하면서
		//각각 요소를 vo에 담아라
		for(ScoreVO vo : scores) {
			System.out.println(vo.toString());
		}
		
		
		
		
	}

}
