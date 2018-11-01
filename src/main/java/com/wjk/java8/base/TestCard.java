package com.wjk.java8.base;

/**
 * 银行卡
 * @author h
 *
 */
public class TestCard {
	public static void main(String[] args) {

		//		checkCard(1);
		//		checkCard(2);
		//		checkCard(3);
		//		checkCard(4);

		System.out.println(checkBankCard(""));

	}

	public static void checkCard(int num) {

		String preCard = "";//前十位

		switch (num) {
		case 1:
			checkCardNum(preCard + "0000",10,0);
			break;
		case 2:
			checkCardNum(preCard + "000",100,10);
			break;
		case 3:
			checkCardNum(preCard + "00",1000,100);
			break;
		case 4:
			checkCardNum(preCard + "0",10000,1000);
			break;
		}

	}

	public static void checkCardNum(String preCard, int num,int pre) {
		String laCard = "";//后四位

		int count = 0;

		for (int i = pre; i < num; i++) {

			String card = preCard + i + laCard;

			boolean flag = checkBankCard(card);

			if(flag) {
				count++;
				System.out.println(card);
			}
		}

		System.out.println(count);
	}

	/**  
	 * 校验银行卡卡号  
	 * @param cardId  
	 * @return  
	 */   
	public static boolean checkBankCard(String cardId) {  
		char  bit = getBankCardCheckCode(cardId.substring( 0 , cardId.length() -  1 ));  
		if (bit ==  'N' ){  
			return false ;  
		}  
		return cardId.charAt(cardId.length() -  1 ) == bit;  
	}  

	/**  
	 * 从不含校验位的银行卡卡号采用 Luhm 校验算法获得校验位  
	 * @param nonCheckCodeCardId  
	 * @return  
	 */   
	public static char getBankCardCheckCode(String nonCheckCodeCardId){  
		if (nonCheckCodeCardId ==  null  || nonCheckCodeCardId.trim().length() ==  0   
				|| !nonCheckCodeCardId.matches("\\d+" )) {  
			//如果传的不是数据返回N   
			return 'N' ;  
		}  
		char [] chs = nonCheckCodeCardId.trim().toCharArray();  
		int  luhmSum =  0 ;  
		for ( int  i = chs.length -  1 , j =  0 ; i >=  0 ; i--, j++) {  
			int  k = chs[i] -  '0' ;  
			if (j %  2  ==  0 ) {  
				k *= 2 ;  
				k = k / 10  + k %  10 ;  
			}  
			luhmSum += k;             
		}  
		return  (luhmSum %  10  ==  0 ) ?  '0'  : ( char )(( 10  - luhmSum %  10 ) +  '0' );  
	} 
}
