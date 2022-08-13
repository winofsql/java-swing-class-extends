import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WinMain extends JFrame {

    private JPanel contentPane;
    private NextClass nextClass;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    WinMain frame = new WinMain();
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
    public WinMain() {

        NextClass.init(WinMain.this, contentPane);

        // myClass = new MyClass();
        // myClass.setTitle("処理開始");
        // String title = myClass.getTitle();
        // MyClass.print(title);

        // nextClass = new NextClass("処理開始");
        // String title = nextClass.getTitle();
        // NextClass.print(title);

    }
}
