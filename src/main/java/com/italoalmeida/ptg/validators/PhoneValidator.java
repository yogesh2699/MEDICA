package com.italoalmeida.ptg.validators;

import static com.italoalmeida.ptg.validators.ValidatorUtil.isVaildString;
import static com.italoalmeida.ptg.validators.ValidatorUtil.isValidPositiveInteger;

import org.springframework.stereotype.Component;

import com.italoalmeida.ptg.exceptions.InvalidFieldsException;
import com.italoalmeida.ptg.exceptions.MissingFieldsException;
import com.italoalmeida.ptg.models.Phone;


@Component
public class PhoneValidator implements Validator<Phone> {
	
	@Override
	public void validateRequiredFields(Phone model) throws Exception {
		
		//if (model.getNumber() == null) throw new MissingFieldsException();
		
		//if (model.getArea_code() == null) throw new MissingFieldsException();
		
		//if (model.getCountry_code() == null) throw new MissingFieldsException();
	}

	@Override
	public void validateFieldsValues(Phone model) throws Exception {
		
		//if (!isValidPositiveInteger(model.getNumber())) throw new InvalidFieldsException();
		
		//if (!isValidPositiveInteger(model.getArea_code())) throw new InvalidFieldsException();
		
		//if (!isVaildString(model.getCountry_code())) throw new InvalidFieldsException();
	}

	@Override
	public void validateUniqueFields(Phone model) throws Exception {}

}
