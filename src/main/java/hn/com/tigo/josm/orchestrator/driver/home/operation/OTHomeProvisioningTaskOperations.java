package hn.com.tigo.josm.orchestrator.driver.home.operation;

import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.json.JSONObject;
import org.json.XML;

import com.google.gson.Gson;
import com.tigo.commons.basicrequest.v1.schema.BasicRequestType;
import com.tigo.commons.resources.additional.v1.schema.AdditionalType;
import com.tigo.commons.resources.additional.v1.schema.AdditionalsType;
import com.tigo.commons.resources.servicehome.ServiceHomePort;
import com.tigo.commons.resources.servicehome.ServiceHomeWsSOAPQSService;
import com.tigo.commons.resources.servicehome.v1.schema.CancelOrderRequestType;
import com.tigo.commons.resources.servicehome.v1.schema.CancelOrderResponse;
import com.tigo.commons.resources.servicehome.v1.schema.CloseOrderRequestType;
import com.tigo.commons.resources.servicehome.v1.schema.CloseOrderResponse;
import com.tigo.commons.resources.servicehome.v1.schema.CreateOrderRequestType;
import com.tigo.commons.resources.servicehome.v1.schema.CreateOrderResponse;
import com.tigo.commons.resources.servicehome.v1.schema.UninstallOrderRequestType;
import com.tigo.commons.resources.servicehome.v1.schema.UninstallOrderResponse;

import hn.com.tigo.josm.common.adapter.dto.ParameterArray;
import hn.com.tigo.josm.common.adapter.dto.TaskResponseType;
import hn.com.tigo.josm.common.exceptions.AdapterException;
import hn.com.tigo.josm.common.exceptions.enumerators.AdapterErrorCode;

import hn.com.tigo.josm.orchestrator.driver.home.core.AbstractDriver;
import hn.com.tigo.josm.orchestrator.driver.home.model.JsonRequest;
import hn.com.tigo.josm.orchestrator.driver.home.utils.HomeConstantsDriver;

/**
 * This class contains the process logic for the OTHomeProvisioning task, which creates, cancels, closes, and uninstalls orders.
 * 
 * @author Laurent G. Cáceres
 * @version 1.0.0
 * @since 15/08/2022
 */
public class OTHomeProvisioningTaskOperations extends AbstractDriver {

	/** Attribute that determine request. */
	private final String request;

	/**
	 * Instantiates a new String.
	 *
	 * @param request
	 *            the request
	 */
	public OTHomeProvisioningTaskOperations(final String request) {
		this.request = request;
	}

	@Override
	public TaskResponseType execute() throws AdapterException {

		TaskResponseType responseDriver = null;

		try {

			final Gson gson = new Gson();
			final JsonRequest jsonRequest = gson.fromJson(request, JsonRequest.class);

			if (jsonRequest.getCreateOrderRequest() != null) {

				responseDriver = createOrder(jsonRequest);

			} else if (jsonRequest.getCancelOrderRequest() != null) {

				responseDriver = cancelOrder(jsonRequest);

			} else if (jsonRequest.getCloseOrderRequest() != null) {

				responseDriver = closeOrder(jsonRequest);

			} else if (jsonRequest.getUninstallOrderRequest() != null) {

				responseDriver = uninstallOrder(jsonRequest);
			}

		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			throw new AdapterException(AdapterErrorCode.COMMUNICATION_ERROR, HomeConstantsDriver.ERROR_MESSAGE);

		}
		validateResponse(responseDriver);
		return responseDriver;
	}

