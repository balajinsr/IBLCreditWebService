package com.arcot.apps.service;

import com.arcot.apps.model.IvrOperationRequest;
import com.arcot.apps.model.IvrOperationResponse;

public interface IBLCreditService {
	public IvrOperationResponse ivrOperation(IvrOperationRequest ivrOperationRequest);
}
