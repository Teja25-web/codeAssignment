package io.approvalProcess.constraint;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyAccessor;

public class AddressHistoryValidator implements ConstraintValidator<AddressHistoryConstraint, Object> {

	private String fromDate;
	private String toDate;
	private String message;

	@Override
	public void initialize(final AddressHistoryConstraint constraintAnnotation) {
		fromDate = constraintAnnotation.fromDate();
		toDate = constraintAnnotation.toDate();
		message = constraintAnnotation.message();
	}

	@Override
	public boolean isValid(Object object, ConstraintValidatorContext context) {
		boolean valid = false;

		if (object != null) {
			LocalDate fromDate = getPropertyValue(object, this.fromDate);
			LocalDate toDate = getPropertyValue(object, this.toDate);

			if (fromDate != null && toDate != null) {
				if ((LocalDate.from(fromDate)).until(toDate, ChronoUnit.YEARS) >= 3) {
					valid = true;
				}
			} else {
				valid = true;
			}
		} else {
			valid = true;
		}

		if (!valid) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(message).addPropertyNode(fromDate).addConstraintViolation();
		}

		return valid;
	}

	private LocalDate getPropertyValue(final Object object, final String fieldName) {
		final PropertyAccessor bean = new BeanWrapperImpl(object);
		return (LocalDate) bean.getPropertyValue(fieldName);
	}

}
