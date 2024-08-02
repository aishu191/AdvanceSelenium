package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StoreData1 {
	public class StoreData {
		@DataProvider(name="data")
		public Object[][] sender(){
			Object[][]obj=new Object[2][2];
			obj[0][0]="siya";
			obj[0][1]="piya";
			obj[1][0]="riya";
			obj[1][1]="kiya";
			return obj;
			
		}
	@Test(dataProvider="data")
	public void receiver(String data1,String data2) {
		System.out.println(data1);
		System.out.println(data2);
		
	}
}
}