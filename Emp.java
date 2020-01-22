package OneToOne;

	import javax.persistence.CascadeType;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.OneToOne;
	import javax.persistence.Table;
	@Entity
	@Table(name = "employ")
	public class Emp {
	 private long empId;
	 private String empName;
	 private Addr empAddr;
	 public Emp() {
	 }
	 public Emp(String empName, Addr empAddr) {
	  this.empName = empName;
	  this.empAddr = empAddr;
	 }
	 @Id
	 @GeneratedValue
	 @Column(name = "emp_ID")
	 public long getempId() {
	  return this.empId;
	 }
	 public void setempId(long empId) {
	  this.empId = empId;
	 }
	 @Column(name = "emp_NAME", nullable = false, length = 100)
	 public String getempName() {
	  return this.empName;
	 }
	 public void setempName(String empName) {
	  this.empName = empName;
	 }
	 @OneToOne(cascade = CascadeType.ALL)
	 public Addr getempAddr() {
	  return this.empAddr;
	 }
	 public void setempAddr(Addr empAddr) {

	  this.empAddr = empAddr;
	 }
}
