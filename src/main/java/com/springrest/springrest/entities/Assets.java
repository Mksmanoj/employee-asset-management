package com.springrest.springrest.entities;

public class Assets {
	private String name;
	private String purchaseDate;
	private String conditionNote;
	private String category;
	private String assignmentStatus;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getConditionNote() {
		return conditionNote;
	}

	public void setConditionNote(String conditionNote) {
		this.conditionNote = conditionNote;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAssignmentStatus() {
		return assignmentStatus;
	}

	public void setAssignmentStatus(String assignmentStatus) {
		this.assignmentStatus = assignmentStatus;
	}

	@Override
	public String toString() {
		return "Assets [name=" + name + ", purchaseDate=" + purchaseDate + ", conditionNote=" + conditionNote
				+ ", category=" + category + ", assignmentStatus=" + assignmentStatus + "]";
	}

	public Assets(String name, String purchaseDate, String conditionNote, String category, String assignmentStatus) {
		this.name = name;
		this.purchaseDate = purchaseDate;
		this.conditionNote = conditionNote;
		this.category = category;
		this.assignmentStatus = assignmentStatus;
	}

}
