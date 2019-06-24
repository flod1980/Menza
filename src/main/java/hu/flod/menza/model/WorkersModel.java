package hu.flod.menza.model;

public class WorkersModel {
	
	private int id;
	private String workerName;
	
	public WorkersModel() {
		
	}
	
	public WorkersModel(int id, String name) {
		this.id = id;
		this.workerName = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWorkerName() {
		return workerName;
	}

	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}
	
	

}
