package hn.com.tigo.josm.orchestrator.driver.home.test;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;

import org.junit.Test;

import com.google.gson.Gson;
import com.tigo.commons.generalresponse.v1.schema.GeneralResponseType;
import com.tigo.commons.generalresponse.v1.schema.ObjectFactory;
import com.tigo.commons.resources.servicehome.v1.schema.CancelOrderResponse;
import com.tigo.commons.resources.servicehome.v1.schema.CloseOrderResponse;
import com.tigo.commons.resources.servicehome.v1.schema.CreateOrderResponse;
import com.tigo.commons.resources.servicehome.v1.schema.UninstallOrderResponse;

import hn.com.tigo.josm.common.adapter.dto.TaskResponseType;
import hn.com.tigo.josm.common.exceptions.AdapterException;
import hn.com.tigo.josm.orchestrator.driver.home.model.Additional;
import hn.com.tigo.josm.orchestrator.driver.home.model.Additionals;
import hn.com.tigo.josm.orchestrator.driver.home.model.BasicRequest;
import hn.com.tigo.josm.orchestrator.driver.home.model.CancelOrderRequest;
import hn.com.tigo.josm.orchestrator.driver.home.model.CloseOrderRequest;
import hn.com.tigo.josm.orchestrator.driver.home.model.CreateOrderRequest;
import hn.com.tigo.josm.orchestrator.driver.home.model.JsonRequest;
import hn.com.tigo.josm.orchestrator.driver.home.model.UninstallOrderRequest;
import hn.com.tigo.josm.orchestrator.driver.home.operation.OTHomeProvisioningTaskOperations;

public class OTHomeProvisioningOperationsTest extends AbstractTest {

	public OTHomeProvisioningOperationsTest() throws AdapterException {

	}
	
	@Test
	public void test() {
		
		try {
			
			String requestCreate = "{\r\n" + 
					"	\"CreateOrderRequest\": {\r\n" + 
					"		\"basicRequest\": {\r\n" + 
					"			\"externalApplicationID\": \"123\",\r\n" + 
					"			\"externalTransactionID\": \"24886d60-9a28-47d0-b2fd-20c20416d489\",\r\n" + 
					"			\"utiReference\": \"24886d60-9a28-47d0-b2fd-20c20416d489\"\r\n" + 
					"		},\r\n" + 
					"		\"additionals\": {\r\n" + 
					"			\"additional\": [{\r\n" + 
					"					\"name\": \"ACTION\",\r\n" + 
					"					\"value\": \"PROVIDE\"\r\n" + 
					"				},\r\n" + 
					"				{\r\n" + 
					"					\"name\": \"CLIENT\",\r\n" + 
					"					\"value\": \"2899910\"\r\n" + 
					"				},\r\n" + 
					"				{\r\n" + 
					"					\"name\": \"NEWSERVICE\",\r\n" + 
					"					\"value\": \"DISNY2\"\r\n" + 
					"				},\r\n" + 
					"				{\r\n" + 
					"					\"name\": \"NEWPROMOTION\",\r\n" + 
					"					\"value\": \"PDISNY1\"\r\n" + 
					"				}\r\n" + 
					"			]\r\n" + 
					"		}\r\n" + 
					"	}\r\n" + 
					"}\r\n" + 
					"";
			JsonRequest jsonRequest = new JsonRequest();
			BasicRequest basicRequest = new BasicRequest();
			basicRequest.setExternalApplicationID("123");
			basicRequest.setExternalTransactionID("24886d89-9a28-47d0-b2fd-20c204172233");
			basicRequest.setUtiReference("24886d89-9a28-47d0-b2fd-20c20416d654");
			
			Additional additional = new Additional();
			additional.setName("ACTION");
			additional.setValue("CEASE");
			
			List<Additional> listAdditional = new ArrayList<Additional>();
			listAdditional.add(additional);
			Additionals additionals = new Additionals();
			additionals.setAdditional(listAdditional);
			
			CreateOrderRequest createOrderRequest = new CreateOrderRequest();
			createOrderRequest.setBasicRequest(basicRequest);
			createOrderRequest.setAdditionals(additionals);
			jsonRequest.setCreateOrderRequest(createOrderRequest);
			CreateOrderResponse result = new CreateOrderResponse();
			
			ObjectFactory factory = new ObjectFactory();
			GeneralResponseType generalResponseType = factory.createGeneralResponseType();
		
			JAXBElement<String> uti = factory.createGeneralResponseTypeUti("N3f5796d1.69369a73.3f.18262827d79.N78bb");
			JAXBElement<String> code = factory.createGeneralResponseTypeCode("01");
			JAXBElement<String> message = factory.createGeneralResponseTypeMessage("Las OTs fueron creadas exitosamente");
			JAXBElement<String> status = factory.createGeneralResponseTypeStatus("OK");
			
			generalResponseType.setCode(code);
			generalResponseType.setStatus(status);
			generalResponseType.setUti(uti);
			generalResponseType.setMessage(message);
			
			JAXBElement<GeneralResponseType> generalResponse = factory.createGeneralResponse(generalResponseType);

			result.setGeneralResponse(generalResponse.getValue());
			
			JAXBContext context = JAXBContext.newInstance(CreateOrderResponse.class);
			
			OTHomeProvisioningTaskOperations operation = new OTHomeProvisioningTaskOperations(requestCreate);
			//operation.createOrder(jsonRequest);
			operation.responseFinal(result, context, result.getGeneralResponse().getCode().getValue());
			TaskResponseType response = driver.executeDriver(operation);
			
			
		} catch (Exception e) {

		}
	}
	
