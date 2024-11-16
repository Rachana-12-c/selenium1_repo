package dataprovider;

import org.testng.annotations.DataProvider;

public class DataStorage {
	@DataProvider
	public String[][] dataSender() {
		String logindata[][]= {
				{"admin","admin"},
				{"admin","ad"},
				{"ad","admin"},
				{"ad","ad"}
				};
		return logindata;
	}

}
