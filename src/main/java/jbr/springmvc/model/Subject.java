package jbr.springmvc.model;



import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="SUBJECT")
public class Subject implements Serializable{
		private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "subjectId", nullable = false)
	int subjectId;
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + durationInHours;
		result = prime * result + ((book == null) ? 0 : book.hashCode());
		result = prime * result + (int) (subjectId ^ (subjectId >>> 32));
		result = prime * result + ((subtitle == null) ? 0 : subtitle.hashCode());
		return result;
	}
	/*public Subject() {
	  
	}*/
	/*public Subject(long subjectId, String subtitle, int durationInHours, Set<Book> references) {
		super();
		this.subjectId = subjectId;
		this.subtitle = subtitle;
		this.durationInHours = durationInHours;
		this.references = references;
	}*/
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Subject)) {
			return false;
		}
		Subject other = (Subject) obj;
		if (durationInHours != other.durationInHours) {
			return false;
		}
		if (book == null) {
			if (other.book != null) {
				return false;
			}
		} else if (!book.equals(other.book)) {
			return false;
		}
		if (subjectId != other.subjectId) {
			return false;
		}
		if (subtitle == null) {
			if (other.subtitle != null) {
				return false;
			}
		} else if (!subtitle.equals(other.subtitle)) {
			return false;
		}
		return true;
	}
	/**
	 * @return the subjectId
	 */
	public int getSubjectId() {
		return subjectId;
	}
	/**
	 * @param subjectId the subjectId to set
	 */
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	/**
	 * @return the subtitle
	 */
	public String getSubtitle() {
		return subtitle;
	}
	/**
	 * @param subtitle the subtitle to set
	 */
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	/**
	 * @return the durationInHours
	 */
	public int getDurationInHours() {
		return durationInHours;
	}
	/**
	 * @param durationInHours the durationInHours to set
	 */
	public void setDurationInHours(int durationInHours) {
		this.durationInHours = durationInHours;
	}
	/**
	 * @return the references
	 */
	
 
	public Set<Book> getBook() {
		return book;
	}
	/**
	 * @param references the references to set
	 */
	public void setBook(Set<Book> book) {
		this.book = book;
	}
	@Column(name = "subtitle")
	String subtitle;
	@Column(name = "durationInHours")
	int durationInHours;
	@OneToMany(mappedBy="subject",cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	Set<Book> book;
	
@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", subtitle=" + subtitle + ", durationInHours=" + durationInHours
				+ ", references=" + book + "]";
	}
}
