package assignment_2_pay_calc;

public class FooCorporation {

	public double get_total_pay(double hours, double base_pay) {
		double min_wage = 8.0;
		double reg_hourly_pay = base_pay * hours;
		double reg_hourly_total = 0;
		double max_reg_hours = 40;
		double hours_worked_overtime;
		double normal_pay;
		double overtime_pay;
		double total_with_overtime;
		
		if (base_pay < min_wage) System.out.println("Base pay is below minimum wage!");
		if (hours <= max_reg_hours) reg_hourly_total = reg_hourly_pay;
		if (hours > max_reg_hours) {
			normal_pay = max_reg_hours * base_pay;
			hours_worked_overtime = hours - max_reg_hours; 
			overtime_pay = get_overtime_pay(hours_worked_overtime, base_pay);
			total_with_overtime = normal_pay + overtime_pay; 
			System.out.println("Pay with overtime:" + total_with_overtime);
			return total_with_overtime;
		}
		System.out.println("Regular hourly total amount: "+ reg_hourly_total);
		return reg_hourly_total;
		
	}
	
	public double get_overtime_pay(double hours_worked_overtime, double base_pay) {
		double overtime_pay = base_pay * 1.5;
		double overtime_total = hours_worked_overtime * overtime_pay;
		System.out.println("Overtime total pay: " + overtime_total);
		return overtime_total;
	}
}