package edu.java.marcio;


import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import edu.java.marcio.content.Content;

public class Student {
	private String name;
	
	private Set<Content> subscribedContents = new LinkedHashSet<Content>();
	private Set<Content> concludedContents = new LinkedHashSet<Content>();
	
	public void makeProgress() {
		Optional<Content> finishedContent = subscribedContents.stream().findFirst();
		concludedContents.add(finishedContent.get());
		subscribedContents.remove(finishedContent.get());
	}
	
	public void subscribeInBootcamp(Bootcamp bootcamp) {
		this.subscribedContents.addAll(bootcamp.getContents());
		bootcamp.getStudentsSubscribed().add(this);
	}
	
	public double calcTotalXP() {
		return this.concludedContents.stream().mapToDouble(Content::calcXP).sum();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(concludedContents, name, subscribedContents);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
		return Objects.equals(concludedContents, other.concludedContents) && Objects.equals(name, other.name)
				&& Objects.equals(subscribedContents, other.subscribedContents);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Content> getSubscribedContents() {
		return subscribedContents;
	}

	public void setSubscribedContents(Set<Content> subscribedContents) {
		this.subscribedContents = subscribedContents;
	}

	public Set<Content> getConcludedContents() {
		return concludedContents;
	}

	public void setConcludedContents(Set<Content> concludedContents) {
		this.concludedContents = concludedContents;
	}
	
}
