/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CardClearingApiService {

	CardClearingCaptureBaseWithIdAndRoot executePostCapture(String crReferenceId, CardClearingCaptureBase request);
	
	CardClearingCaptureBaseWithIdAndRoot executePutCapture(String crReferenceId, String bqReferenceId, CardClearingCaptureBase request);
	
	CardClearingRecordBaseWithIdAndRoot record(String crReferenceId, CardClearingRecordBase request);
	
	CardClearingCaptureBaseWithIdAndRoot requestPostCapture(String crReferenceId, CardClearingCaptureBase request);
	
	CardClearingCaptureBaseWithIdAndRoot requestPutCapture(String crReferenceId, String bqReferenceId, CardClearingCaptureBase request);
	
	CardClearingClearingBaseWithIdAndRoot retrieve(String crReferenceId);
	
	CardClearingAddressingBaseWithIdAndRoot retrieveAddressings(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	CardClearingCaptureBaseWithIdAndRoot retrieveCapture(String crReferenceId, String bqReferenceId);
	
	CardClearingFXConversionBaseWithIdAndRoot retrieveFxconversions(String crReferenceId, String bqReferenceId);
	
	CardClearingFeesBaseWithIdAndRoot retrieveFees(String crReferenceId, String bqReferenceId);
	
	CardClearingMatchingBaseWithIdAndRoot retrieveMatchings(String crReferenceId, String bqReferenceId);
	
	CardClearingReconciliationBaseWithIdAndRoot retrieveReconciliations(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
	CardClearingReportingBaseWithIdAndRoot retrieveReportings(String crReferenceId, String bqReferenceId);
	
	CardClearingRoutingBaseWithIdAndRoot retrieveRoutings(String crReferenceId, String bqReferenceId);
	
	CardClearingClearingBaseWithIdAndRoot update(String crReferenceId, CardClearingClearingBase request);
	
}
