package kodlamaio.hrms.core.utilities.results;

import kodlamaio.hrms.entities.concretes.Job_Advertisement;

public class SuccessDataResult <T> extends DataResult<T>{

	public SuccessDataResult(T data, String message) {
		super(data, true, message);
	}
	
	public SuccessDataResult(Job_Advertisement job_Advertisement) {
		super(job_Advertisement, true);
	}
	
	public SuccessDataResult(String message) {
		super(null, true, message);
	}
	
	public SuccessDataResult() {
		super(null, true);
	}
}
