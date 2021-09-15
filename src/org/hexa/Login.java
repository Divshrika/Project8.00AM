package org.hexa;

public class Login {

	private void empId(int id) {
		System.out.println("Employee id:" + id);
	}

	private void empId(long id) {
		System.out.println("College id:" + id);
	}

	private void empId(String id) {
		System.out.println("Driving License id:" + id);
	}

	public static void main(String[] args) {
		Login e = new Login();
		e.empId(10000);
		e.empId(1025463258l);
		e.empId("TN05D5486597");

		e.empId(20000);
		e.empId(203256458756l);
		e.empId("TN04E87956812");
		
		e.empId(25000);
		e.empId(30256489752l);
		e.empId("TN08F87958685");
	}
}
