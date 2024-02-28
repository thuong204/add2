package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JToolBar;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.util.ArrayList;
import java.awt.event.InputEvent;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Dao.ThiSinhDao;
import Helper.DataValidator;
import Helper.MessageDialogHelper;
import model.ThiSinh;
import model.Tinh;

import javax.swing.JTextArea;

public class HomeView extends JFrame {
	private JTextField textFieldMaTS;
	private JTextField textField_TenTS;
	private JTextField textFieldLop;
	private JTextField textFieldTruong;
	private JTextField textFieldQliMaSv;
	private JTextField textField_Van;
	private JTextField textField_Anh;
	private JTextField textField_Ly;
	private JTextField textField_Hoa;
	private JTextField textField_Sinh;
	private JTextField textField_Toan;
	private JTextField textFieldMasvTimKiem;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_NgaySinh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeView frame = new HomeView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the frame.
	 */
	public HomeView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1063, 608);
		this.setTitle("TRANG CHỦ QUẢN LÍ THI THPT");
		this.setLocationRelativeTo(null);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenuHethong = new JMenu("Hệ thống");
		mnNewMenuHethong.setForeground(new Color(0, 0, 0));
		mnNewMenuHethong.setFont(new Font("Arial", Font.BOLD, 20));
		menuBar.add(mnNewMenuHethong);
		
		JCheckBoxMenuItem mntmNewMenuItemDangXuat = new JCheckBoxMenuItem("Đăng xuất");
		mntmNewMenuItemDangXuat.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_DOWN_MASK));
		mntmNewMenuItemDangXuat.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\login5.png"));
		mntmNewMenuItemDangXuat.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenuHethong.add(mntmNewMenuItemDangXuat);
		
		JSeparator separator = new JSeparator();
		mnNewMenuHethong.add(separator);
		
		JMenuItem mntmNewMenuItemThoat = new JMenuItem("Thoát");
		mntmNewMenuItemThoat.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_DOWN_MASK));
		mntmNewMenuItemThoat.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\Close-2-icon (1).png"));
		mntmNewMenuItemThoat.setForeground(new Color(0, 0, 0));
		mntmNewMenuItemThoat.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mntmNewMenuItemThoat.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenuHethong.add(mntmNewMenuItemThoat);
		
		JMenu mnNewMenuThiSinh = new JMenu("Thí sinh");
		mnNewMenuThiSinh.setForeground(new Color(0, 0, 0));
		mnNewMenuThiSinh.setFont(new Font("Arial", Font.BOLD, 20));
		menuBar.add(mnNewMenuThiSinh);
		
		JMenuItem mntmNewMenuItemQLTS = new JMenuItem("Quản lí Thí Sinh");
		mntmNewMenuItemQLTS.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.ALT_DOWN_MASK));
		mntmNewMenuItemQLTS.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\personal-information-icon.png"));
		mntmNewMenuItemQLTS.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenuThiSinh.add(mntmNewMenuItemQLTS);
		
		JSeparator separator_1 = new JSeparator();
		mnNewMenuThiSinh.add(separator_1);
		
		JMenuItem mntmNewMenuItemQLDiem = new JMenuItem("Quản lí điểm");
		mntmNewMenuItemQLDiem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.ALT_DOWN_MASK));
		mntmNewMenuItemQLDiem.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\Actions-mail-mark-task-icon.png"));
		mntmNewMenuItemQLDiem.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenuThiSinh.add(mntmNewMenuItemQLDiem);
		
		JMenu mnNewMenuTroGiup = new JMenu("Trợ giúp");
		mnNewMenuTroGiup.setForeground(new Color(0, 0, 0));
		mnNewMenuTroGiup.setFont(new Font("Arial", Font.BOLD, 20));
		menuBar.add(mnNewMenuTroGiup);
		
		JMenuItem mntmNewMenuItemGioiThieu = new JMenuItem("Giới thiệu");
		mntmNewMenuItemGioiThieu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_DOWN_MASK));
		mntmNewMenuItemGioiThieu.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\Info-icon.png"));
		mntmNewMenuItemGioiThieu.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenuTroGiup.add(mntmNewMenuItemGioiThieu);
		getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, "name_101782358054800");
		panel.setLayout(new CardLayout(0, 0));
		
		JPanel panel_QuanLiThiSinh = new JPanel();
		panel_QuanLiThiSinh.setBackground(new Color(128, 255, 255));
		panel_QuanLiThiSinh.setForeground(new Color(128, 128, 128));
		panel.add(panel_QuanLiThiSinh, "name_101933947173200");
		panel_QuanLiThiSinh.setLayout(null);
		
		JLabel lblNewLabelQuanLiThiSinh = new JLabel("Quản Lí Thí Sinh");
		lblNewLabelQuanLiThiSinh.setBackground(new Color(255, 255, 255));
		lblNewLabelQuanLiThiSinh.setForeground(new Color(255, 0, 0));
		lblNewLabelQuanLiThiSinh.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabelQuanLiThiSinh.setBounds(21, 11, 176, 43);
		panel_QuanLiThiSinh.add(lblNewLabelQuanLiThiSinh);
		
		JLabel lblNewLabeMaTSl = new JLabel("Mã thí sinh");
		lblNewLabeMaTSl.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabeMaTSl.setBounds(31, 67, 86, 22);
		panel_QuanLiThiSinh.add(lblNewLabeMaTSl);
		
		textFieldMaTS = new JTextField();
		textFieldMaTS.setBackground(new Color(255, 255, 255));
		textFieldMaTS.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldMaTS.setBounds(136, 66, 136, 26);
		panel_QuanLiThiSinh.add(textFieldMaTS);
		textFieldMaTS.setColumns(10);
		
		textField_TenTS = new JTextField();
		textField_TenTS.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_TenTS.setColumns(10);
		textField_TenTS.setBounds(136, 103, 242, 26);
		panel_QuanLiThiSinh.add(textField_TenTS);
		
		JLabel lblNewLabelTenTS = new JLabel("Tên thí sinh");
		lblNewLabelTenTS.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabelTenTS.setBounds(31, 103, 93, 25);
		panel_QuanLiThiSinh.add(lblNewLabelTenTS);
		
		JLabel lblNewLabelTenLop = new JLabel("Lớp");
		lblNewLabelTenLop.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabelTenLop.setBounds(413, 69, 57, 18);
		panel_QuanLiThiSinh.add(lblNewLabelTenLop);
		
		textFieldLop = new JTextField();
		textFieldLop.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldLop.setColumns(10);
		textFieldLop.setBounds(480, 64, 136, 26);
		panel_QuanLiThiSinh.add(textFieldLop);
		
		JLabel lblNewLabelTruong = new JLabel("Trường");
		lblNewLabelTruong.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabelTruong.setBounds(413, 109, 86, 22);
		panel_QuanLiThiSinh.add(lblNewLabelTruong);
		
		textFieldTruong = new JTextField();
		textFieldTruong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldTruong.setColumns(10);
		textFieldTruong.setBounds(480, 108, 291, 26);
		panel_QuanLiThiSinh.add(textFieldTruong);
		
		JLabel lblNewLabelGioiTinh = new JLabel("Giới tính");
		lblNewLabelGioiTinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabelGioiTinh.setBounds(31, 178, 65, 22);
		panel_QuanLiThiSinh.add(lblNewLabelGioiTinh);
		
		JLabel lblNewLabelTinh = new JLabel("Tỉnh");
		lblNewLabelTinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabelTinh.setBounds(413, 150, 86, 14);
		panel_QuanLiThiSinh.add(lblNewLabelTinh);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(new Color(0, 0, 0));
		separator_4.setBounds(424, 11, 9, 246);
		panel_QuanLiThiSinh.add(separator_4);
		
		ButtonGroup btGroupGioiTinh = new ButtonGroup();
		JRadioButton rdbtnNewRadioButtonNam = new JRadioButton("Nam");
		rdbtnNewRadioButtonNam.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnNewRadioButtonNam.setBounds(123, 176, 59, 29);
		panel_QuanLiThiSinh.add(rdbtnNewRadioButtonNam);
		
		JRadioButton rdbtnNewRadioButtonNu = new JRadioButton("Nữ");
		rdbtnNewRadioButtonNu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnNewRadioButtonNu.setBounds(213, 176, 47, 29);
		panel_QuanLiThiSinh.add(rdbtnNewRadioButtonNu);
		
		btGroupGioiTinh.add(rdbtnNewRadioButtonNam);
		btGroupGioiTinh.add(rdbtnNewRadioButtonNu);
		
		JComboBox comboBoxTinh = new JComboBox();
	    ArrayList<Tinh> listTinh =Tinh.getDSTinh();
	    for(Tinh tinh:listTinh) {
	    	comboBoxTinh.addItem(tinh.getTenTinh());
	    }
		comboBoxTinh.setBounds(480, 149, 136, 22);
		panel_QuanLiThiSinh.add(comboBoxTinh);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(31, 52, 763, 2);
		panel_QuanLiThiSinh.add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(41, 219, 763, 2);
		panel_QuanLiThiSinh.add(separator_6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 192));
		panel_1.setBounds(866, 50, 149, 158);
		panel_QuanLiThiSinh.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButtonLuu = new JButton("Lưu");
		btnNewButtonLuu.setBackground(new Color(255, 255, 255));
		btnNewButtonLuu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					StringBuilder sb = new StringBuilder();
					DataValidator.validateEmpty(textFieldMaTS, sb, "Mã thí sinh không được để trống");
					DataValidator.validateEmpty(textField_TenTS, sb, "Tên thí sinh không được để trống");
					if(sb.length()>0) {
						MessageDialogHelper.showErrorDialog(null, sb.toString(), "Lỗi");
						return;
					}
					try {
						String maThiSinh = textFieldMaTS.getText();
						String tenThiSinh = textField_TenTS.getText();
						String ngaySinh = textField_NgaySinh.getText();
						int gioitinh=1;
						if(rdbtnNewRadioButtonNam.isSelected()) {
							gioitinh=1;
						}
						else
							gioitinh=0;
						String lop = textFieldLop.getText();
						String truong = textFieldTruong.getText();
						int queQuan =comboBoxTinh.getSelectedIndex();
						Tinh tinh =Tinh.getTinhByID(queQuan);
						ThiSinh ts = new ThiSinh(maThiSinh, tenThiSinh, lop, truong, tinh, ngaySinh, gioitinh);
						ThiSinhDao dao = new ThiSinhDao();
						if(dao.insert(ts)) {
							MessageDialogHelper.showMessageDialog(null, "Thí sinh đã được lưu", "Thông báo");
						}
						else {
							MessageDialogHelper.showConfirmDialog(null, "Thí sinh chưa được lưu","Cảnh báo");
						}
				}
				catch(Exception ex) {
					ex.printStackTrace();
					MessageDialogHelper.showErrorDialog(null,ex.getMessage(),"Lỗi" );
					}				
				}
		});
		btnNewButtonLuu.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\Save-as-icon.png"));
		btnNewButtonLuu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButtonLuu.setBounds(10, 56, 96, 23);
		panel_1.add(btnNewButtonLuu);
		
		JButton btnNewButtonCapNhat = new JButton("Cập nhật");
		btnNewButtonCapNhat.setBackground(new Color(255, 255, 255));
		btnNewButtonCapNhat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder sb = new StringBuilder();
				DataValidator.validateEmpty(textFieldMaTS, sb, "Mã thí sinh không được để trống");
				DataValidator.validateEmpty(textField_TenTS, sb, "Tên thí sinh không được để trống");
				if(sb.length()>0) {
					MessageDialogHelper.showErrorDialog(null, sb.toString(), "Lỗi");
					return;
				}
				if(MessageDialogHelper.showConfirmDialog(null, "Bạn có muốn cập nhật thí sinh hay không?", "Hỏi")==JOptionPane.NO_OPTION){
					return;
				}
					try {
						String maThiSinh = textFieldMaTS.getText();
						String tenThiSinh = textField_TenTS.getText();
						String ngaySinh = textField_NgaySinh.getText();
						int gioitinh=1;
						if(rdbtnNewRadioButtonNam.isSelected()) {
							gioitinh=1;
						}
						else
							gioitinh=0;
						String lop = textFieldLop.getText();
						String truong = textFieldTruong.getText();
						int queQuan =comboBoxTinh.getSelectedIndex();
						Tinh tinh =Tinh.getTinhByID(queQuan);
						ThiSinh ts = new ThiSinh(maThiSinh, tenThiSinh, lop, truong, tinh, ngaySinh, gioitinh);
						ThiSinhDao dao = new ThiSinhDao();
						if(dao.update(ts)) {
							MessageDialogHelper.showMessageDialog(null, "Thí sinh đã được cập nhật", "Thông báo");
						}
						else {
							MessageDialogHelper.showConfirmDialog(null, "Thí sinh chưa được cập nhật","Cảnh báo");
						}
				}
				catch(Exception ex) {
					ex.printStackTrace();
					MessageDialogHelper.showErrorDialog(null,ex.getMessage(),"Lỗi" );
					}				
			}	
			}
		);
	
		btnNewButtonCapNhat.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\Document-write-icon (1).png"));
		btnNewButtonCapNhat.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButtonCapNhat.setBounds(10, 90, 129, 23);
		panel_1.add(btnNewButtonCapNhat);
		
		JButton btnNewButtonXoa = new JButton("Xóa");
		btnNewButtonXoa.setBackground(new Color(255, 255, 255));
		btnNewButtonXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder sb = new StringBuilder();
				DataValidator.validateEmpty(textFieldMaTS, sb, "Mã thí sinh không được để trống");
				if(sb.length()>0) {
					MessageDialogHelper.showErrorDialog(null, sb.toString(), "Lỗi");
					return;
				}
				if(MessageDialogHelper.showConfirmDialog(null, "Bạn có muốn xóa thí sinh hay không?", "Hỏi")==JOptionPane.NO_OPTION){
					return;
				}
					try {
						
						ThiSinhDao dao = new ThiSinhDao();
						if(dao.delete(textFieldMaTS.getText())) {
							MessageDialogHelper.showMessageDialog(null, "Thí sinh đã được xóa", "Thông báo");
						}
						else {
							MessageDialogHelper.showMessageDialog(null, "Thí sinh không được xóa do không tồn tại","Cảnh báo");
						}
				}
				catch(Exception ex) {
					ex.printStackTrace();
					MessageDialogHelper.showErrorDialog(null,ex.getMessage(),"Lỗi" );
					}				
			}	
			}
		);
		btnNewButtonXoa.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\Delete-icon (1).png"));
		btnNewButtonXoa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButtonXoa.setBounds(10, 124, 96, 23);
		panel_1.add(btnNewButtonXoa);
		
		JButton btnNewButtonTaoMoi = new JButton("Tạo mới");
		btnNewButtonTaoMoi.setBackground(new Color(255, 255, 255));
		btnNewButtonTaoMoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldMaTS.setText("");
				textField_TenTS.setText("");
				textField.setText("");
				textFieldMaTS.setText("");
				textFieldMaTS.setText("");
				textFieldMaTS.setText("");				
			}
		});
		btnNewButtonTaoMoi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButtonTaoMoi.setBounds(10, 22, 96, 23);
		panel_1.add(btnNewButtonTaoMoi);
		
		JTable jtable = new JTable();
		jtable.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jtable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 th\u00ED sinh", "T\u00EAn th\u00ED sinh", "Gi\u1EDBi t\u00EDnh", "L\u1EDBp", "Tr\u01B0\u1EDDng", "T\u1EC9nh/Th\u00E0nh ph\u1ED1"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, String.class, String.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		jtable.getColumnModel().getColumn(0).setPreferredWidth(68);
		jtable.getColumnModel().getColumn(1).setPreferredWidth(193);
		jtable.getColumnModel().getColumn(1).setMinWidth(48);
		jtable.getColumnModel().getColumn(2).setPreferredWidth(68);
		jtable.getColumnModel().getColumn(3).setPreferredWidth(58);
		jtable.getColumnModel().getColumn(4).setPreferredWidth(281);
		jtable.getColumnModel().getColumn(5).setPreferredWidth(104);
		
		JScrollPane scrollPane = new JScrollPane(jtable);
		scrollPane.setBounds(113, 268, 822, 251);
		panel_QuanLiThiSinh.add(scrollPane);
		
		JLabel lblNewLabelDanhSachThiSinh = new JLabel("Danh Sách Thí Sinh");
		lblNewLabelDanhSachThiSinh.setForeground(new Color(255, 0, 0));
		lblNewLabelDanhSachThiSinh.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabelDanhSachThiSinh.setBounds(21, 219, 251, 43);
		panel_QuanLiThiSinh.add(lblNewLabelDanhSachThiSinh);
		
		JLabel lblNewLabelNgaySinh = new JLabel("Ngày Sinh");
		lblNewLabelNgaySinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabelNgaySinh.setBounds(31, 141, 79, 22);
		panel_QuanLiThiSinh.add(lblNewLabelNgaySinh);
		
		textField_NgaySinh = new JTextField();
		textField_NgaySinh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_NgaySinh.setColumns(10);
		textField_NgaySinh.setBounds(136, 140, 136, 26);
		panel_QuanLiThiSinh.add(textField_NgaySinh);
		
		JPanel panel_QuanLiDiem = new JPanel();
		panel_QuanLiDiem.setBackground(new Color(255, 255, 128));
		panel.add(panel_QuanLiDiem, "name_101944687875600");
		panel_QuanLiDiem.setLayout(null);
		panel_QuanLiDiem.setVisible(true);
		
		JLabel lbQLDieml = new JLabel("Quản lí Điểm thi");
		lbQLDieml.setForeground(new Color(0, 0, 255));
		lbQLDieml.setFont(new Font("Tahoma", Font.BOLD, 24));
		lbQLDieml.setBounds(10, 11, 254, 34);
		panel_QuanLiDiem.add(lbQLDieml);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(20, 56, 986, 2);
		panel_QuanLiDiem.add(separator_2);
		
		JLabel lblNewLabelQliMaSv = new JLabel("Mã thí sinh");
		lblNewLabelQliMaSv.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabelQliMaSv.setBounds(30, 72, 129, 22);
		panel_QuanLiDiem.add(lblNewLabelQliMaSv);
		
		textFieldQliMaSv = new JTextField();
		textFieldQliMaSv.setBounds(146, 69, 118, 27);
		panel_QuanLiDiem.add(textFieldQliMaSv);
		textFieldQliMaSv.setColumns(10);
		
		JLabel lblNewLabelDiemAnh = new JLabel("Anh");
		lblNewLabelDiemAnh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabelDiemAnh.setBounds(30, 234, 65, 22);
		panel_QuanLiDiem.add(lblNewLabelDiemAnh);
		
		textField_Van = new JTextField();
		textField_Van.setColumns(10);
		textField_Van.setBounds(146, 172, 71, 27);
		panel_QuanLiDiem.add(textField_Van);
		
		JLabel lblNewLabelQliDiemVan = new JLabel("Văn");
		lblNewLabelQliDiemVan.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabelQliDiemVan.setBounds(30, 177, 78, 22);
		panel_QuanLiDiem.add(lblNewLabelQliDiemVan);
		
		textField_Anh = new JTextField();
		textField_Anh.setColumns(10);
		textField_Anh.setBounds(146, 229, 71, 27);
		panel_QuanLiDiem.add(textField_Anh);
		
		JLabel lblNewLabelDiemLy = new JLabel("Lý");
		lblNewLabelDiemLy.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabelDiemLy.setBounds(322, 118, 39, 22);
		panel_QuanLiDiem.add(lblNewLabelDiemLy);
		
		textField_Ly = new JTextField();
		textField_Ly.setColumns(10);
		textField_Ly.setBounds(380, 119, 71, 27);
		panel_QuanLiDiem.add(textField_Ly);
		
		JLabel lblNewLabelDiemHoa = new JLabel("Hóa");
		lblNewLabelDiemHoa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabelDiemHoa.setBounds(322, 173, 48, 22);
		panel_QuanLiDiem.add(lblNewLabelDiemHoa);
		
		textField_Hoa = new JTextField();
		textField_Hoa.setColumns(10);
		textField_Hoa.setBounds(380, 176, 71, 27);
		panel_QuanLiDiem.add(textField_Hoa);
		
		JLabel lblNewLabelDiemSinh = new JLabel("Sinh");
		lblNewLabelDiemSinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabelDiemSinh.setBounds(322, 230, 48, 22);
		panel_QuanLiDiem.add(lblNewLabelDiemSinh);
		
		textField_Sinh = new JTextField();
		textField_Sinh.setColumns(10);
		textField_Sinh.setBounds(380, 227, 71, 27);
		panel_QuanLiDiem.add(textField_Sinh);
		
		JLabel lblNewLabelDiemToan = new JLabel("Toán");
		lblNewLabelDiemToan.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabelDiemToan.setBounds(30, 121, 71, 22);
		panel_QuanLiDiem.add(lblNewLabelDiemToan);
		
		textField_Toan = new JTextField();
		textField_Toan.setColumns(10);
		textField_Toan.setBounds(146, 118, 71, 27);
		panel_QuanLiDiem.add(textField_Toan);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(128, 255, 255));
		panel_2.setBounds(633, 69, 406, 196);
		panel_QuanLiDiem.add(panel_2);
		panel_2.setLayout(null);
		
		textFieldMasvTimKiem = new JTextField();
		textFieldMasvTimKiem.setColumns(10);
		textFieldMasvTimKiem.setBounds(126, 11, 118, 27);
		panel_2.add(textFieldMasvTimKiem);
		
		JLabel lblNewLabelQliMaSvTimKiem = new JLabel("Mã thí sinh");
		lblNewLabelQliMaSvTimKiem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabelQliMaSvTimKiem.setBounds(10, 14, 129, 22);
		panel_2.add(lblNewLabelQliMaSvTimKiem);
		
		JButton btnNewButtonTimKiem = new JButton("Tìm kiếm");
		btnNewButtonTimKiem.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\Search-icon (3).png"));
		btnNewButtonTimKiem.setBounds(283, 15, 113, 23);
		panel_2.add(btnNewButtonTimKiem);
		
		JLabel lblNewLabelKhoiA00 = new JLabel("A00");
		lblNewLabelKhoiA00.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabelKhoiA00.setBounds(71, 60, 49, 27);
		panel_2.add(lblNewLabelKhoiA00);
		
		JLabel lbLabelA01 = new JLabel("A01");
		lbLabelA01.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbLabelA01.setBounds(71, 98, 49, 22);
		panel_2.add(lbLabelA01);
		
		JLabel lblNewLabelB00 = new JLabel("B00");
		lblNewLabelB00.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabelB00.setBounds(71, 132, 49, 27);
		panel_2.add(lblNewLabelB00);
		
		JLabel lblNewLabelD01 = new JLabel("D01");
		lblNewLabelD01.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabelD01.setBounds(71, 170, 49, 25);
		panel_2.add(lblNewLabelD01);
		
		textField = new JTextField();
		textField.setBounds(130, 65, 49, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(130, 101, 49, 20);
		panel_2.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(130, 137, 49, 20);
		panel_2.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(130, 174, 49, 20);
		panel_2.add(textField_3);
		
		JLabel lblNewLabelHihi = new JLabel("New label");
		lblNewLabelHihi.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\Graduate-male-icon.png"));
		lblNewLabelHihi.setBounds(277, 60, 129, 136);
		panel_2.add(lblNewLabelHihi);
		
		JTable tableDiem = new JTable();
		tableDiem.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tableDiem.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 th\u00ED sinh", "To\u00E1n", "V\u0103n", "Anh", "L\u00FD", "H\u00F3a", "Sinh"
			}
		));
		tableDiem.getColumnModel().getColumn(1).setPreferredWidth(60);
		tableDiem.getColumnModel().getColumn(2).setPreferredWidth(56);
		tableDiem.getColumnModel().getColumn(3).setPreferredWidth(55);
		tableDiem.getColumnModel().getColumn(4).setPreferredWidth(57);
		tableDiem.getColumnModel().getColumn(5).setPreferredWidth(60);
		tableDiem.getColumnModel().getColumn(6).setPreferredWidth(59);
		
		JScrollPane scrollPane_1 = new JScrollPane(tableDiem);
		scrollPane_1.setBounds(10, 325, 588, 205);
		panel_QuanLiDiem.add(scrollPane_1);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(10, 277, 593, 2);
		panel_QuanLiDiem.add(separator_7);
		
		JLabel lbDSDieml = new JLabel("Danh Sách Điểm thi");
		lbDSDieml.setForeground(Color.BLUE);
		lbDSDieml.setFont(new Font("Tahoma", Font.BOLD, 24));
		lbDSDieml.setBounds(10, 280, 254, 34);
		panel_QuanLiDiem.add(lbDSDieml);
		
		JButton btnNewButtonQlThemmoi = new JButton("Thêm mới");
		btnNewButtonQlThemmoi.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButtonQlThemmoi.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\New-file-icon.png"));
		btnNewButtonQlThemmoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButtonQlThemmoi.setBounds(509, 72, 114, 34);
		panel_QuanLiDiem.add(btnNewButtonQlThemmoi);
		
		JButton btnNewButtonQlLuu = new JButton("Lưu");
		btnNewButtonQlLuu.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\Save-as-icon.png"));
		btnNewButtonQlLuu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButtonQlLuu.setBounds(509, 121, 89, 34);
		panel_QuanLiDiem.add(btnNewButtonQlLuu);
		
		JButton btnNewButtonQlCapNhat = new JButton("Cập nhật");
		btnNewButtonQlCapNhat.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\Document-write-icon (1).png"));
		btnNewButtonQlCapNhat.setBounds(509, 172, 114, 31);
		panel_QuanLiDiem.add(btnNewButtonQlCapNhat);
		
		JButton btnButtonQlXoa = new JButton("Xóa");
		btnButtonQlXoa.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\Delete-icon (1).png"));
		btnButtonQlXoa.setBounds(509, 218, 89, 34);
		panel_QuanLiDiem.add(btnButtonQlXoa);
		
		JLabel lblNewLabelAnh = new JLabel("");
		lblNewLabelAnh.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\graduate-icon (2).png"));
		lblNewLabelAnh.setBounds(726, 287, 345, 254);
		panel_QuanLiDiem.add(lblNewLabelAnh);
		
		JPanel panel_GioiThieu = new JPanel();
		panel.add(panel_GioiThieu, "name_115663010978300");
		panel_GioiThieu.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Giới thiệu về phần mềm");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(30, 11, 388, 37);
		panel_GioiThieu.add(lblNewLabel);
		
		JTextArea jTextAreaGioiThieu = new JTextArea("1.Xin cảm ơn vì đã tin tưởng và đồng hành cùng ứng dụng \n"
				                                 +   "2.Giới thiệu ứng dụng quản lí thi THPT \n"
				                                 +   "    Ứng dụng cho phép người dùng quản lí thông tin và điểm của thí sinh tham gia kì thi\n"
				                                 +   "    Ứng dụng cho phép học sinh tra cứu thông tin điểm của mình và ứng dụng có thể tính điểm từng khối \n    cho từng thí sinh dự thi\n"
				                                 +   "3.Xin chào và hẹn gặp lại."+"\n \n \n"
				                                 +   "1.Thank you for trusting and accompanying the application\n"
				                                 + "2.Introduce the high school exam management application\n"
				                                 + "    The application allows users to manage information and scores of students participating in the exam\n"
				                                 + "    The application allows students to look up their score information and the application can calculate \n    the score for each block for each candidate\n"
				                                 + "3.Thank you and see you soon.");
		jTextAreaGioiThieu.setEditable(false);
		jTextAreaGioiThieu.setFont(new Font("Monospaced", Font.ITALIC, 16));
		jTextAreaGioiThieu.setBackground(new Color(255, 255, 255)); 
		jTextAreaGioiThieu.setForeground(new Color(0, 0, 0));
		jTextAreaGioiThieu.setBounds(91, 80, 948, 390);
		panel_GioiThieu.add(jTextAreaGioiThieu);
		
		panel_QuanLiThiSinh.setVisible(true);
		panel_QuanLiDiem.setVisible(false);
		panel_GioiThieu.setVisible(false);
		
		JSeparator separator_3 = new JSeparator();
		getContentPane().add(separator_3, "name_101510708469700");
		this.setVisible(true);
		
		
	}
}
