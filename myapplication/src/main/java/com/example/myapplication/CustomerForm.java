package com.example.myapplication;

import javax.naming.event.NamespaceChangeListener;

import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.themes.ValoTheme;

public class CustomerForm extends FormLayout  {
	
	
	private TextField firstName = new TextField("First name");
	private TextField lastName = new TextField("Last name");
	private TextField email = new TextField("Email");
	private NativeSelect status = new NativeSelect("Status");
	private PopupDateField birthDate= new PopupDateField("Birthday");
	private Button save =new Button("Save");
	private Button delete =new Button("Delete");
	private CustomerService service = CustomerService.getInstance();
	private Customer customer ;
	private MyUI myUI;
	public CustomerForm(MyUI myUI) {
		// TODO Auto-generated constructor stub
		this.myUI=myUI;
		status.addItems(CustomerStatus.values());
		save.setStyleName(ValoTheme.BUTTON_PRIMARY);
		save.setClickShortcut(KeyCode.ENTER);
		setSizeUndefined();
		HorizontalLayout buttons = new HorizontalLayout(save,delete);
		buttons.setSpacing(true);
		addComponents(firstName ,lastName ,email ,status ,birthDate ,buttons );
		
	}
		
		
	}

	