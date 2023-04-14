package com.ipi.javapoo.gui;

import javax.swing.*;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIApp extends JFrame {
	
	public GUIApp() {
		setTitle("Gestion de comptes bancaires");
		
		// Données initales
		Object[][] data = {
				{"BENOIT FAUCHERY", "7852 4692 0347 7896", new Integer(618), new Double(180.00), false},
		};
		
		// Colonnes
		String[] columnNames = {"Nom", "Code", "CVV", "Amount", "Active"};
		
		// Specificité table
		DefaultTableModel model = new DefaultTableModel(data, columnNames) {
			// Edition champs
			@Override
			public boolean isCellEditable(int row, int column) {
				return true;
			}
			
			//Restriction entrés champs
			@Override
			public Class getColumnClass(int column) {
				return switch (column) {
					case 0, 1 -> String.class;
					case 2 -> Integer.class;
					case 3 -> Double.class;
					default -> Boolean.class;
				};
			}
		};
		
		JTable table = new JTable(model);
		
		// Style table
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		table.setDefaultRenderer(Object.class, centerRenderer);
		table.setRowHeight(30);
		
		JScrollPane tablePane = new JScrollPane(table);
		
		JButton addButton = new JButton("Ajouter une ligne");
		addButton.addActionListener(e -> model.addRow(new Object[]{"", "", ""}));
		
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(tablePane, BorderLayout.CENTER);
		panel.add(addButton, BorderLayout.SOUTH);
		
		add(panel);
		
		//Position et taille de l'app
		setMinimumSize(new Dimension(400,300));
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUIApp();
	}
}

