package com.del.foodieapp.util;

import java.security.Key;
import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtTokenUtil {
	
	 private static final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

	    public String generateToken(String username) {
	        long currentMillis = System.currentTimeMillis();
	        long expiryMillis = currentMillis + (60 * 60 * 1000 * 24);
	        Date expiryDate = new Date(expiryMillis);
	        String token = Jwts.builder()
	                .signWith(key)
	                .setSubject(username)
	                .setExpiration(expiryDate)
	                .compact();

	        return token;
	    }


	    public String decodeToken(String token) {
	        if (token == null || token.isEmpty()) {
	            return null;
	        }
	        token = token.trim();
	        Jws<Claims> jws = Jwts.parserBuilder()
	                .setSigningKey(key)
	                .build()
	                .parseClaimsJws(token);
	        Claims claims = jws.getBody();
	        String username = claims.getSubject();
	        return username;
	    }
	

}
