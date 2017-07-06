/*
 * file_name: MainView.java 
 *
 * Copyright GaoYisheng Corporation 2017 
 * 
 * License： 
 * date：2017年7月4日 
 *       https://www.gaoyisheng.site
 *       https://github.com/timo1160139211
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.edu.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

import cn.edu.model.User;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author GaoYisheng 
 * 2017年7月4日
 * TODO
 */
public class MainView {

	public JFrame frame;
	public JTable tableOfCommodities;
	public JTextField textFieldOfName;
	public JTextField textFieldOfAmount;
	public JTextField textFieldOfDeadline;
	public JTextField textFieldOfDescription;

	public User currentUser;
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MainView window = new MainView();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	public User getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}

	/**
	 * Create the application.
	 */
	
//	public MainView() {
//		initialize();
//	}
//
//	/**
//	 * Initialize the contents of the frame.
//	 */
//	private void initialize() {
/*		frame = new JFrame();

		frame.setResizable(false);
		frame.setBounds(100, 100, 700, 493);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel topMenuPanel = new JPanel();
		topMenuPanel.setBorder(new LineBorder(Color.GRAY));
		topMenuPanel.setBounds(12, 8, 671, 39);
		frame.getContentPane().add(topMenuPanel);
		topMenuPanel.setLayout(null);
		
		JButton btnSystemMaintain = new JButton("System Maintain");
		btnSystemMaintain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSystemMaintain.setFont(new Font("Dialog", Font.BOLD, 10));
		btnSystemMaintain.setBounds(8, 8, 138, 28);
		topMenuPanel.add(btnSystemMaintain);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.setBounds(150, 8, 86, 28);
		topMenuPanel.add(btnHelp);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(557, 8, 102, 28);
		topMenuPanel.add(btnExit);
		
		JButton btnHome = new JButton("Home");
		btnHome.setBounds(443, 8, 102, 28);
		topMenuPanel.add(btnHome);
		
		JPanel leftMenuPanel = new JPanel();
		leftMenuPanel.setBorder(new LineBorder(new Color(128, 128, 128)));
		leftMenuPanel.setBounds(12, 63, 172, 386);
		frame.getContentPane().add(leftMenuPanel);
		leftMenuPanel.setLayout(null);
		
		JButton btnViewCommodities = new JButton("View Commodities");
		btnViewCommodities.setFont(new Font("Dialog", Font.BOLD, 10));
		btnViewCommodities.setBounds(25, 36, 135, 28);
		leftMenuPanel.add(btnViewCommodities);
		
		JLabel lblCommodityManagement = new JLabel("Commodities Management");
		lblCommodityManagement.setBounds(0, 12, 160, 18);
		leftMenuPanel.add(lblCommodityManagement);
		
		JButton btnAddCommodities = new JButton("Add Commodities");
		btnAddCommodities.setFont(new Font("Dialog", Font.BOLD, 10));
		btnAddCommodities.setBounds(25, 70, 135, 28);
		leftMenuPanel.add(btnAddCommodities);
		
		JLabel lblOrdersManagement = new JLabel("Orders Management");
		lblOrdersManagement.setBounds(0, 150, 160, 18);
		leftMenuPanel.add(lblOrdersManagement);
		
		JButton btnRemoveCommodities = new JButton("Remove Co-dities");
		btnRemoveCommodities.setFont(new Font("Dialog", Font.BOLD, 10));
		btnRemoveCommodities.setBounds(25, 110, 135, 28);
		leftMenuPanel.add(btnRemoveCommodities);
		
		JLabel lblUsersManagement = new JLabel("Users Management");
		lblUsersManagement.setBounds(0, 260, 160, 18);
		leftMenuPanel.add(lblUsersManagement);
		
		JButton btnViewOrders = new JButton("View Orders");
		btnViewOrders.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnViewOrders.setFont(new Font("Dialog", Font.BOLD, 10));
		btnViewOrders.setBounds(25, 180, 135, 28);
		leftMenuPanel.add(btnViewOrders);
		
		JButton btnEditOrders = new JButton("Edit Orders");
		btnEditOrders.setFont(new Font("Dialog", Font.BOLD, 10));
		btnEditOrders.setBounds(25, 220, 135, 28);
		leftMenuPanel.add(btnEditOrders);
		
		JButton btnViewUsers = new JButton("View Users");
		btnViewUsers.setFont(new Font("Dialog", Font.BOLD, 10));
		btnViewUsers.setBounds(25, 290, 135, 28);
		leftMenuPanel.add(btnViewUsers);
		
		JButton btnRemoveUsers = new JButton("Remove Users");
		btnRemoveUsers.setFont(new Font("Dialog", Font.BOLD, 10));
		btnRemoveUsers.setBounds(25, 330, 135, 28);
		leftMenuPanel.add(btnRemoveUsers);
		
		JPanel contentPanel = new JPanel();
		contentPanel.setBorder(new LineBorder(Color.GRAY));
		contentPanel.setBounds(209, 63, 474, 386);
		frame.getContentPane().add(contentPanel);
		contentPanel.setLayout(new CardLayout(0, 0));
		
		JLayeredPane ViewCommoditiesLayeredPane = new JLayeredPane();
		contentPanel.add(ViewCommoditiesLayeredPane, "name_16691853452983");
		ViewCommoditiesLayeredPane.setLayout(null);
		
		JLabel lblViewCommodities = new JLabel("View Commodities");
		lblViewCommodities.setBounds(12, 30, 185, 18);
		ViewCommoditiesLayeredPane.add(lblViewCommodities);
		
		tableOfCommodities = new JTable();
		tableOfCommodities.setBounds(42, 347, 394, -243);
		ViewCommoditiesLayeredPane.add(tableOfCommodities);
		
		JLayeredPane AddCommoditiesLayeredPane = new JLayeredPane();
		contentPanel.add(AddCommoditiesLayeredPane, "name_16720454721894");
		AddCommoditiesLayeredPane.setLayout(null);
		
		JLabel lblAddCommodities = new JLabel("Add Commodities");
		lblAddCommodities.setBounds(12, 30, 185, 18);
		AddCommoditiesLayeredPane.add(lblAddCommodities);
		
		JLabel lblCommodityInformations = new JLabel("Commodity Informations :");
		lblCommodityInformations.setBounds(22, 74, 175, 18);
		AddCommoditiesLayeredPane.add(lblCommodityInformations);
		
		JPanel panelOfCommodityInfo = new JPanel();
		panelOfCommodityInfo.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panelOfCommodityInfo.setBounds(12, 104, 438, 127);
		AddCommoditiesLayeredPane.add(panelOfCommodityInfo);
		panelOfCommodityInfo.setLayout(null);
		
		JLabel lblCommodityName = new JLabel("Name     |");
		lblCommodityName.setBounds(22, 40, 69, 18);
		panelOfCommodityInfo.add(lblCommodityName);
		
		JLabel lblAmount = new JLabel("Amount  |");
		lblAmount.setBounds(121, 40, 59, 18);
		panelOfCommodityInfo.add(lblAmount);
		
		JLabel lblDeadline = new JLabel("deadline  |");
		lblDeadline.setBounds(212, 40, 101, 18);
		panelOfCommodityInfo.add(lblDeadline);
		
		JLabel lblDecription = new JLabel("decription  |");
		lblDecription.setBounds(311, 40, 115, 18);
		panelOfCommodityInfo.add(lblDecription);
		
		textFieldOfName = new JTextField();
		textFieldOfName.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldOfName.setText("water");
		textFieldOfName.setBounds(22, 70, 59, 22);
		panelOfCommodityInfo.add(textFieldOfName);
		textFieldOfName.setColumns(10);
		
		textFieldOfAmount = new JTextField();
		textFieldOfAmount.setText("86");
		textFieldOfAmount.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldOfAmount.setColumns(10);
		textFieldOfAmount.setBounds(121, 70, 59, 22);
		panelOfCommodityInfo.add(textFieldOfAmount);
		
		textFieldOfDeadline = new JTextField();
		textFieldOfDeadline.setText("2018-1-1");
		textFieldOfDeadline.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldOfDeadline.setColumns(10);
		textFieldOfDeadline.setBounds(222, 70, 59, 22);
		panelOfCommodityInfo.add(textFieldOfDeadline);
		
		txtWahahaWater = new JTextField();
		txtWahahaWater.setText("wahaha water");
		txtWahahaWater.setHorizontalAlignment(SwingConstants.RIGHT);
		txtWahahaWater.setColumns(10);
		txtWahahaWater.setBounds(305, 70, 77, 22);
		panelOfCommodityInfo.add(txtWahahaWater);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(92, 268, 102, 28);
		AddCommoditiesLayeredPane.add(btnClear);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(235, 268, 102, 28);
		AddCommoditiesLayeredPane.add(btnAdd);
		
		JLayeredPane RemoveCommoditiesLayeredPane = new JLayeredPane();
		contentPanel.add(RemoveCommoditiesLayeredPane, "name_42466686770062");
		RemoveCommoditiesLayeredPane.setLayout(null);
	}

	
	*/
	
	/**
	 * constructor with a param named User.
	 * 2017-07-06
	 * @param currentUser
	 */
	
	public MainView(User currentUser) {
//		initialize();
//	}
//
//	/**
//	 * Initialize the contents of the frame.
//	 */
//	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Welcome mainPage: @" + currentUser.getUsername());
		frame.setResizable(false);
		frame.setBounds(100, 100, 700, 493);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel topMenuPanel = new JPanel();
		topMenuPanel.setBorder(new LineBorder(Color.GRAY));
		topMenuPanel.setBounds(12, 8, 671, 39);
		frame.getContentPane().add(topMenuPanel);
		topMenuPanel.setLayout(null);
		
		JButton btnSystemMaintain = new JButton("System Maintain");
		btnSystemMaintain.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(frame, "see http://www.help.com!", "Help",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnSystemMaintain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSystemMaintain.setFont(new Font("Dialog", Font.BOLD, 10));
		btnSystemMaintain.setBounds(8, 8, 138, 28);
		topMenuPanel.add(btnSystemMaintain);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(frame, "see http://www.help.com!", "Help",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnHelp.setBounds(150, 8, 86, 28);
		topMenuPanel.add(btnHelp);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		btnExit.setBounds(557, 8, 102, 28);
		topMenuPanel.add(btnExit);
		
		JButton btnHome = new JButton("Home");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Home window = new Home(currentUser);
						window.homeFrame.setVisible(true);
						
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
				
				frame.dispose();
			}
		});
		btnHome.setBounds(443, 8, 102, 28);
		topMenuPanel.add(btnHome);
		
		JPanel leftMenuPanel = new JPanel();
		leftMenuPanel.setBorder(new LineBorder(new Color(128, 128, 128)));
		leftMenuPanel.setBounds(12, 63, 172, 386);
		frame.getContentPane().add(leftMenuPanel);
		leftMenuPanel.setLayout(null);
		
		JButton btnViewCommodities = new JButton("View Commodities");
		btnViewCommodities.setFont(new Font("Dialog", Font.BOLD, 10));
		btnViewCommodities.setBounds(25, 36, 135, 28);
		leftMenuPanel.add(btnViewCommodities);
		
		JLabel lblCommodityManagement = new JLabel("Commodities Management");
		lblCommodityManagement.setBounds(0, 12, 160, 18);
		leftMenuPanel.add(lblCommodityManagement);
		
		JButton btnAddCommodities = new JButton("Add Commodities");
		btnAddCommodities.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnAddCommodities.setFont(new Font("Dialog", Font.BOLD, 10));
		btnAddCommodities.setBounds(25, 70, 135, 28);
		leftMenuPanel.add(btnAddCommodities);
		
		JLabel lblOrdersManagement = new JLabel("Orders Management");
		lblOrdersManagement.setBounds(0, 150, 160, 18);
		leftMenuPanel.add(lblOrdersManagement);
		
		JButton btnRemoveCommodities = new JButton("Remove Co-dities");
		btnRemoveCommodities.setFont(new Font("Dialog", Font.BOLD, 10));
		btnRemoveCommodities.setBounds(25, 110, 135, 28);
		leftMenuPanel.add(btnRemoveCommodities);
		
		JLabel lblUsersManagement = new JLabel("Users Management");
		lblUsersManagement.setBounds(0, 260, 160, 18);
		leftMenuPanel.add(lblUsersManagement);
		
		JButton btnViewOrders = new JButton("View Orders");
		btnViewOrders.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnViewOrders.setFont(new Font("Dialog", Font.BOLD, 10));
		btnViewOrders.setBounds(25, 180, 135, 28);
		leftMenuPanel.add(btnViewOrders);
		
		JButton btnEditOrders = new JButton("Edit Orders");
		btnEditOrders.setFont(new Font("Dialog", Font.BOLD, 10));
		btnEditOrders.setBounds(25, 220, 135, 28);
		leftMenuPanel.add(btnEditOrders);
		
		JButton btnViewUsers = new JButton("View Users");
		btnViewUsers.setFont(new Font("Dialog", Font.BOLD, 10));
		btnViewUsers.setBounds(25, 290, 135, 28);
		leftMenuPanel.add(btnViewUsers);
		
		JButton btnRemoveUsers = new JButton("Remove Users");
		btnRemoveUsers.setFont(new Font("Dialog", Font.BOLD, 10));
		btnRemoveUsers.setBounds(25, 330, 135, 28);
		leftMenuPanel.add(btnRemoveUsers);
		
		JPanel contentPanel = new JPanel();
		contentPanel.setBorder(new LineBorder(Color.GRAY));
		contentPanel.setBounds(209, 63, 474, 386);
		frame.getContentPane().add(contentPanel);
		contentPanel.setLayout(new CardLayout(0, 0));
		
		JLayeredPane AddCommoditiesLayeredPane = new JLayeredPane();
		contentPanel.add(AddCommoditiesLayeredPane, "name_16720454721894");
		AddCommoditiesLayeredPane.setLayout(null);
		
		JLabel lblAddCommodities = new JLabel("Add Commodities");
		lblAddCommodities.setBounds(12, 30, 185, 18);
		AddCommoditiesLayeredPane.add(lblAddCommodities);
		
		JLabel lblCommodityInformations = new JLabel("Commodity Informations :");
		lblCommodityInformations.setBounds(22, 74, 175, 18);
		AddCommoditiesLayeredPane.add(lblCommodityInformations);
		
		JPanel panelOfCommodityInfo = new JPanel();
		panelOfCommodityInfo.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panelOfCommodityInfo.setBounds(12, 104, 438, 127);
		AddCommoditiesLayeredPane.add(panelOfCommodityInfo);
		panelOfCommodityInfo.setLayout(null);
		
		JLabel lblCommodityName = new JLabel("Name     |");
		lblCommodityName.setBounds(22, 40, 69, 18);
		panelOfCommodityInfo.add(lblCommodityName);
		
		JLabel lblAmount = new JLabel("Amount  |");
		lblAmount.setBounds(121, 40, 59, 18);
		panelOfCommodityInfo.add(lblAmount);
		
		JLabel lblDeadline = new JLabel("deadline  |");
		lblDeadline.setBounds(212, 40, 101, 18);
		panelOfCommodityInfo.add(lblDeadline);
		
		JLabel lblDecription = new JLabel("decription  |");
		lblDecription.setBounds(311, 40, 115, 18);
		panelOfCommodityInfo.add(lblDecription);
		
		textFieldOfName = new JTextField();
		textFieldOfName.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldOfName.setText("water");
		textFieldOfName.setBounds(22, 70, 59, 22);
		panelOfCommodityInfo.add(textFieldOfName);
		textFieldOfName.setColumns(10);
		
		textFieldOfAmount = new JTextField();
		textFieldOfAmount.setText("86");
		textFieldOfAmount.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldOfAmount.setColumns(10);
		textFieldOfAmount.setBounds(121, 70, 59, 22);
		panelOfCommodityInfo.add(textFieldOfAmount);
		
		textFieldOfDeadline = new JTextField();
		textFieldOfDeadline.setText("2018-1-1");
		textFieldOfDeadline.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldOfDeadline.setColumns(10);
		textFieldOfDeadline.setBounds(222, 70, 59, 22);
		panelOfCommodityInfo.add(textFieldOfDeadline);
		
		textFieldOfDescription = new JTextField();
		textFieldOfDescription.setText("wahaha water");
		textFieldOfDescription.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldOfDescription.setColumns(10);
		textFieldOfDescription.setBounds(305, 70, 77, 22);
		panelOfCommodityInfo.add(textFieldOfDescription);
		
		JButton btnClear = new JButton("Clear");

		btnClear.setBounds(92, 268, 102, 28);
		AddCommoditiesLayeredPane.add(btnClear);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(235, 268, 102, 28);
		AddCommoditiesLayeredPane.add(btnAdd);
		
		JLayeredPane ViewCommoditiesLayeredPane = new JLayeredPane();
		contentPanel.add(ViewCommoditiesLayeredPane, "name_16691853452983");
		ViewCommoditiesLayeredPane.setLayout(null);
		
		JLabel lblViewCommodities = new JLabel("View Commodities");
		lblViewCommodities.setBounds(12, 30, 185, 18);
		ViewCommoditiesLayeredPane.add(lblViewCommodities);
		
		tableOfCommodities = new JTable();
		tableOfCommodities.setBounds(42, 347, 394, -243);
		ViewCommoditiesLayeredPane.add(tableOfCommodities);
		
		JLayeredPane RemoveCommoditiesLayeredPane = new JLayeredPane();
		contentPanel.add(RemoveCommoditiesLayeredPane, "name_42466686770062");
		RemoveCommoditiesLayeredPane.setLayout(null);
		
		btnClear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textFieldOfName.setText("");
				textFieldOfAmount.setText("");
				textFieldOfDeadline.setText("");
				textFieldOfDescription.setText("");
			}
		});
		
		
		
	}
}
