package com.task;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Task {
	
	private static int count=1;
	private int taskId; 
	private String taskName;
	private String description;
	private LocalDate taskDate;
	private Status status;
	private boolean active;
	
	public Task(String taskName, String description, LocalDate localDate) {
		
		this.taskId = count++;
		this.taskName = taskName;
		this.description = description;
		this.taskDate = localDate;
		this.status = Status.PENDING;
		this.active = true;
	}


	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskName=" + taskName + ", description=" + description + ", l1=" + taskDate
				+ ", status=" + status + ", active=" + active + "]";
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Task.count = count;
	}


	public int getTaskId() {
		return taskId;
	}


	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}


	public String getTaskName() {
		return taskName;
	}


	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public LocalDate getTaskDate() {
		return taskDate;
	}


	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
