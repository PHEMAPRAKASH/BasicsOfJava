package CarRentalSystem;

import java.util.List;

public class Car {

	private String carId;
	private String Name;
	private String Brand;
	private double basepricePerDay;
	private boolean isAvailable;

	public Car(String carId, String name, String brand, double basepricePerDay, boolean isAvailable) {
		super();
		this.carId = carId;
		Name = name;
		Brand = brand;
		this.basepricePerDay = basepricePerDay;
		this.isAvailable = isAvailable;
	}

	public String getCarId() {
		return carId;
	}

	public String getName() {
		return Name;
	}

	public String getBrand() {
		return Brand;
	}

	public double getBasepricePerDay() {
		return basepricePerDay;
	}

	public double calculatePrice(int rentalDays) {
		return basepricePerDay + rentalDays;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void rent() {
		isAvailable = false;
	}

	public void retrunCar() {
		isAvailable = true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Customer {
	private String customerId;
	private String name;

	public Customer(String customerId, String name) {
		this.customerId = customerId;
		this.name = name;
	}

	public String getCustomerId() {
		return customerId;
	}

	public String getname() {
		return name;
	}
}

class Rental {
	private Car car;
	private Customer customer;
	private int days;

	public Rental(Car car, Customer customer, int days) {
		super();
		this.car = car;
		this.customer = customer;
		this.days = days;
	}

	public Car getCar() {
		return car;
	}

	public Customer getCustomer() {
		return customer;
	}

	public int getDays() {
		return days;
	}

}

class CarrentalSystem {
	private List<Car> cars;
	private List<Customer> customers;
	private List<Rental> rental;
	
	public void addcar(Car car) {
		cars.add(car);
	}
	public void caddCustomers(Customer customer) {
		customers.add(customer);
	}
}