	@Test
	public void test2() {
		
		try {
			
			String requestCancel = "{\r\n" + 
					"	\"CancelOrderRequest\": {\r\n" + 
					"		\"basicRequest\": {\r\n" + 
					"			\"externalApplicationID\": \"123\",\r\n" + 
					"			\"externalTransactionID\": \"24886d89-9a28-47d0-b2fd-20c204172233\",\r\n" + 
					"			\"utiReference\": \"24886d89-9a28-47d0-b2fd-20c20416d654\"\r\n" + 
					"		},\r\n" + 
					"		\"additionals\": {\r\n" + 
					"			\"additional\": [{\r\n" + 
					"				\"name\": \"ACTION\",\r\n" + 
					"				\"value\": \"CEASE\"\r\n" + 
					"			},{\r\n" + 
					"				\"name\": \"CLIENT\",\r\n" + 
					"				\"value\": \"2899910\"\r\n" + 
					"			},{\r\n" + 
					"				\"name\": \"OLDSERVICE\",\r\n" + 
					"				\"value\": \"DISNY1\"\r\n" + 
					"			}]\r\n" + 
					"		}\r\n" + 
					"	}\r\n" + 
					"}";
			JsonRequest jsonRequest = new JsonRequest();
			BasicRequest basicRequest = new BasicRequest();
			basicRequest.setExternalApplicationID("123");
			basicRequest.setExternalTransactionID("24886d89-9a28-47d0-b2fd-20c204172233");
			basicRequest.setUtiReference("24886d89-9a28-47d0-b2fd-20c20416d654");
			
			Additional additional = new Additional();
			additional.setName("ACTION");
			additional.setValue("CEASE");
			
			List<Additional> listAdditional = new ArrayList<Additional>();
			listAdditional.add(additional);
			Additionals additionals = new Additionals();
			additionals.setAdditional(listAdditional);
			
			CancelOrderRequest cancelOrderRequest = new CancelOrderRequest();
			cancelOrderRequest.setBasicRequest(basicRequest);
			cancelOrderRequest.setAdditionals(additionals);
			jsonRequest.setCancelOrderRequest(cancelOrderRequest);
			CancelOrderResponse result = new CancelOrderResponse();
			
			GeneralResponseType generalResponseType = new GeneralResponseType();
			ObjectFactory factory = new ObjectFactory();
			JAXBElement<String> uti = factory.createGeneralResponseTypeUti("N3f5796d1.69369a73.3f.18262827d79.N78bb");
			JAXBElement<String> code = factory.createGeneralResponseTypeCode("01");
			JAXBElement<String> message = factory.createGeneralResponseTypeMessage("La OT fue anulada exitosamente");
			JAXBElement<String> status = factory.createGeneralResponseTypeStatus("OK");

			generalResponseType.setCode(code);
			generalResponseType.setStatus(status);
			generalResponseType.setUti(uti);
			generalResponseType.setMessage(message);
			
			result.setGeneralResponse(generalResponseType);
			
			JAXBContext context = JAXBContext.newInstance(CancelOrderResponse.class);
			
			OTHomeProvisioningTaskOperations operation = new OTHomeProvisioningTaskOperations(requestCancel);
			//operation.cancelOrder(jsonRequest);
			operation.responseFinal(result, context, result.getGeneralResponse().getCode().getValue());
			TaskResponseType response = driver.executeDriver(operation);		
			
		} catch (Exception e) {

		}
	}
	
