package ska_project2;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.NumberFormat;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

public class JavaZonFrame extends javax.swing.JFrame implements ActionListener, ItemListener {

    private JPanel jPanel1;
    private JButton btnAdd;
    private JComboBox cboItem1, cboItem2, cboItem3;
    private JTextField txtQty1, txtQty2, txtQty3;
    private JTextField txtPrice1, txtPrice2, txtPrice3;
    private JTextField txtLineTotal3, txtLineTotal2, txtLineTotal1;
    private JLabel jLabel14, jLabel12, jLabel11, jLabel10, jLabel2;
    private JLabel jLabel3, jLabel4, jLabel5, jLabel9;
    private JLabel jLabel8, jLabel7, jLabel6, jLabel1, jLabel13;
    private JTextField txtOrderID, txtFirstName, txtLastName, txtPhone, txtMemberShip;
    private JButton btnReset;
    private JLabel jLabel15, jLabel16, jLabel17;
    private JButton btnImport;
    private JTextField txtStreet, txtCity, txtState, txtZip;
    private JTextField txtTotal;
    private JTextField txtTax;
    private JTextField txtSubtotal;
    private JLabel lblLineTotal;
    private JLabel lblTotal;
    private JLabel lblTax;
    private JLabel lblSubtotal;
    private JButton btnExport;
    private JButton btnClear;
    private JButton btnList;
    private JButton btnFind;
    private JButton btnDelete;
    private JButton btnUpdate;

