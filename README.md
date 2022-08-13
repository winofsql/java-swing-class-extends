# java-swing-class-extends

```java

public class NextClass extends MyClass {

    public NextClass() {

    }

    public NextClass(String v) {
        super(v);
    }

}
```

```java
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        // 中央表示
        setLocationRelativeTo(null);
        // タイトル設定
        setTitle("WindowBuilder");

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnNewButton = new JButton("実行");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("こんにちは世界");
            }
        });
        btnNewButton.setBounds(160, 50, 90, 20);
        contentPane.add(btnNewButton);

        // myClass = new MyClass();
        // myClass.setTitle("処理開始");
        // String title = myClass.getTitle();
        // MyClass.print(title);

        // nextClass = new NextClass("処理開始");
        // String title = nextClass.getTitle();
        // NextClass.print(title);

    }
}
```
