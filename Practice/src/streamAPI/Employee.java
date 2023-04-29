package streamAPI;

public class Employee {

	private int EmpId;
	private String EmpName;
	private String EmpAdd;
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpAdd() {
		return EmpAdd;
	}
	public void setEmpAdd(String empAdd) {
		EmpAdd = empAdd;
	}
	public Employee(int empId, String empName, String empAdd) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpAdd = empAdd;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpAdd=" + EmpAdd + "]";
	}
	
}
