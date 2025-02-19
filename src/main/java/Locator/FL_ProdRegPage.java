package Locator;

public class FL_ProdRegPage {
	public interface SDprodreg_PageLocator{
		public String Regnewprdlink ="(//a//*[@id=\"Icon_Add\"])";
		//public String Regnewprdlink ="(//span[contains(text(),'Register')])";
		public String Wdtgglebttn ="(//*[@id='switchText'])";
		public String Branddrpdwn ="(//select[contains(@id,'brand')])[1]";
		public String Proddrpdown ="(//button[@type='button']/span)";
		public String Sandprodexpd ="(//*[@id='ygtvtableel2']//td[1])";
		public String Mp3prodexpnd ="(//*[@id='ygtvtableel3']//td[2])";
		public String SDclpjamexpnd ="(//*[@id='ygtvtableel18']//td[3])";
		public String EightGBexpnd ="(//*[@id='ygtvtableel24']//td[4])";
		public String BlackBexpnd ="(//*[text()='Pink'])";
		public String Serialtxtfld ="(//*[@name='Asset.SerialNumber'])";
		public String Firstnmetext ="(//*[@name='Contact.Name.First'])";
		public String Lastnmetext ="(//*[@name='Contact.Name.Last'])";
		public String Emailtext ="(//*[@class=\"rn_Email\"])";
		public String Countrydrpdwn ="(//select[contains(@id,'Country')])";
		public String Prchsedateclk ="(//input[contains(@id,'PurchasedDate')])";
		public String Purchsedate ="(//*[contains(@id,'datepicker')]//td[2]/a)";
		public String Placeprchgedrpdwn ="(//select[contains(@id,'PlaceOfPurchase')])";
		public String Sbmitbbtn ="(//button[contains(@id,'WDFormSubmit')])";
		public String Sdregsccspopup ="(//*[name()='svg'])[12]";			
		
		
	}
}
