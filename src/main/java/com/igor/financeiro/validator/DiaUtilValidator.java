package com.igor.financeiro.validator;

import java.util.Calendar;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("diaUtil")
public class DiaUtilValidator implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {

		Date data = (Date) value;

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);

		int diaDaSemana = calendar.get(Calendar.DAY_OF_WEEK);

		if (diaDaSemana < Calendar.MONDAY || diaDaSemana > Calendar.FRIDAY) {
			throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Data inválida",
					"A data informada não é um dia útil"));

		}

	}

}
