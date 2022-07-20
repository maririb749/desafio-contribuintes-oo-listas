package entities;

public class TaxPayer {

	private Double salaryIncome;
	private Double serviceIncome;
	private Double capitalIncome;
	private Double healthSpending;
	private Double educationSpending;

	public TaxPayer() {

	}

	

	public TaxPayer(Double salaryIncome, Double serviceIncome, Double capitalIncome, Double healthSpending,
			Double educationSpending) {
		this.salaryIncome = salaryIncome;
		this.serviceIncome = serviceIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}
	
	


	public Double getSalaryIncome() {
		return salaryIncome;
	}



	public void setSalaryIncome(Double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}



	public Double getServiceIncome() {
		return serviceIncome;
	}



	public void setServiceIncome(Double serviceIncome) {
		this.serviceIncome = serviceIncome;
	}



	public Double getCapitalIncome() {
		return capitalIncome;
	}



	public void setCapitalIncome(Double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}



	public Double getHealthSpending() {
		return healthSpending;
	}



	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}



	public Double getEducationSpending() {
		return educationSpending;
	}



	public void setEducationSpending(Double educationSpending) {
		this.educationSpending = educationSpending;
	}



	public Double salaryTax() {
		Double monthSalary = salaryIncome / 12;
		if (monthSalary < 3000.0) {
			return 0.0;
		} else if (monthSalary > 3000.00 && monthSalary <= 5000.00) {
			return salaryIncome * 0.1;

		} else {
			return salaryIncome * 0.2;
		}

	}

	public Double servicesTax() {
		return serviceIncome * 0.15;
	}

	public Double capitalTax() {
		return capitalIncome*0.2;
	}


  public Double grossTax() {
	  return salaryTax() + servicesTax() + capitalTax();
}
  public Double taxRebate() {
	  Double spendigns = healthSpending + educationSpending;
	  Double maxRebate = grossTax() * 0.3;
	  return (spendigns < maxRebate) ? spendigns : maxRebate; 
	  
  }
  
  public Double netTax() {
	  return grossTax() - taxRebate();
  }
  
  @Override
  public String toString() {
	  return "Imposto bruto total:"
			  + String.format("%.2f", grossTax())
			  + "\nAbatimento: "
			  +String.format("%.2f", taxRebate())
			  +"\nImposto devido:"
			  + String.format("%.2f", netTax());
  }
}