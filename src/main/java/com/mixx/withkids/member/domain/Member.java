package com.mixx.withkids.member.domain;

import javax.persistence.*;

@Entity
public class Member {

	@Id @GeneratedValue
	Long id;
	String passwd;
	String name;
	Category category;

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
	 	return "id = " + id + " & passwd = " + passwd + " & name = " + name + " & category = " + category;
	}

	// public abstract String speak();

	// public void eat(){
	// 	energy = energy + 1;
	// }

	// public void sleep(){
	// 	energy = energy + 1;
	// }

	// public void save(){
	// 	Repository repository = PetstoreApplication.getApplicationContext().getBean(Repository.class);
	// 	repository.save(this);
	// }

}
