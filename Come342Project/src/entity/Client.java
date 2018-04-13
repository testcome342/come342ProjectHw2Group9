
package entity;
//gülsençakıcı
public class Client {
        private String Email;
	private String CompanyName;
	private String CompanyAddress;
	private String ContactName;
        public Client(){
        
        }
	public Client(String Email, String companyName, String companyAddress, String contactName){
            this.Email = Email;
	    this.CompanyName = companyName;     
	    this.CompanyAddress = companyAddress;
	    this.ContactName = contactName;     
	     
	}
        public void setEmail(String Email) {
            this.Email = Email;
	}
	public void setCompanyName(String CompanyName) {
            this.CompanyName = CompanyName;
	}
	public void setCompanyAddress(String CompanyAddress) {
            this.CompanyAddress = CompanyAddress;
	}
	public void setContactName(String ContactName) {
            this.ContactName = ContactName;
	}
        public String getEmail() {
            return Email;
	}
	public String getCompanyName() {
            return CompanyName;
	}
	public String getCompanyAddress() {
            return CompanyAddress;
	}
	public String getContactName() {
            return ContactName;
	}
	
}
