package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;

	public Department () {
	}

	public Department(Integer id, String nameString) {
		this.id = id;
		this.name = nameString;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNameString() {
		return name;
	}

	public void setNameString(String nameString) {
		this.name = nameString;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
}
