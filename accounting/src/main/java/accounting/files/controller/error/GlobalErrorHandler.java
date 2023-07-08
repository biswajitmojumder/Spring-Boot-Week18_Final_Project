package accounting.files.controller.error;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice
@Slf4j
public class GlobalErrorHandler {
	@ExceptionHandler(NoSuchElementException.class)
	public Map<String, String> handleNoSuchElementException(NoSuchElementException ex) {
		log.error("Element not found: {}", ex.getMessage());
		Map<String, String> errorResponse = new HashMap<>();
		errorResponse.put("message", ex.toString());
		return errorResponse;
	}
}
