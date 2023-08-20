package com.tus.payment;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.tus.payment.OrderDetail;
import com.tus.payment.PaymentServices;
//import com.paypal.base.rest.PayPalRESTException;
import com.paypal.base.rest.PayPalRESTException;

@ManagedBean
@SessionScoped
public class AuthorizePayment {
	private String product;
	private float subTotal,shipping, tax, total;
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public float getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(float subTotal) {
		this.subTotal = subTotal;
	}
	public float getShipping() {
		return shipping;
	}
	public void setShipping(float shipping) {
		this.shipping = shipping;
	}
	public float getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	
	public String checkOut() throws IOException{
		try {
			OrderDetail orderDetail = new OrderDetail(product, subTotal, shipping, tax, total);
            PaymentServices paymentServices = new PaymentServices();
            String approvalLink = paymentServices.authorizePayment(orderDetail);
            FacesContext.getCurrentInstance().
            getExternalContext().redirect(approvalLink);   
        } catch (PayPalRESTException ex) {
        	ex.printStackTrace();
        }
		return null;
	}
	
	
}
