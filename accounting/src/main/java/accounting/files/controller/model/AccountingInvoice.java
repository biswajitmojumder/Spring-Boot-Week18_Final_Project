package accounting.files.controller.model;

import java.util.Date;
import java.util.List;

public class AccountingInvoice {
	private String invoiceId;
	private AccountingCustomer customer;
	private Date invoiceDate;
	private double totalAmount;
	private List<AccountingInvoiceItem> items;
	private boolean closed;

	public String getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public AccountingCustomer getCustomer() {
		return customer;
	}

	public void setCustomer(AccountingCustomer customer) {
		this.customer = customer;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public List<AccountingInvoiceItem> getItems() {
		return items;
	}

	public void setItems(List<AccountingInvoiceItem> items) {
		this.items = items;
	}

	public boolean isClosed() {
		return closed;
	}

	public void setClosed(boolean closed) {
		this.closed = closed;
	}
}
