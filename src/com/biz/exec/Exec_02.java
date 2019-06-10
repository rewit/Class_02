package com.biz.exec;

import com.biz.model.ScoreVO;
import com.biz.model.StudentVO;

public class Exec_02 {

	public static void main(String[] args) {

		StudentVO stVO = new StudentVO();
		ScoreVO scVO = new ScoreVO();
		
		stVO.number = "1";
		scVO.setkor(120);
		
		int intkor = scVO.getkor();

		scVO.setkor(-50);
		intkor = scVO.getkor();
		
		System.out.println("국어점수 : " + intkor );
		
	}

}
