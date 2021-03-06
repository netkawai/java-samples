/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CustomerOrder.java
 *
 * Created on Aug 27, 2010, 12:20:40 PM
 */

package adagent;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.math.BigDecimal;
import org.jdesktop.application.Action;

/**
 *
 * @author Kawai
 */
public class CustomerOrder extends javax.swing.JDialog {

    /** Creates new form CustomerOrder */
    public CustomerOrder(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

   

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(adagent.ADagentApp.class).getContext().getResourceMap(CustomerOrder.class);
        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory(resourceMap.getString("entityManager.persistenceUnit")).createEntityManager(); // NOI18N
        tContTypeQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery(resourceMap.getString("tContTypeQuery.query")); // NOI18N
        tContTypeList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : tContTypeQuery.getResultList();
        tPageTypeQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery(resourceMap.getString("tPageTypeQuery.query")); // NOI18N
        tPageTypeList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : tPageTypeQuery.getResultList();
        tSizeTypeQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery(resourceMap.getString("tSizeTypeQuery.query")); // NOI18N
        tSizeTypeList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : tSizeTypeQuery.getResultList();
        dateVerifier1 = new adagent.DateVerifier();
        sizeTypeListCellRenderer1 = new adagent.SizeTypeListCellRenderer();
        pageTypeListCellRenderer1 = new adagent.PageTypeListCellRenderer();
        contentTypeListCellRenderer1 = new adagent.ContentTypeListCellRenderer();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        contComboBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        pageComboBox = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setName("Form"); // NOI18N

        sizeTypeListCellRenderer1.setText(resourceMap.getString("sizeTypeListCellRenderer1.text")); // NOI18N
        sizeTypeListCellRenderer1.setName("sizeTypeListCellRenderer1"); // NOI18N

        pageTypeListCellRenderer1.setText(resourceMap.getString("pageTypeListCellRenderer1.text")); // NOI18N
        pageTypeListCellRenderer1.setName("pageTypeListCellRenderer1"); // NOI18N

        contentTypeListCellRenderer1.setText(resourceMap.getString("contentTypeListCellRenderer1.text")); // NOI18N
        contentTypeListCellRenderer1.setName("contentTypeListCellRenderer1"); // NOI18N

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        jTextField1.setName("jTextField1"); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${currentOrder.CName}"), jTextField1, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        contComboBox.setName("contComboBox"); // NOI18N
        contComboBox.setRenderer(contentTypeListCellRenderer1);

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, tContTypeList, contComboBox);
        bindingGroup.addBinding(jComboBoxBinding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${currentOrder.ACont}"), contComboBox, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        binding.setConverter(new org.jdesktop.beansbinding.Converter<Short, adagent.TContType>() {
            @Override
            public adagent.TContType convertForward(Short value) {
                System.out.println("forward:" + value);
                return new adagent.TContType(value);
            }

            @Override
            public Short convertReverse(adagent.TContType value) {
                System.out.println("Revert:"+value.toString());
                return value.getCID();
            }
        });
        bindingGroup.addBinding(binding);

        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N

        pageComboBox.setName("pageComboBox"); // NOI18N
        pageComboBox.setRenderer(pageTypeListCellRenderer1);

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, tPageTypeList, pageComboBox);
        bindingGroup.addBinding(jComboBoxBinding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${currentOrder.APage}"), pageComboBox, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        binding.setConverter(new org.jdesktop.beansbinding.Converter<Short, adagent.TPageType>() {
            @Override
            public adagent.TPageType convertForward(Short value) {
                System.out.println("forward:" + value);
                return new adagent.TPageType(value);
            }

            @Override
            public Short convertReverse(adagent.TPageType value) {
                System.out.println("Revert:"+value.toString());
                return value.getPID();
            }
        });
        bindingGroup.addBinding(binding);

        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N

        jComboBox3.setName("jComboBox3"); // NOI18N
        jComboBox3.setRenderer(sizeTypeListCellRenderer1);

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, tSizeTypeList, jComboBox3);
        bindingGroup.addBinding(jComboBoxBinding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${currentOrder.ASize}"), jComboBox3, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        binding.setConverter(new org.jdesktop.beansbinding.Converter<Short, adagent.TSizeType>() {
            @Override
            public adagent.TSizeType convertForward(Short value) {
                System.out.println("forward:" + value);
                return new adagent.TSizeType(value);
            }

            @Override
            public Short convertReverse(adagent.TSizeType value) {
                System.out.println("Revert:"+value.toString());
                return value.getSID();
            }
        });
        bindingGroup.addBinding(binding);

        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        jFormattedTextField1.setInputVerifier(dateVerifier1);
        jFormattedTextField1.setName("jFormattedTextField1"); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${currentOrder.APostingDate}"), jFormattedTextField1, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        jLabel9.setText(resourceMap.getString("jLabel9.text")); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(adagent.ADagentApp.class).getContext().getActionMap(CustomerOrder.class, this);
        jButton1.setAction(actionMap.get("editrCustomerOK")); // NOI18N
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(310, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(43, 43, 43))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 150, Short.MAX_VALUE)
                    .addComponent(sizeTypeListCellRenderer1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 250, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 150, Short.MAX_VALUE)
                    .addComponent(pageTypeListCellRenderer1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 250, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 150, Short.MAX_VALUE)
                    .addComponent(contentTypeListCellRenderer1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 250, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(32, 32, 32)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)
                                .addComponent(jLabel8))
                            .addGap(43, 43, 43)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(contComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pageComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel9)))))
                    .addContainerGap(49, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(28, 28, 28))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 138, Short.MAX_VALUE)
                    .addComponent(sizeTypeListCellRenderer1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 162, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 100, Short.MAX_VALUE)
                    .addComponent(pageTypeListCellRenderer1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 200, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 62, Short.MAX_VALUE)
                    .addComponent(contentTypeListCellRenderer1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 238, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(contComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pageComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addContainerGap(90, Short.MAX_VALUE)))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CustomerOrder dialog = new CustomerOrder(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox contComboBox;
    private adagent.ContentTypeListCellRenderer contentTypeListCellRenderer1;
    private adagent.DateVerifier dateVerifier1;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox pageComboBox;
    private adagent.PageTypeListCellRenderer pageTypeListCellRenderer1;
    private adagent.SizeTypeListCellRenderer sizeTypeListCellRenderer1;
    private java.util.List<adagent.TContType> tContTypeList;
    private javax.persistence.Query tContTypeQuery;
    private java.util.List<adagent.TPageType> tPageTypeList;
    private javax.persistence.Query tPageTypeQuery;
    private java.util.List<adagent.TSizeType> tSizeTypeList;
    private javax.persistence.Query tSizeTypeQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    protected TOrder currentOrder;

    /**
     * Get the value of currentOrder
     *
     * @return the value of currentOrder
     */
    public TOrder getCurrentOrder() {
        return currentOrder;
    }

    /**
     * Set the value of currentOrder
     *
     * @param currentOrder new value of currentOrder
     */
    public void setCurrentOrder(TOrder currentOrder) {
        TOrder oldRecord = this.currentOrder;
        this.currentOrder = currentOrder;
        propertyChangeSupport.firePropertyChange("currentOrder", oldRecord, currentOrder);
    }
    
    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    /**
     * Add PropertyChangeListener.
     *
     * @param listener
     */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    /**
     * Remove PropertyChangeListener.
     *
     * @param listener
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    @Action
    public void editrCustomerOK() {
        TOrder oldRecord = this.currentOrder;
        BigDecimal conBill = new BigDecimal(0);
        BigDecimal pageBill = new BigDecimal(0);
        double sizeWeight = 0.0;

        for(TContType c : tContTypeList){
            if(c.getCID().compareTo(currentOrder.getACont()) == 0){
                conBill = c.getContentCost();
                break;
            }
        }
        for(TPageType p: tPageTypeList) {
            if(p.getPID().compareTo(currentOrder.getAPage()) == 0) {
                pageBill = p.getPageCost();
                break;
            }
        }
        for(TSizeType s : tSizeTypeList) {
            if(s.getSID().compareTo(currentOrder.getASize()) == 0) {
                sizeWeight = s.getSizeWeight();
                break;
            }
        }

        conBill = conBill.add(pageBill);
        conBill = conBill.multiply(new BigDecimal(sizeWeight));
        System.out.println(conBill.toString());
        if(conBill.compareTo(new BigDecimal(0)) != 0) {
            currentOrder.setABill(conBill);
        }
        this.setVisible(false);
        propertyChangeSupport.firePropertyChange("currentOrder", oldRecord, currentOrder);
    }

    @Action
    public void editCustomerCancel() {
        currentOrder.setCName("");
    }

}
