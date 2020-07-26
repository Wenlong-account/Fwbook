package ui;

import java.awt.Dimension;
import java.awt.Toolkit;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Login {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Login window = new Login();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		Toolkit kit = Toolkit.getDefaultToolkit();//定义工具包
		Dimension screenSize = kit.getScreenSize();//获取屏幕的尺寸
		int screenWidth = screenSize.width;//获取屏幕的宽
		int screenHeight = screenSize.height;//获取屏幕的高
		int shellWidth = 512;//设置窗口的宽
		int shellHeight = 512;//设置窗口的高
		shell.setBounds((screenWidth-shellWidth)/2, (screenHeight-shellHeight)/2, shellWidth, shellHeight);
		shell.setText("Login");

	}

}
