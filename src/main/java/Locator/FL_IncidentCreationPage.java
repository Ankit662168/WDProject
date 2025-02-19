package Locator;

public class FL_IncidentCreationPage {
	public interface Incident_PageLocator{
		public String Languagedrpdown ="(//select[contains(@id,'Language')])[1]";
		public String Catgrydrpdown ="(//select[contains(@id,'Category')])[1]";
		public String Prodctctgrydrpdwn ="(//select[contains(@id,'productCategory')])[1]";
		public String Prctnamedrpdwn ="(//select[contains(@id,'productName')])";
		public String sbjctlinetxtfld ="(//input[contains(@id,'27_Incident.Subject')])";
		public String Descrptiontxtfld ="(//*[@id='rn_WDTextInput_28']//textarea)";
			
		
		
		
		
	}
}