	@Test
	public void test3() {
		   
		try {
			String requestClose = "{\r\n" + 
					"	\"CloseOrderRequest\": {\r\n" + 
					"		\"basicRequest\": {\r\n" + 
					"			\"externalApplicationID\": \"123\",\r\n" + 
					"			\"externalTransactionID\": \"24886d89-9a28-47d0-b2fd-20c204178489\",\r\n" + 
					"			\"utiReference\": \"24886d89-9a28-47d0-b2fd-20c20416d489\"\r\n" + 
					"		},\r\n" + 
					"		\"additionals\": {\r\n" + 
					"			\"additional\": [{\r\n" + 
					"				\"name\": \"OT_NEW\",\r\n" + 
					"				\"value\": \"98451849845\"\r\n" + 
					"			}]\r\n" + 
					"		}\r\n" + 
					"	}\r\n" + 
					"}\r\n" + 
					"";
			
			JsonRequest jsonRequest = new JsonRequest();
			BasicRequest basicRequest = new BasicRequest();
			basicRequest.setExternalApplicationID("123");
			basicRequest.setExternalTransactionID("24886d89-9a28-47d0-b2fd-20c204172233");
			basicRequest.setUtiReference("24886d89-9a28-47d0-b2fd-20c20416d654");
			
			Additional additional = new Additional();
			additional.setName("ACTION");
			additional.setValue("CEASE");
			
			List<Additional> listAdditional = new ArrayList<Additional>();
			listAdditional.add(additional);
			Additionals additionals = new Additionals();
			additionals.setAdditional(listAdditional);
			
			CloseOrderRequest closeOrderRequest = new CloseOrderRequest();
			closeOrderRequest.setBasicRequest(basicRequest);
			closeOrderRequest.setAdditionals(additionals);
			jsonRequest.setCloseOrderRequest(closeOrderRequest);
			CloseOrderResponse result = new CloseOrderResponse();
			
			GeneralResponseType generalResponseType = new GeneralResponseType();
			ObjectFactory factory = new ObjectFactory();
			JAXBElement<String> uti = factory.createGeneralResponseTypeUti("N3f5796d1.69369a73.3f.18262827d79.N78bb");
			JAXBElement<String> code = factory.createGeneralResponseTypeCode("01");
			JAXBElement<String> message = factory.createGeneralResponseTypeMessage("La OT fue cerrada exitosamente");
			JAXBElement<String> status = factory.createGeneralResponseTypeStatus("OK");

			generalResponseType.setCode(code);
			generalResponseType.setStatus(status);
			generalResponseType.setUti(uti);
			generalResponseType.setMessage(message);
			
			result.setGeneralResponse(generalResponseType);
			
			JAXBContext context = JAXBContext.newInstance(CloseOrderResponse.class);
			
			OTHomeProvisioningTaskOperations operation = new OTHomeProvisioningTaskOperations(requestClose);
			//operation.closeOrder(jsonRequest);
			operation.responseFinal(result, context, result.getGeneralResponse().getCode().getValue());
			
			TaskResponseType response = driver.executeDriver(operation);
		} catch (Exception e) {
	
		}
	}
	
