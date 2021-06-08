package kodlamaio.hrms.core.utilities.results;

import kodlamaio.hrms.entities.concretes.Job_Advertisement;

public class DataResult<T> extends Result{

	private T data;
	public DataResult(T data, boolean success, String message) {
		super(success, message);
		this.data = data;	
		}
	
	public DataResult(Job_Advertisement job_Advertisement, boolean success) {
		super(success);
		this.data = (T) job_Advertisement;	
		}
	
	public T getData() {
		return this.data;
	}
	
	
}
