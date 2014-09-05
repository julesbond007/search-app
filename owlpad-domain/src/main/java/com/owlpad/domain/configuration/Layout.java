package com.owlpad.domain.configuration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Jay Paulynice
 *
 */
@XmlRootElement
@Entity(name = "layout")
public class Layout {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "left_region")
	private String leftRegion;

	@Column(name = "right_region")
	private String rightRegion;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the leftRegion
	 */
	public String getLeftRegion() {
		return leftRegion;
	}

	/**
	 * @return the rightRegion
	 */
	public String getRightRegion() {
		return rightRegion;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param leftRegion
	 *            the leftRegion to set
	 */
	public void setLeftRegion(String leftRegion) {
		this.leftRegion = leftRegion;
	}

	/**
	 * @param rightRegion
	 *            the rightRegion to set
	 */
	public void setRightRegion(String rightRegion) {
		this.rightRegion = rightRegion;
	}
}