	@Test
	public void test4() {
		
		try {
			
			 String requestUninstall = "{\"UninstallOrderRequest\": {\"basicRequest\": {\"externalApplicationID\": \"123\",\"externalTransactionID\": \"24886d60-9a28-47d0-b2fd-20c20416d489\",\"utiReference\": \"24886d60-9a28-47d0-b2fd-20c20416d489\"},\"additionals\": {\"additional\": [{\"name\": \"ACTION\",\"value\": \"PROVIDE\"}]}}}";
		
			JsonRequest jsonRequest = new JsonRequest();
			BasicRequest basicRequest = new BasicRequest();
			basicRequest.setExternalApplicationID("123");
			basicRequest.setExternalTransactionID("24886d89-9a28-47d0-b2fd-20c204172233");
			basicRequest.setUtiReference("24886d89-9a28-47d0-b2fd-20c20416d654");
			
			Additional additional = new Additional();
			additional.setName("ACTION");
			additional.setValue("CEASE");
			
			List<Additional> listAdditional = new ArrayList<Additional>();
			listAdditional.add(additional);
			Additionals additionals = new Additionals();
			additionals.setAdditional(listAdditional);
			
			UninstallOrderRequest uninstallOrderRequest = new UninstallOrderRequest();
			uninstallOrderRequest.setBasicRequest(basicRequest);
			uninstallOrderRequest.setAdditionals(additionals);
			jsonRequest.setUninstallOrderRequest(uninstallOrderRequest);
			
			UninstallOrderResponse result = new UninstallOrderResponse();
			
			GeneralResponseType generalResponseType = new GeneralResponseType();
			ObjectFactory factory = new ObjectFactory();
			JAXBElement<String> uti = factory.createGeneralResponseTypeUti("N3f5796d1.69369a73.3f.18262827d79.N78bb");
			JAXBElement<String> code = factory.createGeneralResponseTypeCode("01");
			JAXBElement<String> message = factory.createGeneralResponseTypeMessage("La OT fue anulada exitosamente");
			JAXBElement<String> status = factory.createGeneralResponseTypeStatus("OK");

			generalResponseType.setCode(code);
			generalResponseType.setStatus(status);
			generalResponseType.setUti(uti);
			generalResponseType.setMessage(message);
			
			result.setGeneralResponse(generalResponseType);
			
			JAXBContext context = JAXBContext.newInstance(UninstallOrderResponse.class);
			
			OTHomeProvisioningTaskOperations operation = new OTHomeProvisioningTaskOperations(requestUninstall);
			//operation.uninstallOrder(jsonRequest);
			operation.responseFinal(result, context, result.getGeneralResponse().getCode().getValue());
		
			TaskResponseType response = driver.executeDriver(operation);
		} catch (Exception e) {
	
		}
	}
	
	@Test
	public void testErr() {
		
		try {
			String requestError = "{\"CreateOrderRequest\": {\"basicRequest\": {\"externalApplicationID\": \"123\",\"externalTransactionID\": \"24886d60-9a28-47d0-b2fd-20c20416d489\",\"utiReference\": \"24886d60-9a28-47d0-b2fd-20c20416d489\"},\"additionals\": {\"additional\": [{\"name\": \"ACTION\",\"value\": \"PROVIDE\"}]}}}";
			OTHomeProvisioningTaskOperations operation = new OTHomeProvisioningTaskOperations(requestError);
			TaskResponseType response = driver.executeDriver(operation);
		} catch (Exception e) {
	
		}
	}
	
	@Test
	public void testErr2() {
		
		try {
			String requestError = "{\"CancelOrderRequest\": {\"basicRequest\": {\"externalApplicationID\": \"123\",\"externalTransactionID\": \"24886d60-9a28-47d0-b2fd-20c20416d489\",\"utiReference\": \"24886d60-9a28-47d0-b2fd-20c20416d489\"},\"additionals\": {\"additional\": [{\"name\": \"ACTION\",\"value\": \"PROVIDE\"}]}}}";
			OTHomeProvisioningTaskOperations operation = new OTHomeProvisioningTaskOperations(requestError);
			TaskResponseType response = driver.executeDriver(operation);
		} catch (Exception e) {
	
		}
	}
	
	@Test
	public void testErr3() {
		
		try {
			String requestError = "{\"CloseOrderRequest\": {\"basicRequest\": {\"externalApplicationID\": \"123\",\"externalTransactionID\": \"24886d60-9a28-47d0-b2fd-20c20416d489\",\"utiReference\": \"24886d60-9a28-47d0-b2fd-20c20416d489\"},\"additionals\": {\"additional\": [{\"name\": \"ACTION\",\"value\": \"PROVIDE\"}]}}}";
			OTHomeProvisioningTaskOperations operation = new OTHomeProvisioningTaskOperations(requestError);
			TaskResponseType response = driver.executeDriver(operation);
		} catch (Exception e) {
	
		}
	}
	
	@Test
	public void testErr4() {
		
		try {
			String requestError = "{\"UninstallOrderRequest\": {\"basicRequest\": {\"externalApplicationID\": \"123\",\"externalTransactionID\": \"24886d60-9a28-47d0-b2fd-20c20416d489\",\"utiReference\": \"24886d60-9a28-47d0-b2fd-20c20416d489\"},\"additionals\": {\"additional\": [{\"name\": \"ACTION\",\"value\": \"PROVIDE\"}]}}}";
			OTHomeProvisioningTaskOperations operation = new OTHomeProvisioningTaskOperations(requestError);
			TaskResponseType response = driver.executeDriver(operation);
		} catch (Exception e) {
	
		}
	}

}