    private JavaZon jz;
    private Menu menu;
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    
    public JavaZonFrame() {
        try {

            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

            GridLayout thisLayout = new GridLayout();

            jz = new JavaZon();
            menu = new Menu();

            String menuItems[] = menu.getMenuDescriptions();

            getContentPane().setLayout(thisLayout);

            jPanel1 = new JPanel();
            getContentPane().add(jPanel1);
            GridBagLayout jPanel1Layout = new GridBagLayout();

            jPanel1.setLayout(jPanel1Layout);
            jPanel1.setPreferredSize(new java.awt.Dimension(499, 426));

            btnAdd = new JButton();
            jPanel1.add(btnAdd, gc(1, 17, 1, 1));
            btnAdd.setText("Add");
            btnAdd.addActionListener(this);

            btnDelete = new JButton();
            jPanel1.add(btnDelete, gc(2, 17, 1, 1));
            btnDelete.setText("Delete");
            btnDelete.addActionListener(this);

            btnFind = new JButton();
            jPanel1.add(btnFind, gc(3, 17, 1, 1));
            btnFind.setText("Find");
            btnFind.addActionListener(this);

            btnList = new JButton();
            jPanel1.add(btnList, gc(4, 17, 1, 1));
            btnList.setText("List");
            btnList.addActionListener(this);

            btnClear = new JButton();
            jPanel1.add(btnClear, gc(5, 17, 1, 1));
            btnClear.setText("Clear");
            btnClear.addActionListener(this);

            txtOrderID = new JTextField(10);
            jPanel1.add(txtOrderID, gc(2, 2, 1, 1));

            btnReset = new JButton();
            jPanel1.add(btnReset, gc(6, 17, 1, 1));
            btnReset.setText("Reset");
            btnReset.addActionListener(this);

            btnUpdate = new JButton();
            jPanel1.add(btnUpdate, gc(7, 17, 1, 1));
            btnUpdate.setText("Update");
            btnUpdate.addActionListener(this);

            btnExport = new JButton();
            jPanel1.add(btnExport, gc(5, 18, 1, 1));
            btnExport.setText("Export");
            btnExport.addActionListener(this);

            btnImport = new JButton();
            jPanel1.add(btnImport, gc(4, 18, 1, 1));
            btnImport.setText("Import");
            btnImport.addActionListener(this);

            txtFirstName = new JTextField(10);
            jPanel1.add(txtFirstName, gc(2, 3, 2, 1));

            txtLastName = new JTextField(10);
            jPanel1.add(txtLastName, gc(5, 3, 2, 1));

            jLabel1 = new JLabel();
            jPanel1.add(jLabel1, gc(1, 2, 1, 1));
            jLabel1.setText("Order ID:");

            jLabel2 = new JLabel();
            jPanel1.add(jLabel2, gc(1, 3, 1, 1));
            jLabel2.setText("First Name:");

            jLabel3 = new JLabel();
            jPanel1.add(jLabel3, gc(4, 3, 1, 1));
            jLabel3.setText("Last Name:");

            jLabel4 = new JLabel();
            jPanel1.add(jLabel4, gc(2, 0, 3, 1));
            jLabel4.setText("Welcome to JAVAZON III");

            // Street Name
            jLabel5 = new JLabel();
            jPanel1.add(jLabel5, gc(1, 5, 1, 1));
            jLabel5.setText("Street:");
            txtStreet = new JTextField(10);
            jPanel1.add(txtStreet, gc(2, 5, 2, 1));

            //Phone Number
            jLabel6 = new JLabel();
            jPanel1.add(jLabel6, gc(4, 4, 1, 1));
            jLabel6.setText("Phone:");
            txtPhone = new JTextField(10);
            jPanel1.add(txtPhone, gc(5, 4, 2, 1));

            //Membership
            jLabel7 = new JLabel();
            jPanel1.add(jLabel7, gc(1, 4, 1, 1));
            jLabel7.setText(("Membership:"));
            txtMemberShip = new JTextField(10);
            jPanel1.add(txtMemberShip, gc(2, 4, 1, 1));

            //City
            jLabel8 = new JLabel();
            jPanel1.add(jLabel8, gc(1, 6, 1, 1));
            jLabel8.setText("City:");
            txtCity = new JTextField(10);
            jPanel1.add(txtCity, gc(2, 6, 1, 1));

            //State
            jLabel9 = new JLabel();
            jPanel1.add(jLabel9, gc(3, 6, 1, 1));
            jLabel9.setText("State:");
            txtState = new JTextField(10);
            jPanel1.add(txtState, gc(4, 6, 1, 1));

            //Zip
            jLabel10 = new JLabel();
            jPanel1.add(jLabel10, gc(5, 6, 1, 1));
            jLabel10.setText("Zip:");
            txtZip = new JTextField(10);
            jPanel1.add(txtZip, gc(6, 6, 1, 1));

            //Product
            jLabel11 = new JLabel();
            jPanel1.add(jLabel11, gc(2, 7, 1, 1));
            jLabel11.setText("Product:");
            //Product Item1
            cboItem1 = new JComboBox(menu.getMenuDescriptions());
            jPanel1.add(cboItem1, gc(2, 8, 1, 1));
            cboItem1.setSelectedIndex(-1);
            cboItem1.addItemListener(this);

            //Product Item2
            cboItem2 = new JComboBox(menu.getMenuDescriptions());
            jPanel1.add(cboItem2, gc(2, 9, 1, 1));
            cboItem2.setSelectedIndex(-1);
            cboItem2.addItemListener(this);

            //Product Item3
            cboItem3 = new JComboBox(menu.getMenuDescriptions());
            jPanel1.add(cboItem3, gc(2, 10, 1, 1));
            cboItem3.setSelectedIndex(-1);
            cboItem3.addItemListener(this);

            //Quantity
            jLabel12 = new JLabel();
            jPanel1.add(jLabel12, gc(3, 7, 1, 1));
            jLabel12.setText("Quantity:");

            //Qty1
            txtQty1 = new JTextField();
            jPanel1.add(txtQty1, gc(3, 8, 1, 1));
            //Qty2
            txtQty2 = new JTextField();
            jPanel1.add(txtQty2, gc(3, 9, 1, 1));
            //Qty3
            txtQty3 = new JTextField();
            jPanel1.add(txtQty3, gc(3, 10, 1, 1));
            //Price
            jLabel13 = new JLabel();
            jPanel1.add(jLabel13, gc(4, 7, 1, 1));
            jLabel13.setText("Price:");

            //txtPrice1
            txtPrice1 = new JTextField();
            jPanel1.add(txtPrice1, gc(4, 8, 1, 1));

            //txtPrice2
            txtPrice2 = new JTextField();
            jPanel1.add(txtPrice2, gc(4, 9, 1, 1));

            //txtPrice3
            txtPrice3 = new JTextField();
            jPanel1.add(txtPrice3, gc(4, 10, 1, 1));

            //LineTotal
            lblLineTotal = new JLabel();
            jPanel1.add(lblLineTotal, gc(5, 7, 1, 1));
            lblLineTotal.setText("LineTotal:");

            //LineTotal1
            txtLineTotal1 = new JTextField();
            jPanel1.add(txtLineTotal1, gc(5, 8, 1, 1));

            //Linetotal2
            txtLineTotal2 = new JTextField();
            jPanel1.add(txtLineTotal2, gc(5, 9, 1, 1));

            //Linetotal3
            txtLineTotal3 = new JTextField();
            jPanel1.add(txtLineTotal3, gc(5, 10, 1, 1));

            //Subtotal
            lblSubtotal = new JLabel();
            jPanel1.add(lblSubtotal, gc(4, 11, 1, 1));
            lblSubtotal.setText("Subtotal:");
            txtSubtotal = new JTextField();
            jPanel1.add(txtSubtotal, gc(5, 11, 1, 1));

            //Tax
            lblTax = new JLabel();
            jPanel1.add(lblTax, gc(4, 12, 1, 1));
            lblTax.setText("Tax:");
            txtTax = new JTextField();
            jPanel1.add(txtTax, gc(5, 12, 1, 1));
            //Total
            lblTotal = new JLabel();
            jPanel1.add(lblTotal, gc(4, 13, 1, 1));
            lblTotal.setText("Total:");
            txtTotal = new JTextField();
            jPanel1.add(txtTotal, gc(5, 13, 1, 1));

            //File Options
            jLabel13 = new JLabel();
            jPanel1.add(jLabel13, gc(3, 18, 1, 1));
            jLabel13.setText("File Options");
            //TODO ADD THE REST OF THE CONTROLS
            //REFER TO HANDOUT FOR THE CONTROLS NEEDED
            //AND THE LOCATION OF EACH ITEM
            pack();
            this.setSize(607, 525);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private GridBagConstraints gc(int x, int y, int w, int h) {

        GridBagConstraints c = new GridBagConstraints();

        c.gridx = x;
        c.gridy = y;
        c.gridheight = h;
        c.gridwidth = w;

        c.anchor = GridBagConstraints.WEST;

        c.fill = GridBagConstraints.HORIZONTAL;

        c.insets = new Insets(5, 5, 5, 5);

        return c;
    }

    public void actionPerformed(ActionEvent e) {
        //based on the object that trigerred the event
        //call the appropriate method

        //Call addOrder
        //Call clearOrders
        //Call deleteOrder
        //Call findOrder
        //call printOrders
        //call resetForm
        Object o = e.getSource();
        //Calling methods based on which button is clicked
        if (o == this.btnAdd) {
            addOrder();
        } else if (o == this.btnDelete) {
            deleteOrder();
        } else if (o == this.btnFind) {
            findOrder();
        } else if (o == this.btnClear) {
            clearOrders();
        } else if (o == this.btnReset) {
            resetForm();
        } else if (o == this.btnUpdate) {
            updateOrder();
        } else if (o == this.btnList) {
            printOrders();
        }

    }

    public void itemStateChanged(ItemEvent e) {
        //example of method to display the price of the product
        //based on what item was selected
        //Displays Price when an Item is selected
        Object o = e.getSource();
        if (o == cboItem1) {
            if (cboItem1.getSelectedIndex() != -1) {
                txtPrice1.setText(menu.getPrice(cboItem1.getSelectedIndex()));
            }
        } else if (o == cboItem2) {
            if (cboItem2.getSelectedIndex() != -1) {
                txtPrice2.setText(menu.getPrice(cboItem2.getSelectedIndex()));
            }
        } else if (o == cboItem3) {
            if (cboItem3.getSelectedIndex() != -1) {
                txtPrice3.setText(menu.getPrice(cboItem3.getSelectedIndex()));
            }
        }

        //TODO add code to display the price
        //for the other comboboxes and textfields for the line item price
    }

    private void addOrder() {
        //CREATE VARIABLES TO HOLD INPUT
        //TODO
        //PASS THE INPUT TO THE VALIDATOR\
        //THE ONLY VALIDATION IN THIS PROJECT
        //IS THAT STRING VALUES ARE NOT BLANK
        //AND NUMERICAL VALUES ARE THE CORRECT TYPE
        //FOR EXAMPLE QUANTITY SHOULD BE INTEGER
        //PRICE SHOULD BE DOUBLE
        //EVERYTHING ELSE IS OK

        Validator.clearError(); //before we start processing we clear any errors

        String orderID = Validator.getOrderID(txtOrderID.getText());
        String firstName = Validator.getFirstName(txtFirstName.getText());

        //add the other variables to hold your values from the validator in here
        //see below what variables you will need to create a customer object and an order object
        String lastName = Validator.getLastName(txtLastName.getText());
        String street = Validator.getStreet(txtStreet.getText());
        String city = Validator.getCity(txtCity.getText());
        String zip = Validator.getZip(txtZip.getText());
        String state = Validator.getState(txtState.getText());
        String phone = Validator.getPhone(txtPhone.getText());
        String membership = Validator.getMemberShip(txtMemberShip.getText());

        //Example of how to validate the combobox from the validator
        //After you create the validation method called getQuantity in the validator
        //uncomment the Validator.getQuantity... line
        if (this.cboItem1.getSelectedIndex() != -1) {
            Validator.getQuantity(txtQty1.getText());
        }
        if (this.cboItem2.getSelectedIndex() != -1) {
            Validator.getQuantity(txtQty2.getText());
        }
        if (this.cboItem3.getSelectedIndex() != -1) {
            Validator.getQuantity(txtQty3.getText());
        }

        //do the same thing for the other 2 comboboxes
        //if there are errors then display them to the user
        //otherwise start creating the objects for the order
        if (Validator.getError().length() != 0) {
            
            JOptionPane.showMessageDialog(null, "An Error Occured:\n\n" + Validator.getError());
            

        } else {
            
            Customer customer = new Customer(firstName, lastName, street, city,
                    state, zip, phone, membership);

            Order order = new Order(orderID);
            order.setOrderCustomer(customer);           

            if (this.cboItem1.getSelectedIndex() != -1) {
                Product product1 = menu.getMenu()[this.cboItem1.getSelectedIndex()];
                order.setOrderProduct(product1, Integer.parseInt(txtQty1.getText()));
                this.txtLineTotal1.setText(nf.format(order.getLineTotal(0)));
            }

            if (this.cboItem2.getSelectedIndex() != -1) {
                Product product2 = menu.getMenu()[this.cboItem2.getSelectedIndex()];
                order.setOrderProduct(product2, Integer.parseInt(txtQty2.getText()));
                this.txtLineTotal2.setText(nf.format(order.getLineTotal(1)));
            }

            if (this.cboItem3.getSelectedIndex() != -1) {
                Product product3 = menu.getMenu()[this.cboItem3.getSelectedIndex()];
                order.setOrderProduct(product3, Integer.parseInt(txtQty3.getText()));
                this.txtLineTotal3.setText(nf.format(order.getLineTotal(2)));
            }

            //do the same for the other 2 comboboxes
            jz.addOrder(order);
            jz.setClerk(orderID);
            jz.processOrder(orderID);

            //TODO
            //INSTEAD OF GET RECEIPT YOU NEED TO GREATE METHODS THAT
            //WILL RETURN INDIVIDUAL VALUES
            //FOR EACH LINE ITEM RETRIEVE THE TOTALS
            //FOR THE WHOLE ORDER RETRIEVE THE SUBTOTAL, TAX, TOTAL
            //DISPLAY THESE RESULTS IN THE APPROPRIATE BOXES INSTEAD OF THE JOPTIONPANE BOX
            //JOptionPane.showMessageDialog(null, jz.getReceipt(orderID));
           
            txtSubtotal.setText((order.getSubTotal()));
            txtTax.setText((order.getTax()));
            txtTotal.setText(nf.format(order.total));

            JOptionPane.showMessageDialog(null, "Order " + orderID + " was Saved");
        }

    }

    private void deleteOrder() {
        String orderID = JOptionPane.showInputDialog("Enter Order ID to Delete");
        String result = jz.deleteOrder(orderID);

        JOptionPane.showMessageDialog(null, result);
    }

    private void findOrder() {
        //find a particular order

        //TODO
        //Fill the screen with the order that was retrieved
        //All the fields should be blanked out and filled with the values from the new order
        String input = txtOrderID.getText();
        Order foundOrder = jz.findOrder(input);
        if (foundOrder != null) {

            Customer foundCustomer = foundOrder.getCustomer();

            txtFirstName.setText(foundCustomer.getFirstName());
            txtLastName.setText(foundCustomer.getLastName());
            txtStreet.setText(foundCustomer.getAddress());
            txtMemberShip.setText(foundCustomer.getMembershipID());
            txtPhone.setText(foundCustomer.getPhone());
            this.txtCity.setText(foundCustomer.getCity());
            this.txtState.setText(foundCustomer.getState());
            this.txtZip.setText(foundCustomer.getZip());


            txtSubtotal.setText(foundOrder.getSubTotal());
            txtTax.setText(foundOrder.getTax());
            txtTotal.setText(nf.format(foundOrder.getTotal()));

            txtLineTotal1.setText(nf.format(foundOrder.getLineTotal(0)));
            txtLineTotal2.setText(nf.format(foundOrder.getLineTotal(1)));
            txtLineTotal3.setText(nf.format(foundOrder.getLineTotal(2)));

            this.cboItem1.setSelectedItem(foundOrder.getLineItem(0).getJvzProduct().getDescription());
            this.cboItem2.setSelectedItem(foundOrder.getLineItem(1).getJvzProduct().getDescription());
            this.cboItem3.setSelectedItem(foundOrder.getLineItem(2).getJvzProduct().getDescription());

            txtQty1.setText(String.valueOf(foundOrder.getLineItem(0).getJvzQuantity()));
            txtQty2.setText(String.valueOf(foundOrder.getLineItem(1).getJvzQuantity()));
            txtQty3.setText(String.valueOf(foundOrder.getLineItem(2).getJvzQuantity()));

           
        } else {

            JOptionPane.showMessageDialog(null, "Order Not Found");
        }
    }

    private void clearOrders() {
        //clear orders
        jz.clearOrders();
        JOptionPane.showMessageDialog(null, "Orders Cleared!");
    }

    private void printOrders() {
        //print summary of orders
        String result = jz.getOrdersSummary();
        if (result.length() == 0) {
            JOptionPane.showMessageDialog(null, "No Orders Available!");
        } else {
            JOptionPane.showMessageDialog(null, jz.getOrdersSummary());
        }
    }
    private void updateOrder() {
        
        String input = txtOrderID.getText();
        Order updateOrder = jz.findOrder(input);
        if (updateOrder != null) {
            String orderID = Validator.getOrderID(txtOrderID.getText());
            String firstName = Validator.getFirstName(txtFirstName.getText());

            
            String lastName = Validator.getLastName(txtLastName.getText());
            String street = Validator.getStreet(txtStreet.getText());
            String city = Validator.getCity(txtCity.getText());
            String zip = Validator.getZip(txtZip.getText());
            String state = Validator.getState(txtState.getText());
            String phone = Validator.getPhone(txtPhone.getText());
            String membership = Validator.getMemberShip(txtMemberShip.getText());

            if (this.cboItem1.getSelectedIndex() != -1) {
                Validator.getQuantity(String.valueOf(txtQty1.getText()));
            }
            if (this.cboItem2.getSelectedIndex() != -1) {
                Validator.getQuantity(txtQty2.getText());
            }
            if (this.cboItem3.getSelectedIndex() != -1) {
                Validator.getQuantity(txtQty3.getText());
            }

            if (Validator.getError().length() != 0) {

                JOptionPane.showMessageDialog(null, "An Error Occured:\n\n" + Validator.getError());

            } else {
                Customer customer = new Customer(firstName, lastName, street, city,
                        state, zip, phone, membership);

                Order order = new Order(orderID);
                order.setOrderCustomer(customer);
                
                if (this.cboItem1.getSelectedIndex() != -1) {
                Product product1 = menu.getMenu()[this.cboItem1.getSelectedIndex()];
                order.setOrderProduct(product1, Integer.parseInt(txtQty1.getText()));
                this.txtLineTotal1.setText(nf.format(order.getLineTotal(0)));
            }

            if (this.cboItem2.getSelectedIndex() != -1) {
                Product product2 = menu.getMenu()[this.cboItem2.getSelectedIndex()];
                order.setOrderProduct(product2, Integer.parseInt(txtQty2.getText()));
                this.txtLineTotal2.setText(nf.format(order.getLineTotal(1)));
            }

            if (this.cboItem3.getSelectedIndex() != -1) {
                Product product3 = menu.getMenu()[this.cboItem3.getSelectedIndex()];
                order.setOrderProduct(product3, Integer.parseInt(txtQty3.getText()));
                this.txtLineTotal3.setText(nf.format(order.getLineTotal(2)));
            }

                
                jz.addOrder(order);
                jz.setClerk(orderID);
                jz.processOrder(orderID);

                
                
                txtSubtotal.setText((order.getSubTotal()));
                txtTax.setText((order.getTax()));
                txtTotal.setText(nf.format(order.total));

                JOptionPane.showMessageDialog(null, "Order " + orderID + " was updated");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Order Not Found. Cannot Update Order");
        }

    }
    

    public void resetForm() {
        //TODO
        //ADD code here to reset the form to a blank state

        txtOrderID.setText("");
        txtFirstName.setText("");
        txtLastName.setText("");
        txtMemberShip.setText("");
        txtStreet.setText("");
        txtCity.setText("");
        txtState.setText("");
        txtZip.setText("");
        txtPhone.setText("");
        txtQty1.setText("");
        txtQty2.setText("");
        txtQty3.setText("");
        txtPrice1.setText("");
        txtPrice2.setText("");
        txtPrice3.setText("");
        txtLineTotal1.setText("");
        txtLineTotal2.setText("");
        txtLineTotal3.setText("");
        txtSubtotal.setText("");
        txtTax.setText("");
        txtTotal.setText("");

        try {

            this.cboItem1.setSelectedIndex(-1);
            this.cboItem2.setSelectedIndex(-1);
            this.cboItem3.setSelectedIndex(-1);

        } catch (Exception ex) {
            //ignore error
        }
    }

    

}
