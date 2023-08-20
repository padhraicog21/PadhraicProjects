package com.tus.payment;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;

import com.paypal.base.rest.PayPalRESTException;

@ManagedBean
@SessionScoped
public class AuthorizePayment {
    private String product;
    private String name;
    private String phoneNumber;
    private String email;
    private String username;
    private String password;
    private String age;
    private String paymentMethod;
    private float total;

    
    public float getTotal() {

    	if ("3 Month Membership".equals(product)) {
            total = 30;
        } else if ("6 Month Membership".equals(product)) {
            total = 50;
        } else if ("12 Month Membership".equals(product)) {
            total = 100;
        } else {
            total = 0;
        }
        return total;
    }
    
    public void calculateTotal(AjaxBehaviorEvent event) {
        if ("3 Month Membership".equals(product)) {
            total = 30;
        } else if ("6 Month Membership".equals(product)) {
            total = 50;
        } else if ("12 Month Membership".equals(product)) {
            total = 100;
        } else {
            total = 0;
        }
    }

    
    public String getProduct() {
		return product;
	}


	public void setProduct(String product) {
		this.product = product;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getPaymentMethod() {
		return paymentMethod;
	}


	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}


	public void setTotal(float total) {
		this.total = total;
	}


	private String generateConfirmationCode() {
        return "ABC123";
    }
	
	private boolean isEmpty(String value) {
	    return value == null || value.trim().isEmpty();
	}
	
	

    public String checkOut() throws IOException { 
        if (isEmpty(name) || isEmpty(phoneNumber) || isEmpty(email) ||
                isEmpty(username) || isEmpty(password) || isEmpty(age) ||
                isEmpty(paymentMethod)) {
                return "paymentError.xhtml?faces-redirect=true";
        }
        if ("cash".equals(paymentMethod)) {
            String confirmationCode = generateConfirmationCode();
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("confirmationCode", confirmationCode);

            return "confirmationCash.xhtml?faces-redirect=true";
        } else if ("paypal".equals(paymentMethod)) {
            try {
                OrderDetail orderDetail = new OrderDetail(product, getTotal());
                orderDetail.setName(name);
                orderDetail.setPhoneNumber(phoneNumber);
                orderDetail.setEmail(email);
                orderDetail.setUsername(username);
                orderDetail.setPassword(password);
                orderDetail.setAge(age);

                PaymentServices paymentServices = new PaymentServices();
                String approvalLink = paymentServices.authorizePayment(orderDetail);
                FacesContext.getCurrentInstance().getExternalContext().redirect(approvalLink);
            } catch (PayPalRESTException ex) {
                ex.printStackTrace();
            }
            return null;
        } else {
            return null;
        }
    }
}
