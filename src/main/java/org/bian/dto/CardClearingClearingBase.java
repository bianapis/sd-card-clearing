package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CardClearingClearingBase
 */
public class CardClearingClearingBase   {
  private String cardClearingProcessType = null;

  private Object cardClearingProcessRecord = null;

  private String cardClearingProcessDateTime = null;

  private String cardClearingProcessStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: defines the type of clearing process  
   * @return cardClearingProcessType
  **/

  public String getCardClearingProcessType() {
    return cardClearingProcessType;
  }

  public void setCardClearingProcessType(String cardClearingProcessType) {
    this.cardClearingProcessType = cardClearingProcessType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: the control record/mechanism used to track the completion of the clearing process 
   * @return cardClearingProcessRecord
  **/

  public Object getCardClearingProcessRecord() {
    return cardClearingProcessRecord;
  }

  public void setCardClearingProcessRecord(Object cardClearingProcessRecord) {
    this.cardClearingProcessRecord = cardClearingProcessRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: the scheduled time for the process  
   * @return cardClearingProcessDateTime
  **/

  public String getCardClearingProcessDateTime() {
    return cardClearingProcessDateTime;
  }

  public void setCardClearingProcessDateTime(String cardClearingProcessDateTime) {
    this.cardClearingProcessDateTime = cardClearingProcessDateTime;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: open, active, completed, etc. 
   * @return cardClearingProcessStatus
  **/

  public String getCardClearingProcessStatus() {
    return cardClearingProcessStatus;
  }

  public void setCardClearingProcessStatus(String cardClearingProcessStatus) {
    this.cardClearingProcessStatus = cardClearingProcessStatus;
  }


}

