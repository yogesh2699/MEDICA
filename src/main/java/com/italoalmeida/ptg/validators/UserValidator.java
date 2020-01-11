package com.italoalmeida.ptg.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.italoalmeida.ptg.exceptions.EmailAlreadyExistsException;
import com.italoalmeida.ptg.exceptions.InvalidFieldsException;
import com.italoalmeida.ptg.exceptions.MissingFieldsException;
import com.italoalmeida.ptg.models.Phone;
import com.italoalmeida.ptg.models.User;
import com.italoalmeida.ptg.repositories.UserRepository;

import static com.italoalmeida.ptg.validators.ValidatorUtil.*;

/**
 * @author Italo Almeida
 *
 */
@Component
public class UserValidator implements Validator<User> {
	
	@Autowired
	UserRepository userRepository;

	@Autowired
	PhoneValidator phoneValidator;

	@Override
	public void validateRequiredFields(User model) throws Exception {
		
		if (model.getFirstName() == null) throw new MissingFieldsException();
		
		if (model.getLastName() == null) throw new MissingFieldsException();
		
		if (model.getEmail() == null) throw new MissingFieldsException();
		
		if (model.getPassword() == null) throw new MissingFieldsException();		

		if (model.getPhones() == null) throw new MissingFieldsException();

		if (model.getAge() == null) throw new MissingFieldsException();

		if(model.getGender() == null) throw new MissingFieldsException();

	}

	@Override
	public void validateFieldsValues(User model) throws Exception {
		
		if (!isVaildString(model.getFirstName())) throw new InvalidFieldsException();
		
		if (!isVaildString(model.getLastName())) throw new InvalidFieldsException();
		
		if (!isValidEmail(model.getEmail())) throw new InvalidFieldsException();
		
		if (!isVaildString(model.getPassword())) throw new InvalidFieldsException();

		if (!isValidList(model.getPhones())) throw new InvalidFieldsException();

		if(!isVaildString(model.getGender())) throw new InvalidFieldsException();

		if(!isValidPositiveInteger(model.getAge())) throw new InvalidFieldsException();

	}
	
	@Override
	public void validateUniqueFields(User model) throws Exception {
		if (userRepository.findByEmail(model.getPhones()) != null) throw new EmailAlreadyExistsException();
	}

}
