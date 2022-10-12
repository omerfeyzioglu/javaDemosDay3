package youTubeEgitim;

public class YouTubeDemo2 {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new Customer(), new CarCreditManager());
		customerManager.GiveCredit();
	}

	class CreditManager {
		void Calculate(int creditType) {
			// sonar qube
			if (creditType == 1) // esnaf
			{
			}
			if (creditType == 2)// ogretmen
			{

			}
		}

	}

	void Save() {

		System.out.println("kaydedildi");
	}
}

interface ICreditManager {

	void Calculate();

	void Save();

}

abstract class BaseCreditManager implements ICreditManager {
	public abstract void Calculate();

	public void Save() {
		System.out.println("kaydedildi");
	}

}

class TeacherCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void Calculate() {
		System.out.println("öğretmen kredisi hesaplandı");

	}

	@Override
	public void Save() {

	}

}

class MilitaryCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void Calculate() {
		System.out.println("asker kredisi hesaplandı");

	}

}

class CarCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void Calculate() {
		System.out.println("araba kredisi hesaplandı");

	}

}

// SOLID prencipels
class Customer {
	public Customer() {
		System.out.println("customer object is started");
	}

	private int id;

	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

class Person extends Customer {
	private String nationalIdentity;
	private String firstName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private String lastName;

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
}

class Company extends Customer {
	private String companyName;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	private String taxNumber;

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

}

class CustomerManager {
	private Customer customer;
	private ICreditManager creditManager;

	public CustomerManager(Customer customer, ICreditManager creditManager) {

		this.customer = customer;
		this.creditManager = creditManager;
	}

	public void Save() {
		System.out.println("customer saved : ");
	}

	public void Delete() {
		System.out.println("customer deleted : ");
	}

	public void GiveCredit() {
		creditManager.Calculate();
		System.out.println("kredi verildi");
	}

}
