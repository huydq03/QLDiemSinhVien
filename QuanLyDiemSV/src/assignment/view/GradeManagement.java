/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment.view;

import assignment.model.Grade;
import assignment.model.Student;
import assignment.service.GradeService;
import assignment.service.StudentService;
import assignment.util.Validator;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class GradeManagement extends javax.swing.JFrame {

    /**
     * Creates new form GradeManagement
     */
    DefaultTableModel model;
    List<Grade> listGrades;
    StudentService studentService;
    GradeService gradeService;
    Validator validator;
    List<Grade> paging;
    boolean isCheck = true;
    private int numsPage;
    private int numsPerPage;
    private int totalItem;
    private int currentPage;
    public GradeManagement() {
        initComponents();
        this.setLocationRelativeTo(null);
        model = (DefaultTableModel) tableTop3.getModel();
        studentService = new StudentService();
        gradeService = new GradeService();
        validator = new Validator();
        paging = this.getTop3();
        numsPerPage = 3;
        currentPage = 1;
        listGrades = this.gradeService.getAllGrade();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtInformation = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtPhysical = new javax.swing.JTextField();
        txtEnglish = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
        lblIDMsg = new javax.swing.JLabel();
        lblEnglistMsg = new javax.swing.JLabel();
        lblITMsg = new javax.swing.JLabel();
        lblPhysicalMsg = new javax.swing.JLabel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnNextRow = new javax.swing.JButton();
        btnPreviousRow = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTop3 = new javax.swing.JTable();
        lblPage = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Quan Ly Diem Sinh Vien");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel3.setText("Ma SV:");

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/assignment/search-icon-24.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnSearch)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(24, 24, 24))
        );

        jLabel2.setText("Tim Kiem");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setText("Ho Ten");

        lblName.setForeground(new java.awt.Color(255, 51, 51));

        jLabel6.setText("MaSV:");

        txtInformation.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtInformationFocusLost(evt);
            }
        });

        txtID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIDFocusLost(evt);
            }
        });

        txtPhysical.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPhysicalFocusLost(evt);
            }
        });

        txtEnglish.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEnglishFocusLost(evt);
            }
        });

        jLabel7.setText("Tieng Anh");

        jLabel8.setText("Tin Hoc");

        jLabel9.setText("GDTC");

        jLabel10.setText("Diem TB:");

        lblScore.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblScore.setForeground(new java.awt.Color(255, 51, 51));

        lblIDMsg.setName("Ma sv"); // NOI18N

        lblEnglistMsg.setName("Tieng Anh"); // NOI18N

        lblITMsg.setName("Tin Hoc"); // NOI18N

        lblPhysicalMsg.setName("GDTC"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(lblIDMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEnglish, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(txtInformation)
                            .addComponent(txtPhysical, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(txtID)
                            .addComponent(lblPhysicalMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblITMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEnglistMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIDMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel10))
                    .addComponent(txtEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEnglistMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblITMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPhysical, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPhysicalMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/assignment/new-icon-16.png"))); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/assignment/Save-icon.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/assignment/Actions-edit-delete-icon-16.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/assignment/Actions-document-edit-icon-16.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/assignment/Skip-forward-icon2-48.png"))); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnNextRow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/assignment/Fast-forward-icon-48.png"))); // NOI18N
        btnNextRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextRowActionPerformed(evt);
            }
        });

        btnPreviousRow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/assignment/Fast-backward-icon2-48.png"))); // NOI18N
        btnPreviousRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousRowActionPerformed(evt);
            }
        });

        btnPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/assignment/Skip-backward-icon2-48.png"))); // NOI18N
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        jLabel11.setText("3 Sinh vien co diem cao nhat");

        tableTop3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ma SV", "Ho Ten", "Tieng Anh", "Tin Hoc", "GDTC", "Diem TB"
            }
        ));
        tableTop3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTop3MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableTop3);

        lblPage.setText("1/1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(0, 83, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btnPrevious)
                        .addGap(18, 18, 18)
                        .addComponent(btnPreviousRow)
                        .addGap(26, 26, 26)
                        .addComponent(btnNextRow)
                        .addGap(31, 31, 31)
                        .addComponent(btnNext))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)
                        .addGap(115, 115, 115)
                        .addComponent(lblPage)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(212, 212, 212))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNextRow, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPreviousRow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lblPage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        this.resetText();

    }//GEN-LAST:event_btnNewActionPerformed

    private void txtIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDFocusLost
        // TODO add your handling code here:
        String id = validator.getString(txtID.getText(), lblIDMsg);
        if (id != null) {
            Student s = studentService.getStudentById(id);
            if (s != null) {
                lblName.setText(s.getHoTen());
                isCheck = true;
            } else {
                lblIDMsg.setText("Ma sv khong ton tai");
                isCheck = false;
                lblIDMsg.setForeground(Color.red);
            }
        }
    }//GEN-LAST:event_txtIDFocusLost

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        Grade g = validateMarks();
        if (g != null) {
            if (check(g.getMaSV()) && isCheck) {
                boolean isSaved = saveGrade(g);
                if (isSaved) {
                    paging = this.getTop3();
                    currentPage = 1;
                    loadTable();
                    JOptionPane.showMessageDialog(this, "Save thanh cong!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ma sinh vien da trung hoac khong ton tai");
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String masv = txtSearch.getText();
        if (!masv.isBlank()) {
            Grade grade = getGradeByIdStudent(masv);
            if (grade != null) {
                txtID.setText(masv);
                txtIDFocusLost(null);
                txtEnglish.setText(grade.getTiengAnh() + "");
                txtInformation.setText(grade.getTinHoc() + "");
                txtPhysical.setText(grade.getgDTC() + "");
                String score = String.format("%.2f", grade.getMarks());
                lblScore.setText(score);
            } else {
                JOptionPane.showMessageDialog(this, "Sinh Vien chua duoc nhap diem!");
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String masv = validator.getString(txtID.getText(), lblIDMsg);
        if (masv != null) {
            int check = JOptionPane.showConfirmDialog(this, "Ban co muon xoa khong?");
            if (check == JOptionPane.YES_OPTION) {
                boolean isDeleted = this.deleteGrade(masv);
                if (isDeleted) {
                    paging = this.gradeService.getTop3();
                    loadTable();
                    JOptionPane.showMessageDialog(this, "Delete thanh cong!");
                }
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtEnglishFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEnglishFocusLost
        // TODO add your handling code here:
        String englist = txtEnglish.getText();
        String iT = txtInformation.getText();
        String physicalEducation = txtPhysical.getText();

        try {
            if (!(englist.isBlank() || iT.isBlank() || physicalEducation.isBlank())) {
                double e = Double.parseDouble(englist);
                double i = Double.parseDouble(iT);
                double p = Double.parseDouble(physicalEducation);
                String score = String.format("%.2f", ((e + i + p) * 1.0 / 3));
                lblScore.setText(score);
            }
        } catch (NumberFormatException e) {

        }
    }//GEN-LAST:event_txtEnglishFocusLost

    private void txtInformationFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtInformationFocusLost
        // TODO add your handling code here:
        String englist = txtEnglish.getText();
        String iT = txtInformation.getText();
        String physicalEducation = txtPhysical.getText();

        try {
            if (!(englist.isBlank() || iT.isBlank() || physicalEducation.isBlank())) {
                double e = Double.parseDouble(englist);
                double i = Double.parseDouble(iT);
                double p = Double.parseDouble(physicalEducation);
                String score = String.format("%.2f", ((e + i + p) * 1.0 / 3));
                lblScore.setText(score);
            }
        } catch (NumberFormatException e) {

        }
    }//GEN-LAST:event_txtInformationFocusLost

    private void txtPhysicalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPhysicalFocusLost
        // TODO add your handling code here:
        String englist = txtEnglish.getText();
        String iT = txtInformation.getText();
        String physicalEducation = txtPhysical.getText();

        try {
            if (!(englist.isBlank() || iT.isBlank() || physicalEducation.isBlank())) {
                double e = Double.parseDouble(englist);
                double i = Double.parseDouble(iT);
                double p = Double.parseDouble(physicalEducation);
                String score = String.format("%.2f", ((e + i + p) * 1.0 / 3));
                lblScore.setText(score);
            }
        } catch (NumberFormatException e) {

        }
    }//GEN-LAST:event_txtPhysicalFocusLost

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        Grade g = validateMarks();

        if (g != null) {
            int confirm = JOptionPane.showConfirmDialog(this, "Ban co muon cap nhat khong?");
            if (!this.check(g.getMaSV()) && confirm == JOptionPane.YES_OPTION) {
                boolean isUpdated = this.updateGrade(g);
                if (isUpdated) {
                    paging = this.getTop3();
                    currentPage = 1;
                    loadTable();
                }
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tableTop3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTop3MouseClicked
        // TODO add your handling code here:
        int selectdRow = tableTop3.getSelectedRow();
        String masv = (String) model.getValueAt(selectdRow, 0);
        String name =(String) model.getValueAt(selectdRow, 1);
        String englist =  model.getValueAt(selectdRow, 2).toString();
        String iT =  model.getValueAt(selectdRow, 3).toString();
        String physical =  model.getValueAt(selectdRow, 4).toString();
        String dtb =  model.getValueAt(selectdRow, 5).toString();
        txtID.setText(masv);
        txtEnglish.setText(englist +"");
        txtInformation.setText(iT+"");
        txtPhysical.setText(physical+"");
        lblName.setText(name);
        lblScore.setText(dtb+"");
    }//GEN-LAST:event_tableTop3MouseClicked

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        if(currentPage > 1){
            currentPage --;
            loadTable();
        }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        if(currentPage < numsPage){
            currentPage ++;
            loadTable();
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnNextRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextRowActionPerformed
        // TODO add your handling code here:
        int selectRow = tableTop3.getSelectedRow() + 1;
        if(selectRow >= numsPerPage ){
            btnNextActionPerformed(null);
            tableTop3.setRowSelectionInterval(0, 0);
            tableTop3MouseClicked(null);
        }
        else{
            if(currentPage <= numsPage){
                try{
                    tableTop3.setRowSelectionInterval(selectRow, selectRow);
                    tableTop3MouseClicked(null);
                }catch(IllegalArgumentException e){
                    
                }
            }
        }
    }//GEN-LAST:event_btnNextRowActionPerformed

    private void btnPreviousRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousRowActionPerformed
        // TODO add your handling code here:
        int selectRow = tableTop3.getSelectedRow() - 1;
        if(selectRow < 0 ){
            btnPreviousActionPerformed(null);
            tableTop3.setRowSelectionInterval(2, 2);
            tableTop3MouseClicked(null);
        }
        else{
            if(currentPage >= 1){
                try{
                    tableTop3.setRowSelectionInterval(selectRow, selectRow);
                    tableTop3MouseClicked(null);
                }catch(IllegalArgumentException e){
                    
                }
            }
        }
    }//GEN-LAST:event_btnPreviousRowActionPerformed

    private Grade getGradeByIdStudent(String id) {
        return this.gradeService.getGradeByIdStudent(id);
    }

    private boolean saveGrade(Grade g) {
        return this.gradeService.saveGrade(g);
    }

    private Grade validateMarks() {
        String id = validator.getString(txtID.getText(), lblIDMsg);
        float english = validator.getMark(txtEnglish.getText(), lblEnglistMsg);
        float iT = validator.getMark(txtInformation.getText(), lblITMsg);
        float physicalEducation = validator.getMark(txtPhysical.getText(), lblPhysicalMsg);
        if (!(id == null || english == -1 || iT == -1 || physicalEducation == -1)) {
            Grade grade = new Grade();
            grade.setMaSV(id);
            grade.setTiengAnh(english);
            grade.setTinHoc(iT);
            grade.setgDTC(physicalEducation);
            return grade;
        }
        return null;
    }

    private boolean deleteGrade(String masv) {
        return this.gradeService.deleteGrade(masv);
    }

    private void resetText() {
        txtID.setText("");
        txtEnglish.setText("");
        txtInformation.setText("");
        txtPhysical.setText("");
        txtSearch.setText("");
        lblName.setText("");
        lblScore.setText("");
    }

    private void loadTable() {
        model.setNumRows(0);
        if (!paging.isEmpty()) {
        totalItem = paging.size();
        numsPage = (totalItem - 1) / numsPerPage + 1;
        int start = (currentPage - 1) * numsPerPage;
        int end = start + numsPerPage;
        if (end > totalItem) {
            end = totalItem;
        }
        lblPage.setText(currentPage + "/" + numsPage);
            for (Grade g : paging.subList(start, end)) {
                Student s = this.studentService.getStudentById(g.getMaSV());
                String score = String.format("%.2f", g.getMarks());
                if (s != null) {
                    model.addRow(new Object[]{
                        g.getMaSV(),
                        s.getHoTen(),
                        g.getTiengAnh(),
                        g.getTinHoc(),
                        g.getgDTC(),
                        score
                    });
                }
            }
        }
    }

    private boolean check(String masv) {
        for (Grade g : listGrades) {
            if (g.getMaSV().equals(masv)) {
                return false;
            }
        }
        return true;
    }

    private List<Grade> getTop3() {
        return this.gradeService.getTop3();
    }

    private boolean updateGrade(Grade grade) {
        return this.gradeService.updateGrade(grade);
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNextRow;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnPreviousRow;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnglistMsg;
    private javax.swing.JLabel lblIDMsg;
    private javax.swing.JLabel lblITMsg;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPage;
    private javax.swing.JLabel lblPhysicalMsg;
    private javax.swing.JLabel lblScore;
    private javax.swing.JTable tableTop3;
    private javax.swing.JTextField txtEnglish;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtInformation;
    private javax.swing.JTextField txtPhysical;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