	public TaskResponseType uninstallOrder(final JsonRequest jsonRequest) throws Exception {

		TaskResponseType responseDriver;
		BasicRequestType basicRequestType = new BasicRequestType();
		AdditionalsType additionalsType = new AdditionalsType();

		for (int i = 0; i < jsonRequest.getUninstallOrderRequest().getAdditionals().getAdditional().size(); i++) {
			AdditionalType additionalType = new AdditionalType();
			additionalType
					.setName(jsonRequest.getUninstallOrderRequest().getAdditionals().getAdditional().get(i).getName());
			additionalType.setValue(
					jsonRequest.getUninstallOrderRequest().getAdditionals().getAdditional().get(i).getValue());
			additionalsType.getAdditional().add(additionalType);
		}

		basicRequestType.setExternalApplicationID(
				jsonRequest.getUninstallOrderRequest().getBasicRequest().getExternalApplicationID());
		basicRequestType.setExternalTransactionID(
				jsonRequest.getUninstallOrderRequest().getBasicRequest().getExternalTransactionID());
		basicRequestType.setUtiReference(jsonRequest.getUninstallOrderRequest().getBasicRequest().getUtiReference());

		UninstallOrderRequestType uninstallOrderRequestType = new UninstallOrderRequestType();
		uninstallOrderRequestType.setAdditionals(additionalsType);
		uninstallOrderRequestType.setBasicRequest(basicRequestType);

		UninstallOrderResponse result = getConnection().uninstallOrder(uninstallOrderRequestType);
		JAXBContext context = JAXBContext.newInstance(UninstallOrderResponse.class);

		responseDriver = responseFinal(result, context, result.getGeneralResponse().getCode().getValue());

		return responseDriver;
	}

	public TaskResponseType closeOrder(final JsonRequest jsonRequest) throws Exception {

		TaskResponseType responseDriver;
		BasicRequestType basicRequestType = new BasicRequestType();
		AdditionalsType additionalsType = new AdditionalsType();

		for (int i = 0; i < jsonRequest.getCloseOrderRequest().getAdditionals().getAdditional().size(); i++) {
			AdditionalType additionalType = new AdditionalType();
			additionalType
					.setName(jsonRequest.getCloseOrderRequest().getAdditionals().getAdditional().get(i).getName());
			additionalType
					.setValue(jsonRequest.getCloseOrderRequest().getAdditionals().getAdditional().get(i).getValue());
			additionalsType.getAdditional().add(additionalType);
		}

		basicRequestType.setExternalApplicationID(
				jsonRequest.getCloseOrderRequest().getBasicRequest().getExternalApplicationID());
		basicRequestType.setExternalTransactionID(
				jsonRequest.getCloseOrderRequest().getBasicRequest().getExternalTransactionID());
		basicRequestType.setUtiReference(jsonRequest.getCloseOrderRequest().getBasicRequest().getUtiReference());

		CloseOrderRequestType closeOrderRequestType = new CloseOrderRequestType();
		closeOrderRequestType.setAdditionals(additionalsType);
		closeOrderRequestType.setBasicRequest(basicRequestType);

		CloseOrderResponse result = getConnection().closeOrder(closeOrderRequestType);
		JAXBContext context = JAXBContext.newInstance(CloseOrderResponse.class);

		responseDriver = responseFinal(result, context, result.getGeneralResponse().getCode().getValue());

		return responseDriver;
	}

	public TaskResponseType cancelOrder(final JsonRequest jsonRequest) throws Exception {

		TaskResponseType responseDriver;
		BasicRequestType basicRequestType = new BasicRequestType();
		AdditionalsType additionalsType = new AdditionalsType();

		for (int i = 0; i < jsonRequest.getCancelOrderRequest().getAdditionals().getAdditional().size(); i++) {
			AdditionalType additionalType = new AdditionalType();
			additionalType
					.setName(jsonRequest.getCancelOrderRequest().getAdditionals().getAdditional().get(i).getName());
			additionalType
					.setValue(jsonRequest.getCancelOrderRequest().getAdditionals().getAdditional().get(i).getValue());
			additionalsType.getAdditional().add(additionalType);
		}

		basicRequestType.setExternalApplicationID(
				jsonRequest.getCancelOrderRequest().getBasicRequest().getExternalApplicationID());
		basicRequestType.setExternalTransactionID(
				jsonRequest.getCancelOrderRequest().getBasicRequest().getExternalTransactionID());
		basicRequestType.setUtiReference(jsonRequest.getCancelOrderRequest().getBasicRequest().getUtiReference());

		CancelOrderRequestType cancelOrderRequestType = new CancelOrderRequestType();
		cancelOrderRequestType.setAdditionals(additionalsType);
		cancelOrderRequestType.setBasicRequest(basicRequestType);

		CancelOrderResponse result = getConnection().cancelOrder(cancelOrderRequestType);
		JAXBContext context = JAXBContext.newInstance(CancelOrderResponse.class);

		responseDriver = responseFinal(result, context, result.getGeneralResponse().getCode().getValue());

		return responseDriver;
	}

