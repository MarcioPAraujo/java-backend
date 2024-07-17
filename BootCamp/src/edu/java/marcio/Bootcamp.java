package edu.java.marcio;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

import edu.java.marcio.content.Content;

public class Bootcamp {
	private String name;
	private String description;
	private Set<Student> studentsSubscribed = new HashSet<>();
	private Set<Content> contents = new LinkedHashSet<>();
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<Student> getStudentsSubscribed() {
		return studentsSubscribed;
	}
	public void setStudentsSubscribed(Set<Student> studentsSubscribed) {
		this.studentsSubscribed = studentsSubscribed;
	}
	public Set<Content> getContents() {
		return contents;
	}
	public void setContents(Set<Content> contents) {
		this.contents = contents;
	}
	@Override
	public String toString() {
		return "Bootcamp [name=" + name + ", description=" + description + ", studentsSubscribed=" + studentsSubscribed
				+ ", contents=" + contents + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(contents, description, name, studentsSubscribed);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Bootcamp)) {
			return false;
		}
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(contents, other.contents) && Objects.equals(description, other.description)
				&& Objects.equals(name, other.name) && Objects.equals(studentsSubscribed, other.studentsSubscribed);
	}
	
	
}
