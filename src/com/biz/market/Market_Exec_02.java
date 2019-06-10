package com.biz.market;

public class Market_Exec_02 {

	public static void main(String[] args) {

		//RiceMarket rm = new NewRiceMarket(); 상속한 클래스 = 상속받은 클래스
		RiceMarket rm = new NewRiceMarket();
		
		
		rm.iprice = 1000;
		rm.oprice = 1200;
		
		rm.margin();
		
		
	}

}
