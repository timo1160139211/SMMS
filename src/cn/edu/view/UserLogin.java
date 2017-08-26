/*
 * file_name: UserLogin.java 
 *
 * Copyright GaoYisheng Corporation 2017 
 * 
 * License£º 
 * date£º2017Äê7ÔÂ4ÈÕ 
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

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import cn.edu.model.User;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UserLogin {

	public JFrame loginFrm;
	public JTextField userNameTextField;
	public JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLogin window = new UserLogin();
					window.loginFrm.setVisible(true);

					
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UserLogin() {
		
		loginFrm = new JFrame();
		loginFrm.setFont(new Font("Dialog", Font.PLAIN, 15));
		loginFrm.setTitle("Log In");
		loginFrm.setBounds(100, 100, 408, 312);
		loginFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginFrm.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, -29, 398, 319);
		loginFrm.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel userNameLabel = new JLabel("Name:");
		userNameLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		userNameLabel.setBounds(81, 71, 86, 32);
		panel.add(userNameLabel);

		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		passwordLabel.setBounds(57, 122, 103, 31);
		panel.add(passwordLabel);

		userNameTextField = new JTextField();
		userNameTextField.setFont(new Font("Dialog", Font.PLAIN, 16));
		userNameTextField.setBounds(166, 71, 158, 33);
		panel.add(userNameTextField);
		userNameTextField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Dialog", Font.PLAIN, 16));
		passwordField.setBounds(166, 124, 158, 32);
		panel.add(passwordField);

		JButton loginButton = new JButton("log in");
		loginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (userNameTextField.getText().toString().equals("")) {
					JOptionPane.showMessageDialog(loginFrm, "user name is empty !", "error",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					if (new String(passwordField.getPassword()).equals("")) {
						JOptionPane.showMessageDialog(loginFrm, "password is empty !", "error",
								JOptionPane.INFORMATION_MESSAGE);
					} else {

						if (userNameTextField.getText().toString().equals("baixianduo")||userNameTextField.getText().toString().equals("admin")) {
							if (new String(passwordField.getPassword()).equals("baixianduo")||new String(passwordField.getPassword()).equals("admin")) {

								User currentUser = new User(userNameTextField.getText().toString()
										,new String(passwordField.getPassword()),"male","2017-6-6","superAdmin");
								

								EventQueue.invokeLater(new Runnable() {
									public void run() {
										try {
											
											MainView window = new MainView(currentUser);
//											window.setCurrentUser(currentUser);
											
											window.frame.setVisible(true);
										} catch (Exception e) {
											e.printStackTrace();
										}
									}
								});

								loginFrm.dispose();
								
							} else {
								JOptionPane.showMessageDialog(loginFrm, "username and password not match !", "forget password ?",
										JOptionPane.QUESTION_MESSAGE);
							}
						} else {
							JOptionPane.showMessageDialog(loginFrm, "user not exsit !", "not registered ?",
									JOptionPane.WARNING_MESSAGE);
						}
					}

				}
			}

		});
		loginButton.setFont(new Font("Dialog", Font.BOLD, 16));

		loginButton.setBounds(222, 221, 102, 39);
		panel.add(loginButton);

		JButton exitButton = new JButton("exit");
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				loginFrm.dispose();
			}
		});
		exitButton.setFont(new Font("Dialog", Font.BOLD, 16));
		exitButton.setBounds(76, 221, 102, 39);
		panel.add(exitButton);

	}
}
