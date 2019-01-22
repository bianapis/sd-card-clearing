/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CardClearingApiServiceImpl implements CardClearingApiService {

	public CardClearingCaptureBaseWithIdAndRoot executePostCapture(String crReferenceId, CardClearingCaptureBase request){
		return JsonReader.read("executePost-CardClearingCaptureBaseWithIdAndRoot.json",new TypeReference<CardClearingCaptureBaseWithIdAndRoot>(){});
	}
	
	public CardClearingCaptureBaseWithIdAndRoot executePutCapture(String crReferenceId, String bqReferenceId, CardClearingCaptureBase request){
		return JsonReader.read("executePut-CardClearingCaptureBaseWithIdAndRoot.json",new TypeReference<CardClearingCaptureBaseWithIdAndRoot>(){});
	}
	
	public CardClearingRecordBaseWithIdAndRoot record(String crReferenceId, CardClearingRecordBase request){
		return JsonReader.read("record-CardClearingRecordBaseWithIdAndRoot.json",new TypeReference<CardClearingRecordBaseWithIdAndRoot>(){});
	}
	
	public CardClearingCaptureBaseWithIdAndRoot requestPostCapture(String crReferenceId, CardClearingCaptureBase request){
		return JsonReader.read("requestPost-CardClearingCaptureBaseWithIdAndRoot.json",new TypeReference<CardClearingCaptureBaseWithIdAndRoot>(){});
	}
	
	public CardClearingCaptureBaseWithIdAndRoot requestPutCapture(String crReferenceId, String bqReferenceId, CardClearingCaptureBase request){
		return JsonReader.read("requestPut-CardClearingCaptureBaseWithIdAndRoot.json",new TypeReference<CardClearingCaptureBaseWithIdAndRoot>(){});
	}
	
	public CardClearingClearingBaseWithIdAndRoot retrieve(String crReferenceId){
		return JsonReader.read("retrieve-CardClearingClearingBaseWithIdAndRoot.json",new TypeReference<CardClearingClearingBaseWithIdAndRoot>(){});
	}
	
	public CardClearingAddressingBaseWithIdAndRoot retrieveAddressings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CardClearingAddressingBaseWithIdAndRoot.json",new TypeReference<CardClearingAddressingBaseWithIdAndRoot>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public CardClearingCaptureBaseWithIdAndRoot retrieveCapture(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CardClearingCaptureBaseWithIdAndRoot.json",new TypeReference<CardClearingCaptureBaseWithIdAndRoot>(){});
	}
	
	public CardClearingFXConversionBaseWithIdAndRoot retrieveFxconversions(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CardClearingFXConversionBaseWithIdAndRoot.json",new TypeReference<CardClearingFXConversionBaseWithIdAndRoot>(){});
	}
	
	public CardClearingFeesBaseWithIdAndRoot retrieveFees(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CardClearingFeesBaseWithIdAndRoot.json",new TypeReference<CardClearingFeesBaseWithIdAndRoot>(){});
	}
	
	public CardClearingMatchingBaseWithIdAndRoot retrieveMatchings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CardClearingMatchingBaseWithIdAndRoot.json",new TypeReference<CardClearingMatchingBaseWithIdAndRoot>(){});
	}
	
	public CardClearingReconciliationBaseWithIdAndRoot retrieveReconciliations(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CardClearingReconciliationBaseWithIdAndRoot.json",new TypeReference<CardClearingReconciliationBaseWithIdAndRoot>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public CardClearingReportingBaseWithIdAndRoot retrieveReportings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CardClearingReportingBaseWithIdAndRoot.json",new TypeReference<CardClearingReportingBaseWithIdAndRoot>(){});
	}
	
	public CardClearingRoutingBaseWithIdAndRoot retrieveRoutings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CardClearingRoutingBaseWithIdAndRoot.json",new TypeReference<CardClearingRoutingBaseWithIdAndRoot>(){});
	}
	
	public CardClearingClearingBaseWithIdAndRoot update(String crReferenceId, CardClearingClearingBase request){
		return JsonReader.read("update-CardClearingClearingBaseWithIdAndRoot.json",new TypeReference<CardClearingClearingBaseWithIdAndRoot>(){});
	}
	
}
