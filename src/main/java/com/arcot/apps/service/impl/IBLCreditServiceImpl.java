package com.arcot.apps.service.impl;

import com.arcot.apps.model.IvrOperationRequest;
import com.arcot.apps.model.IvrOperationResponse;
import com.arcot.apps.service.IBLCreditService;

public class IBLCreditServiceImpl implements IBLCreditService {

	@Override
	public IvrOperationResponse ivrOperation(IvrOperationRequest ivrOperationRequest) {
		IvrOperationResponse ivrOperationResponse = new IvrOperationResponse();
		//TODO: invoke your logic and populate IvrOperationResponse
		ivrOperationResponse.setResponseCode("00");
		return ivrOperationResponse;
	}
}
