package com.mycompany.ecommerce.helper;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class LoginHelper {

	String email;
	String password;
}
