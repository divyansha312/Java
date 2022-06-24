 class Emp{
	private int  emp_id;
	public void  setEmpId(int eid) {
		emp_id=eid;
	}
	public int getEmpId() {
		return emp_id;
		
	}
}
public class Encap_ex1 {
	public static void main(String[] args) {
		Emp e = new Emp();
		e.setEmpId(45);
		System.out.println(e.getEmpId());
		
		
	}

}
