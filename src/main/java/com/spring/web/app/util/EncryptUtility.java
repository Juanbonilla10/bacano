package com.spring.web.app.util;

import java.util.Base64;

public class EncryptUtility {
	public String encode(String clave) {
		String codificado = Base64.getEncoder().encodeToString(clave.getBytes());
		return codificado;
	}

	public String decode(String clave) {
		byte[] decodedBytes = Base64.getMimeDecoder().decode(clave);
		return new String(decodedBytes);
	}
}
