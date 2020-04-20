/**
 * 
 */
package com.example.currencyexchange;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Alok Ranjan
 *
 */
@Entity
public class ExchangeValue {
	@Id
	public long id;
	@Column(name="currency_from")
	public String from;
	@Column(name="currency_to")
	public String to;
	public BigDecimal conversionMultiple;
	public int port;

	public ExchangeValue() {
		// TODO Auto-generated constructor stub
	}

	public ExchangeValue(long id, String from, String to, BigDecimal bigDecimal) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = bigDecimal;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}
