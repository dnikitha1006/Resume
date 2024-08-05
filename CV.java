package com.company;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
public class CV {
private JPanel cvPanel;
private JTextField name;
private JTextField address;
private JTextField contact;
private JTextField email;
private JTextField skills1;
private JTextField skills2;
private JTextField skills3;
private JTextField skills4;
private JComboBox work;
private JTextField college;
private JTextField qualiA;
private JButton SELECTIMAGEButton;
private JLabel img;
private JButton GENERATERESUMEButton;
private JTextField qualiB;
private JTextField location;
JFrame frame = new JFrame();
public CV() {
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setContentPane(cvPanel);
frame.pack();
frame.setLocationRelativeTo(null);
frame.setVisible(true);
SELECTIMAGEButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
JFileChooser fileChooser = new JFileChooser();
FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE","jpg","png");
fileChooser.addChoosableFileFilter(filter);
int rs = fileChooser.showSaveDialog(null);
if(rs==JFileChooser.APPROVE_OPTION){
File selectedImage = fileChooser.getSelectedFile();
location.setText(selectedImage.getAbsolutePath());
img.setIcon(resize(location.getText()));
}
}
});
