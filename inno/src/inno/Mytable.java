package inno;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mytable database table.
 * 
 */
@Entity
@NamedQuery(name="Mytable.findAll", query="SELECT m FROM Mytable m")
public class Mytable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="Company") 
	private String company;
	@Column(name="IBAN")
	private String iban;
	@Column(name="Name")
	private String name;
	@Column(name="Phone")
	private String phone;

	public Mytable() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getIban() {
		return this.iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}