/*
 * file_name: Home.java 
 *
 * Copyright GaoYisheng Corporation 2017 
 * 
 * License£º 
 * date£º2017Äê7ÔÂ6ÈÕ 
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

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import cn.edu.model.User;

/**
 * @author GaoYisheng 
 * TODO
 */
public class Home {

	public JFrame homeFrame;
	public JTextField NameTextField;
	public JTextField GenderTextField;
	public JTextField FirstDayTextField;
	public JTextField PrivilegeTextField;

	/**
	 * Create the application.
	 */
	public Home(User currentUser) {
		
		homeFrame = new JFrame();
		homeFrame.setTitle("Welcome home : @ " + currentUser.getUsername());
		homeFrame.setResizable(false);
		homeFrame.setBounds(100, 100, 700, 493);
		homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		homeFrame.getContentPane().setLayout(null);
		
		JPanel topMenuPanel = new JPanel();
		topMenuPanel.setBorder(new LineBorder(Color.GRAY));
		topMenuPanel.setBounds(12, 8, 671, 39);
		homeFrame.getContentPane().add(topMenuPanel);
		topMenuPanel.setLayout(null);
		
		JButton btnSystemMaintain = new JButton("System Maintain");
		btnSystemMaintain.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(homeFrame, "see http://www.help.com!", "System Maintain",
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
				JOptionPane.showMessageDialog(homeFrame, "see http://www.help.com!", "Help",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnHelp.setBounds(150, 8, 86, 28);
		topMenuPanel.add(btnHelp);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				homeFrame.dispose();
			}
		});
		btnExit.setBounds(557, 8, 102, 28);
		topMenuPanel.add(btnExit);
		
		JButton btnMainPage = new JButton("mainPage");
		btnMainPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							
							MainView window = new MainView(currentUser);
//							window.setCurrentUser(currentUser);
							
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
				homeFrame.dispose();
			}
		});
		btnMainPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMainPage.setBounds(443, 8, 102, 28);
		topMenuPanel.add(btnMainPage);
		
		JPanel leftMenuPanel = new JPanel();
		leftMenuPanel.setBorder(new LineBorder(new Color(128, 128, 128)));
		leftMenuPanel.setBounds(12, 63, 172, 386);
		homeFrame.getContentPane().add(leftMenuPanel);
		leftMenuPanel.setLayout(null);
		

		JButton btnGenerateReports = new JButton("Generate Reports ");
		btnGenerateReports.setFont(new Font("Dialog", Font.BOLD, 10));
		btnGenerateReports.setBounds(25, 198, 135, 28);
		leftMenuPanel.add(btnGenerateReports);
		
		JButton btnOperateLog = new JButton("View Operate Log");
		btnOperateLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOperateLog.setFont(new Font("Dialog", Font.BOLD, 10));
		btnOperateLog.setBounds(25, 143, 135, 28);
		leftMenuPanel.add(btnOperateLog);
		
		JButton btnEditInformations = new JButton("Edit Informations");
		btnEditInformations.setFont(new Font("Dialog", Font.BOLD, 10));
		btnEditInformations.setBounds(25, 92, 135, 28);
		leftMenuPanel.add(btnEditInformations);
		
		JPanel contentPanel = new JPanel();
		contentPanel.setBorder(new LineBorder(Color.GRAY));
		contentPanel.setBounds(209, 63, 474, 386);
		homeFrame.getContentPane().add(contentPanel);
		contentPanel.setLayout(new CardLayout(0, 0));
		
		JLayeredPane ViewInformationsLayeredPane = new JLayeredPane();
		contentPanel.add(ViewInformationsLayeredPane, "name_30218347811907");
		ViewInformationsLayeredPane.setLayout(null);
		
		JLabel lblInformation = new JLabel("Information");
		lblInformation.setBounds(12, 30, 185, 18);
		ViewInformationsLayeredPane.add(lblInformation);
		
		JLabel lblInformationsFor = new JLabel("Informations : @" + currentUser.getUsername());
		lblInformationsFor.setBounds(24, 74, 221, 18);
		ViewInformationsLayeredPane.add(lblInformationsFor);
		
		JPanel panelOfInformations = new JPanel();
		panelOfInformations.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panelOfInformations.setBounds(12, 104, 438, 127);
		ViewInformationsLayeredPane.add(panelOfInformations);
		panelOfInformations.setLayout(null);
		
		JLabel lblUserName = new JLabel("Name     |");
		lblUserName.setBounds(22, 40, 69, 18);
		panelOfInformations.add(lblUserName);
		
		JLabel lblFirstDay = new JLabel("FirstDay  |");
		lblFirstDay.setBounds(212, 40, 101, 18);
		panelOfInformations.add(lblFirstDay);
		
		JLabel lblPrivilege = new JLabel("Privilege  |");
		lblPrivilege.setBounds(311, 40, 115, 18);
		panelOfInformations.add(lblPrivilege);
		
		JLabel lblGender = new JLabel("Gender  |");
		lblGender.setBounds(118, 40, 69, 18);
		panelOfInformations.add(lblGender);
		
		NameTextField = new JTextField(currentUser.getUsername());
		NameTextField.setEditable(false);
		NameTextField.setBounds(12, 68, 70, 22);
		panelOfInformations.add(NameTextField);
		NameTextField.setColumns(10);
		
		GenderTextField = new JTextField(currentUser.getGender());
		GenderTextField.setEditable(false);
		GenderTextField.setColumns(10);
		GenderTextField.setBounds(104, 68, 70, 22);
		panelOfInformations.add(GenderTextField);
		
		FirstDayTextField = new JTextField(currentUser.getFirstDay());
		FirstDayTextField.setEditable(false);
		FirstDayTextField.setColumns(10);
		FirstDayTextField.setBounds(198, 68, 78, 22);
		panelOfInformations.add(FirstDayTextField);
		
		PrivilegeTextField = new JTextField(currentUser.getPrivilege());
		PrivilegeTextField.setEditable(false);
		PrivilegeTextField.setColumns(10);
		PrivilegeTextField.setBounds(300, 68, 78, 22);
		panelOfInformations.add(PrivilegeTextField);
		
		JLayeredPane EditInformationsLayeredPane = new JLayeredPane();
		contentPanel.add(EditInformationsLayeredPane, "name_30218360201173");
		EditInformationsLayeredPane.setLayout(null);
		
		JLabel lblViewCommodities = new JLabel("View Commodities");
		lblViewCommodities.setBounds(12, 30, 185, 18);
		EditInformationsLayeredPane.add(lblViewCommodities);
		
		JButton btnViewInformations = new JButton("View Informations");
		btnViewInformations.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Rectangle aRect=new Rectangle(209, 63, 474, 386);
				ViewInformationsLayeredPane.scrollRectToVisible(aRect);;
			}
		});
		btnViewInformations.setFont(new Font("Dialog", Font.BOLD, 10));
		btnViewInformations.setBounds(25, 36, 135, 28);
		leftMenuPanel.add(btnViewInformations);
		
		
	}
}
