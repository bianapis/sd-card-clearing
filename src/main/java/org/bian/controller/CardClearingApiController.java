/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Process;

@BianRestController
public class CardClearingApiController {

	@Autowired
	CardClearingApiService service;
	
	@BQ("capture")
	@Process.ExecutePost
	public BianResponse<CardClearingCaptureBaseWithIdAndRoot> executePostCapture(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CardClearingCaptureBase> bianRequest) {
		return BianResponse.forSuccess(service.executePostCapture(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("capture")
	@Process.ExecutePut
	public BianResponse<CardClearingCaptureBaseWithIdAndRoot> executePutCapture(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CardClearingCaptureBase> bianRequest) {
		return BianResponse.forSuccess(service.executePutCapture(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Process.Record
	public BianResponse<CardClearingRecordBaseWithIdAndRoot> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CardClearingRecordBase> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("capture")
	@Process.RequestPost
	public BianResponse<CardClearingCaptureBaseWithIdAndRoot> requestPostCapture(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CardClearingCaptureBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPostCapture(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("capture")
	@Process.RequestPut
	public BianResponse<CardClearingCaptureBaseWithIdAndRoot> requestPutCapture(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CardClearingCaptureBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPutCapture(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Process.Retrieve
	public BianResponse<CardClearingClearingBaseWithIdAndRoot> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@BQ("addressings")
	@Process.Retrieve
	public BianResponse<CardClearingAddressingBaseWithIdAndRoot> retrieveAddressings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAddressings(crReferenceId, bqReferenceId));
	}
	
	@Process.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Process.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("capture")
	@Process.Retrieve
	public BianResponse<CardClearingCaptureBaseWithIdAndRoot> retrieveCapture(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCapture(crReferenceId, bqReferenceId));
	}
	
	@BQ("fxconversions")
	@Process.Retrieve
	public BianResponse<CardClearingFXConversionBaseWithIdAndRoot> retrieveFxconversions(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFxconversions(crReferenceId, bqReferenceId));
	}
	
	@BQ("fees")
	@Process.Retrieve
	public BianResponse<CardClearingFeesBaseWithIdAndRoot> retrieveFees(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFees(crReferenceId, bqReferenceId));
	}
	
	@BQ("matchings")
	@Process.Retrieve
	public BianResponse<CardClearingMatchingBaseWithIdAndRoot> retrieveMatchings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveMatchings(crReferenceId, bqReferenceId));
	}
	
	@BQ("reconciliations")
	@Process.Retrieve
	public BianResponse<CardClearingReconciliationBaseWithIdAndRoot> retrieveReconciliations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReconciliations(crReferenceId, bqReferenceId));
	}
	
	@Process.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("reportings")
	@Process.Retrieve
	public BianResponse<CardClearingReportingBaseWithIdAndRoot> retrieveReportings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReportings(crReferenceId, bqReferenceId));
	}
	
	@BQ("routings")
	@Process.Retrieve
	public BianResponse<CardClearingRoutingBaseWithIdAndRoot> retrieveRoutings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRoutings(crReferenceId, bqReferenceId));
	}
	
	@Process.Update
	public BianResponse<CardClearingClearingBaseWithIdAndRoot> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CardClearingClearingBase> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
