package org.pamenon.jbpm.claimfund.domain.facts;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Person implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "givenName")
	private java.lang.String givenName;
	@org.kie.api.definition.type.Label(value = "surname")
	private java.lang.String surname;
	@org.kie.api.definition.type.Label(value = "age")
	private java.lang.Integer age;
	@org.kie.api.definition.type.Label(value = "gender")
	private java.lang.String gender;

	public Person() {
	}

	public java.lang.String getGivenName() {
		return this.givenName;
	}

	public void setGivenName(java.lang.String givenName) {
		this.givenName = givenName;
	}

	public java.lang.String getSurname() {
		return this.surname;
	}

	public void setSurname(java.lang.String surname) {
		this.surname = surname;
	}

	public java.lang.Integer getAge() {
		return this.age;
	}

	public void setAge(java.lang.Integer age) {
		this.age = age;
	}

	public java.lang.String getGender() {
		return this.gender;
	}

	public void setGender(java.lang.String gender) {
		this.gender = gender;
	}

	public Person(java.lang.String givenName, java.lang.String surname,
			java.lang.Integer age, java.lang.String gender) {
		this.givenName = givenName;
		this.surname = surname;
		this.age = age;
		this.gender = gender;
	}

}