	public TaskResponseType createOrder(final JsonRequest jsonRequest) throws Exception {

		TaskResponseType responseDriver;
		BasicRequestType basicRequestType = new BasicRequestType();
		AdditionalsType additionalsType = new AdditionalsType();

		for (int i = 0; i < jsonRequest.getCreateOrderRequest().getAdditionals().getAdditional().size(); i++) {
			AdditionalType additionalType = new AdditionalType();
			additionalType
					.setName(jsonRequest.getCreateOrderRequest().getAdditionals().getAdditional().get(i).getName());
			additionalType
					.setValue(jsonRequest.getCreateOrderRequest().getAdditionals().getAdditional().get(i).getValue());
			additionalsType.getAdditional().add(additionalType);
		}

		basicRequestType.setExternalApplicationID(
				jsonRequest.getCreateOrderRequest().getBasicRequest().getExternalApplicationID());
		basicRequestType.setExternalTransactionID(
				jsonRequest.getCreateOrderRequest().getBasicRequest().getExternalTransactionID());
		basicRequestType.setUtiReference(jsonRequest.getCreateOrderRequest().getBasicRequest().getUtiReference());

		CreateOrderRequestType createOrderRequestType = new CreateOrderRequestType();
		createOrderRequestType.setAdditionals(additionalsType);
		createOrderRequestType.setBasicRequest(basicRequestType);

		CreateOrderResponse result = getConnection().createOrder(createOrderRequestType);
		JAXBContext context = JAXBContext.newInstance(CreateOrderResponse.class);

		responseDriver = responseFinal(result, context, result.getGeneralResponse().getCode().getValue());

		return responseDriver;
	}

	private ServiceHomePort getConnection() throws MalformedURLException {

		URL	url = new URL(this.endpoint);
		return new ServiceHomeWsSOAPQSService(url).getServiceHomeWsSOAPQSPort();
	}

	public TaskResponseType responseFinal(Object result, JAXBContext context, String codigo) {

		TaskResponseType responseDriver;
		JSONObject xmlJSONObj = XML.toJSONObject(jaxbObjectToXML(result, context));
		String jsonfinal = xmlJSONObj.toString(4);
		
		ParameterArray parameterArray = new ParameterArray();
		parameterArray.getParameter().add(buildNewParameter(HomeConstantsDriver.HTTP_CODE, codigo));
		parameterArray.getParameter().add(buildNewParameter(HomeConstantsDriver.JSON_RESPONSE, jsonfinal));

		responseDriver = createDriverToAdapterResponse(String.valueOf(HomeConstantsDriver.CODE_SUCCESSFUL),
				HomeConstantsDriver.TITLE_SUCCESSFUL, parameterArray);
		return responseDriver;
	}

	private static String jaxbObjectToXML(Object customer, JAXBContext context) {

		String xmlString = "";
		try {
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			StringWriter sw = new StringWriter();
			m.marshal(customer, sw);
			xmlString = sw.toString();

		} catch (JAXBException e) {
			LOGGER.error(e.getLocalizedMessage());
		}
		xmlString = xmlString.replaceAll("\\<\\?xml(.+?)\\?\\>", "").trim();
		xmlString = xmlString.replaceAll("ns1:", "").trim();
		return xmlString;
	}
}
