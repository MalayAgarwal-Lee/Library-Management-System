import com.sun.glass.events.KeyEvent;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Malay Agarwal
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
    public MainPage() {
        
        initComponents();
        
        SetIcon();
        Choice.requestFocusInWindow();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
       // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
       private void initComponents() {

              jLabel1 = new javax.swing.JLabel();
              jLabel2 = new javax.swing.JLabel();
              AddBook = new javax.swing.JLabel();
              AddMember = new javax.swing.JLabel();
              ReturnBook = new javax.swing.JLabel();
              IssueBook = new javax.swing.JLabel();
              SearchBook = new javax.swing.JLabel();
              ShowIssues = new javax.swing.JLabel();
              ShowReturns = new javax.swing.JLabel();
              ShowPurchases = new javax.swing.JLabel();
              PurchaseBook = new javax.swing.JLabel();
              SearchMembers = new javax.swing.JLabel();
              DeleteBook = new javax.swing.JLabel();
              DeleteMember = new javax.swing.JLabel();
              EditInfoBook = new javax.swing.JLabel();
              EditInfoMember = new javax.swing.JLabel();
              ViewBooks = new javax.swing.JLabel();
              ViewMembers = new javax.swing.JLabel();
              ExitButton = new javax.swing.JButton();
              jLabel17 = new javax.swing.JLabel();
              Choice = new javax.swing.JTextField();
              OKButton = new javax.swing.JButton();

              setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
              setTitle("Main menu");
              setResizable(false);

              jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
              jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
              jLabel1.setText("LIBRARY");

              jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
              jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
              jLabel2.setText("WELCOME");

              AddBook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
              AddBook.setText("1. Add a new book.");

              AddMember.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
              AddMember.setText("2. Add a new member.");

              ReturnBook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
              ReturnBook.setText("4. Return a book.");
              ReturnBook.setFocusable(false);

              IssueBook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
              IssueBook.setText("3. Issue a book.");
              IssueBook.setFocusable(false);

              SearchBook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
              SearchBook.setText("6. Search for a book.");

              ShowIssues.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
              ShowIssues.setText("7. View issues.");

              ShowReturns.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
              ShowReturns.setText("8.  View returns.");

              ShowPurchases.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
              ShowPurchases.setText("9. View purchases.");

              PurchaseBook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
              PurchaseBook.setText("5. Purchase stock.");

              SearchMembers.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
              SearchMembers.setText("10. Search for a member.");

              DeleteBook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
              DeleteBook.setText("11. Delete a book.");

              DeleteMember.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
              DeleteMember.setText("12. Delete a member.");

              EditInfoBook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
              EditInfoBook.setText("13. Edit information of  a book.");

              EditInfoMember.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
              EditInfoMember.setText("14. Edit information of a member.");

              ViewBooks.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
              ViewBooks.setText("15. View all books.");

              ViewMembers.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
              ViewMembers.setText("16. View all members.");

              ExitButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
              ExitButton.setText("Exit");
              ExitButton.addActionListener(new java.awt.event.ActionListener() {
                     public void actionPerformed(java.awt.event.ActionEvent evt) {
                            ExitButtonActionPerformed(evt);
                     }
              });

              jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
              jLabel17.setText("Enter your choice: ");

              Choice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
              Choice.setToolTipText("Please enter values which are not more than 16.");
              Choice.addActionListener(new java.awt.event.ActionListener() {
                     public void actionPerformed(java.awt.event.ActionEvent evt) {
                            ChoiceActionPerformed(evt);
                     }
              });
              Choice.addKeyListener(new java.awt.event.KeyAdapter() {
                     public void keyPressed(java.awt.event.KeyEvent evt) {
                            ChoiceKeyPressed(evt);
                     }
              });

              OKButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
              OKButton.setText("OK");
              OKButton.addActionListener(new java.awt.event.ActionListener() {
                     public void actionPerformed(java.awt.event.ActionEvent evt) {
                            OKButtonActionPerformed(evt);
                     }
              });

              javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
              getContentPane().setLayout(layout);
              layout.setHorizontalGroup(
                     layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createSequentialGroup()
                            .addContainerGap(104, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                 .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                               .addComponent(ReturnBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                               .addComponent(AddBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                               .addComponent(AddMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                               .addComponent(IssueBook, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(58, 58, 58)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                               .addComponent(SearchBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                               .addComponent(ShowIssues, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                               .addComponent(ShowReturns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                               .addComponent(PurchaseBook, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(58, 58, 58)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                               .addComponent(SearchMembers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                               .addComponent(ShowPurchases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                               .addComponent(DeleteBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                               .addComponent(DeleteMember, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                 .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGap(226, 226, 226)
                                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                               .addComponent(Choice, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                               .addGroup(layout.createSequentialGroup()
                                                                      .addComponent(OKButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                      .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGap(0, 20, Short.MAX_VALUE)))
                                          .addGap(58, 58, 58)
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                 .addComponent(EditInfoMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                 .addComponent(EditInfoBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                 .addComponent(ViewBooks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                 .addComponent(ViewMembers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                          .addGap(104, 104, 104))
                                   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                 .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                 .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGap(477, 477, 477))))
              );
              layout.setVerticalGroup(
                     layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2)
                            .addGap(51, 51, 51)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                   .addGroup(layout.createSequentialGroup()
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                 .addComponent(AddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(ShowPurchases, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(EditInfoBook, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                 .addComponent(AddMember, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(SearchMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(EditInfoMember, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                   .addGroup(layout.createSequentialGroup()
                                          .addComponent(PurchaseBook, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                          .addComponent(SearchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addComponent(IssueBook, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                          .addComponent(ShowIssues, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(DeleteBook, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(ViewBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                   .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                          .addComponent(ReturnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(ViewMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(DeleteMember, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                   .addComponent(ShowReturns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 24, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                   .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(Choice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(39, 39, 39)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                   .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(OKButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(200, 200, 200))
              );

              pack();
       }// </editor-fold>//GEN-END:initComponents
           

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void ChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChoiceActionPerformed

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
        //ChoiceWarning.setVisible(false);
        if (!"".equals(Choice.getText()))
        {
            int choice = Integer.parseInt(Choice.getText());
            
            if (choice <= 16 && choice > 0)
            {
                switch(choice)
                {
                    case 1:
                        this.setVisible(false);
                        AddBook book = new AddBook();
                        book.setVisible(true);
                        break;
                        
                    case 2:
                        this.setVisible(false);
                        AddMember member = new AddMember();
                        member.setVisible(true);
                        break;
                           
                    
                    case 3:
                        this.setVisible(false);
                        IssueBook issue = new IssueBook();
                        issue.setVisible(true);
                        break;
                        
                    
                    case 4: 
                           this.setVisible(false);
                           ReturnBook returns = new ReturnBook();
                           returns.setVisible(true);
                           break;
                    
                    case 5: 
                           this.setVisible(false);
                           PurchaseBook purchase = new PurchaseBook();
                           purchase.setVisible(true);
                           break;
                    
                    case 6: 
                           this.setVisible(false);
                           SearchBook search = new SearchBook();
                           search.setVisible(true);
                           break;
                    
                    case 7: 
                           this.setVisible(false);
                           ViewIssues issues = new ViewIssues();
                           issues.setVisible(true);
                           break;
                    
                    case 8: 
                           this.setVisible(false);
                           ViewReturns returns1 = new ViewReturns();
                           returns1.setVisible(true);
                           break;
                    
                    case 9: 
                           this.setVisible(false);
                           ViewPurchases purchase1 = new ViewPurchases();
                           purchase1.setVisible(true);
                           break;
                    
                    case 10: 
                           this.setVisible(false);
                           SearchMember members = new SearchMember();
                           members.setVisible(true);
                           break;
                    
                    case 11: 
                           this.setVisible(false);
                           DeleteBook deleteBook = new DeleteBook();
                           deleteBook.setVisible(true);
                           break;
                    
                    case 12: 
                           this.setVisible(false);
                           DeleteMember deleteMember = new DeleteMember();
                           deleteMember.setVisible(true);
                           break;
                    
                    case 13: 
                           this.setVisible(false);
                           EditBook editBook = new EditBook();
                           editBook.setVisible(true);
                           break;
                    
                    case 14: 
                           this.setVisible(false);
                           EditMember editMember = new EditMember();
                           editMember.setVisible(true);
                           break;
                    
                    case 15: 
                           this.setVisible(false);
                           new ViewBooks().setVisible(true);
                           break;
                    
                    case 16: 
                           this.setVisible(false);
                           new ViewMembers().setVisible(true);
                           break;
                    
                    default:  break;    
                } 
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Only numbers between 1 and 16 are acceptable.");
                Choice.requestFocusInWindow();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please enter a value in the box.");
            Choice.requestFocusInWindow();
        }
    }//GEN-LAST:event_OKButtonActionPerformed

       private void ChoiceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ChoiceKeyPressed
              if (evt.getKeyCode() == KeyEvent.VK_ENTER){
                     
                     OKButton.doClick();
              }
       }//GEN-LAST:event_ChoiceKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

       // Variables declaration - do not modify//GEN-BEGIN:variables
       private javax.swing.JLabel AddBook;
       private javax.swing.JLabel AddMember;
       private javax.swing.JTextField Choice;
       private javax.swing.JLabel DeleteBook;
       private javax.swing.JLabel DeleteMember;
       private javax.swing.JLabel EditInfoBook;
       private javax.swing.JLabel EditInfoMember;
       private javax.swing.JButton ExitButton;
       private javax.swing.JLabel IssueBook;
       private javax.swing.JButton OKButton;
       private javax.swing.JLabel PurchaseBook;
       private javax.swing.JLabel ReturnBook;
       private javax.swing.JLabel SearchBook;
       private javax.swing.JLabel SearchMembers;
       private javax.swing.JLabel ShowIssues;
       private javax.swing.JLabel ShowPurchases;
       private javax.swing.JLabel ShowReturns;
       private javax.swing.JLabel ViewBooks;
       private javax.swing.JLabel ViewMembers;
       private javax.swing.JLabel jLabel1;
       private javax.swing.JLabel jLabel17;
       private javax.swing.JLabel jLabel2;
       // End of variables declaration//GEN-END:variables

       private void SetIcon() {
              
              setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("appIcon.png")));
       }
}
