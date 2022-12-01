package chapter14.ex07;

public class Account {
	// 완료시간 : 1시 20분까지 , 메일발송
	
	private long balance = 1000;		// 예금의 잔고 초기값 1000
	
	BalanceException be1 = new BalanceException();
	BalanceException be2 = new BalanceException("예외메세지 : 잔고가 부족합니다.");
	
	public Account() {}			// 기본 생성자
	
	public long getBalance() {	// getter : 호출 시 balance 필드의 값을 리턴으로 돌려줌
		return balance;
	}
	
	// 입급 
	public void deposit(int money) {	// 기존의 잔고에서 money를 인풋받아 더하고 다시 필드에 적용 
		balance += money;
	}

	// 예외 처리 
	// 출금
	public void withdrow(int money) throws BalanceException {	
		// 잔고가 인풋받은 money보다 작은 경우 잔고 부족이라는 강제 예외를 발생시켜서
			// 예외메세지 : 잔고가 부족합니다. 라고 출력해주면 됨.
			// BalanceException <== 사용자 정의 예외를 생성해서 
			if(money < balance) {
				throw be2;
				
			} else {
				balance -= money;
				System.out.println(getBalance());
			} 
	}
}

class BalanceException extends Exception{
	public BalanceException() {
		super();
	}
	public BalanceException(String message) {
		super(message);
	}

		


public static void main(String[] args) {
		
		Account a1 = new Account();
		try {
			a1.withdrow(5000);
		} catch (BalanceException e) {
			System.out.println("잔액이 부족합니다.");
			e.printStackTrace();
		}
	}	
}
