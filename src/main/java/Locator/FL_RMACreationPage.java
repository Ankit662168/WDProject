package Locator;

public class FL_RMACreationPage {
	public interface RMA_PageLocator{
		//public String Regprodviewalllink ="(//*[@data-refid='registeredProducts' and contains(text(),'View All')])";
		public String Regprodviewalllink ="(//div[3]/div[1]/div[1]/button)";
		public String pagnitaor ="//*[@id='RegisteredProductsPaginator']";
		//public String clkng_rqstwrrntylink  ="//*[@id='regProductTable2']//tr[last()]//td[last()]//a[contains(text(),'Request')]";
		//public String clkng_rqstwrrntylink  ="(//*[@id='regProductTable2']//tr[1]//td[4]//a[contains(text(),'Request')])";
		public String clkng_rqstwrrntylink  ="(//div[2]/div[1]/table/tbody/tr[1]/td[4]/div/div[1]/a)";
		public String slct_rgprdctrdiobtn ="(//input[@value='1'])[2]";
		//public String Contnuebttn ="(//button[text()='Continue'])";
		public String Contnuebttn ="(//div[2]/div/div[1]/div/div[2]/div/button)";
		public String RmaReasondrpdwn ="(//*[@id='reason-select-0'])";
		
		
		
		
		
		
		
		
	}
}
