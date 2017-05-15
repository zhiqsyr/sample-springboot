package net.iclassmate.basecenter.web.aop.advice;

import net.iclassmate.basecenter.domain.dto.BusinessException;
import net.iclassmate.basecenter.domain.dto.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 异常统一处理
 * 
 * @author dongbz at 2016-07-19
 */
@ControllerAdvice
public class ControllerExceptionHandler {

	private static final Logger logger = LoggerFactory.getLogger(ControllerExceptionHandler.class);
	
	@ExceptionHandler(value = Throwable.class)
	@ResponseBody
	public Response handleError(Throwable e) {
		Response response = new Response();

		if (e instanceof BusinessException) {
			response.setHttpStatus(((BusinessException) e).getHttpStatus());
		} else {
			response.setHttpStatus(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		if (e instanceof NullPointerException) {
			response.setMessage("NullPointerException");
		} else {
			response.setMessage(e.getMessage());
		}
		
		logger.error(e.getMessage(), e);
		return response;
	}
	
}
