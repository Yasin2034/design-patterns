
public class Main {

	public static void main(String[] args) {
		
	 EagerSingleton eager = EagerSingleton.getInstance();
	 StaticBlockSingleton staticBlock = StaticBlockSingleton.getInstance();
	 LazySingleton lazy = LazySingleton.getInstance();
	 DoubleCheckedLockingSingleton doubleCheckLocking = DoubleCheckedLockingSingleton.getInstance();
	}

}
